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

  public ProductDaoImpl() {}

  @Override
  public long createProduct(Product product) throws SQLException {
    long createdId = -1;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(
            SQL_CREATE_INTO_PRODUCTS, PreparedStatement.RETURN_GENERATED_KEYS)) {
      preparedStatementForProduct(preparedStatement, product);
      int rawsAdded = preparedStatement.executeUpdate();
      LOG.debug(rawsAdded + " was added.");
      ResultSet resultSet = preparedStatement.getGeneratedKeys();
      while (resultSet != null && resultSet.next()) {
        createdId = resultSet.getBigDecimal(1).longValue();
        LOG.debug(createdId + " Id was generated.");
      }
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
    return createdId;
  }

  @Override
  public Product findProduct(long id) throws SQLException {
    Product result = null;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_SELECT_FROM_PRODUCTS)) {
      preparedStatement.setLong(1, id);
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet != null && resultSet.next()) {
        result = productMapper(resultSet);
      }
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
    if (result != null) {
      LOG.debug(String.format("%d %s was found", result.getId(), result.getProductName()));
    }
    return result;
  }

  @Override
  public int updateProduct(Product product) throws SQLException {
    int result = -1;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_UPDATE_INTO_PRODUCTS)) {
      preparedStatementForProduct(preparedStatement, product);
      preparedStatement.setLong(4, product.getId());
      result = preparedStatement.executeUpdate();
      LOG.debug(result + " product was updated.");
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
    return result;
  }

  @Override
  public List<Product> getAllProducts() throws SQLException {
    List<Product> result = null;
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_SELECT_ALL_FROM_PRODUCTS)) {
      result = new ArrayList<>();
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet != null && resultSet.next()) {
        result.add(productMapper(resultSet));
      }
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
    return result;
  }

  @Override
  public void deleteProduct(long id) throws SQLException {
    try (PreparedStatement preparedStatement =
        connection.prepareStatement(SQL_DELETE_FROM_PRODUCTS)) {
      preparedStatement.setBigDecimal(1, new BigDecimal(id));
      int raws = preparedStatement.executeUpdate();
      LOG.debug(raws + " was deleted.");
    } catch (SQLException sqlE) {
      connection.rollback();
      connection.setAutoCommit(true);
      throw sqlE;
    }
  }

  @Override
  public void setConnection(Connection connection) {
    this.connection = connection;
  }

  private Product productMapper(ResultSet resultSet) throws SQLException {
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
