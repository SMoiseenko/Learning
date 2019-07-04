package by.moiseenko.service;

import by.moiseenko.model.Product;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface ProductService {

  List<Product> getAllProducts();

  long addProductToDB(Product product);

  Product findProductById(long id);

  void updateProduct(Product product);

  void deleteProduct(long Id);
}
