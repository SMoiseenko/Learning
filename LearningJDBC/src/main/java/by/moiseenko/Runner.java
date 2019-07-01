package by.moiseenko;

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

  public static void main(String[] args) throws Exception {
    FileSystemXmlApplicationContext context =
        new FileSystemXmlApplicationContext("/src/main/resources/applicationContext.xml");
    context.close();
  }
}
