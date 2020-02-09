package by.moiseenko.creational.prototype;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Dog extends Animal {

  private static final Logger LOG = LogManager.getLogger(Dog.class.getName());

  private String color;

  public Dog() {
  }

  public Dog(Dog dog) {
    super(dog);
    if (dog != null) {
      this.color = dog.color;
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public Animal clone() {
    return new Dog(this);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Dog)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Dog dog = (Dog) o;
    return color.equals(dog.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), color);
  }
}
