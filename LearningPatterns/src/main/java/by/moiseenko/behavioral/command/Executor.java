package by.moiseenko.behavioral.command;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface Executor {

  String getText();

  void setText(String text);

  void copy(String param);

  void paste(String param);

  void cut(String param);

}
