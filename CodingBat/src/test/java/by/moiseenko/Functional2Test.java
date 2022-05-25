package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Functional2Impl;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Functional2Test {

  private static Functional2 f2;

  @BeforeAll
  private static void init() {
    f2 = new Functional2Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#noNegDataProvider")
  void noNeg(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f2.noNeg(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#no9DataProvider")
  void no9(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f2.no9(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#noTeenDataProvider")
  void noTeen(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f2.noTeen(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#noZDataProvider")
  void noZ(List<String> strings, List<String> expected) {
    assertEquals(expected, f2.noZ(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#noLongDataProvider")
  void noLong(List<String> strings, List<String> expected) {
    assertEquals(expected, f2.noLong(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#no34DataProvider")
  void no34(List<String> strings, List<String> expected) {
    assertEquals(expected, f2.no34(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#noYYDataProvider")
  void noYY(List<String> strings, List<String> expected) {
    assertEquals(expected, f2.noYY(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#two2DataProvider")
  void two2(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f2.two2(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Functional2TestDataProvider#square56DataProvider")
  void square56(List<Integer> nums, List<Integer> expected) {
    assertEquals(expected, f2.square56(nums));
  }
}