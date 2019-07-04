package by.moiseenko.service.impl;

import by.moiseenko.model.Person;
import by.moiseenko.model.Product;
import by.moiseenko.repository.PersonDao;
import by.moiseenko.repository.ProductDao;
import by.moiseenko.repository.impl.ApacheConnectionPool;
import by.moiseenko.service.ProductService;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ProductServiceImpl implements ProductService {

  private static final Logger LOG = LogManager.getLogger(ProductServiceImpl.class.getName());
  private ProductDao productDao;
  private PersonDao personDao;

  public ProductServiceImpl(ProductDao productDao, PersonDao personDao) {
    this.productDao = productDao;
    this.personDao = personDao;
  }

  @Override
  public long addProductToDB(Product product) {
    long generatedId = -1;
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      connection.setAutoCommit(false);
      productDao.setConnection(connection);
      personDao.setConnection(connection);
      generatedId = productDao.createProduct(product);
      product.setId(generatedId);
      BigDecimal personSalary = product.getPerson().getSalary();
      personSalary = personSalary.add(product.getPrice());
      product.getPerson().setSalary(personSalary);
      product.getPerson().addProduct(product);
      personDao.updatePerson(product.getPerson());
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }

    return generatedId;
  }

  @Override
  public List<Product> getAllProducts() {
    List<Product> productList = null;
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      connection.setAutoCommit(false);
      productDao.setConnection(connection);
      productList = productDao.getAllProducts();
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    return productList;
  }

  @Override
  public Product findProductById(long id) {
    Product product = null;
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      connection.setAutoCommit(false);
      productDao.setConnection(connection);
      product = productDao.findProduct(id);
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    return product;
  }

  @Override
  public void updateProduct(Product product) {
    BigDecimal oldPrice = findProductById(product.getId()).getPrice();
    product
        .getPerson()
        .setSalary(product.getPerson().getSalary().subtract(oldPrice).add(product.getPrice()));
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      connection.setAutoCommit(false);
      productDao.setConnection(connection);
      personDao.setConnection(connection);
      productDao.updateProduct(product);
      personDao.updatePerson(product.getPerson());
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException slqE) {
      LOG.error(slqE);
    }
  }

  @Override
  public void deleteProduct(long Id) {
    Product product = findProductById(Id);
    BigDecimal oldPrice = product.getPrice();
    try (Connection connection = ApacheConnectionPool.getConnection()) {
      connection.setAutoCommit(false);
      productDao.setConnection(connection);
      personDao.setConnection(connection);
      Person person = personDao.findPerson(product.getPerson().getId());
      person.setSalary(person.getSalary().subtract(oldPrice));
      productDao.deleteProduct(product.getId());
      personDao.updatePerson(person);
      connection.commit();
      connection.setAutoCommit(true);
    } catch (SQLException slqE) {
      LOG.error(slqE);
    }
  }
}
