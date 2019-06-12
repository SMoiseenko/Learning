package by.moiseenko.service.impl;

import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.CRUDbySQL;
import by.moiseenko.jdbc.JDBConnector;
import by.moiseenko.service.ProductService;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ProductServiceImpl implements ProductService {

  private static final Logger LOG = LogManager.getLogger(ProductServiceImpl.class.getName());
  private CRUDbySQL cruDbySQL;

  public ProductServiceImpl(CRUDbySQL cruDbySQL) {
    this.cruDbySQL = cruDbySQL;
  }

  @Override
  public void addProductToDB(Product product) {
    String sqlQuery = "INSERT learning_jdbc.products (ProductName, Price) VALUES ('"+product.getProductName()+"', "+product.getPrice()+")";
    try {
      cruDbySQL.executeUpdate(sqlQuery);
    } catch (SQLException e) {
      LOG.error(e);
    }
  }
}
