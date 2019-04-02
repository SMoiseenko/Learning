package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class MessageUtils {

  private static final Logger LOG = LogManager.getLogger(MessageUtils.class.getName());

  public void getDataFromMessage(Message<?> message) {
    LOG.debug(message.getData());
  }
}
