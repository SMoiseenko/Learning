package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Payment<T extends CharSequence, T1 extends Number> {

  private static final Logger LOG = LogManager.getLogger(Payment.class.getName());
  private T nameValue;
  private T1 decValue;

  public Payment(T nameValue, T1 decValue) {
    this.nameValue = nameValue;
    this.decValue = decValue;
  }

  @Override
  public String toString() {
    return "Payment{" + "nameValue=" + nameValue + ", decValue=" + decValue + '}';
  }
}
