package by.moiseenko.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class RecursionTest {

  private static Recursion rec;

  @BeforeAll
  private static void init() {
    rec = new Recursion();
  }

  @Test
  void squareSplitTest() {
    //GIVEN
    int width = 1680;
    int height = 640;
    int expected = 80;
    //WHEN
    int actual = rec.squareSplit(width, height);
    //THEN
    Assertions.assertEquals(expected, actual);
  }

  @ParameterizedTest
  @MethodSource("data4Test")
  void squareSplitParameterized(int width, int height, int expected) {
    Assertions.assertEquals(expected, rec.squareSplit(width, height));
  }


  @ParameterizedTest
  @MethodSource("data4Factorial")
  void factorialParameterized(int i, int expected){
    Assertions.assertEquals(expected, rec.factorial(i));
  }

  private static Object[][] data4Test() {
    return new Object[][]{
        {1920, 1080, 120},
        {1, 1, 1},
        {12097, 3191, 1}
    };
  }
  private static Object[][] data4Factorial(){
    return new Object[][]{
        {0,1},{1,1},{6,720}, {10, 3_628_800}
    };
  }

}