package by.moiseenko;

import by.moiseenko.controller.PersonController;
import by.moiseenko.controller.impl.PersonControllerImpl;
import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.PersonDao;
import by.moiseenko.jdbc.ProductDao;
import by.moiseenko.jdbc.impl.CRUDbySQL;
import by.moiseenko.jdbc.impl.DataSource;
import by.moiseenko.jdbc.impl.PersonDaoImpl;
import by.moiseenko.jdbc.impl.ProductDaoImpl;
import by.moiseenko.service.PersonService;
import by.moiseenko.service.ProductService;
import by.moiseenko.service.impl.PersonServiceImpl;
import by.moiseenko.service.impl.ProductServiceImpl;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  public static String mySQL_prop =
      "/home/moiseenko-s/IdeaProjects/Learning/LearningJDBC/src/main/resources/jdbc_prop.xml";

  public static void main(String[] args) {
    someExamples(false);
    tempCode(false);

    DataSource dataSource = new DataSource(mySQL_prop);
    //    PersonDao personDao = new PersonDaoImpl(dataSource);
    //    PersonService personService = new PersonServiceImpl(personDao);
    //    PersonController personController = new PersonControllerImpl(personService);
    ProductDao productDao = new ProductDaoImpl(dataSource);
  productDao.createProduct(new Product("Milk", new BigDecimal(1.15)));
  LOG.debug(productDao.findProduct(28));

  }

  private static void someExamples(boolean isActive) {
    if (isActive) {
      CRUDbySQL crudbySQL = new CRUDbySQL(new DataSource(mySQL_prop));
      try {
        crudbySQL.executeUpdate(
            "CREATE TABLE products (Id INT PRIMARY KEY AUTO_INCREMENT, ProductName VARCHAR(20), Price INT)");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
      try {
        crudbySQL.executeUpdate(
            "INSERT products (ProductName, Price) VALUES ('Молоко', 105), ('Кефир', 203), ('Vodka', 666)");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }

      Product product_pivas = new Product("Пивас", new BigDecimal(114));
      ProductService productService = new ProductServiceImpl(crudbySQL);
      productService.addProductToDB(product_pivas);

      try {
        crudbySQL.executeUpdate("UPDATE products SET Price = Price + 1000");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }

      try {
        crudbySQL.executeUpdate("DELETE FROM products WHERE Id = 1");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }

      try {
        crudbySQL.executeQuery("SELECT * FROM products");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }

      try {
        crudbySQL.executeUpdate("UPDATE products SET Price = Price - 1000");
      } catch (SQLException sqlE) {
        LOG.error(sqlE);
      }
    }
  }
  private  static void tempCode(boolean isActive){
    if (isActive){
      PersonDao personDao = new PersonDaoImpl(new DataSource(mySQL_prop));
      Person p1 = new Person("vasya", "vas123", "Vasiliy", "Sidorov", LocalDate.parse("10.03.1985"), new BigDecimal(550));
      personDao.savePerson(p1);
      p1.setSalary(new BigDecimal(880));
      personDao.updatePerson(1, p1);
      personDao.deleteDuplicatesBySQLProcedure();
      LOG.debug(personDao.findPerson(5));
      LOG.debug("\n"+
          personDao.getAllPersons().stream()
              .map(Person::toString)
              .reduce((per1, per2) -> per1.concat("\n").concat(per2))
              .get());
    }
  }
}
