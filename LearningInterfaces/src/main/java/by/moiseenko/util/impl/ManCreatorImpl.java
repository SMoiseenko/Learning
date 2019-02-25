package by.moiseenko.util.impl;

import by.moiseenko.annotation.ManAgeValidator;
import by.moiseenko.entity.Man;
import by.moiseenko.exception.YouForgetAnnotationException;
import by.moiseenko.util.ManCreator;

public class ManCreatorImpl implements ManCreator {
  @Override
  public Man createMan(String name, int age) throws YouForgetAnnotationException {

    int validAge = manAgeValidator(age);
    return new Man(name, validAge);
  }

  private int manAgeValidator(int age) throws YouForgetAnnotationException {
    int minAge = Integer.MIN_VALUE;
    int maxAge = Integer.MAX_VALUE;
    Class manClass = Man.class;
    if (manClass.isAnnotationPresent(ManAgeValidator.class)) {
      ManAgeValidator mav = (ManAgeValidator) manClass.getAnnotation(ManAgeValidator.class);
      minAge = mav.minAge();
      maxAge = mav.maxAge();
    } else throw new YouForgetAnnotationException("Be careful");

    if (age < minAge) {
      throw new IllegalArgumentException("Man too young!!! age = " + age);
    }
    if (age > maxAge) {
      throw new IllegalArgumentException("Man To old!!! age = " + age);
    }
    return age;
  }
}
