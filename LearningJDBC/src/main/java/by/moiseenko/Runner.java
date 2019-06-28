package by.moiseenko;

import by.moiseenko.model.Person;
import by.moiseenko.service.impl.PersonServiceImpl;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
      System.getProperty("user.home")
          + "/IdeaProjects/Learning/LearningJDBC/src/main/resources/jdbc_prop.xml";

  public static void main(String[] args) {
    Person person = new Person();
    person.setFirstName("sdgsg");
    person.setLastName("sdgjhserargh");
    person.setSalary(new BigDecimal(-100));
    person.setLogin("lgogog");
    person.setPassword("12345678");
    person.setDateOfBirth(LocalDate.parse("20.03.1987", DateTimeFormatter.ofPattern("d.M.y")));
    new PersonServiceImpl().createPerson(person);
  }

}
