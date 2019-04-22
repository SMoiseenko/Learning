package by.moiseenko.entity;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Passport implements Cloneable{

  private static final Logger LOG = LogManager.getLogger(Passport.class.getName());
private long number;

  public Passport(long number) {
    this.number = number;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Passport)) {
      return false;
    }
    Passport passport = (Passport) o;
    return getNumber() == passport.getNumber();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNumber());
  }

  @Override
  public String toString() {
    return "Passport{" +
        "number=" + number +
        '}';
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
