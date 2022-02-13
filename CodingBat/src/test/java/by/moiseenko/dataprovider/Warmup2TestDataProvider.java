package by.moiseenko.dataprovider;

/**
 * Data provider for Warmup2Test
 */
public class Warmup2TestDataProvider {

  public static Object[][] arrayCount9DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 9}, 1},
        {new int[]{1, 9, 9}, 2},
        {new int[]{1, 9, 9, 3, 9}, 3},
        {new int[]{1, 2, 3}, 0},
        {new int[0], 0},
        {new int[]{4, 2, 4, 3, 1}, 0},
        {new int[]{9, 2, 4, 3, 1}, 1}
    };
  }

  public static Object[][] arrayFront9DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 9, 3, 4}, true},
        {new int[]{1, 2, 3, 4, 9}, false},
        {new int[]{1, 2, 3, 4, 5}, false},
        {new int[]{9, 2, 3}, true},
        {new int[]{1, 9, 9}, true},
        {new int[]{1, 2, 3}, false},
        {new int[]{1, 9}, true},
        {new int[]{5, 5}, false},
        {new int[]{2}, false},
        {new int[]{9}, true},
        {new int[0], false},
        {new int[]{3, 9, 2, 3, 3}, true}
    };
  }

  public static Object[][] array123DataProvider() {
    return new Object[][]{
        {new int[]{1, 1, 2, 3, 1}, true},
        {new int[]{1, 1, 2, 4, 1}, false},
        {new int[]{1, 1, 2, 1, 2, 3}, true},
        {new int[]{1, 1, 2, 1, 2, 1}, false},
        {new int[]{1, 2, 3, 1, 2, 3}, true},
        {new int[]{1, 2, 3}, true},
        {new int[]{1, 1, 1}, false},
        {new int[]{1, 2}, false},
        {new int[]{1}, false},
        {new int[0], false}
    };
  }

  public static Object[][] array667DataProvider() {
    return new Object[][]{
        {new int[]{6, 6, 2}, 1},
        {new int[]{6, 6, 2, 6}, 1},
        {new int[]{6, 7, 2, 6}, 1},
        {new int[]{6, 6, 2, 6, 7}, 2},
        {new int[]{1, 6, 3}, 0},
        {new int[]{6, 1}, 0},
        {new int[0], 0},
        {new int[]{3, 6, 7, 6}, 1},
        {new int[]{3, 6, 6, 7}, 2},
        {new int[]{6, 3, 6, 6}, 1},
        {new int[]{6, 7, 6, 6}, 2},
        {new int[]{1, 2, 3, 5, 6}, 0},
        {new int[]{1, 2, 3, 6, 6}, 1}
    };
  }

  public static Object[][] noTriplesDataProvider() {
    return new Object[][]{
        {new int[]{1, 1, 2, 2, 1}, true},
        {new int[]{1, 1, 2, 2, 2, 1}, false},
        {new int[]{1, 1, 1, 2, 2, 2, 1}, false},
        {new int[]{1, 1, 2, 2, 1, 2, 1}, true},
        {new int[]{1, 2, 1}, true},
        {new int[]{1, 1, 1}, false},
        {new int[]{1, 1}, true},
        {new int[]{1}, true},
        {new int[]{}, true}
    };
  }

  public static Object[][] has271DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 7, 1}, true},
        {new int[]{1, 2, 8, 1}, false},
        {new int[]{2, 7, 1}, true},
        {new int[]{3, 8, 2}, true},
        {new int[]{2, 7, 3}, true},
        {new int[]{2, 7, 4}, false},
        {new int[]{2, 7, -1}, true},
        {new int[]{2, 7, -2}, false},
        {new int[]{4, 5, 3, 8, 0}, true},
        {new int[]{2, 7, 5, 10, 4}, true},
        {new int[]{2, 7, -2, 4, 9, 3}, true},
        {new int[]{2, 7, 5, 10, 1}, false},
        {new int[]{2, 7, -2, 4, 10, 2}, false},
        {new int[]{1, 1, 4, 9, 0}, false},
        {new int[]{1, 1, 4, 9, 4, 9, 2}, true}
    };
  }
}
