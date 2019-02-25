package by.moiseenko.exception;

public class MethodDoNotRealizeException extends Exception {

  public MethodDoNotRealizeException() {}

  public MethodDoNotRealizeException(String message) {
    super(message);
  }

  public MethodDoNotRealizeException(String message, Throwable cause) {
    super(message, cause);
  }

  public MethodDoNotRealizeException(Throwable cause) {
    super(cause);
  }
}
