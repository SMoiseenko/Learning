package by.moiseenko.entity;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class PriceDisplay extends Thread {
  private static final Logger LOG = LogManager.getLogger(PriceDisplay.class.getName());
  private static final long DELAY = 500L;
  private CrudeOil crudeOil;
  private int number;

  public PriceDisplay(CrudeOil crudeOil, int number) {
    super("DISPLAY-" + number);
    this.crudeOil = crudeOil;
    this.number = number;
  }

  @Override
  public void run() {
    while (true) {
      try {
        TimeUnit.MILLISECONDS.sleep(DELAY);
        LOG.debug("DISPLAYED PRICE = " + crudeOil.getPrice());
      } catch (InterruptedException e) {
        LOG.error(e);
      }
    }
  }
}
