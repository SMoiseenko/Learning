package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
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

  public void printThisAndAnotherClasses(Message<?> message){
    LOG.debug(this.toString() + " - " + message.toString());
  }

  @Override
  public String toString() {
    return data.getClass().getSimpleName() + " {" +
        "data=" + data +
        '}';
  }
}
