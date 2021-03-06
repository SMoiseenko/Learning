package by.moiseenko;

import by.moiseenko.entity.Person;
import by.moiseenko.myException.MyException;
import by.moiseenko.myException.MyRuntimeException;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
  private static StringBuilder nullString;
  private static final Logger logger = LogManager.getLogger(Runner.class);

  public static void main(String[] args) {
    int a = 1;
    int b = 0;
    int c;

    try {
      c = a / b;
      logger.debug(c);
      nullString.reverse();
      logger.debug(nullString);

    } catch (ArithmeticException | NullPointerException e) {
      logger.debug(e);
    }
    System.out.println("***********************");
    try {
      nullString.reverse();
      logger.debug(nullString);
    } catch (NullPointerException e) {
      logger.debug(e);
    }
    System.out.println("***********************");
    try {
      float d = DivideByZero.division(2, 3);
      logger.debug(d);
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println("***********************");
    int[] a1 = new int[10];
    for (int i = 0; i < 10; i++) {
      a1[i] = (int) (Math.random() * 2) - 1;
    }
    logger.debug(Arrays.toString(a1));
    System.out.println("***********************");
    try {
      StringBuilder str = new StringBuilder(a1[0]);
    } catch (NegativeArraySizeException e) {
      logger.debug(e);
    }
    System.out.println("***********************");

    try {
      throwNPE();
    } catch (NullPointerException e) {
      e.printStackTrace();
    }
    System.out.println("***********************");
    try {
      DivideByZero.testMyException(666);
    } catch (MyException e) {
      e.printStackTrace();
    }
    System.out.println("***********************");
    try {
      DivideByZero.testMyRuntimeException();
    } catch (MyRuntimeException e) {
      e.printStackTrace();
    }
    System.out.println("***********************");
    try {
      float devResFloat = DivideByZero.rethrowException(3, 0);
      logger.debug(devResFloat);
    } catch (MyRuntimeException e) {
      e.printStackTrace();
      System.out.println(e);
      System.err.println(e.getCause());
    }





Person chechik = new Person(48, "Yasya");

    int chechikAge = chechik.getAge();
    assert (chechikAge < 30) : "Сука он уже не моложежь";


  }

  static void throwNPE() {
    RuntimeException NPE = new NullPointerException("MY NPE");
    throw NPE;
  }
}
