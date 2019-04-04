package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Message<T extends Number> {

  private static final Logger LOG = LogManager.getLogger(Message.class.getName());
  private T data;

  public Message() {
  }

  public Message(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void printThisAndAnotherClasses(Message<?> another){
    LOG.debug(this.toString());
    LOG.debug(another.toString());
  }
  @Override
  public String toString() {
    return data.getClass().getSimpleName() + "{" +
        "data=" + data +
        '}';
  }
}
