package by.moiseenko.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class DivideInThread extends Thread {

  private static final Logger LOG = LogManager.getLogger(DivideInThread.class.getName());

  private double a, b, result;

  public DivideInThread(double a, double b) {
    this.a = a;
    this.b = b;
  }

  private void divider() {
    result = a / b;
  }

  public double getResult() {
    return result;
  }

  @Override
  public void run() {
    try {
      sleep(1000);
    } catch (InterruptedException e) {
      LOG.error(e);
    }
    LOG.debug("AM I DAEMON: " + this.isDaemon());
    divider();

    LOG.debug(result);
  }
}
