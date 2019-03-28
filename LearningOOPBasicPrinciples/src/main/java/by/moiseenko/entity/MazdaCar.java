package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class MazdaCar extends Car {

  private static final Logger LOG = LogManager.getLogger(MazdaCar.class.getName());
  public int doorsQty = 5;
  public static int weelsQty = 3;

  public MazdaCar() {
    LOG.debug("MAZDA_CAR CONSTRUCTOR");
  }

  @Override
  public void publicMethod() {
    LOG.debug("MAZDA_CAR PUBLIC METHOD, doorsQty=5 and real:" + doorsQty);
  }

  @Override
  protected void protectedMethod() {
    LOG.debug("MAZDA_CAR PROTECTED METHOD, weelsQty = 3 and real:" + weelsQty);
  }

  public void showData(float a){
    LOG.debug( a + " DATA FROM NON_STATIC METHOD WITH ONE ARGUMENT(ChCl)");
  }
}
