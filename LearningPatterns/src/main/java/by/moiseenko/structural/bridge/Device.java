package by.moiseenko.structural.bridge;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface Device {

  void enable();

  void disable();

  int getVolume();

  void setVolume(int vol);

  int getChannel();

  void setChannel(int ch);

  void printStatus();
}
