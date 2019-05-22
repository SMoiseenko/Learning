package by.moiseenko.entity;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CrudeOilAtomic extends Thread {
  private static final Logger LOG = LogManager.getLogger(CrudeOilAtomic.class.getName());
  private AtomicInteger price;

  public CrudeOilAtomic(String name, AtomicInteger price) {
    super(name);
    this.price = price;
  }

  public AtomicInteger getPrice() {
    return price;
  }

  @Override
  public void run() {
    Random rnd = new Random();
    for (; ; ) {
      try {
        Thread.sleep(rnd.nextInt(500));
        price.addAndGet(rnd.nextInt(100));
        LOG.debug(price);
        Thread.sleep(rnd.nextInt(500));
        price.addAndGet(rnd.nextInt(100));
        LOG.debug(price);
      } catch (InterruptedException ie) {
        LOG.error(ie);
      }
    }
  }
}
