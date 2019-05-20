package by.moiseenko.entity;

import by.moiseenko.exception.AuctionNotFinishException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Auction {
  private static final Logger LOG = LogManager.getLogger(Auction.class.getName());
  public static final int BIDS_NUMBER = 5;
  private List<Bid> bids;
  private CyclicBarrier barrier;
  private Bid winner;

  public Auction() {
    this.bids = new ArrayList<>();
    this.barrier =
        new CyclicBarrier(
            BIDS_NUMBER,
            () -> {
              Bid winner = defineWinner();
              this.winner = winner;
              LOG.debug("Bid #" + winner.getNumber() + ", price: " + winner.getPrice() + " win!");
            });
  }

  public CyclicBarrier getBarrier() {
    return barrier;
  }

  public boolean addBid(Bid bid) {
    return bids.add(bid);
  }

  public Bid getWinner() throws AuctionNotFinishException{
    if (winner != null) {
      return winner;
    } else throw new AuctionNotFinishException();
  }

  private Bid defineWinner() {
    return Collections.max(bids, Comparator.comparing(Bid::getPrice));
  }
}
