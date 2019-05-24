package by.moiseenko.entity;

import java.util.LinkedList;
import java.util.Queue;
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
public class Shop {
  private static final Logger LOG = LogManager.getLogger(Shop.class.getName());
  private static final int STORE_CAPACITY = 5;
  private int count;
  private int sold;
  private Queue<Goods> goods;
  private ReentrantLock lock;
  private Condition condition;

  public Shop(ReentrantLock lock) {
    this.lock = lock;
    this.goods = new LinkedList<>();
    this.condition = lock.newCondition();
    this.count = 0;
    this.sold = 0;
  }

  public void sellGoods() {
    lock.lock();
    try {
      while (goods.size() < STORE_CAPACITY) {
        condition.await();
      }
      while (goods.size() > 0) {
        LOG.debug("On the stock " + goods.size() + " goods.");
        TimeUnit.MILLISECONDS.sleep(50);
        goods.poll();
        sold++;
        LOG.debug("Sold one goods on stock. Now qty goods " + goods.size());
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    } finally {
      condition.signalAll();
      lock.unlock();

    }
  }

  public void produceGoods() {
    lock.lock();
    try {
      while (goods.size() > 0) {
        condition.await();
      }
      while (goods.size() < STORE_CAPACITY) {
        LOG.debug("On the stock " + goods.size() + " goods.");
        TimeUnit.MILLISECONDS.sleep(30);
        goods.add(new Goods(++count));
        LOG.debug("Add one goods on stock. Now qty goods " + goods.size());
      }
    } catch (InterruptedException ie) {
      LOG.error(ie);
    } finally {
      condition.signalAll();
      lock.unlock();

    }
  }

  public int getSold() {
    return sold;
  }

  public int getCount() {
    return count;
  }
}
