package by.moiseenko.entity;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CrudeOil extends Thread {
  private static final Logger LOG = LogManager.getLogger(CrudeOil.class.getName());
  private int price;

  public CrudeOil(String name, int price) {
    super(name);
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public void run() {
    Random rnd = new Random();
    try {
      while (true) {
        Thread.sleep(rnd.nextInt(500));
        price = price + rnd.nextInt(10);
        LOG.debug("REAL PRICE" + price);
        Thread.sleep(rnd.nextInt(500));
        price = price + rnd.nextInt(10);
        LOG.debug("REAL PRICE" + price);
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
  }
}
