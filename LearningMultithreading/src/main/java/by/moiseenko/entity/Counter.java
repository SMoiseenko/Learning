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

  private int count = 0;

  public synchronized void increaseCounter() {
    int tempcount = this.count;

    try {
      Thread.sleep(10L);
    } catch (InterruptedException e) {
      LOG.error(e);
    }
    this.count = ++tempcount;
    LOG.debug(count);
  }

  public void decreaseCounter() {
    count--;
    LOG.debug(count);
  }

  public int getCount() {
    return count;
  }
}
