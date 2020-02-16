package by.moiseenko.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ExecutorImpl implements Executor {
  private static final Logger LOG = LogManager.getLogger(ExecutorImpl.class.getName());


  @Override
  public void setText(String text) {

  }

  @Override
  public String getText() {
    return null;
  }

  @Override
  public void copy(String param) {

  }

  @Override
  public void paste(String param) {

  }

  @Override
  public void cut(String param) {

  }
}
