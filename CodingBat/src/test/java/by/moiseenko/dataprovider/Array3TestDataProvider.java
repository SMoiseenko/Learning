package by.moiseenko.dataprovider;

/**
 * Data provider for Array3Test
 */
public class Array3TestDataProvider {

  public static Object[][] maxSpanDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 1, 1, 3}, 4},
        {new int[]{1, 4, 2, 1, 4, 1, 4}, 6},
        {new int[]{1, 4, 2, 1, 4, 4, 4}, 6},
        {new int[]{3, 3, 3}, 3},
        {new int[]{3, 9, 3}, 3},
        {new int[]{3, 9, 9}, 2},
        {new int[]{3, 9}, 1},
        {new int[]{3, 3}, 2},
        {new int[]{}, 0},
        {new int[]{1}, 1},
    };
  }

  public static Object[][] fix34DataProvider() {
    return new Object[][]{
        {new int[]{1, 3, 1, 4}, new int[]{1, 3, 4, 1}},
        {new int[]{1, 3, 1, 4, 4, 3, 1}, new int[]{1, 3, 4, 1, 1, 3, 4}},
        {new int[]{3, 2, 2, 4}, new int[]{3, 4, 2, 2}},
        {new int[]{3, 2, 3, 2, 4, 4}, new int[]{3, 4, 3, 4, 2, 2}},
        {new int[]{2, 3, 2, 3, 2, 4, 4}, new int[]{2, 3, 4, 3, 4, 2, 2}},
        {new int[]{5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5},
            new int[]{5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4}},
        {new int[]{3, 1, 4}, new int[]{3, 4, 1}},
        {new int[]{3, 4, 1}, new int[]{3, 4, 1}},
        {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
        {new int[]{1}, new int[]{1}},
        {new int[]{}, new int[]{}},
        {new int[]{7, 3, 7, 7, 4}, new int[]{7, 3, 4, 7, 7}},
        {new int[]{3, 1, 4, 3, 1, 4}, new int[]{3, 4, 1, 3, 4, 1}},
        {new int[]{3, 1, 1, 3, 4, 4}, new int[]{3, 4, 1, 3, 4, 1}},
    };
  }

  public static Object[][] fix45DataProvider() {
    return new Object[][]{
        {new int[]{5, 4, 9, 4, 9, 5}, new int[]{9, 4, 5, 4, 5, 9}},
        {new int[]{1, 4, 1, 5}, new int[]{1, 4, 5, 1}},
        {new int[]{1, 4, 1, 5, 5, 4, 1}, new int[]{1, 4, 5, 1, 1, 4, 5}},
        {new int[]{4, 9, 4, 9, 5, 5, 4, 9, 5}, new int[]{4, 5, 4, 5, 9, 9, 4, 5, 9}},
        {new int[]{5, 5, 4, 1, 4, 1}, new int[]{1, 1, 4, 5, 4, 5}},
        {new int[]{4, 2, 2, 5}, new int[]{4, 5, 2, 2}},
        {new int[]{4, 2, 4, 2, 5, 5}, new int[]{4, 5, 4, 5, 2, 2}},
        {new int[]{4, 2, 4, 5, 5}, new int[]{4, 5, 4, 5, 2}},
        {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
        {new int[]{4, 5}, new int[]{4, 5}},
        {new int[]{5, 4, 1}, new int[]{1, 4, 5}},
        {new int[]{}, new int[]{}},
        {new int[]{5, 4, 5, 4, 1}, new int[]{1, 4, 5, 4, 5}},
        {new int[]{4, 5, 4, 1, 5}, new int[]{4, 5, 4, 5, 1}},
        {new int[]{3, 4, 5}, new int[]{3, 4, 5}},
        {new int[]{4, 1, 5}, new int[]{4, 5, 1}},
        {new int[]{5, 4, 1}, new int[]{1, 4, 5}},
        {new int[]{2, 4, 2, 5}, new int[]{2, 4, 5, 2}},
    };
  }

  public static Object[][] canBalanceDataProvider() {
    return new Object[][]{
        {new int[]{1, 1, 1, 2, 1}, true},
        {new int[]{2, 1, 1, 2, 1}, false},
        {new int[]{10, 10}, true},
        {new int[]{10, 0, 1, -1, 10}, true},
        {new int[]{1, 1, 1, 1, 4}, true},
        {new int[]{2, 1, 1, 1, 4}, false},
        {new int[]{2, 3, 4, 1, 2}, false},
        {new int[]{1, 2, 3, 1, 0, 2, 3}, true},
        {new int[]{1, 2, 3, 1, 0, 1, 3}, false},
        {new int[]{1}, false},
        {new int[]{1, 1, 1, 2, 1}, true},
    };
  }

  public static Object[][] linearInDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 4, 6}, new int[]{2, 4}, true},
        {new int[]{1, 2, 4, 6}, new int[]{2, 3, 4}, false},
        {new int[]{1, 2, 4, 4, 6}, new int[]{2, 4}, true},
        {new int[]{2, 2, 4, 4, 6, 6}, new int[]{2, 4}, true},
        {new int[]{2, 2, 2, 2, 2}, new int[]{2, 2}, true},
        {new int[]{2, 2, 2, 2, 2}, new int[]{2, 4}, false},
        {new int[]{2, 2, 2, 2, 4}, new int[]{2, 4}, true},
        {new int[]{1, 2, 3}, new int[]{2}, true},
        {new int[]{1, 2, 3}, new int[]{-1}, false},
        {new int[]{1, 2, 3}, new int[]{}, true},
        {new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 0, 3, 12}, true},
        {new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{0, 3, 12, 14}, false},
        {new int[]{-1, 0, 3, 3, 3, 10, 12}, new int[]{-1, 10, 11}, false},
    };
  }

  public static Object[][] squareUpDataProvider() {
    return new Object[][]{
        {3, new int[]{0, 0, 1, 0, 2, 1, 3, 2, 1}},
        {2, new int[]{0, 1, 2, 1}},
        {4, new int[]{0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}},
        {1, new int[]{1}},
        {0, new int[]{}},
        {6, new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5,
            4, 3, 2, 1, 6, 5, 4, 3, 2, 1}},
    };
  }

  public static Object[][] seriesUpDataProvider() {
    return new Object[][]{
        {3, new int[]{1, 1, 2, 1, 2, 3}},
        {4, new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}},
        {2, new int[]{1, 1, 2}},
        {1, new int[]{1}},
        {0, new int[]{}},
        {6, new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6}},
    };
  }

  public static Object[][] maxMirrorDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3, 8, 9, 3, 2, 1}, 3},
        {new int[]{1, 2, 1, 4}, 3},
        {new int[]{7, 1, 2, 9, 7, 2, 1}, 2},
        {new int[]{21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}, 4},
        {new int[]{1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}, 4},
        {new int[]{1, 2, 3, 2, 1}, 5},
        {new int[]{1, 2, 3, 3, 8}, 2},
        {new int[]{1, 2, 7, 8, 1, 7, 2}, 2},
        {new int[]{1, 1, 1}, 3},
        {new int[]{1}, 1},
        {new int[]{}, 0},
        {new int[]{9, 1, 1, 4, 2, 1, 1, 1}, 3},
        {new int[]{5, 9, 9, 4, 5, 4, 9, 9, 2}, 7},
        {new int[]{5, 9, 9, 6, 5, 4, 9, 9, 2}, 2},
        {new int[]{5, 9, 1, 6, 5, 4, 1, 9, 5}, 3},
    };
  }

  public static Object[][] countClumpsDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 2, 3, 4, 4}, 2},
        {new int[]{1, 1, 2, 1, 1}, 2},
        {new int[]{1, 1, 1, 1, 1}, 1},
        {new int[]{1, 2, 3}, 0},
        {new int[]{2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 4},
        {new int[]{0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 4},
        {new int[]{0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 5},
        {new int[]{0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2}, 5},
        {new int[]{}, 0},
    };
  }
}
