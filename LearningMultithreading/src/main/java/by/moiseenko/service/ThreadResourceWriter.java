package by.moiseenko.service;

import by.moiseenko.entity.Resource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ThreadResourceWriter extends Thread {

  private static final Logger LOG = LogManager.getLogger(ThreadResourceWriter.class.getName());
  private Resource res;

  public ThreadResourceWriter(Resource res, String name) {
    super(name);
    this.res = res;
  }

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      res.write(getName(), i);
    }
  }
}
