package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.String3Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Change implementation in init() method to your.
 */
class String3Test {

  private static String3 s3;

  @BeforeAll
  private static void init() {
    s3 = new String3Impl();
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/countYZ.csv")
  void countYZ(String str, int expected) {
    assertEquals(expected, s3.countYZ(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/withoutString.csv")
  void withoutString(String base, String remove, String expected) {
    assertEquals(expected, s3.withoutString(base, remove));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/equalIsNot.csv")
  void equalIsNot(String str, boolean expected) {
    assertEquals(expected, s3.equalIsNot(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/gHappy.csv")
  void gHappy(String str, boolean expected) {
    assertEquals(expected, s3.gHappy(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/countTriple.csv")
  void countTriple(String str, int expected) {
    assertEquals(expected, s3.countTriple(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/sumDigits.csv")
  void sumDigits(String str, int expected) {
    assertEquals(expected, s3.sumDigits(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/sameEnds.csv")
  void sameEnds(String string, String expected) {
    assertEquals(expected, s3.sameEnds(string));
  }


  @ParameterizedTest
  @CsvFileSource(resources = "/string3/mirrorEnds.csv")
  void mirrorEnds(String string, String expected) {
    assertEquals(expected, s3.mirrorEnds(string));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/maxBlock.csv")
  void maxBlock(String str, int expected) {
    assertEquals(expected, s3.maxBlock(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/sumNumbers.csv")
  void sumNumbers(String str, int expected) {
    assertEquals(expected, s3.sumNumbers(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string3/notReplace.csv")
  void notReplace(String str, String expected) {
    assertEquals(expected, s3.notReplace(str));
  }
}