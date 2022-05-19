package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Array1Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Array1Test {

  private static Array1 a1;

  @BeforeAll
  private static void init() {
    a1 = new Array1Impl();
  }


  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#firstLast6DataProvider")
  void firstLast6(int[] nums, boolean expected) {
    assertEquals(expected, a1.firstLast6(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#sameFirstLastDataProvider")
  void sameFirstLast(int[] nums, boolean expected) {
    assertEquals(expected, a1.sameFirstLast(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#makePiDataProvider")
  void makePi(int[] expected) {
    assertEquals(expected, a1.makePi());
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#commonEndDataProvider")
  void commonEnd(int[] a, int[] b, boolean expected) {
    assertEquals(expected, a1.commonEnd(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#sum3DataProvider")
  void sum3(int[] nums, int expected) {
    assertEquals(expected, a1.sum3(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#rotateLeft3DataProvider")
  void rotateLeft3(int[] nums, int[] expected) {
    assertEquals(expected, a1.rotateLeft3(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#reverse3DataProvider")
  void reverse3(int[] nums, int[] expected) {
    assertEquals(expected, a1.reverse3(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#maxEnd3DataProvider")
  void maxEnd3(int[] nums, int[] expected) {
    assertEquals(expected, a1.maxEnd3(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#sum2DataProvider")
  void sum2(int[] nums, int expected) {
    assertEquals(expected, a1.sum2(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#middleWayDataProvider")
  void middleWay(int[] a, int[] b, int[] expected) {
    assertEquals(expected, a1.middleWay(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#makeEndsDataProvider")
  void makeEnds(int[] nums, int[] expected) {
    assertEquals(expected, a1.makeEnds(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#has23DataProvider")
  void has23(int[] nums, boolean expected) {
    assertEquals(expected, a1.has23(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#no23DataProvider")
  void no23(int[] nums, boolean expected) {
    assertEquals(expected, a1.no23(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#makeLastDataProvider")
  void makeLast(int[] nums, int[] expected) {
    assertEquals(expected, a1.makeLast(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#double23DataProvider")
  void double23(int[] nums, boolean expected) {
    assertEquals(expected, a1.double23(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#fix23DataProvider")
  void fix23(int[] nums, int[] expected) {
    assertEquals(expected, a1.fix23(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#start1DataProvider")
  void start1(int[] a, int[] b, int expected) {
    assertEquals(expected, a1.start1(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#biggerTwoDataProvider")
  void biggerTwo(int[] a, int[] b, int[] expected) {
    assertEquals(expected, a1.biggerTwo(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#makeMiddleDataProvider")
  void makeMiddle(int[] nums, int[] expected) {
    assertEquals(expected, a1.makeMiddle(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#plusTwoDataProvider")
  void plusTwo(int[] a, int[] b, int[] expected) {
    assertEquals(expected, a1.plusTwo(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#swapEndsDataProvider")
  void swapEnds(int[] nums, int[] expected) {
    assertEquals(expected, a1.swapEnds(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#midThreeDataProvider")
  void midThree(int[] nums, int[] expected) {
    assertEquals(expected, a1.midThree(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#maxTripleDataProvider")
  void maxTriple(int[] nums, int expected) {
    assertEquals(expected, a1.maxTriple(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#frontPieceDataProvider")
  void frontPiece(int[] nums, int[] expected) {
    assertEquals(expected, a1.frontPiece(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#unlucky1DataProvider")
  void unlucky1(int[] nums, boolean expected) {
    assertEquals(expected, a1.unlucky1(nums));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#make2DataProvider")
  void make2(int[] a, int[] b, int[] expected) {
    assertEquals(expected, a1.make2(a, b));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Array1TestDataProvider#front11DataProvider")
  void front11(int[] a, int[] b, int[] expected) {
    assertEquals(expected, a1.front11(a, b));
  }
}