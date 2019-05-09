package by.moiseenko.service;

import by.moiseenko.entity.Counter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CounterUsedThread implements Runnable {

  private static final Logger LOG = LogManager.getLogger(CounterUsedThread.class.getName());
  private Counter counter;

  public CounterUsedThread(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
      for (int i = 0; i < 5; i++) {
      counter.increaseCounter();
    }
  }
}
