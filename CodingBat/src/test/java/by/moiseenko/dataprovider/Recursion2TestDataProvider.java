package by.moiseenko.dataprovider;

/**
 * Data provider for Recursion2Test
 */
public class Recursion2TestDataProvider {

  public static Object[][] groupSumDataProvider() {
    return new Object[][]{
        {0, new int[]{2, 4, 8}, 10, true},
        {0, new int[]{2, 4, 8}, 14, true},
        {0, new int[]{2, 4, 8}, 9, false},
        {0, new int[]{2, 4, 8}, 8, true},
        {1, new int[]{2, 4, 8}, 8, true},
        {1, new int[]{2, 4, 8}, 2, false},
        {0, new int[]{1}, 1, true},
        {0, new int[]{9}, 1, false},
        {1, new int[]{9}, 0, true},
        {0, new int[0], 0, true},
        {0, new int[]{10, 2, 2, 5}, 17, true},
        {0, new int[]{10, 2, 2, 5}, 15, true},
        {0, new int[]{10, 2, 2, 5}, 9, true}
    };
  }


  public static Object[][] groupSum6DataProvider() {
    return new Object[][]{
        {0, new int[]{5, 6, 2}, 8, true},
        {0, new int[]{5, 6, 2}, 9, false},
        {0, new int[]{5, 6, 2}, 7, false},
        {0, new int[]{1}, 1, true},
        {0, new int[]{9}, 1, false},
        {0, new int[0], 0, true},
        {0, new int[]{3, 2, 4, 6}, 8, true},
        {0, new int[]{6, 2, 4, 3}, 8, true},
        {0, new int[]{5, 2, 4, 6}, 9, false},
        {0, new int[]{6, 2, 4, 5}, 9, false},
        {0, new int[]{3, 2, 4, 6}, 3, false},
        {0, new int[]{1, 6, 2, 6, 4}, 12, true},
        {0, new int[]{1, 6, 2, 6, 4}, 13, true},
        {0, new int[]{1, 6, 2, 6, 4}, 4, false},
        {0, new int[]{1, 6, 2, 6, 4}, 9, false},
        {0, new int[]{1, 6, 2, 6, 5}, 14, true},
        {0, new int[]{1, 6, 2, 6, 5}, 15, true},
        {0, new int[]{1, 6, 2, 6, 5}, 16, false}
    };
  }


  public static Object[][] groupNoAdjDataProvider() {
    return new Object[][]{
        {0, new int[]{2, 5, 10, 4}, 12, true},
        {0, new int[]{2, 5, 10, 4}, 14, false},
        {0, new int[]{2, 5, 10, 4}, 7, false},
        {0, new int[]{2, 5, 10, 4, 2}, 7, true},
        {0, new int[]{2, 5, 10, 4}, 9, true},
        {0, new int[]{10, 2, 2, 3, 3}, 15, true},
        {0, new int[]{10, 2, 2, 3, 3}, 7, false},
        {0, new int[0], 0, true},
        {0, new int[]{1}, 1, true},
        {0, new int[]{9}, 1, false},
        {0, new int[]{9}, 0, true},
        {0, new int[]{5, 10, 4, 1}, 11, true}
    };
  }


  public static Object[][] groupSum5DataProvider() {
    return new Object[][]{
        {0, new int[]{2, 5, 10, 4}, 19, true},
        {0, new int[]{2, 5, 10, 4}, 17, true},
        {0, new int[]{2, 5, 10, 4}, 12, false},
        {0, new int[]{2, 5, 4, 10}, 12, false},
        {0, new int[]{3, 5, 1}, 4, false},
        {0, new int[]{3, 5, 1}, 5, true},
        {0, new int[]{1, 3, 5}, 5, true},
        {0, new int[]{3, 5, 1}, 9, false},
        {0, new int[]{2, 5, 10, 4}, 7, false},
        {0, new int[]{2, 5, 10, 4}, 15, true},
        {0, new int[]{2, 5, 10, 4}, 11, false},
        {0, new int[]{1}, 1, true},
        {0, new int[]{9}, 1, false},
        {0, new int[]{9}, 0, true},
        {0, new int[0], 0, true}
    };
  }


  public static Object[][] groupSumClumpDataProvider() {
    return new Object[][]{
        {0, new int[]{2, 4, 8}, 10, true},
        {0, new int[]{1, 2, 4, 8, 1}, 14, true},
        {0, new int[]{2, 4, 4, 8}, 14, false},
        {0, new int[]{8, 2, 2, 1}, 9, true},
        {0, new int[]{8, 2, 2, 1}, 11, false},
        {0, new int[]{1}, 1, true},
        {0, new int[]{9}, 1, false}

    };
  }


  public static Object[][] splitArrayDataProvider() {
    return new Object[][]{
        {new int[]{2, 2}, true},
        {new int[]{2, 3}, false},
        {new int[]{5, 2, 3}, true},
        {new int[]{5, 2, 2}, false},
        {new int[]{1, 1, 1, 1, 1, 1}, true},
        {new int[]{1, 1, 1, 1, 1}, false},
        {new int[0], true},
        {new int[]{1}, false},
        {new int[]{3, 5}, false},
        {new int[]{5, 3, 2}, true},
        {new int[]{2, 2, 10, 10, 1, 1}, true},
        {new int[]{1, 2, 2, 10, 10, 1, 1}, false},
        {new int[]{1, 2, 3, 10, 10, 1, 1}, true}

    };
  }


  public static Object[][] splitOdd10DataProvider() {
    return new Object[][]{
        {new int[]{5, 5, 5}, true},
        {new int[]{5, 5, 6}, false},
        {new int[]{5, 5, 6, 1}, true},
        {new int[]{6, 5, 5, 1}, true},
        {new int[]{6, 5, 5, 1, 10}, true},
        {new int[]{6, 5, 5, 5, 1}, false},
        {new int[]{1}, true},
        {new int[0], false},
        {new int[]{10, 7, 5, 5}, true},
        {new int[]{10, 0, 5, 5}, false},
        {new int[]{10, 7, 5, 5, 2}, true},
        {new int[]{10, 7, 5, 5, 1}, false}
    };
  }


  public static Object[][] split53DataProvider() {
    return new Object[][]{
        {new int[]{1, 1}, true},
        {new int[]{1, 1, 1}, false},
        {new int[]{2, 4, 2}, true},
        {new int[]{2, 2, 2, 1}, false},
        {new int[]{3, 3, 5, 1}, true},
        {new int[]{3, 5, 8}, false},
        {new int[]{2, 4, 6}, true},
        {new int[]{3, 5, 6, 10, 3, 3}, true}
    };
  }


}
