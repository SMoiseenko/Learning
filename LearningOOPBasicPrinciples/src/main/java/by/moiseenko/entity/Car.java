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
   public int doorsQty = 4;
   public static int weelsQty = 4;

  public Car() {
    LOG.debug("CAR CONSTRUCTOR");
  }

  public void publicMethod(){
    LOG.debug("CAR PUBLIC METHOD, doorsQty=4 and real:" + doorsQty);
  }

  public final void finalMethod(){
    LOG.debug("CAR FINAL METHOD");
  }
  protected void protectedMethod(){
    LOG.debug("CAR PROTECTED METHOD, weelsQty = 4 and real:" + weelsQty);
  }

  public static void showData(){
    LOG.debug("DATA FROM STATIC METHOD WITHOUT ATTRIBUTES(MoCl)");
  }
  public void showData(int a){
    LOG.debug( a + " DATA FROM NON_STATIC METHOD WITH ONE ARGUMENT(MoCl)");
  }
}
