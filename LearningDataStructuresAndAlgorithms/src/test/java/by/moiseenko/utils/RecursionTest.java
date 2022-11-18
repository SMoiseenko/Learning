package by.moiseenko.utils;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class RecursionTest {

  private static Recursion rec;

  @BeforeAll
  public static void init() {
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
  void factorialParameterized(int i, int expected) {
    Assertions.assertEquals(expected, rec.factorial(i));
  }


  private static Object[][] data4Test() {
    return new Object[][]{
        {1920, 1080, 120},
        {1, 1, 1},
        {12097, 3191, 1}
    };
  }

  private static Object[][] data4Factorial() {
    return new Object[][]{
        {0, 1}, {1, 1}, {6, 720}, {10, 3_628_800}
    };
  }

  @Test
  void sumOfArrayTest() {
    //GIVEN
    int[] givenArray = {2, 6, 10};
    long expected = Arrays.stream(givenArray).sum();
    //WHEN
    long actual = rec.sumOfArray(givenArray);
    //THEN
    Assertions.assertEquals(expected, actual);
  }

  private static Object[][] data4countOfArray() {
    return new Object[][]{
        {new int[]{1}, 1},
        {new int[]{1, 2}, 2},
        {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 10},
        {new int[0], 0},
        {new int[100], 100}
    };
  }

  @ParameterizedTest
  @MethodSource("data4countOfArray")
  void countOfArrayTest(int[] arr, int expected) {
    Assertions.assertEquals(expected, rec.countOfArray(arr));
  }
}