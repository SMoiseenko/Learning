import by.moiseenko.repository.PersonDAO;
import by.moiseenko.repository.impl.PersonDAOImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    //
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("spring-config.xml");
    PersonDAO personDAO = context.getBean("personDAOBean", PersonDAOImpl.class);
    personDAO.getAll().forEach(LOG::debug);
    context.close();
    }
}
