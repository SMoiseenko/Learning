package by.moiseenko.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ArrayUtilsTest {

  private final int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
  private final ArrayUtils arrayUtils = new ArrayUtils();

  private static Object[][] dateProvider() {
    return new Object[][]{
        {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10}, 20, -1},
        {new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, 16, 6},
        {new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19}, 19, 9},
        {new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100}, 10, 0}
    };
  }

  @Test
  void binarySearch() {
    assertEquals(-1, arrayUtils.binarySearch(arr, 15), "Regular binary search should work.");
  }

  @ParameterizedTest
  @MethodSource("dateProvider")
  void binarySearchParameterized(int[] arr, int i, int result) {
    assertEquals(result, arrayUtils.binarySearch(arr, i), "Regular binary search should work.");
  }
}