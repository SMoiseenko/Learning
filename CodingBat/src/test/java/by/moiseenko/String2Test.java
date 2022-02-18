package by.moiseenko;

import static org.junit.jupiter.api.Assertions.*;

import by.moiseenko.impl.String2Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class String2Test {

  private static String2 s2;

  @BeforeAll
  private static void init() {
    s2 = new String2Impl();
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/doubleChar.csv")
  void doubleChar(String str, String expected) {
    assertEquals(expected, s2.doubleChar(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/countHi.csv")
  void countHi(String str, int expected) {
    assertEquals(expected, s2.countHi(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/catDog.csv")
  void catDog(String str, boolean expected) {
    assertEquals(expected, s2.catDog(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/countCode.csv")
  void countCode(String str, int expected) {
    assertEquals(expected, s2.countCode(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/endOther.csv")
  void endOther(String a, String b, boolean expected) {
    assertEquals(expected, s2.endOther(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/xyzThere.csv")
  void xyzThere(String str, boolean expected) {
    assertEquals(expected, s2.xyzThere(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/bobThere.csv")
  void bobThere(String str, boolean expected) {
    assertEquals(expected, s2.bobThere(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/xyBalance.csv")
  void xyBalance(String str, boolean expected) {
    assertEquals(expected, s2.xyBalance(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/mixString.csv")
  void mixString(String a, String b, String expected) {
    assertEquals(expected, s2.mixString(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/repeatEnd.csv")
  void repeatEnd(String str, int n, String expected) {
    assertEquals(expected, s2.repeatEnd(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/repeatFront.csv")
  void repeatFront(String str, int n, String expected) {
    assertEquals(expected, s2.repeatFront(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/repeatSeparator.csv")
  void repeatSeparator(String word, String sep, int count, String expected) {
    assertEquals(expected, s2.repeatSeparator(word, sep, count));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/prefixAgain.csv")
  void prefixAgain(String str, int n, boolean expected) {
    assertEquals(expected, s2.prefixAgain(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/xyzMiddle.csv")
  void xyzMiddle(String str, boolean expected) {
    assertEquals(expected, s2.xyzMiddle(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/getSandwich.csv")
  void getSandwich(String str, String expected) {
    assertEquals(expected, s2.getSandwich(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/sameStarChar.csv")
  void sameStarChar(String str, boolean expected) {
    assertEquals(expected, s2.sameStarChar(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/oneTwo.csv")
  void oneTwo(String str, String expected) {
    assertEquals(expected, s2.oneTwo(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/zipZap.csv")
  void zipZap(String str, String expected) {
    assertEquals(expected, s2.zipZap(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/starOut.csv")
  void starOut(String str, String expected) {
    assertEquals(expected, s2.starOut(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/plusOut.csv")
  void plusOut(String str, String word, String expected) {
    assertEquals(expected, s2.plusOut(str, word));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string2/wordEnds.csv")
  void wordEnds(String str, String word, String expected) {
    assertEquals(expected, s2.wordEnds(str, word));
  }
}