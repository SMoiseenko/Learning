package by.moiseenko.entity;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Person {
  private static final Logger LOG = LogManager.getLogger(Person.class.getName());

  private String name;
  private int age;
  private Sex sex;

  public Person() {
  }

  public Person(String name, int age, Sex sex) {
    this.name = name;
    this.age = age;
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Sex getSex() {
    return sex;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return age == person.age && name.equals(person.name) && sex == person.sex;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age, sex);
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
  }
}
