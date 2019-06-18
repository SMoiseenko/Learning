package by.moiseenko.jdbc;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import java.util.List;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface ProductDao {

  List<Product> getAllProducts();

  List<Product> getAllPersonProducts(Person person);

  long createProduct(Product product);

  Product findProduct(long id);

  long updateProduct(Product product);

  void deleteProduct(long id);
}
