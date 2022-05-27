package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Map1Impl;
import java.util.Map;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Map1Test {

  private static Map1 m1;

  @BeforeAll
  private static void init() {
    m1 = new Map1Impl();
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapBullyDataProvider")
  void mapBully(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapBully(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapShareDataProvider")
  void mapShare(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapShare(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapABDataProvider")
  void mapAB(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapAB(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#topping1DataProvider")
  void topping1(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.topping1(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#topping2DataProvider")
  void topping2(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.topping2(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#topping3DataProvider")
  void topping3(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.topping3(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapAB2DataProvider")
  void mapAB2(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapAB2(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapAB3DataProvider")
  void mapAB3(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapAB3(map));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Map1TestDataProvider#mapAB4DataProvider")
  void mapAB4(Map<String, String> map, Map<String, String> expected) {
    assertEquals(expected, m1.mapAB4(map));
  }
}