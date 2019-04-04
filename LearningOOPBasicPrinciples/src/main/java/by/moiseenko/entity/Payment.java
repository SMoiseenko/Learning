package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Payment<A extends CharSequence, B extends Number> {

  private static final Logger LOG = LogManager.getLogger(Payment.class.getName());

  private A nameValue;
  private B digitValue;

  public Payment(A nameValue, B digitValue) {
    this.nameValue = nameValue;
    this.digitValue = digitValue;
  }

  @Override
  public String toString() {
    return "Payment{" +
        "nameValue=" + nameValue +
        ", digitValue=" + digitValue +
        '}';
  }
}
