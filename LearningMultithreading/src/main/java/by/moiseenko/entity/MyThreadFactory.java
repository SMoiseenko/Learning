package by.moiseenko.entity;

import java.util.concurrent.ThreadFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class MyThreadFactory implements ThreadFactory {

  private static final Logger LOG = LogManager.getLogger(MyThreadFactory.class.getName());

  private int counter = 0;
  private String prefix;

  public MyThreadFactory(String prefix) {
    this.prefix = prefix;
  }

  @Override
  public Thread newThread(Runnable r) {
    Thread result = new Thread(new ThreadGroup("default-group"), r, prefix + "-" + counter++);
    result.setDaemon(false);
    result.setPriority(5);
    return result;
  }
}
