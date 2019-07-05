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

  public static void main(String[] args) {
    FileSystemXmlApplicationContext context =
        new FileSystemXmlApplicationContext("classpath:/applicationContext.xml");
    context.close();
  }
}
