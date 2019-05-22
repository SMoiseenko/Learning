package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Producer extends Subject implements Runnable {
  private static final Logger LOG = LogManager.getLogger(Producer.class.getName());

  public Producer(String name, Item item) {
    super(name, item);
  }

  @Override
  public void run() {
    try {
      synchronized (item) {
        int proposedNumber = item.getNumber();
        item = exchanger.exchange(item);

        LOG.debug(
            (proposedNumber <= item.getNumber())
                ? "Producer " + getName() + " increases the production of a good plan."
                : "Producer " + getName() + " decreases the production of a good plan.");
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
  }
}
