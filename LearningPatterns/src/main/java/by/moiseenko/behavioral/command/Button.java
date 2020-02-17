package by.moiseenko.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Button {
  private static final Logger LOG = LogManager.getLogger(Button.class.getName());

  private Command command;

  public Button(Command command) {
    this.command = command;
  }

  public void push(){
    command.execute();
  }

}
