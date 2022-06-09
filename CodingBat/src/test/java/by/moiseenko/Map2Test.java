package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Map2Impl;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Map2Test {

  private static Map2 m2;

  @BeforeAll
  private static void init() {
    m2 = new Map2Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#word0DataProvider")
  void word0(String[] strings, Map<String, Integer> expected) {
    assertEquals(expected, m2.word0(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#wordLenDataProvider")
  void wordLen(String[] strings, Map<String, Integer> expected) {
    assertEquals(expected, m2.wordLen(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#pairsDataProvider")
  void pairs(String[] strings, Map<String, String> expected) {
    assertEquals(expected, m2.pairs(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#wordCountDataProvider")
  void wordCount(String[] strings, Map<String, Integer> expected) {
    assertEquals(expected, m2.wordCount(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#firstCharDataProvider")
  void firstChar(String[] strings, Map<String, String> expected) {
    assertEquals(expected, m2.firstChar(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#wordAppendDataProvider")
  void wordAppend(String[] strings, String expected) {
    assertEquals(expected, m2.wordAppend(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#wordMultipleDataProvider")
  void wordMultiple(String[] strings, Map<String, Boolean> expected) {
    assertEquals(expected, m2.wordMultiple(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#allSwapDataProvider")
  void allSwap(String[] strings, String[] expected) {
    assertArrayEquals(expected, m2.allSwap(strings));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map2TestDataProvider#firstSwapDataProvider")
  void firstSwap(String[] strings, String[] expected) {
    assertArrayEquals(expected, m2.firstSwap(strings));
  }
}