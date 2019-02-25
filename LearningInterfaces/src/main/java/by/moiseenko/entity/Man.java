package by.moiseenko.entity;

import by.moiseenko.annotation.ManAgeValidator;

@ManAgeValidator(minAge = 18, maxAge = 60)
public class Man {
  private String name;

  private int age;

  public Man(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Man{" + "name='" + name + '\'' + ", age=" + age + '}';
  }
}
