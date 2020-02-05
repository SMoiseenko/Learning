package by.moiseenko.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Salad {

  private static final Logger LOG = LogManager.getLogger(Salad.class.getName());

  private int one;
  private int two;
  private int three;
  private int four;
  private int fifth;

  public void setOne(int one) {
    this.one = one;
  }

  public void setTwo(int two) {
    this.two = two;
  }

  public void setThree(int three) {
    this.three = three;
  }

  public void setFour(int four) {
    this.four = four;
  }

  public void setFifth(int fifth) {
    this.fifth = fifth;
  }

  @Override
  public String toString() {
    return "Salad{" +
        "one=" + one +
        ", two=" + two +
        ", three=" + three +
        ", four=" + four +
        ", fifth=" + fifth +
        '}';
  }
}
