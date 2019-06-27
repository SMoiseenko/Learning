package by.moiseenko.service.impl;

import by.moiseenko.model.Product;
import by.moiseenko.repository.ProductDao;
import by.moiseenko.repository.impl.CRUDbySQL;
import by.moiseenko.service.ProductService;
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
    return productDao.createProduct(product);
  }

  @Override
  public List<Product> getAllProducts() {
    return productDao.getAllProducts();
  }

  @Override
  public Product findProductById(long id) {
    return productDao.findProduct(id);
  }

  @Override
  public void updateProduct(Product product) {

  }

  @Override
  public void deleteProduct() {

  }
}
