package by.moiseenko.structural.facade;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Payment {

  private static final Logger LOG = LogManager.getLogger(Payment.class.getName());


  public void receivePayment(){
    LOG.debug("Payment was received;");
  }

}
