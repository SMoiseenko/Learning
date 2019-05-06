package by.moiseenko;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class SimpleTest {

  private static final Logger LOG = LogManager.getLogger(SimpleTest.class.getName());
@Test
  public void simpleTest(){
  Assert.assertEquals(1,1);
}

}

