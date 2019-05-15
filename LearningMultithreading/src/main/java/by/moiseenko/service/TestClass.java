package by.moiseenko.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
class TestClass implements EmptyMethod {

  private String a;
  private String b;

  public TestClass(String a, String b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public void doThis() {
    System.out.println(a);
    System.out.println(b);
  }
}
