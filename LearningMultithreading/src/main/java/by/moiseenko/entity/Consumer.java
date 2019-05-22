package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Consumer extends Subject implements Runnable {
  private static final Logger LOG = LogManager.getLogger(Consumer.class.getName());

  public Consumer(String name, Item item) {
    super(name, item);
  }

  @Override
  public void run() {
    try {
      synchronized (item) {
        int requiredNumber = item.getNumber();
        item = exchanger.exchange(item);

        LOG.debug(
            (requiredNumber >= item.getNumber())
                ? "Consumer " + getName() + " increases the price of a good."
                : "Consumer " + getName() + " decreases the price of a good.");
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
  }
}
