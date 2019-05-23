package by.moiseenko.service;

import by.moiseenko.entity.Item;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ItemService {
  private static final Logger LOG = LogManager.getLogger(ItemService.class.getName());

  private Item item;
  private ReentrantLock lock;
  private Condition condition;

  public ItemService(Item item) {
    this.item = item;
    this.lock = new ReentrantLock();
    this.condition = lock.newCondition();
  }

  public Item getItem() {
    lock.lock();
    try {
      LOG.debug("getItem: " + item);
      return item;
    } finally {
      lock.unlock();
    }
  }

  public void setItem(Item item) {
    lock.lock();
    try {
      TimeUnit.SECONDS.sleep(2);
      this.item = item;
      LOG.debug("setItem: " + item);
    } catch (InterruptedException ie) {
      LOG.error(ie);
    } finally {
      lock.unlock();
    }
  }
}
