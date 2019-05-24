package by.moiseenko.service;

import by.moiseenko.entity.Shop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Buyer extends Thread {
  private static final Logger LOG = LogManager.getLogger(Buyer.class.getName());
  private final int NEED_TO_BUY = 100;

  private Shop shop;

  public Buyer(Shop shop) {

    this.shop = shop;
  }

  @Override
  public void run() {
    while (shop.getSold() < NEED_TO_BUY) {
      shop.sellGoods();
    }
    LOG.debug("I by " + shop.getSold() + " goods and not need anyone. Bye Bye)");
  }
}
