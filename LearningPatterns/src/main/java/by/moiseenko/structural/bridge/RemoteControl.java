package by.moiseenko.structural.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class RemoteControl {

  private static final Logger LOG = LogManager.getLogger(RemoteControl.class.getName());

  private Device device;

  public RemoteControl(Device device) {
    this.device = device;
  }

  public void powerButton() {
    device.enable();
  }

  public void powerButtonTwice() {
    device.disable();
  }

  public void addVolume() {
    device.setVolume(device.getVolume() + 1);
  }

  public void reduceVolume() {
    device.setVolume(device.getVolume() - 1);
  }

  public void mute() {
    device.setVolume(0);
  }

  public void plusChannel() {
    device.setChannel(device.getChannel() + 1);
  }

  public void minusChannel() {
    device.setChannel(device.getChannel() - 1);
  }

  public void statusButton() {
    device.printStatus();
  }
}
