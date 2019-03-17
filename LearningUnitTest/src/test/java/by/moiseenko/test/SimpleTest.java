package by.moiseenko.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class SimpleTest {
  private static final Logger LOG = LogManager.getLogger(SimpleTest.class.getName());

  @Test
  public void simpleTest() {
    LOG.debug("JUST FOR SMALL TESTING");
  }
}
