package by.moiseenko;

import by.moiseenko.structural.proxy.Calculate;
import by.moiseenko.structural.proxy.ProxyCalculateImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestProxy {

  private static final Logger LOG = LogManager.getLogger(TestProxy.class.getName());
  private static Calculate calculate = new ProxyCalculateImpl();

  @Test
  void testCalcAdd(){
    assertEquals(10, calculate.add(8,2));
  }

  @Test
  void testCalcSub(){
    assertEquals(22, calculate.sub(36,36-22));
  }

}
