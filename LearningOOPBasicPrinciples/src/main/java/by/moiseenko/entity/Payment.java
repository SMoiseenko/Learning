package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Payment<A, B> {

  private static final Logger LOG = LogManager.getLogger(Payment.class.getName());

  private A nameValue;
  private B digitValue;

  public Payment(A nameValue, B digitValue) {
    this.nameValue = nameValue;
    this.digitValue = digitValue;
  }

  public A getNameValue() {
    return nameValue;
  }

  public void setNameValue(A nameValue) {
    this.nameValue = nameValue;
  }

  public B getDigitValue() {
    return digitValue;
  }

  public void setDigitValue(B digitValue) {
    this.digitValue = digitValue;
  }

  public static void calculate(float a, int... sum) {
    if (a == 0) {
      throw new IllegalArgumentException();
    }
    int result = 0;
    for (int s1 : sum) {
      result += s1;
    }

    LOG.debug(result / a);
  }

  public static void printToLOG(String[] names, int[]... args) {
    LOG.debug("NAMES:");
    for (String s : names) {
      LOG.debug(s);
    }
    int qty = 0;
    for (int[] t : args) {
      LOG.debug(String.format("int array #%d:", qty++));
      for (int t1 : t) {
        LOG.debug(t1);
      }
    }
  }

  @Override
  public String toString() {
    return "Payment{" + "nameValue=" + nameValue + ", digitValue=" + digitValue + '}';
  }
}
