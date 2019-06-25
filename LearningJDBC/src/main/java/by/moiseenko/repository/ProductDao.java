package by.moiseenko.repository;

import by.moiseenko.model.Person;
import by.moiseenko.model.Product;
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

  int updateProduct(Product product);

  void deleteProduct(long id);
}
