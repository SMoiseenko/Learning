package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public abstract class MyAbstractClass {

  private static final Logger LOG = LogManager.getLogger(MyAbstractClass.class.getName());
public abstract void sayHello();

public static void sayStatic(){
  LOG.debug("STATIC METHOD ABSTRACT CLASS");
}
}
