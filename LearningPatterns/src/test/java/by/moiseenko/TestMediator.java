package by.moiseenko;

import by.moiseenko.behavioral.medoator.ConcreteMediator;
import by.moiseenko.behavioral.medoator.Mediator;
import by.moiseenko.behavioral.medoator.Sender;
import by.moiseenko.behavioral.medoator.SenderImplA;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestMediator {

  private static final Logger LOG = LogManager.getLogger(TestMediator.class.getName());

  @Test
  void testMediator() {
    Mediator mediator = new ConcreteMediator();
    Sender sender = new SenderImplA(mediator, "A");
    sender.operation();
    Assertions.assertEquals(1,1);
  }
}
