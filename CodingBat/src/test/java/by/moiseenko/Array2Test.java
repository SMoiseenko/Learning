package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Array2Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Array2Test {

  private static Array2 a2;

  @BeforeAll
  private static void init() {
    a2 = new Array2Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#countEvensDataProvider")
  void countEvens(int[] nums, int expected) {
    assertEquals(expected, a2.countEvens(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#bigDiffDataProvider")
  void bigDiff(int[] nums, int expected) {
    assertEquals(expected, a2.bigDiff(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#centeredAverageDataProvider")
  void centeredAverage(int[] nums, int expected) {
    assertEquals(expected, a2.centeredAverage(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#sum13DataProvider")
  void sum13(int[] nums, int expected) {
    assertEquals(expected, a2.sum13(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#sum67DataProvider")
  void sum67(int[] nums, int expected) {
    assertEquals(expected, a2.sum67(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#has22DataProvider")
  void has22(int[] nums, boolean expected) {
    assertEquals(expected, a2.has22(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#lucky13DataProvider")
  void lucky13(int[] nums, boolean expected) {
    assertEquals(expected, a2.lucky13(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#sum28DataProvider")
  void sum28(int[] nums, boolean expected) {
    assertEquals(expected, a2.sum28(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#more14DataProvider")
  void more14(int[] nums, boolean expected) {
    assertEquals(expected, a2.more14(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#fizzArrayDataProvider")
  void fizzArray(int n, int[] expected) {
    assertEquals(expected, a2.fizzArray(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#only14DataProvider")
  void only14(int[] nums, boolean expected) {
    assertEquals(expected, a2.only14(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#fizzArray2DataProvider")
  void fizzArray2(int n, String[] expected) {
    assertEquals(expected, a2.fizzArray2(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#no14DataProvider")
  void no14(int[] nums, boolean expected) {
    assertEquals(expected, a2.no14(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#isEverywhereDataProvider")
  void isEverywhere(int[] nums, int val, boolean expected) {
    assertEquals(expected, a2.isEverywhere(nums, val));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#either24DataProvider")
  void either24(int[] nums, boolean expected) {
    assertEquals(expected, a2.either24(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#matchUpDataProvider")
  void matchUp(int[] nums1, int[] nums2, int expected) {
    assertEquals(expected, a2.matchUp(nums1, nums2));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#has77DataProvider")
  void has77(int[] nums, boolean expected) {
    assertEquals(expected, a2.has77(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#has12DataProvider")
  void has12(int[] nums, boolean expected) {
    assertEquals(expected, a2.has12(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#modThreeDataProvider")
  void modThree(int[] nums, boolean expected) {
    assertEquals(expected, a2.modThree(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#haveThreeDataProvider")
  void haveThree(int[] nums, boolean expected) {
    assertEquals(expected, a2.haveThree(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#twoTwoDataProvider")
  void twoTwo(int[] nums, boolean expected) {
    assertEquals(expected, a2.twoTwo(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#sameEndsDataProvider")
  void sameEnds(int[] nums, int len, boolean expected) {
    assertEquals(expected, a2.sameEnds(nums, len));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#tripleUpDataProvider")
  void tripleUp(int[] nums, boolean expected) {
    assertEquals(expected, a2.tripleUp(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#fizzArray3DataProvider")
  void fizzArray3(int start, int end, int[] expected) {
    assertEquals(expected, a2.fizzArray3(start, end));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#shiftLeftDataProvider")
  void shiftLeft(int[] nums, int[] expected) {
    assertEquals(expected, a2.shiftLeft(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#tenRunDataProvider")
  void tenRun(int[] nums, int[] expected) {
    assertEquals(expected, a2.tenRun(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#pre4DataProvider")
  void pre4(int[] nums, int[] expected) {
    assertEquals(expected, a2.pre4(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#post4DataProvider")
  void post4(int[] nums, int[] expected) {
    assertEquals(expected, a2.post4(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#notAloneDataProvider")
  void notAlone(int[] nums, int val, int[] expected) {
    assertEquals(expected, a2.notAlone(nums, val));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#zeroFrontDataProvider")
  void zeroFront(int[] nums, int[] expected) {
    assertEquals(expected, a2.zeroFront(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#withoutTenDataProvider")
  void withoutTen(int[] nums, int[] expected) {
    assertEquals(expected, a2.withoutTen(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#zeroMaxDataProvider")
  void zeroMax(int[] nums, int[] expected) {
    assertEquals(expected, a2.zeroMax(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#evenOddDataProvider")
  void evenOdd(int[] nums, int[] expected) {
    assertEquals(expected, a2.evenOdd(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array2TestDataProvider#fizzBuzzDataProvider")
  void fizzBuzz(int start, int end, String[] expected) {
    assertEquals(expected, a2.fizzBuzz(start, end));
  }
}