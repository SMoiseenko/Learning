package by.moiseenko.behavioral.medoator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ConcreteMediator implements Mediator {

  private static final Logger LOG = LogManager.getLogger(ConcreteMediator.class.getName());



  @Override
  public void notifee(Sender sender) {
    if (sender.getName().equals("A")) {
      reactOnA();
    }
  }

  void reactOnA() {
    LOG.debug("Was pushed SenderA");
  }

}
