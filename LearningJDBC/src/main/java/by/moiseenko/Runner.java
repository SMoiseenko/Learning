package by.moiseenko;

import by.moiseenko.repository.PersonDao;
import by.moiseenko.repository.impl.ApacheConnectionPool;
import by.moiseenko.repository.impl.PersonDaoImpl;
import by.moiseenko.service.PersonService;
import by.moiseenko.service.impl.PersonServiceImpl;
import com.google.protobuf.Internal.MapAdapter;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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

  public static void main(String[] args) throws SQLException {
    FileSystemXmlApplicationContext context =
       new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
    PersonService personService = context.getBean("personServiceBean", PersonService.class);
    personService.getAllPersons().forEach(System.out::println);
    LOG.debug("*********");
    personService.getAllPersons().forEach(System.out::println);
    context.close();



  }
}
