package by.moiseenko.util.impl;

import by.moiseenko.util.ClassUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassUtilsImpl implements ClassUtils {
  @Override
  public void printAllClassElementsInfo(Object target) {
    Class<?> targetClass = target.getClass();
    ClassLoader targetClassLoader = targetClass.getClassLoader();
    Field[] classFields = targetClass.getDeclaredFields();
    Constructor[] classConstructors = targetClass.getDeclaredConstructors();
    Method[] classMethods = targetClass.getMethods();
    System.out.println(targetClassLoader);
    System.out.println(targetClass.getName() + " has next fields:");
    for (Field f : classFields) {
      System.out.println(f);
    }
    System.out.println("has next constructors:");
    for (Constructor c : classConstructors) {
      System.out.println(c);
    }
    System.out.println("has next methods:");
    for (Method m : classMethods) {
      System.out.println(m);
    }
  }
}
