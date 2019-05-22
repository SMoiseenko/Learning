package by.moiseenko.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class AuctionNotFinishException extends Exception {
  private static final Logger LOG = LogManager.getLogger(AuctionNotFinishException.class.getName());

  public AuctionNotFinishException() {
    super();
  }

  public AuctionNotFinishException(String message) {
    super(message);
  }

  public AuctionNotFinishException(String message, Throwable cause) {
    super(message, cause);
  }

  public AuctionNotFinishException(Throwable cause) {
    super(cause);
  }
}
