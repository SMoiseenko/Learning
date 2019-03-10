package by.moiseenko.testDataProvider;

import by.moiseenko.utils.Mathematics;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {
  private static final Logger LOG = LogManager.getLogger(TestDataProvider.class);
  private Mathematics mathematics = null;

  @DataProvider
  public Object[][] forAddMethod() {
    return new Object[][] {{5, 2, 3}, {8, 4, 4}, {11, 5, 6}};
  }

  @DataProvider
  public Object[][] forSubtractMethod() {
    return new Object[][] {{5, 10, 5}, {13, 23, 10}};
  }

  @DataProvider
  public Object[][] forDivideMethod() {
    return new Object[][] {{10, 100, 10}};
  }

  @DataProvider
  public Object[][] forDivideMethodWithException() {
    return new Object[][] {{5, 0}};
  }

  @BeforeClass
  public void mathematicInstanceCreator() {
    LOG.debug(
        "Test  @BeforeClass annotation. In this method new Mathematics instance was created.");
    mathematics = new Mathematics();
  }

  @BeforeMethod
  public void testBeforeMethodAnnotation(){
      LOG.debug(
              "@BeforeMethod annotation before testAddMethod method. Has execute every time before each method in this class.");
  }

  @Test(dataProvider = "forAddMethod")
  public void testAddMethod(int expected, int a, int b) {
    int actual = mathematics.add(a, b);
    LOG.debug(String.format("Actual: %d, expected: %d", actual, expected));
    Assert.assertEquals(actual, expected);
  }

  @Test(dataProvider = "forSubtractMethod")
  public void testSubtractMethod(int expected, int a, int b) {
    int actual = mathematics.subtract(a, b);
    LOG.debug(String.format("Actual: %d, expected: %d", actual, expected));
    Assert.assertEquals(actual, expected);
  }

  @Test(dataProvider = "forDivideMethodWithException", expectedExceptions = ArithmeticException.class)
    public void testDivideMethodException(int a, int b){
     mathematics.divide(a,b);
     LOG.debug("ArithmeticException was found");

  }
}
