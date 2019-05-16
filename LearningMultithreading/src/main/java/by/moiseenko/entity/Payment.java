package by.moiseenko.entity;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Payment {
  private static final Logger LOG = LogManager.getLogger(Payment.class.getName());

  private int amount;
  private boolean close;

  public int getAmount() {
    return amount;
  }

  public boolean isClose() {
    return close;
  }

  public synchronized void doPayment() {
    try {
      LOG.debug("Start payment:");
      while (amount <= 0) {
        this.wait();
      }
      LOG.debug("Payment on amount " + amount + " was made.");
      close = true;
    } catch (InterruptedException ie) {
      LOG.error(ie);
    }
    LOG.debug("Is payment closed: " + close);
  }

  public void initAmount() {
    Scanner scanner = new Scanner(System.in);
    amount = scanner.nextInt();
  }
}
