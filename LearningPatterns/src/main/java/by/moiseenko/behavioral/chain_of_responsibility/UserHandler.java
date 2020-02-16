package by.moiseenko.behavioral.chain_of_responsibility;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface UserHandler {

  void setNext(UserHandler userHandler);

  void handle(String[] request);
}
