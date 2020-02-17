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
  private String text;

  @Override
  public void setText(String text) {
    this.text = text;

  }

  @Override
  public String getText() {
    return text;
  }

  @Override
  public void copy(String param) {
    LOG.debug("Was invoked Executor.copy with parameters: " + param);

  }

  @Override
  public void paste(String param) {
    LOG.debug("Was invoked Executor.paste with parameters: " + param);
  }

  @Override
  public void cut(String param) {
    LOG.debug("Was invoked Executor.cut with parameters: " + param);
  }
}
