package by.moiseenko.structural.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CalculateImpl implements Calculate {

  private static final Logger LOG = LogManager.getLogger(CalculateImpl.class.getName());


  @Override
  public int add(int x, int y) {
    return x+y;
  }

  @Override
  public int sub(int x, int y) {
    return x-y;
  }
}
