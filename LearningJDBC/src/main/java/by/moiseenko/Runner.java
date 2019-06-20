package by.moiseenko;

import by.moiseenko.entity.Person;
import by.moiseenko.entity.Product;
import by.moiseenko.jdbc.PersonDao;
import by.moiseenko.jdbc.ProductDao;
import by.moiseenko.jdbc.impl.CRUDbySQL;
import by.moiseenko.jdbc.impl.DataSource;
import by.moiseenko.jdbc.impl.PersonDaoImpl;
import by.moiseenko.jdbc.impl.ProductDaoImpl;
import by.moiseenko.service.ProductService;
import by.moiseenko.service.impl.ProductServiceImpl;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
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
    PersonDao personDao = new PersonDaoImpl(dataSource);


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

      Product product_pivas = new Product();
      product_pivas.setProductName("Пивас");
      product_pivas.setPrice(new BigDecimal(114));

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

  private static void tempCode(boolean isActive) {
    if (isActive) {
      PersonDao personDao = new PersonDaoImpl(new DataSource(mySQL_prop));
      Person p1 = new Person();
      p1.setLogin("vasya");
      p1.setPassword("vas123");
      p1.setFirstName("Vasiliy");
      p1.setLastName("Sidorov");
      p1.setDateOfBirth(LocalDate.parse("10.03.1985"));
      p1.setSalary(new BigDecimal(550));

      personDao.savePerson(p1);
      p1.setSalary(new BigDecimal(880));
      personDao.updatePerson(1, p1);
      personDao.deleteDuplicatesBySQLProcedure();
      LOG.debug(personDao.findPerson(5));
      LOG.debug(
          "\n"
              + personDao.getAllPersons().stream()
                  .map(Person::toString)
                  .reduce((per1, per2) -> per1.concat("\n").concat(per2))
                  .get());
    }
  }
  private  void callableStatementExample(boolean isActive){
    if(isActive){
      DataSource dataSource = new DataSource(mySQL_prop);
      try(Connection connection = dataSource.getConnection()){
        CallableStatement callableStatement =
            connection.prepareCall("{call get_most_expensive_product_from_products(?,?)}");
        callableStatement.registerOutParameter(1, Types.VARCHAR);
        callableStatement.registerOutParameter(2, Types.DECIMAL);
        callableStatement.execute();
        LOG.debug(callableStatement.getString("o_producr_name"));
        LOG.debug(callableStatement.getBigDecimal(2));
      }catch (SQLException sqlE){
        LOG.error(sqlE);
      }
    }
  }
}
