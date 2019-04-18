package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ClassC  extends ClassA{

  private static final Logger LOG = LogManager.getLogger(ClassC.class.getName());

  public void sayName(String name, int x) {
    LOG.debug(name + " FORM CLASS_C " + x);
  }

  @Override
  public void sayName(String name) {
    LOG.debug(name + " FORM CLASS_C ");
  }
}
