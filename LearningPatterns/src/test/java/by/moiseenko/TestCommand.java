package by.moiseenko;

import by.moiseenko.behavioral.command.Button;
import by.moiseenko.behavioral.command.ButtonHistory;
import by.moiseenko.behavioral.command.Command;
import by.moiseenko.behavioral.command.CopyCommand;
import by.moiseenko.behavioral.command.CutCommand;
import by.moiseenko.behavioral.command.Executor;
import by.moiseenko.behavioral.command.ExecutorImpl;
import by.moiseenko.behavioral.command.PasteCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class TestCommand {

  private static final Logger LOG = LogManager.getLogger(TestCommand.class.getName());
  private static ButtonHistory history = new ButtonHistory();

  @Test
  void testCommand(){

    Executor executor = new ExecutorImpl();

    Command cutCommand = new CutCommand(executor, "22cut33");
    Command pasteCommand = new PasteCommand(executor, "54paste32");
    Command copyCommand = new CopyCommand(executor, "19copy762");

    Button cutButton = new Button(cutCommand);
    Button pasteButton = new Button(pasteCommand);
    Button copyButton = new Button(copyCommand);

    execute(cutButton);
    execute(pasteButton);
    execute(copyButton);

    Assertions.assertEquals(1,1);

  }

  private void execute (Button button){
    button.push();
    history.push(button);
    }
}
