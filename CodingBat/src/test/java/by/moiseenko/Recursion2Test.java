package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Recursion2Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */


class Recursion2Test {

  private static Recursion2 r2;

  @BeforeAll
  private static void init() {
    r2 = new Recursion2Impl();
  }


  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#groupSumDataProvider")
  void groupSum(int start, int[] nums, int target, boolean expected) {
    assertEquals(expected, r2.groupSum(start, nums, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#groupSum6DataProvider")
  void groupSum6(int start, int[] nums, int target, boolean expected) {
    assertEquals(expected, r2.groupSum6(start, nums, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#groupNoAdjDataProvider")
  void groupNoAdj(int start, int[] nums, int target, boolean expected) {
    assertEquals(expected, r2.groupNoAdj(start, nums, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#groupSum5DataProvider")
  void groupSum5(int start, int[] nums, int target, boolean expected) {
    assertEquals(expected, r2.groupSum5(start, nums, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#groupSumClumpDataProvider")
  void groupSumClump(int start, int[] nums, int target, boolean expected) {
    assertEquals(expected, r2.groupSumClump(start, nums, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#splitArrayDataProvider")
  void splitArray(int[] nums, boolean expected) {
    assertEquals(expected, r2.splitArray(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#splitOdd10DataProvider")
  void splitOdd10(int[] nums, boolean expected) {
    assertEquals(expected, r2.splitOdd10(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion2TestDataProvider#split53DataProvider")
  void split53(int[] nums, boolean expected) {
    assertEquals(expected, r2.split53(nums));
  }
}