package by.moiseenko.behavioral.chain_of_responsibility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class UserLoginHandler extends UserHandlerAbstract {
  private static final Logger LOG = LogManager.getLogger(UserLoginHandler.class.getName());

  @Override
  public void handle(String[] request) {
    if(request[0].equals("ADMIN")){
      LOG.debug("Login .... OK.");
      super.handle(request);
    } else{
      LOG.debug(String.format("Login {%s} unacceptable!!!", request[0]));
    }

  }
}
