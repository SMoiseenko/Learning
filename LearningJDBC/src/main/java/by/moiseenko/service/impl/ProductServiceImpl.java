package by.moiseenko.service.impl;

import by.moiseenko.model.Person;
import by.moiseenko.model.Product;
import by.moiseenko.repository.ProductDao;
import by.moiseenko.repository.impl.ApacheConnectionPool;
import by.moiseenko.service.ProductService;
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

  public ProductServiceImpl(ProductDao productDao) {
    this.productDao = productDao;
  }

  @Override
  public long addProductToDB(Product product) {
    try(Connection connection = ApacheConnectionPool.getConnection()){
      productDao.setConnection(connection);
      connection.setAutoCommit(false);


    }catch (SQLException sqlE){
      LOG.debug(sqlE);
    }

    return -1;
  }

  @Override
  public List<Product> getAllProducts() {
    return null;
  }

  @Override
  public Product findProductById(long id) {
    return null;
  }

  @Override
  public void updateProduct(Product product) {}

  @Override
  public void deleteProduct() {}
}
