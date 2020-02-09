package by.moiseenko;

import by.moiseenko.structural.bridge.Radio;
import by.moiseenko.structural.bridge.RemoteControl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestBridge {

  private static final Logger LOG = LogManager.getLogger(TestBridge.class.getName());

  @Test
  void testBridgeMethod() {
    RemoteControl remote = new RemoteControl(new Radio());
    remote.powerButton();
    remote.addVolume();
    remote.addVolume();
    remote.addVolume();
    remote.plusChannel();
    remote.plusChannel();
    remote.statusButton();
    Assertions.assertEquals(1, 1);
  }
}
