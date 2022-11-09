package by.moiseenko.service;

import by.moiseenko.entity.Shop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Provider extends Thread {
  private static final Logger LOG = LogManager.getLogger(Provider.class.getName());
  private Shop shop;
  private Buyer buyer;

  public Provider(Shop shop, Buyer buyer) {
    this.shop = shop;
    this.buyer = buyer;
  }

  @Override
  public void run() {
    while (buyer.isAlive()) {
     shop.produceGoods();
    }
    LOG.debug("Was produced " + shop.getCount() + " goods.");
    LOG.debug("We lost our buyer, so we need to close our manufacture (((");
  }
}