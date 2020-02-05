package by.moiseenko.prototype;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class Animal {

  private static final Logger LOG = LogManager.getLogger(Animal.class.getName());

  protected Gender gender;
  protected String name;

  public Animal() {
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Animal(Animal animal) {
    if (animal != null) {
      this.gender = animal.gender;
      this.name = animal.name;
    }
  }

  public abstract Animal clone();

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Animal)) {
      return false;
    }
    Animal animal = (Animal) o;
    return getGender() == animal.getGender() &&
        getName().equals(animal.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getGender(), getName());
  }
}
