package by.moiseenko.dataprovider;

/**
 * Data provider for Array2Test
 */
public class Array2TestDataProvider {

  public static Object[][] countEvensDataProvider() {
    return new Object[][]{
        {new int[]{2, 1, 2, 3, 4}, 3},
        {new int[]{2, 2, 0}, 3},
        {new int[]{1, 3, 5}, 0},
        {new int[]{}, 0},
        {new int[]{11, 9, 0, 1}, 1},
        {new int[]{2, 11, 9, 0}, 2},
        {new int[]{2}, 1},
        {new int[]{2, 5, 12}, 2}
    };
  }

  public static Object[][] bigDiffDataProvider() {
    return new Object[][]{
        {new int[]{10, 3, 5, 6}, 7},
        {new int[]{7, 2, 10, 9}, 8},
        {new int[]{2, 10, 7, 2}, 8},
        {new int[]{2, 10}, 8},
        {new int[]{10, 2}, 8},
        {new int[]{10, 0}, 10},
        {new int[]{2, 3}, 1},
        {new int[]{2, 2}, 0},
        {new int[]{2}, 0},
        {new int[]{5, 1, 6, 1, 9, 9}, 8},
        {new int[]{7, 6, 8, 5}, 3},
        {new int[]{7, 7, 6, 8, 5, 5, 6}, 3}
    };
  }

