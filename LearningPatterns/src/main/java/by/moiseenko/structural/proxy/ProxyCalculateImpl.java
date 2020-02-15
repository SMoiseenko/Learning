package by.moiseenko.structural.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ProxyCalculateImpl implements Calculate {

  private static final Logger LOG = LogManager.getLogger(ProxyCalculateImpl.class.getName());
  private Calculate calculate = new CalculateImpl();


  @Override
  public int add(int x, int y) {
    LOG.debug("""
        Method "ADD" was invoked with next parameters: """ + String.format("x = %d, y = %d;", x, y));
    return calculate.add(x,y);
  }

  @Override
  public int sub(int x, int y) {
    LOG.debug("""
        Method "SUB" was invoked with next parameters: """ + String.format("x = %d, y = %d;", x, y));
    return calculate.sub(x,y);
  }
}
