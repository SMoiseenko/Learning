package by.moiseenko.behavioral.chain_of_responsibility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class UserPasswordHandler extends UserHandlerAbstract {

  private static final Logger LOG = LogManager.getLogger(UserPasswordHandler.class.getName());

  @Override
  public void handle(String[] request) {
    if(request[1].equals("GOD")){
      LOG.debug("Password .... OK.");
      super.handle(request);
    } else{
      LOG.debug(String.format("Password {%s} unacceptable!!!", request[1]));
    }

  }
}