  public static Object[][] centeredAverageDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3, 4, 100}, 3},
        {new int[]{1, 1, 5, 5, 10, 8, 7}, 5},
        {new int[]{-10, -4, -2, -4, -2, 0}, -3},
        {new int[]{5, 3, 4, 6, 2}, 4},
        {new int[]{5, 3, 4, 0, 100}, 4},
        {new int[]{100, 0, 5, 3, 4}, 4},
        {new int[]{4, 0, 100}, 4},
        {new int[]{0, 2, 3, 4, 100}, 3},
        {new int[]{1, 1, 100}, 1},
        {new int[]{7, 7, 7}, 7},
        {new int[]{1, 7, 8}, 7},
        {new int[]{1, 1, 99, 99}, 50},
        {new int[]{1000, 0, 1, 99}, 50},
        {new int[]{4, 4, 4, 4, 5}, 4},
        {new int[]{4, 4, 4, 1, 5}, 4},
        {new int[]{6, 4, 8, 12, 3}, 6}
    };
  }

  public static Object[][] sum13DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 2, 1}, 6},
        {new int[]{1, 1}, 2},
        {new int[]{1, 2, 2, 1, 13}, 6},
        {new int[]{1, 2, 13, 2, 1, 13}, 4},
        {new int[]{13, 1, 2, 13, 2, 1, 13}, 3},
        {new int[]{}, 0},
        {new int[]{13}, 0},
        {new int[]{13, 13}, 0},
        {new int[]{13, 0, 13}, 0},
        {new int[]{13, 1, 13}, 0},
        {new int[]{5, 7, 2}, 14},
        {new int[]{5, 13, 2}, 5},
        {new int[]{0}, 0},
        {new int[]{13, 0}, 0}
    };
  }

  public static Object[][] sum67DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 2}, 5},
        {new int[]{1, 2, 2, 6, 99, 99, 7}, 5},
        {new int[]{1, 1, 6, 7, 2}, 4},
        {new int[]{1, 6, 2, 2, 7, 1, 6, 99, 99, 7}, 2},
        {new int[]{1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}, 2},
        {new int[]{2, 7, 6, 2, 6, 7, 2, 7}, 18},
        {new int[]{2, 7, 6, 2, 6, 2, 7}, 9},
        {new int[]{1, 6, 7, 7}, 8},
        {new int[]{6, 7, 1, 6, 7, 7}, 8},
        {new int[]{6, 8, 1, 6, 7}, 0},
        {new int[]{}, 0},
        {new int[]{6, 7, 11}, 11},
        {new int[]{11, 6, 7, 11}, 22},
        {new int[]{2, 2, 6, 7, 7}, 11}
    };
  }

  public static Object[][] has22DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 2}, true},
        {new int[]{1, 2, 1, 2}, false},
        {new int[]{2, 1, 2}, false},
        {new int[]{2, 2, 1, 2}, true},
        {new int[]{1, 3, 2}, false},
        {new int[]{1, 3, 2, 2}, true},
        {new int[]{2, 3, 2, 2}, true},
        {new int[]{4, 2, 4, 2, 2, 5}, true},
        {new int[]{1, 2}, false},
        {new int[]{2, 2}, true},
        {new int[]{2}, false},
        {new int[]{}, false},
        {new int[]{3, 3, 2, 2}, true},
        {new int[]{5, 2, 5, 2}, false}
    };
  }

  public static Object[][] lucky13DataProvider() {
    return new Object[][]{
        {new int[]{0, 2, 4}, true},
        {new int[]{1, 2, 3}, false},
        {new int[]{1, 2, 4}, false},
        {new int[]{2, 7, 2, 8}, true},
        {new int[]{2, 7, 1, 8}, false},
        {new int[]{3, 7, 2, 8}, false},
        {new int[]{2, 7, 2, 1}, false},
        {new int[]{1, 2}, false},
        {new int[]{2, 2}, true},
        {new int[]{2}, true},
        {new int[]{3}, false},
        {new int[]{}, true}
    };
  }

  public static Object[][] sum28DataProvider() {
    return new Object[][]{
        {new int[]{2, 3, 2, 2, 4, 2}, true},
        {new int[]{2, 3, 2, 2, 4, 2, 2}, false},
        {new int[]{1, 2, 3, 4}, false},
        {new int[]{2, 2, 2, 2}, true},
        {new int[]{1, 2, 2, 2, 2, 4}, true},
        {new int[]{}, false},
        {new int[]{2}, false},
        {new int[]{8}, false},
        {new int[]{2, 2, 2}, false},
        {new int[]{2, 2, 2, 2, 2}, false},
        {new int[]{1, 2, 2, 1, 2, 2}, true},
        {new int[]{5, 2, 2, 2, 4, 2}, true}
    };
  }

  public static Object[][] more14DataProvider() {
    return new Object[][]{
        {new int[]{1, 4, 1}, true},
        {new int[]{1, 4, 1, 4}, false},
        {new int[]{1, 1}, true},
        {new int[]{1, 6, 6}, true},
        {new int[]{1}, true},
        {new int[]{1, 4}, false},
        {new int[]{6, 1, 1}, true},
        {new int[]{1, 6, 4}, false},
        {new int[]{1, 1, 4, 4, 1}, true},
        {new int[]{1, 1, 6, 4, 4, 1}, true},
        {new int[]{}, false},
        {new int[]{4, 1, 4, 6}, false},
        {new int[]{4, 1, 4, 6, 1}, false},
        {new int[]{1, 4, 1, 4, 1, 6}, true}
    };
  }

  public static Object[][] fizzArrayDataProvider() {
    return new Object[][]{
        {4, new int[]{0, 1, 2, 3}},
        {1, new int[]{0}},
        {10, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}},
        {0, new int[]{}},
        {2, new int[]{0, 1}},
        {7, new int[]{0, 1, 2, 3, 4, 5, 6}}
    };
  }

  public static Object[][] only14DataProvider() {
    return new Object[][]{
        {new int[]{1, 4, 1, 4}, true},
        {new int[]{1, 4, 2, 4}, false},
        {new int[]{1, 1}, true},
        {new int[]{4, 1}, true},
        {new int[]{2}, false},
        {new int[]{}, true},
        {new int[]{1, 4, 1, 3}, false},
        {new int[]{3, 1, 3}, false},
        {new int[]{1}, true},
        {new int[]{4}, true},
        {new int[]{3, 4}, false},
        {new int[]{1, 3, 4}, false},
        {new int[]{1, 1, 1}, true},
        {new int[]{1, 1, 1, 5}, false},
        {new int[]{4, 1, 4, 1}, true}
    };
  }

  public static Object[][] fizzArray2DataProvider() {
    return new Object[][]{
        {4, new String[]{"0", "1", "2", "3"}},
        {10, new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"}},
        {2, new String[]{"0", "1"}},
        {1, new String[]{"0"}},
        {0, new String[]{}},
        {7, new String[]{"0", "1", "2", "3", "4", "5", "6"}},
        {9, new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"}},
        {11, new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}}
    };
  }

  public static Object[][] no14DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, true},
        {new int[]{1, 2, 3, 4}, false},
        {new int[]{2, 3, 4}, true},
        {new int[]{1, 1, 4, 4}, false},
        {new int[]{2, 2, 4, 4}, true},
        {new int[]{2, 3, 4, 1}, false},
        {new int[]{2, 1, 1}, true},
        {new int[]{1, 4}, false},
        {new int[]{2}, true},
        {new int[]{2, 1}, true},
        {new int[]{1}, true},
        {new int[]{4}, true},
        {new int[]{}, true},
        {new int[]{1, 1, 1, 1}, true},
        {new int[]{9, 4, 4, 1}, false},
        {new int[]{4, 2, 3, 1}, false},
        {new int[]{4, 2, 3, 5}, true},
        {new int[]{4, 4, 2}, true},
        {new int[]{1, 4, 4}, false}
    };
  }

  public static Object[][] isEverywhereDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 1, 3}, 1, true},
        {new int[]{1, 2, 1, 3}, 2, false},
        {new int[]{1, 2, 1, 3, 4}, 1, false},
        {new int[]{2, 1, 2, 1}, 1, true},
        {new int[]{2, 1, 2, 1}, 2, true},
        {new int[]{2, 1, 2, 3, 1}, 2, false},
        {new int[]{3, 1}, 3, true},
        {new int[]{3, 1}, 2, false},
        {new int[]{3}, 1, true},
        {new int[]{}, 1, true},
        {new int[]{1, 2, 1, 2, 3, 2, 5}, 2, true},
        {new int[]{1, 2, 1, 1, 1, 2}, 2, false},
        {new int[]{2, 1, 2, 1, 1, 2}, 2, false},
        {new int[]{2, 1, 2, 2, 2, 1, 1, 2}, 2, false},
        {new int[]{2, 1, 2, 2, 2, 1, 2, 1}, 2, true},
        {new int[]{2, 1, 2, 1, 2}, 2, true}
    };
  }

  public static Object[][] either24DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 2}, true},
        {new int[]{4, 4, 1}, true},
        {new int[]{4, 4, 1, 2, 2}, false},
        {new int[]{1, 2, 3, 4}, false},
        {new int[]{3, 5, 9}, false},
        {new int[]{1, 2, 3, 4, 4}, true},
        {new int[]{2, 2, 3, 4}, true},
        {new int[]{1, 2, 3, 2, 2, 4}, true},
        {new int[]{1, 2, 3, 2, 2, 4, 4}, false},
        {new int[]{1, 2}, false},
        {new int[]{2, 2}, true},
        {new int[]{4, 4}, true},
        {new int[]{2}, false},
        {new int[]{}, false},
    };
  }

  public static Object[][] matchUpDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{2, 3, 10}, 2},
        {new int[]{1, 2, 3}, new int[]{2, 3, 5}, 3},
        {new int[]{1, 2, 3}, new int[]{2, 3, 3}, 2},
        {new int[]{5, 3}, new int[]{5, 5}, 1},
        {new int[]{5, 3}, new int[]{4, 4}, 2},
        {new int[]{5, 3}, new int[]{3, 3}, 1},
        {new int[]{5, 3}, new int[]{2, 2}, 1},
        {new int[]{5, 3}, new int[]{1, 1}, 1},
        {new int[]{5, 3}, new int[]{0, 0}, 0},
        {new int[]{4}, new int[]{4}, 0},
        {new int[]{4}, new int[]{5}, 1}
    };
  }

  public static Object[][] has77DataProvider() {
    return new Object[][]{
        {new int[]{1, 7, 7}, true},
        {new int[]{1, 7, 1, 7}, true},
        {new int[]{1, 7, 1, 1, 7}, false},
        {new int[]{7, 7, 1, 1, 7}, true},
        {new int[]{2, 7, 2, 2, 7, 2}, false},
        {new int[]{2, 7, 2, 2, 7, 7}, true},
        {new int[]{7, 2, 7, 2, 2, 7}, true},
        {new int[]{7, 2, 6, 2, 2, 7}, false},
        {new int[]{7, 7, 7}, true},
        {new int[]{7, 1, 7}, true},
        {new int[]{7, 1, 1}, false},
        {new int[]{1, 2}, false},
        {new int[]{1, 7}, false},
        {new int[]{7}, false},
    };
  }

  public static Object[][] has12DataProvider() {
    return new Object[][]{
        {new int[]{1, 3, 2}, true},
        {new int[]{3, 1, 2}, true},
        {new int[]{3, 1, 4, 5, 2}, true},
        {new int[]{3, 1, 4, 5, 6}, false},
        {new int[]{3, 1, 4, 1, 6, 2}, true},
        {new int[]{2, 1, 4, 1, 6, 2}, true},
        {new int[]{2, 1, 4, 1, 6}, false},
        {new int[]{1}, false},
        {new int[]{2, 1, 3}, false},
        {new int[]{2, 1, 3, 2}, true},
        {new int[]{2}, false},
        {new int[]{3, 2}, false},
        {new int[]{3, 1, 3, 2}, true},
        {new int[]{3, 5, 9}, false},
        {new int[]{3, 5, 1}, false},
        {new int[]{3, 2, 1}, false},
        {new int[]{1, 2}, true},
    };
  }

  public static Object[][] modThreeDataProvider() {
    return new Object[][]{
        {new int[]{2, 1, 3, 5}, true},
        {new int[]{2, 1, 2, 5}, false},
        {new int[]{2, 4, 2, 5}, true},
        {new int[]{1, 2, 1, 2, 1}, false},
        {new int[]{9, 9, 9}, true},
        {new int[]{1, 2, 1}, false},
        {new int[]{1, 2}, false},
        {new int[]{1}, false},
        {new int[]{}, false},
        {new int[]{9, 7, 2, 9}, false},
        {new int[]{9, 7, 2, 9, 2, 2}, false},
        {new int[]{9, 7, 2, 9, 2, 2, 6}, true},
    };
  }

  public static Object[][] haveThreeDataProvider() {
    return new Object[][]{
        {new int[]{3, 1, 3, 1, 3}, true},
        {new int[]{3, 1, 3, 3}, false},
        {new int[]{3, 4, 3, 3, 4}, false},
        {new int[]{1, 3, 1, 3, 1, 2}, false},
        {new int[]{1, 3, 1, 3, 1, 3}, true},
        {new int[]{1, 3, 3, 1, 3}, false},
        {new int[]{1, 3, 1, 3, 1, 3, 4, 3}, false},
        {new int[]{3, 4, 3, 4, 3, 4, 4}, true},
        {new int[]{3, 3, 3}, false},
        {new int[]{1, 3}, false},
        {new int[]{3}, false},
        {new int[]{1}, false},
    };
  }

  public static Object[][] twoTwoDataProvider() {
    return new Object[][]{
        {new int[]{4, 2, 2, 3}, true},
        {new int[]{2, 2, 4}, true},
        {new int[]{2, 2, 4, 2}, false},
        {new int[]{1, 3, 4}, true},
        {new int[]{1, 2, 2, 3, 4}, true},
        {new int[]{1, 2, 3, 4}, false},
        {new int[]{2, 2}, true},
        {new int[]{2, 2, 7}, true},
        {new int[]{2, 2, 7, 2, 1}, false},
        {new int[]{4, 2, 2, 2}, true},
        {new int[]{2, 2, 2}, true},
        {new int[]{1, 2}, false},
        {new int[]{2}, false},
        {new int[]{1}, true},
        {new int[]{}, true},
        {new int[]{5, 2, 2, 3}, true},
        {new int[]{2, 2, 5, 2}, false},
    };
  }

  public static Object[][] sameEndsDataProvider() {
    return new Object[][]{
        {new int[]{5, 6, 45, 99, 13, 5, 6}, 1, false},
        {new int[]{5, 6, 45, 99, 13, 5, 6}, 2, true},
        {new int[]{5, 6, 45, 99, 13, 5, 6}, 3, false},
        {new int[]{1, 2, 5, 2, 1}, 1, true},
        {new int[]{1, 2, 5, 2, 1}, 2, false},
        {new int[]{1, 2, 5, 2, 1}, 0, true},
        {new int[]{1, 2, 5, 2, 1}, 5, true},
        {new int[]{1, 1, 1}, 0, true},
        {new int[]{1, 1, 1}, 1, true},
        {new int[]{1, 1, 1}, 2, true},
        {new int[]{1, 1, 1}, 3, true},
        {new int[]{1}, 1, true},
        {new int[]{}, 0, true},
        {new int[]{4, 2, 4, 5}, 1, false}
    };
  }

  public static Object[][] tripleUpDataProvider() {
    return new Object[][]{
        {new int[]{1, 4, 5, 6, 2}, true},
        {new int[]{1, 2, 3}, true},
        {new int[]{1, 2, 4}, false},
        {new int[]{1, 2, 4, 5, 7, 6, 5, 6, 7, 6}, true},
        {new int[]{1, 2, 4, 5, 7, 6, 5, 7, 7, 6}, false},
        {new int[]{1, 2}, false},
        {new int[]{1}, false},
        {new int[]{}, false},
        {new int[]{10, 9, 8, -100, -99, -98, 100}, true},
        {new int[]{10, 9, 8, -100, -99, 99, 100}, false},
        {new int[]{-100, -99, -99, 100, 101, 102}, true},
        {new int[]{2, 3, 5, 6, 8, 9, 2, 3}, false},
    };
  }

  public static Object[][] fizzArray3DataProvider() {
    return new Object[][]{
        {5, 10, new int[]{5, 6, 7, 8, 9}},
        {11, 18, new int[]{11, 12, 13, 14, 15, 16, 17}},
        {1, 3, new int[]{1, 2}},
        {1, 2, new int[]{1}},
        {1, 1, new int[]{}},
        {1000, 1005, new int[]{1000, 1001, 1002, 1003, 1004}}
    };
  }

  public static Object[][] shiftLeftDataProvider() {
    return new Object[][]{
        {new int[]{6, 2, 5, 3}, new int[]{2, 5, 3, 6}},
        {new int[]{1, 2}, new int[]{2, 1}},
        {new int[]{1}, new int[]{1}},
        {new int[]{}, new int[]{}},
        {new int[]{1, 1, 2, 2, 4}, new int[]{1, 2, 2, 4, 1}},
        {new int[]{1, 1, 1}, new int[]{1, 1, 1}},
        {new int[]{1, 2, 3}, new int[]{2, 3, 1}}
    };
  }

  public static Object[][] tenRunDataProvider() {
    return new Object[][]{
        {new int[]{2, 10, 3, 4, 20, 5}, new int[]{2, 10, 10, 10, 20, 20}},
        {new int[]{10, 1, 20, 2}, new int[]{10, 10, 20, 20}},
        {new int[]{10, 1, 9, 20}, new int[]{10, 10, 10, 20}},
        {new int[]{1, 2, 50, 1}, new int[]{1, 2, 50, 50}},
        {new int[]{1, 20, 50, 1}, new int[]{1, 20, 50, 50}},
        {new int[]{10, 10}, new int[]{10, 10}},
        {new int[]{10, 2}, new int[]{10, 10}},
        {new int[]{0, 2}, new int[]{0, 0}},
        {new int[]{1, 2}, new int[]{1, 2}},
        {new int[]{1}, new int[]{1}},
        {new int[]{}, new int[]{}}
    };
  }

  public static Object[][] pre4DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 4, 1}, new int[]{1, 2}},
        {new int[]{3, 1, 4}, new int[]{3, 1}},
        {new int[]{1, 4, 4}, new int[]{1}},
        {new int[]{1, 4, 4, 2}, new int[]{1}},
        {new int[]{1, 3, 4, 2, 4}, new int[]{1, 3}},
        {new int[]{4, 4}, new int[]{}},
        {new int[]{3, 3, 4}, new int[]{3, 3}},
        {new int[]{1, 2, 1, 4}, new int[]{1, 2, 1}},
        {new int[]{2, 1, 4, 2}, new int[]{2, 1}},
        {new int[]{2, 1, 2, 1, 4, 2}, new int[]{2, 1, 2, 1}},
    };
  }

  public static Object[][] post4DataProvider() {
    return new Object[][]{
        {new int[]{2, 4, 1, 2}, new int[]{1, 2}},
        {new int[]{4, 1, 4, 2}, new int[]{2}},
        {new int[]{4, 4, 1, 2, 3}, new int[]{1, 2, 3}},
        {new int[]{4, 2}, new int[]{2}},
        {new int[]{4, 4, 3}, new int[]{3}},
        {new int[]{4, 4}, new int[]{}},
        {new int[]{4}, new int[]{}},
        {new int[]{2, 4, 1, 4, 3, 2}, new int[]{3, 2}},
        {new int[]{4, 1, 4, 2, 2, 2}, new int[]{2, 2, 2}},
        {new int[]{3, 4, 3, 2}, new int[]{3, 2}},
    };
  }

  public static Object[][] notAloneDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, 2, new int[]{1, 3, 3}},
        {new int[]{1, 2, 3, 2, 5, 2}, 2, new int[]{1, 3, 3, 5, 5, 2}},
        {new int[]{3, 4}, 3, new int[]{3, 4}},
        {new int[]{3, 3}, 3, new int[]{3, 3}},
        {new int[]{1, 3, 1, 2}, 1, new int[]{1, 3, 3, 2}},
        {new int[]{3}, 3, new int[]{3}},
        {new int[]{}, 3, new int[]{}},
        {new int[]{7, 1, 6}, 1, new int[]{7, 7, 6}},
        {new int[]{1, 1, 1}, 1, new int[]{1, 1, 1}},
        {new int[]{1, 1, 1, 2}, 1, new int[]{1, 1, 1, 2}},
    };
  }

  public static Object[][] zeroFrontDataProvider() {
    return new Object[][]{
        {new int[]{1, 0, 0, 1}, new int[]{0, 0, 1, 1}},
        {new int[]{0, 1, 1, 0, 1}, new int[]{0, 0, 1, 1, 1}},
        {new int[]{1, 0}, new int[]{0, 1}},
        {new int[]{0, 1}, new int[]{0, 1}},
        {new int[]{1, 1, 1, 0}, new int[]{0, 1, 1, 1}},
        {new int[]{2, 2, 2, 2}, new int[]{2, 2, 2, 2}},
        {new int[]{0, 0, 1, 0}, new int[]{0, 0, 0, 1}},
        {new int[]{-1, 0, 0, -1, 0}, new int[]{0, 0, 0, -1, -1}},
        {new int[]{0, -3, 0, -3}, new int[]{0, 0, -3, -3}},
        {new int[]{}, new int[]{}},
        {new int[]{9, 9, 0, 9, 0, 9}, new int[]{0, 0, 9, 9, 9, 9}},
    };
  }

  public static Object[][] withoutTenDataProvider() {
    return new Object[][]{
        {new int[]{1, 10, 10, 2}, new int[]{1, 2, 0, 0}},
        {new int[]{10, 2, 10}, new int[]{2, 0, 0}},
        {new int[]{1, 99, 10}, new int[]{1, 99, 0}},
        {new int[]{10, 13, 10, 14}, new int[]{13, 14, 0, 0}},
        {new int[]{10, 13, 10, 14, 10}, new int[]{13, 14, 0, 0, 0}},
        {new int[]{10, 10, 3}, new int[]{3, 0, 0}},
        {new int[]{1}, new int[]{1}},
        {new int[]{13, 1}, new int[]{13, 1}},
        {new int[]{10}, new int[]{0}},
        {new int[]{}, new int[]{}},
    };
  }

  public static Object[][] zeroMaxDataProvider() {
    return new Object[][]{
        {new int[]{0, 5, 0, 3}, new int[]{5, 5, 3, 3}},
        {new int[]{0, 4, 0, 3}, new int[]{3, 4, 3, 3}},
        {new int[]{0, 1, 0}, new int[]{1, 1, 0}},
        {new int[]{0, 1, 5}, new int[]{5, 1, 5}},
        {new int[]{0, 2, 0}, new int[]{0, 2, 0}},
        {new int[]{1}, new int[]{1}},
        {new int[]{0}, new int[]{0}},
        {new int[]{}, new int[]{}},
        {new int[]{7, 0, 4, 3, 0, 2}, new int[]{7, 3, 4, 3, 0, 2}},
        {new int[]{7, 0, 4, 3, 0, 1}, new int[]{7, 3, 4, 3, 1, 1}},
        {new int[]{7, 0, 4, 3, 0, 0}, new int[]{7, 3, 4, 3, 0, 0}},
        {new int[]{7, 0, 1, 0, 0, 7}, new int[]{7, 7, 1, 7, 7, 7}},
    };
  }

  public static Object[][] evenOddDataProvider() {
    return new Object[][]{
        {new int[]{1, 0, 1, 0, 0, 1, 1}, new int[]{0, 0, 0, 1, 1, 1, 1}},
        {new int[]{3, 3, 2}, new int[]{2, 3, 3}},
        {new int[]{2, 2, 2}, new int[]{2, 2, 2}},
        {new int[]{3, 2, 2}, new int[]{2, 2, 3}},
        {new int[]{1, 1, 0, 1, 0}, new int[]{0, 0, 1, 1, 1}},
        {new int[]{1}, new int[]{1}},
        {new int[]{1, 2}, new int[]{2, 1}},
        {new int[]{2, 1}, new int[]{2, 1}},
        {new int[]{}, new int[]{}},
    };
  }

  public static Object[][] fizzBuzzDataProvider() {
    return new Object[][]{
        {1, 6, new String[]{"1", "2", "Fizz", "4", "Buzz"}},
        {1, 8, new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}},
        {1, 11, new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}},
        {1, 16, new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11",
            "Fizz", "13", "14", "FizzBuzz"}},
        {1, 4, new String[]{"1", "2", "Fizz"}},
        {1, 2, new String[]{"1"}},
        {50, 56, new String[]{"Buzz", "Fizz", "52", "53", "Fizz", "Buzz"}},
        {15, 17, new String[]{"FizzBuzz", "16"}},
        {30, 36, new String[]{"FizzBuzz", "31", "32", "Fizz", "34", "Buzz"}},
        {1000, 1006, new String[]{"Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz"}},
        {99, 102, new String[]{"Fizz", "Buzz", "101"}},
        {14, 20, new String[]{"14", "FizzBuzz", "16", "17", "Fizz", "19"}},
    };
  }
}
