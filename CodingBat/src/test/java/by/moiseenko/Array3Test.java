package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Array3Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Array3Test {

  private static Array3 a3;

  @BeforeAll
  public static void init() {
    a3 = new Array3Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#maxSpanDataProvider")
  void maxSpan(int[] nums, int expected) {
    assertEquals(expected, a3.maxSpan(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#fix34DataProvider")
  void fix34(int[] nums, int[] expected) {
    assertArrayEquals(expected, a3.fix34(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#fix45DataProvider")
  void fix45(int[] nums, int[] expected) {
    assertArrayEquals(expected, a3.fix45(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#canBalanceDataProvider")
  void canBalance(int[] nums, boolean expected) {
    assertEquals(expected, a3.canBalance(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#linearInDataProvider")
  void linearIn(int[] outer, int[] inner, boolean expected) {
    assertEquals(expected, a3.linearIn(outer, inner));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#squareUpDataProvider")
  void squareUp(int n, int[] expected) {
    assertArrayEquals(expected, a3.squareUp(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#seriesUpDataProvider")
  void seriesUp(int n, int[] expected) {
    assertArrayEquals(expected, a3.seriesUp(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#maxMirrorDataProvider")
  void maxMirror(int[] nums, int expected) {
    assertEquals(expected, a3.maxMirror(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array3TestDataProvider#countClumpsDataProvider")
  void countClumps(int[] nums, int expected) {
    assertEquals(expected, a3.countClumps(nums));
  }
}