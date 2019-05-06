package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Counter {

  private static final Logger LOG = LogManager.getLogger(Counter.class.getName());

  private static int count = 0;

  public static void increaseCounter(){
    count+=5;
  }

  public static void decreaseCounter(){
    count-=5;
  }

  public static int getCount() {
    return count;
  }
}
