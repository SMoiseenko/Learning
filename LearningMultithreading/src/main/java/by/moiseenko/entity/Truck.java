package by.moiseenko.entity;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Truck implements Runnable {
  private static final Logger LOG = LogManager.getLogger(Truck.class.getName());

  private Phaser phaser;
  private String number;
  private int capacity;
  private Warehouse warehouseFrom;
  private Warehouse warehouseTo;
  private Queue<Goods> truckStorage;

  public Truck(
      Phaser phaser, String number, int capacity, Warehouse warehouseFrom, Warehouse warehouseTo) {
    this.phaser = phaser;
    this.number = number;
    this.capacity = capacity;
    this.warehouseFrom = warehouseFrom;
    this.warehouseTo = warehouseTo;
    this.truckStorage = new ArrayDeque<>(capacity);
    this.phaser.register();
  }

  @Override
  public void run() {
    loadTruck();
    phaser.arriveAndAwaitAdvance();
    goTruck();
    phaser.arriveAndAwaitAdvance();
    unloadTruck();
    phaser.arriveAndDeregister();
  }

  private void loadTruck() {
    for (int i = 0; i < capacity; i++) {
      Goods goods = warehouseFrom.getGoods();
      if (goods == null) {
        return;
      }
      truckStorage.add(goods);
      LOG.debug(
          "Goods #" + goods.getRegistrationNumber() + " was loaded on Truck #" + this.number + ".");
      try {
        TimeUnit.MILLISECONDS.sleep(50);
      } catch (InterruptedException ie) {
        LOG.error(ie);
      }
    }
  }

  private void unloadTruck() {
    int goodsOnBoardAmoint = truckStorage.size();
    for (int i = 0; i < goodsOnBoardAmoint; i++) {
      Goods goods = truckStorage.poll();
      warehouseTo.addGoods(goods);
      LOG.debug("Truck #" + this.number + " unload Goods #" + goods.getRegistrationNumber() + ".");
    }
    try {
      TimeUnit.MILLISECONDS.sleep(50);
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
  }

  private void goTruck() {
    try {
      TimeUnit.MILLISECONDS.sleep(new Random(100).nextInt(500));
      LOG.debug("Truck #" + this.number + " start trip.");
      TimeUnit.MILLISECONDS.sleep(new Random(100).nextInt(1000));
      LOG.debug("Truck# " + this.number + " finish trip.");
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
  }
}
