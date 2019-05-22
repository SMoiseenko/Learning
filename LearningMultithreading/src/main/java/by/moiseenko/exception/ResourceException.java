package by.moiseenko.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ResourceException extends Exception {
  private static final Logger LOG = LogManager.getLogger(ResourceException.class.getName());

  public ResourceException() {
    super();
  }

  public ResourceException(String message) {
    super(message);
  }

  public ResourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public ResourceException(Throwable cause) {
    super(cause);
  }
}
