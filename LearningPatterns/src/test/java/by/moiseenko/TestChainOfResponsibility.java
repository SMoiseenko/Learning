package by.moiseenko;

import by.moiseenko.behavioral.chain_of_responsibility.UserHandler;
import by.moiseenko.behavioral.chain_of_responsibility.UserLoginHandler;
import by.moiseenko.behavioral.chain_of_responsibility.UserPasswordHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestChainOfResponsibility {

  private static final Logger LOG = LogManager.getLogger(TestChainOfResponsibility.class.getName());

  @Test
  void testChainOfResponsibility(){
    String[] requestGood = {"ADMIN", "GOD"};
    String[] requestBad = {"ADMIN", "ADMIN"};

    UserHandler handler1 = new UserLoginHandler();
    UserHandler handler2 = new UserPasswordHandler();
    handler1.setNext(handler2);
    handler1.handle(requestGood);
    handler1.handle(requestBad);
    Assertions.assertEquals(1,1);

  }

}
