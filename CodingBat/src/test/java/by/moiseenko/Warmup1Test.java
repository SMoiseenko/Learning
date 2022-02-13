package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Warmup1Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Warmup1Test {

  private static Warmup1 w;

  @BeforeAll
  static void init() {
    w = new Warmup1Impl();
  }

  @ParameterizedTest(name = "{index} => weekday={0}, vacation={1}, expected={2}")
  @MethodSource("by.moiseenko.dataprovider.Warmup1TestDataProvider#sleepInDataProvider")
  void sleepIn(boolean weekday, boolean vacation, boolean expected) {
    assertEquals(expected, w.sleepIn(weekday, vacation));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/monkeyTrouble.csv", numLinesToSkip = 1)
  void monkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
    assertEquals(expected, w.monkeyTrouble(aSmile, bSmile));
  }

  @ParameterizedTest(name = "{displayName} => a={0}, b={1}, expected={2}")
  @MethodSource("by.moiseenko.dataprovider.Warmup1TestDataProvider#sumDoubleDataProvider")
  void sumDouble(int a, int b, int expected) {
    assertEquals(expected, w.sumDouble(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/diff21.csv", numLinesToSkip = 1)
  void diff21(int n, int expected) {
    assertEquals(expected, w.diff21(n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/parrotTrouble.csv", numLinesToSkip = 1)
  void parrotTrouble(boolean talking, int hour, boolean expected) {
    assertEquals(expected, w.parrotTrouble(talking, hour));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/makes10.csv")
  void makes10(int a, int b, boolean expected) {
    assertEquals(expected, w.makes10(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/nearHundred.csv")
  void nearHundred(int n, boolean expected) {
    assertEquals(expected, w.nearHundred(n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/posNeg.csv")
  void posNeg(int a, int b, boolean negative, boolean expected) {
    assertEquals(expected, w.posNeg(a, b, negative));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/notString.csv")
  void notString(String str, String expected) {
    assertEquals(expected, w.notString(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/missingChar.csv")
  void missingChar(String str, int n, String expected) {
    assertEquals(expected, w.missingChar(str, n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/frontBack.csv")
  void frontBack(String str, String expected) {
    assertEquals(expected, w.frontBack(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/front3.csv")
  void front3(String str, String expected) {
    assertEquals(expected, w.front3(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/backAround.csv")
  void backAround(String str, String expected) {
    assertEquals(expected, w.backAround(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/or35.csv")
  void or35(int n, boolean expected) {
    assertEquals(expected, w.or35(n));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/front22.csv")
  void front22(String str, String expected) {
    assertEquals(expected, w.front22(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/startHi.csv")
  void startHi(String str, boolean expected) {
    assertEquals(expected, w.startHi(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/icyHot.csv")
  void icyHot(int temp1, int temp2, boolean expected) {
    assertEquals(expected, w.icyHot(temp1, temp2));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/in1020.csv")
  void in1020(int a, int b, boolean expected) {
    assertEquals(expected, w.in1020(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/hasTeen.csv")
  void hasTeen(int a, int b, int c, boolean expected) {
    assertEquals(expected, w.hasTeen(a, b, c));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/loneTeen.csv")
  void loneTeen(int a, int b, boolean expected) {
    assertEquals(expected, w.loneTeen(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/delDel.csv")
  void delDel(String str, String expected) {
    assertEquals(expected, w.delDel(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/mixStart.csv")
  void mixStart(String str, boolean expected) {
    assertEquals(expected, w.mixStart(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/startOz.csv")
  void startOz(String str, String expected) {
    assertEquals(expected, w.startOz(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/intMax.csv")
  void intMax(int a, int b, int c, int expected) {
    assertEquals(expected, w.intMax(a, b, c));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/close10.csv")
  void close10(int a, int b, int expected) {
    assertEquals(expected, w.close10(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/in3050.csv")
  void in3050(int a, int b, boolean expected) {
    assertEquals(expected, w.in3050(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/max1020.csv")
  void max1020(int a, int b, int expected) {
    assertEquals(expected, w.max1020(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/stringE.csv")
  void stringE(String str, boolean expected) {
    assertEquals(expected, w.stringE(str));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/lastDigit.csv")
  void lastDigit(int a, int b, boolean expected) {
    assertEquals(expected, w.lastDigit(a, b));
  }

  @ParameterizedTest
  @CsvFileSource(resources = "/warmup1/endUp.csv")
  void endUp(String str, String expected) {
    assertEquals(expected, w.endUp(str));
  }

  @ParameterizedTest
  @DisplayName("everyNth()")
  @CsvFileSource(resources = "/warmup1/everyNth.csv", numLinesToSkip = 1)
  void everyNth(String src, int n, String expected) {
    assertEquals(expected, w.everyNth(src, n));
  }
}