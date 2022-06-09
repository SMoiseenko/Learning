package by.moiseenko.dataprovider;

/**
 * Data provider for Recursion1Test
 */
public class Recursion1TestDataProvider {

  public static Object[][] array6DataProvider() {
    return new Object[][]{
        {new int[]{1, 6, 4}, 0, true},
        {new int[]{1, 4}, 0, false},
        {new int[]{6}, 0, true},
        {new int[0], 0, false},
        {new int[]{6, 2, 2}, 0, true},
        {new int[]{2, 5}, 0, false},
        {new int[]{1, 9, 4, 6, 6}, 0, true},
        {new int[]{2, 5, 6}, 0, true},
    };
  }

  public static Object[][] array11DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 11}, 0, 1},
        {new int[]{11, 11}, 0, 2},
        {new int[]{1, 2, 3, 4}, 0, 0},
        {new int[]{1, 11, 3, 11, 11}, 0, 3},
        {new int[]{11}, 0, 1},
        {new int[]{1}, 0, 0},
        {new int[0], 0, 0},
        {new int[]{11, 2, 3, 4, 11, 5}, 0, 2},
        {new int[]{11, 5, 11}, 0, 2},
    };
  }

  public static Object[][] array220DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 20}, 0, true},
        {new int[]{3, 30}, 0, true},
        {new int[]{3}, 0, false},
        {new int[0], 0, false},
        {new int[]{3, 3, 30, 4}, 0, true},
        {new int[]{2, 19, 4}, 0, false},
        {new int[]{20, 2, 21}, 0, false},
        {new int[]{20, 2, 21, 210}, 0, true},
        {new int[]{2, 200, 2000}, 0, true},
        {new int[]{0, 0}, 0, true},
        {new int[]{1, 2, 3, 4, 5, 6}, 0, false},
        {new int[]{1, 2, 3, 4, 5, 50, 6}, 0, true},
        {new int[]{1, 2, 3, 4, 5, 51, 6}, 0, false},
        {new int[]{1, 2, 3, 4, 4, 50, 500, 6}, 0, true},
    };
  }
}
