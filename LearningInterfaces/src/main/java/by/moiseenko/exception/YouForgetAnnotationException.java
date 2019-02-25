package by.moiseenko.exception;

public class YouForgetAnnotationException extends Exception {
  public YouForgetAnnotationException() {}

  public YouForgetAnnotationException(String message) {
    super(message);
  }

  public YouForgetAnnotationException(String message, Throwable cause) {
    super(message, cause);
  }

  public YouForgetAnnotationException(Throwable cause) {
    super(cause);
  }
}
