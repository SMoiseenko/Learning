package by.moiseenko;

import by.moiseenko.creational.singleton.PresidentMan;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestSingleton {

  private static final Logger LOG = LogManager.getLogger(TestSingleton.class.getName());


  @Test
  void testSingleton() {
    PresidentMan.getInstance().sayMyselfName();
    Assertions.assertSame(PresidentMan.getInstance(), PresidentMan.getInstance());
  }

}
