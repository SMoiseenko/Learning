package by.moiseenko;

import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.CRUDbySQL;
import by.moiseenko.jdbc.JDBConnector;
import by.moiseenko.service.ProductService;
import by.moiseenko.service.impl.ProductServiceImpl;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  private static String mySQL_prop =
      "/home/moiseenko-s/IdeaProjects/Learning/LearningJDBC/src/main/resources/jdbc_prop.xml";

  public static void main(String[] args) {
    CRUDbySQL crudbySQL = new CRUDbySQL(new JDBConnector(mySQL_prop));
    try {
      crudbySQL.executeUpdate(
          "CREATE TABLE products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)");
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }
    try {
      crudbySQL.executeUpdate("INSERT products (ProductName, Price) VALUES ('Молоко', 105), ('Кефир', 203), ('Vodka', 666)");
    } catch (SQLException sqlE) {
      LOG.error(sqlE);
    }

    Product product_pivas = new Product("Пивас", 114);
    ProductService productService = new ProductServiceImpl(crudbySQL);
    productService.addProductToDB(product_pivas);

    try{
      crudbySQL.executeUpdate("UPDATE products SET Price = Price + 1000");
    }catch (SQLException sqlE){
      LOG.error(sqlE);
    }

    try{
      crudbySQL.executeUpdate("DELETE FROM products WHERE Id = 1");
    } catch (SQLException sqlE){
      LOG.error(sqlE);
    }

    try{
      crudbySQL.executeQuery("SELECT * FROM products");
    }catch (SQLException sqlE){
      LOG.error(sqlE);
    }

    try{
      crudbySQL.executeUpdate("UPDATE products SET Price = Price - 1000");
    }catch (SQLException sqlE){
      LOG.error(sqlE);
    }

  }
}
