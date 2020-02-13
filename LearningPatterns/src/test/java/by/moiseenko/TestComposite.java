package by.moiseenko;

import by.moiseenko.structural.composite.Department;
import by.moiseenko.structural.composite.Worker;
import java.math.BigDecimal;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@ExtendWith(TestResultLoggerExtension.class)
public class TestComposite {

  private static final Logger LOG = LogManager.getLogger(TestComposite.class.getName());

  private static Department smallCompany;

  @BeforeAll
  static void init() {
    smallCompany = new Department("Biocom");
    Worker director = new Worker("Gena", "1000");
    Department accounting = new Department("ACCOUNTERS");
    Worker accounter1 = new Worker("Zabelina", "500");
    Department cleaners = new Department("Cleaners");
    Worker cleaner1 = new Worker("Shvabra", "100");
    Worker cleaner2 = new Worker("Metla", "300");
    cleaners.addWorker(cleaner1);
    cleaners.addWorker(cleaner2);
    accounting.addWorker(accounter1);
    accounting.addWorker(cleaners);
    smallCompany.addWorker(director);
    smallCompany.addWorker(accounting);
  }

  @DisplayName("Test Calculation of all Salary")
  @Test
  void testSalary() {
    Assertions.assertEquals(new BigDecimal("1900"), smallCompany.getSalary(),  () -> "Expected: 1900, actual " + smallCompany.getSalary().toString());
  }

  @Test
  void testSayEverythingAboutYourSelf(){
    smallCompany.SayName();
    Assertions.assertEquals(1,1);
  }


}
