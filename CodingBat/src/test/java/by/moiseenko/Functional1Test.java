package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Functional1Impl;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Functional1Test {

  private static Functional1 f1;

  @BeforeAll
  static void init() {
    f1 = new Functional1Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#doublingDataProvider")
  void doubling(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f1.doubling(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#squareDataProvider")
  void square(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f1.square(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#addStarDataProvider")
  void addStar(List<String> strings, List<String> expected) {
    assertEquals(expected, f1.addStar(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#copies3DataProvider")
  void copies3(List<String> strings, List<String> expected) {
    assertEquals(expected, f1.copies3(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#moreYDataProvider")
  void moreY(List<String> strings, List<String> expected) {
    assertEquals(expected, f1.moreY(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#math1DataProvider")
  void math1(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f1.math1(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#rightDigitDataProvider")
  void rightDigit(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f1.rightDigit(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#lowerDataProvider")
  void lower(List<String> strings, List<String> expected) {
    assertEquals(expected, f1.lower(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional1TestDataProvider#noXDataProvider")
  void noX(List<String> strings, List<String> expected) {
    assertEquals(expected, f1.noX(strings));
  }
}