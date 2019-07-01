package by.moiseenko.repository;

import by.moiseenko.model.Product;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface ProductDao {

  List<Product> getAllProducts() throws SQLException;

  long createProduct(Product product) throws SQLException;

  Product findProduct(long id) throws SQLException;

  int updateProduct(Product product) throws SQLException;

  void deleteProduct(long id) throws SQLException;

  void setConnection(Connection connection);


}
