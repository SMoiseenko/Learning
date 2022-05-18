package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.AP1Impl;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class AP1Test {

  public static AP1 ap1;

  @BeforeAll
  private static void init() {
    ap1 = new AP1Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scoresIncreasingDataProvider")
  void scoresIncreasing(int[] scores, boolean expected) {
    assertEquals(expected, ap1.scoresIncreasing(scores));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scores100DataProvider")
  void scores100(int[] scores, boolean expected) {
    assertEquals(expected, ap1.scores100(scores));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scoresClumpDataProvider")
  void scoresClump(int[] scores, boolean expected) {
    assertEquals(expected, ap1.scoresClump(scores));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scoresAverageDataProvider")
  void scoresAverage(int[] scores, int expected) {
    assertEquals(expected, ap1.scoresAverage(scores));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#wordsCountDataProvider")
  void wordsCount(String[] words, int len, int expected) {
    assertEquals(expected, ap1.wordsCount(words, len));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#wordsFrontDataProvider")
  void wordsFront(String[] words, int n, String[] expected) {
    assertEquals(expected, ap1.wordsFront(words, n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#wordsWithoutListDataProvider")
  void wordsWithoutList(String[] words, int len, List<String> expected) {
    assertEquals(expected, ap1.wordsWithoutList(words, len));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#hasOneDataProvider")
  void hasOne(int n, boolean expected) {
    assertEquals(expected, ap1.hasOne(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#dividesSelfDataProvider")
  void dividesSelf(int n, boolean expected) {
    assertEquals(expected, ap1.dividesSelf(n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#copyEvensDataProvider")
  void copyEvens(int[] nums, int count, int[] expected) {
    assertEquals(expected, ap1.copyEvens(nums, count));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#copyEndyDataProvider")
  void copyEndy(int[] nums, int count, int[] expected) {
    assertEquals(expected, ap1.copyEndy(nums, count));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#matchUpDataProvider")
  void matchUp(String[] a, String[] b, int expected) {
    assertEquals(expected, ap1.matchUp(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scoreUpDataProvider")
  void scoreUp(String[] key, String[] answers, int expected) {
    assertEquals(expected, ap1.scoreUp(key, answers));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#wordsWithoutDataProvider")
  void wordsWithout(String[] words, String target, String[] expected) {
    assertEquals(expected, ap1.wordsWithout(words, target));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#scoresSpecialDataProvider")
  void scoresSpecial(int[] a, int[] b, int expected) {
    assertEquals(expected, ap1.scoresSpecial(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#sumHeightsDataProvider")
  void sumHeights(int[] heights, int start, int end, int expected) {
    assertEquals(expected, ap1.sumHeights(heights, start, end));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#sumHeights2DataProvider")
  void sumHeights2(int[] heights, int start, int end, int expected) {
    assertEquals(expected, ap1.sumHeights2(heights, start, end));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#bigHeightsDataProvider")
  void bigHeights(int[] heights, int start, int end, int expected) {
    assertEquals(expected, ap1.bigHeights(heights, start, end));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#userCompareDataProvider")
  void userCompare(String aName, int aId, String bName, int bId, int expected) {
    assertEquals(expected, ap1.userCompare(aName, aId, bName, bId));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#mergeTwoDataProvider")
  void mergeTwo(String[] a, String[] b, int n, String[] expected) {
    assertEquals(expected, ap1.mergeTwo(a, b, n));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.AP1TestDataProvider#commonTwoDataProvider")
  void commonTwo(String[] a, String[] b, int expected) {
    assertEquals(expected, ap1.commonTwo(a, b));
  }
}