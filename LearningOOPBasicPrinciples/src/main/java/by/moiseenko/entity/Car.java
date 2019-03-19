package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Car {

  private static final Logger LOG = LogManager.getLogger(Car.class.getName());
   public int doorQty = 4;

  public Car() {
    LOG.debug("CAR CONSTRUCTOR");
  }

  public void publicMethod(){
    LOG.debug("CAR PUBLIC METHOD, doorQty=4 and real:" + doorQty);
  }

  public final void finalMethod(){
    LOG.debug("CAR FINAL METHOD");
  }
  protected void protectedMethod(){
    LOG.debug("CAR PROTECTED METHOD");
  }
}
