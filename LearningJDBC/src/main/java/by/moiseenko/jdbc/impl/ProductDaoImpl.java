package by.moiseenko.jdbc.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.ProductDao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ProductDaoImpl implements ProductDao {

  private static final Logger LOG = LogManager.getLogger(ProductDaoImpl.class.getName());
  private DataSource dataSource;

  private static final String SQL_SELECT = "SELECT * FROM products WHERE `product_id` = ?";
  private static final String SQL_SELECT_ALL = "SELECT * FROM products";
  private static final String SQL_SELECT_ALL_FOR_USER =
      "SELECT * FROM products WHERE person_id = ?";
  private static final String SQL_UPDATE = "";
  private static final String SQL_CREATE =
      "INSERT  INTO products (`product_name`, `product_price`, `person_id`) VALUES (?,?,?)";
  private static final String SQL_DELETE = "";

  public ProductDaoImpl(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public List<Product> getAllProducts() {
    List<Product> result = new ArrayList<>();
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);
      ResultSet resultSet = preparedStatement.executeQuery();
      Product product = null;
      while (resultSet != null && resultSet.next()) {
        product = mapProduct(resultSet);
        result.add(product);
      }
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    return result;
  }

  @Override
  public List<Product> getAllPersonProducts(Person person) {
    List<Product> result = new ArrayList<>();
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL_FOR_USER);
      preparedStatement.setLong(1, person.getId());
      ResultSet resultSet = preparedStatement.executeQuery();
      Product product = null;
      while (resultSet != null && resultSet.next()) {
        product = mapProduct(resultSet);
        result.add(product);
      }
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    return result;
  }

  @Override
  public long createProduct(Product product) {
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement preparedStatement = connection.prepareStatement(SQL_CREATE);
      preparedStatement.setString(1, product.getProductName());
      preparedStatement.setBigDecimal(2, product.getPrice());
      if (product.getPerson() != null) {
        preparedStatement.setLong(3, product.getPerson().getId());
      } else preparedStatement.setNull(3, Types.BIGINT);

      preparedStatement.executeUpdate();
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    return 0;
  }

  @Override
  public Product findProduct(long id) {
    Product result = null;
    try(Connection connection = dataSource.getConnection()){
      PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT);
      preparedStatement.setLong(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();
      while(resultSet!= null && resultSet.next()){
        result = mapProduct(resultSet);
      }
    }catch (SQLException sqlE){
      LOG.debug(sqlE);
    }
    return result;
  }

  @Override
  public long updateProduct(Product product) {
    return 0;
  }

  @Override
  public void deleteProduct(long id) {}

  private Product mapProduct(ResultSet resultSet) throws SQLException {

    long id = resultSet.getInt("product_id");
    String productName = resultSet.getString("product_name");
    BigDecimal price = resultSet.getBigDecimal("product_price");
    long personId = resultSet.getLong("person_id");

    Product product = new Product(productName, price);

    if (personId != 0) {
      product.setPerson(new Person());
      product.getPerson().setId(personId);
    }
    return product;
  }
}
