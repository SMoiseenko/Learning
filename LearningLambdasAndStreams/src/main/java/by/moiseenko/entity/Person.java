package by.moiseenko.entity;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Person implements Cloneable {
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

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(Sex sex) {
    this.sex = sex;
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
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
  }
}
