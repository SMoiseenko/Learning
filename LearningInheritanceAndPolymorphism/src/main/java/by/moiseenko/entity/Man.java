package by.moiseenko.entity;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Man implements Cloneable, Mannable {

  private static final Logger LOG = LogManager.getLogger(Man.class.getName());

  private int id;
  private String name;
  private int age;
  private Passport passport;

  public Man(int id, String name, int age, Passport passport) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.passport = passport;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Passport getPassport() {
    return passport;
  }

  public void setPassport(Passport passport) {
    this.passport = passport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Man)) {
      return false;
    }
    Man man = (Man) o;
    return getId() == man.getId()
        && getAge() == man.getAge()
        && getName().equals(man.getName())
        && getPassport().equals(man.getPassport());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getName(), getAge(), getPassport());
  }

  @Override
  public String toString() {
    return getClass().getName()
        + "{id="
        + id
        + ", name='"
        + name
        + '\''
        + ", age="
        + age
        + ", passport="
        + passport
        + '}';
  }

  @Override
  public Man clone() throws CloneNotSupportedException {
    return (Man)super.clone();
  }

  @Override
  protected void finalize() throws Throwable {
    LOG.debug("I WAS FINNALIZATED" + this);
    super.finalize();
  }
}
