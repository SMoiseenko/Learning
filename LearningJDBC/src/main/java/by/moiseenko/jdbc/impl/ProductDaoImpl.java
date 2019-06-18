package by.moiseenko.jdbc.impl;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.ProductDao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;
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

  private static final String SQL_SELECT_ALL = "SELECT * FROM products";
  private static final String SQL_SELECT_ALL_FOR_USER = "";
  private static final String SQL_UPDATE = "";
  private static final String SQL_CREATE = "";
  private static final String SQL_DELETE = "";

  public ProductDaoImpl(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public List<Product> getAllProducts() {
    List<Product> result = new ArrayList<>();
    try(Connection connection = dataSource.getConnection()){
      PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_ALL);
      ResultSet resultSet = preparedStatement.executeQuery();
      Product product = null;
      while(resultSet!= null && resultSet.next()){
        long id = resultSet.getInt("id");
        String productName = resultSet.getString("product_name");
        BigDecimal price = resultSet.getBigDecimal("price");
        result.add(new Product(id, productName, price));
      }

    }catch (SQLException sqlE){
      LOG.error(sqlE);
    }
    return null;
  }

  @Override
  public List<Product> getAllPersonProducts(Person person) {
    return null;
  }

  @Override
  public long createProduct(Product product) {
    return 0;
  }

  @Override
  public Product findProduct(long id) {
    return null;
  }

  @Override
  public long updateProduct(Product product) {
    return 0;
  }

  @Override
  public void deleteProduct(long id) {

  }
}
