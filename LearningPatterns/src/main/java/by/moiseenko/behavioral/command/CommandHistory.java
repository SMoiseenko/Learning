package by.moiseenko.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class CommandHistory {

  private static final Logger LOG = LogManager.getLogger(CommandHistory.class.getName());
  private Queue<Command> stack = new LinkedList<>();



}
