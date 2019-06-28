package by.moiseenko.repository.impl;

import by.moiseenko.model.Person;
import by.moiseenko.model.Product;
import by.moiseenko.repository.ProductDao;
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

  private Connection connection;

  public static final String SQL_SELECT_FROM_PRODUCTS =
      "SELECT * FROM learning_jdbc.products WHERE `product_id` = ?";
  public static final String SQL_SELECT_ALL_FROM_PRODUCTS = "SELECT * FROM learning_jdbc.products";
  public static final String SQL_UPDATE_INTO_PRODUCTS =
      "UPDATE learning_jdbc.products SET `product_name` = ?, `product_price` = ?, `person_id` = ? WHERE `product_id` = ?";
  public static final String SQL_CREATE_INTO_PRODUCTS =
      "INSERT  INTO learning_jdbc.products (`product_name`, `product_price`, `person_id`) VALUES (?,?,?)";
  public static final String SQL_DELETE_FROM_PRODUCTS =
      "DELETE FROM learning_jdbc.products WHERE product_id = ?";

  public ProductDaoImpl(Connection connection) {
    this.connection = connection;
  }

  @Override
  public List<Product> getAllProducts() {
    List<Product> result = new ArrayList<>();
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_SELECT_ALL_FROM_PRODUCTS)) {
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet != null && resultSet.next()) {
        result.add(mapProduct(resultSet));
      }
    } catch (SQLException sqlE) {
      LOG.error("Can't get all products from DB. " + sqlE);
    }
    return result;
  }

  @Override
  public long createProduct(Product product) {
    long result = -1;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(
            SQL_CREATE_INTO_PRODUCTS, PreparedStatement.RETURN_GENERATED_KEYS)) {
      preparedStatementForProduct(preparedStatement, product);
      preparedStatement.executeUpdate();
      ResultSet resultSet = preparedStatement.getGeneratedKeys();
      while (resultSet != null && resultSet.next()) {
        result = resultSet.getBigDecimal(1).longValue();
      }
    } catch (SQLException sqlE) {
      LOG.error("Cant store product into DB. " + sqlE);
    }
    return result;
  }

  @Override
  public Product findProduct(long id) {
    Product result = null;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_SELECT_FROM_PRODUCTS)) {
      preparedStatement.setLong(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet != null && resultSet.next()) {
        result = mapProduct(resultSet);
      }
    } catch (SQLException sqlE) {
      LOG.error("Can't find product into DB. " + sqlE);
    }
    return result;
  }

  @Override
  public int updateProduct(Product product) {
    int result = -1;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_UPDATE_INTO_PRODUCTS)) {
      preparedStatementForProduct(preparedStatement, product);
      preparedStatement.setLong(4, product.getId());
      result = preparedStatement.executeUpdate();
      LOG.debug(result + " product was updated.");
    } catch (SQLException sqlE) {
      LOG.error("Can't update product into DB. " + sqlE);
    }
    return result;
  }

  @Override
  public void deleteProduct(long id) {
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_DELETE_FROM_PRODUCTS)) {
      preparedStatement.setBigDecimal(1, new BigDecimal(id));
    } catch (SQLException sqlE) {
      LOG.error("Can't delete user with id = " + id + ";" + sqlE);
    }
  }

  private Product mapProduct(ResultSet resultSet) throws SQLException {
    Product product = new Product();
    product.setId(resultSet.getBigDecimal("product_id").longValue());
    product.setProductName(resultSet.getString("product_name"));
    product.setPrice(resultSet.getBigDecimal("product_price"));
    long personId;
    if ((personId = resultSet.getBigDecimal("person_id").longValue()) != 0) {
      product.setPerson(new Person());
      product.getPerson().setId(personId);
    }
    return product;
  }

  private void preparedStatementForProduct(PreparedStatement preparedStatement, Product product)
      throws SQLException {
    preparedStatement.setString(1, product.getProductName());
    preparedStatement.setBigDecimal(2, product.getPrice());
    if (product.getPerson() != null) {
      preparedStatement.setBigDecimal(3, new BigDecimal(product.getPerson().getId()));
    } else {
      preparedStatement.setNull(3, Types.BIGINT);
    }
  }
}
