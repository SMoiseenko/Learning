package by.moiseenko.entity;

import by.moiseenko.utils.Handler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Button {
  private static final Logger LOG = LogManager.getLogger(Button.class.getName());
  private String name;

  public Button(String name) {

    this.name = name;
  }

  public void click(Handler handler) {
    handler.onClick(name);
  }
}
