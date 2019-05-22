package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Summator extends Thread {
  private static final Logger LOG = LogManager.getLogger(Summator.class.getName());
  private int[] a;

  public Summator(ThreadGroup threadGroup, String name, int... a) {
    super(threadGroup, name);
    this.a = a;
  }

  private int summ(int[] a) {
    int result = 0;
    for (int i : a) {
      result += i;
    }
    return result;
  }

  @Override
  public void run() {
    LOG.debug(summ(a));
    LOG.debug(Thread.currentThread().getThreadGroup());
  }
}
