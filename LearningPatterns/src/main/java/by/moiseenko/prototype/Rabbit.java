package by.moiseenko.prototype;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Rabbit extends Animal {

  private static final Logger LOG = LogManager.getLogger(Rabbit.class.getName());

  private int age;


  public Rabbit() {
  }

  public Rabbit(Rabbit rabbit) {
    super(rabbit);
    if (rabbit != null) {
      this.age = rabbit.age;
    }
  }

  @Override
  public Animal clone() {
    return new Rabbit(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Rabbit)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Rabbit rabbit = (Rabbit) o;
    return age == rabbit.age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), age);
  }

  @Override
  public String toString() {
    return "Rabbit{" +
        "age=" + age +
        ", gender=" + gender +
        ", name='" + name + '\'' +
        '}';
  }
}
