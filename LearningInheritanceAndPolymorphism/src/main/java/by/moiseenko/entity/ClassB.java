package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ClassB extends ClassA {

  private static final Logger LOG = LogManager.getLogger(ClassB.class.getName());

  public void sayName(String name) {
    LOG.debug(name + " FROM CLASS_B");
  }
}
