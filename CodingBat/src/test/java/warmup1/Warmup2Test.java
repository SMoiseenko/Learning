package warmup1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import warmup1.impl.Warmup2Impl;

class Warmup2Test {

  private static Warmup2 w2;

  @BeforeAll
  private static void init() {
    w2 = new Warmup2Impl();
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringTimes.csv")
  void stringTimes(String str, int n, String expected) {
    assertEquals(expected, w2.stringTimes(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/frontTimes.csv")
  void frontTimes(String str, int n, String expected) {
    assertEquals(expected, w2.frontTimes(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/countXX.csv")
  void countXX(String str, int expected) {
    assertEquals(expected, w2.countXX(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/doubleX.csv")
  void doubleX(String str, boolean expected) {
    assertEquals(expected, w2.doubleX(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringBits.csv")
  void stringBits(String str, String expected) {
    assertEquals(expected, w2.stringBits(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringSplosion.csv")
  void stringSplosion(String str, String expected) {
    assertEquals(expected, w2.stringSplosion(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/last2.csv")
  void last2(String str, int expected) {
    assertEquals(expected, w2.last2(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/arrayCount9.csv")
  void arrayCount9(int[] nums, int expected) {
    assertEquals(expected, w2.arrayCount9(nums));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/arrayFront9.csv")
  void arrayFront9(int[] nums, boolean expected) {
    assertEquals(expected, w2.arrayFront9(nums));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/array123.csv")
  void array123(int[] nums, boolean expected) {
    assertEquals(expected, w2.array123(nums));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringMatch.csv")
  void stringMatch(String a, String b, int expected) {
    assertEquals(expected, w2.stringMatch(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringX.csv")
  void stringX(String str, String expected) {
    assertEquals(expected, w2.stringX(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/altPairs.csv")
  void altPairs(String str, String expected) {
    assertEquals(expected, w2.altPairs(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/stringYak.csv")
  void stringYak(String str, String expected) {
    assertEquals(expected, w2.stringYak(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/array667.csv")
  void array667(int[] nums, int expected) {
    assertEquals(expected, w2.array667(nums));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/noTriples.csv")
  void noTriples(int[] nums, boolean expected) {
    assertEquals(expected, w2.noTriples(nums));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup2/has271.csv")
  void has271(int[] nums, boolean expected) {
    assertEquals(expected, w2.has271(nums));
  }
}