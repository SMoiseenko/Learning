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

  public String textMessage = "regexp";

  public ClassB() {
  }

  public ClassB(String str) {
    LOG.debug("I AM CONSTRUCTOR WITH ONE ARGUMENT FROM CLASS B ANT THIS ARGUMENT IS: " + str);
  }

  public void methodB(){
    LOG.debug("methodB");
  }

    public static void sayStaticName(){
    LOG.debug("STATIC METHOD CLASS-B");
    }

  public void sayName(String name) {
    LOG.debug(name + " FROM CLASS_B");
  }
}
