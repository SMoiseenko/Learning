package by.moiseenko.behavioral.command;

import java.util.Stack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ButtonHistory {

  private static final Logger LOG = LogManager.getLogger(ButtonHistory.class.getName());
  private Stack<Button> stack = new Stack<>();


  public void push(Button button){
    stack.push(button);
  }

  public Button pop(){
    return stack.pop();
  }

}
