package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ClassA {

  private static final Logger LOG = LogManager.getLogger(ClassA.class.getName());

  public void sayName(String name){
    LOG.debug(name);
  }

  public static void sayStaticName(){
    LOG.debug("STATIC METHOD CLASS-A");
  }

}
