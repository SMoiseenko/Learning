package by.moiseenko.structural.bridge;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Radio implements Device {

  private static final Logger LOG = LogManager.getLogger(Radio.class.getName());
  private boolean isEnable;
  private int volume;
  private int channel;

  public Radio() {
    isEnable = false;
    volume = 0;
    channel = 0;
  }

  @Override
  public void enable() {
    isEnable = true;

  }

  @Override
  public void disable() {
    isEnable = false;
  }

  @Override
  public int getVolume() {
    return volume;
  }

  @Override
  public void setVolume(int vol) {
    volume = vol;

  }

  @Override
  public int getChannel() {
    return channel;
  }

  @Override
  public void setChannel(int ch) {
    channel = ch;

  }

  @Override
  public void printStatus() {
    LOG.debug(this.toString());
  }

  @Override
  public String toString() {
    return "Radio{" +
        "isEnable=" + isEnable +
        ", volume=" + volume +
        ", channel=" + channel +
        '}';
  }
}
