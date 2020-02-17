package by.moiseenko.behavioral.medoator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SenderImplA implements Sender {

  private static final Logger LOG = LogManager.getLogger(SenderImplA.class.getName());
  private Mediator mediator;
  private String name;



  public SenderImplA(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
  }

  @Override
  public void operation() {
    mediator.notifee(this);
  }

  @Override
  public String getName() {
    return name;
  }
}
