package by.moiseenko.behavioral.chain_of_responsibility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public abstract class UserHandlerAbstract implements UserHandler {

  private static final Logger LOG = LogManager.getLogger(UserHandlerAbstract.class.getName());
  private UserHandler nextHandler;

  @Override
  public void setNext(UserHandler userHandler) {
    nextHandler = userHandler;
  }

  @Override
  public void handle(String[] request) {
    if(nextHandler!= null) nextHandler.handle(request);
  }
}
