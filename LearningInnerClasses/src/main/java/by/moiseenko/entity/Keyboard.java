package by.moiseenko.entity;

import by.moiseenko.utils.EventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Keyboard {

  private static final Logger LOG = LogManager.getLogger(Keyboard.class.getName());
  private final String key1 = "KEY_1";
  private final String key2 = "KEY_2";
  private final String key3 = "KEY_3";
  private EventHandler handler;

  public Keyboard(EventHandler handler) {
    this.handler = handler;
  }

  public void pushKey1() {
    LOG.debug(String.format("%s was pushed", key1));
    handler.execute();
  }

  public void pushKey2() {
    LOG.debug(String.format("%s was pushed", key2));
    handler.execute();
  }

  public void pushKey3() {
    LOG.debug(String.format("%s was pushed", key3));
    handler.execute();
  }

}
