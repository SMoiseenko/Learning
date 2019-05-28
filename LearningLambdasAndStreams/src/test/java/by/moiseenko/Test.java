package by.moiseenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;


/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Test {

  private static final Logger LOG = LogManager.getLogger(Test.class.getName());
  private String text;
@BeforeTest
private void beforeTest(){
  text = "TEST";

}
@org.testng.annotations.Test
  public void doEmptyTest(){
  LOG.debug(text);
  }
}
