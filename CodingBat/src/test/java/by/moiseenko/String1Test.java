package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.String1Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

/**
 * Change implementation in init() method to your.
 */
class String1Test {

  private static String1 s1;

  @BeforeAll
  private static void init() {
    s1 = new String1Impl();
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/helloName.csv")
  void helloName(String name, String expected) {
    assertEquals(expected, s1.helloName(name));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/makeAbba.csv")
  void makeAbba(String a, String b, String expected) {
    assertEquals(expected, s1.makeAbba(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/makeTags.csv")
  void makeTags(String tag, String word, String expected) {
    assertEquals(expected, s1.makeTags(tag, word));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/makeOutWord.csv")
  void makeOutWord(String out, String word, String expected) {
    assertEquals(expected, s1.makeOutWord(out, word));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/extraEnd.csv")
  void extraEnd(String str, String expected) {
    assertEquals(expected, s1.extraEnd(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/firstTwo.csv")
  void firstTwo(String str, String expected) {
    assertEquals(expected, s1.firstTwo(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/firstHalf.csv")
  void firstHalf(String str, String expected) {
    assertEquals(expected, s1.firstHalf(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/withoutEnd.csv")
  void withoutEnd(String str, String expected) {
    assertEquals(expected, s1.withoutEnd(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/comboString.csv")
  void comboString(String a, String b, String expected) {
    assertEquals(expected, s1.comboString(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/nonStart.csv")
  void nonStart(String a, String b, String expected) {
    assertEquals(expected, s1.nonStart(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/left2.csv")
  void left2(String str, String expected) {
    assertEquals(expected, s1.left2(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/right2.csv")
  void right2(String str, String expected) {
    assertEquals(expected, s1.right2(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/theEnd.csv")
  void theEnd(String str, boolean front, String expected) {
    assertEquals(expected, s1.theEnd(str, front));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/withouEnd2.csv")
  void withouEnd2(String str, String expected) {
    assertEquals(expected, s1.withouEnd2(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/middleTwo.csv")
  void middleTwo(String str, String expected) {
    assertEquals(expected, s1.middleTwo(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/endsLy.csv")
  void endsLy(String str, boolean expected) {
    assertEquals(expected, s1.endsLy(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/nTwice.csv")
  void nTwice(String str, int n, String expected) {
    assertEquals(expected, s1.nTwice(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/twoChar.csv")
  void twoChar(String str, int index, String expected) {
    assertEquals(expected, s1.twoChar(str, index));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/middleThree.csv")
  void middleThree(String str, String expected) {
    assertEquals(expected, s1.middleThree(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/hasBad.csv")
  void hasBad(String str, boolean expected) {
    assertEquals(expected, s1.hasBad(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/atFirst.csv")
  void atFirst(String str, String expected) {
    assertEquals(expected, s1.atFirst(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/lastChars.csv")
  void lastChars(String a, String b, String expected) {
    assertEquals(expected, s1.lastChars(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/conCat.csv")
  void conCat(String a, String b, String expected) {
    assertEquals(expected, s1.conCat(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/lastTwo.csv")
  void lastTwo(String str, String expected) {
    assertEquals(expected, s1.lastTwo(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/seeColor.csv")
  void seeColor(String str, String expected) {
    assertEquals(expected, s1.seeColor(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/frontAgain.csv")
  void frontAgain(String str, boolean expected) {
    assertEquals(expected, s1.frontAgain(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/minCat.csv")
  void minCat(String a, String b, String expected) {
    assertEquals(expected, s1.minCat(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/extraFront.csv")
  void extraFront(String str, String expected) {
    assertEquals(expected, s1.extraFront(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/without2.csv")
  void without2(String str, String expected) {
    assertEquals(expected, s1.without2(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/deFront.csv")
  void deFront(String str, String expected) {
    assertEquals(expected, s1.deFront(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/startWord.csv")
  void startWord(String str, String word, String expected) {
    assertEquals(expected, s1.startWord(str, word));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/withoutX.csv")
  void withoutX(String str, String expected) {
    assertEquals(expected, s1.withoutX(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/string1/withoutX2.csv")
  void withoutX2(String str, String expected) {
    assertEquals(expected, s1.withoutX2(str));
  }
}