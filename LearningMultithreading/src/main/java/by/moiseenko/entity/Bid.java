package by.moiseenko.entity;

import by.moiseenko.exception.AuctionNotFinishException;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Bid extends Thread {
  private static final Logger LOG = LogManager.getLogger(Bid.class.getName());

  private int number;
  private int price;
  private CyclicBarrier barrier;
  private Auction auction;

  public Bid(int number, int price, Auction auction) {
    this.number = number;
    this.price = price;
    this.auction = auction;
    this.barrier = auction.getBarrier();

  }

  public int getNumber() {
    return number;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public void run() {
    try {
      LOG.debug("Client " + number + " specifies a price:" + price);
      Thread.sleep(new Random().nextInt(3000));
      int bidQty = new Random().nextInt(4)+1;
      for (int i = 0; i < bidQty; i++) {
        int delta = new Random().nextInt(50);
        price += delta;
        LOG.debug("Client " + number + " set bid: " + price);
      }
      barrier.await();
      if (this.equals(auction.getWinner())) {
        LOG.debug("Client " + number + " pay " + price + " and receive amazing lot!!!");
      }
    } catch (InterruptedException | BrokenBarrierException | AuctionNotFinishException exc) {
      LOG.error(exc);
    }
  }
}
