package by.moiseenko.behavioral.command;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public abstract class Command {

 protected String param;
  protected Executor executor;
  protected String textBackup;

  public Command(Executor executor,String param) {
    this.param = param;
    this.executor = executor;
  }

  protected void saveBackup() {
    textBackup = executor.getText();
  }

  protected void restoreBackup(){
    executor.setText(textBackup);
  }

  abstract public void execute();
}
