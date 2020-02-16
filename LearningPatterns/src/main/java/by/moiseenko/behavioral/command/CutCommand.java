package by.moiseenko.behavioral.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CutCommand extends Command {

  private static final Logger LOG = LogManager.getLogger(CutCommand.class.getName());


  public CutCommand(Executor executor, String param) {
    super(executor, param);
  }

  @Override
  public void execute() {
    executor.cut(param);
  }
}
