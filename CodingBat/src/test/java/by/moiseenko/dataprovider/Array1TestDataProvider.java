package by.moiseenko.dataprovider;

/**
 * Data provider for Array1Test
 */
public class Array1TestDataProvider {

  public static Object[][] firstLast6DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 6}, true},
        {new int[]{6, 1, 2, 3}, true},
        {new int[]{13, 6, 1, 2, 3}, false},
        {new int[]{13, 6, 1, 2, 6}, true},
        {new int[]{3, 2, 1}, false},
        {new int[]{3, 6, 1}, false},
        {new int[]{3, 6}, true},
        {new int[]{6}, true},
        {new int[]{3}, false},
        {new int[]{5, 6}, true},
        {new int[]{5, 5}, false},
        {new int[]{1, 2, 3, 4, 6}, true},
        {new int[]{1, 2, 3, 4}, false}
    };
  }


  public static Object[][] sameFirstLastDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, false},
        {new int[]{1, 2, 3, 1}, true},
        {new int[]{1, 2, 1}, true},
        {new int[]{7}, true},
        {new int[]{}, false},
        {new int[]{1, 2, 3, 4, 5, 1}, true},
        {new int[]{1, 2, 3, 4, 5, 13}, false},
        {new int[]{13, 2, 3, 4, 5, 13}, true},
        {new int[]{7, 7}, true}
    };
  }

  public static Object[][] makePiDataProvider() {
    return new Object[][]{
        {new int[]{3, 1, 4}}
    };
  }

  public static Object[][] commonEndDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{7, 3}, true},
        {new int[]{1, 2, 3}, new int[]{7, 3, 2}, false},
        {new int[]{1, 2, 3}, new int[]{1, 3}, true},
        {new int[]{1, 2, 3}, new int[]{1}, true},
        {new int[]{1, 2, 3}, new int[]{2}, false}
    };
  }

  public static Object[][] sum3DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, 6},
        {new int[]{5, 11, 2}, 18},
        {new int[]{7, 0, 0}, 7},
        {new int[]{1, 2, 1}, 4},
        {new int[]{1, 1, 1}, 3},
        {new int[]{2, 7, 2}, 11}
    };
  }

  public static Object[][] rotateLeft3DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{2, 3, 1}},
        {new int[]{5, 11, 9}, new int[]{11, 9, 5}},
        {new int[]{7, 0, 0}, new int[]{0, 0, 7}},
        {new int[]{1, 2, 1}, new int[]{2, 1, 1}},
        {new int[]{0, 0, 1}, new int[]{0, 1, 0}}
    };
  }

  public static Object[][] reverse3DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{3, 2, 1}},
        {new int[]{5, 11, 9}, new int[]{9, 11, 5}},
        {new int[]{7, 0, 0}, new int[]{0, 0, 7}},
        {new int[]{2, 1, 2}, new int[]{2, 1, 2}},
        {new int[]{1, 2, 1}, new int[]{1, 2, 1}},
        {new int[]{2, 11, 3}, new int[]{3, 11, 2}},
        {new int[]{0, 6, 5}, new int[]{5, 6, 0}},
        {new int[]{7, 2, 3}, new int[]{3, 2, 7}}
    };
  }

  public static Object[][] maxEnd3DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{3, 3, 3}},
        {new int[]{11, 5, 9}, new int[]{11, 11, 11}},
        {new int[]{2, 11, 3}, new int[]{3, 3, 3}},
        {new int[]{11, 3, 3}, new int[]{11, 11, 11}},
        {new int[]{3, 11, 11}, new int[]{11, 11, 11}},
        {new int[]{2, 2, 2}, new int[]{2, 2, 2}},
        {new int[]{2, 11, 2}, new int[]{2, 2, 2}},
        {new int[]{0, 0, 1}, new int[]{1, 1, 1}}
    };
  }

  public static Object[][] sum2DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, 3},
        {new int[]{1, 1}, 2},
        {new int[]{1, 1, 1, 1}, 2},
        {new int[]{1, 2}, 3},
        {new int[]{1}, 1},
        {new int[]{}, 0},
        {new int[]{4, 5, 6}, 9},
        {new int[]{4}, 4}
    };
  }

  public static Object[][] middleWayDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{2, 5}},
        {new int[]{7, 7, 7}, new int[]{3, 8, 0}, new int[]{7, 8}},
        {new int[]{5, 2, 9}, new int[]{1, 4, 5}, new int[]{2, 4}},
        {new int[]{1, 9, 7}, new int[]{4, 8, 8}, new int[]{9, 8}},
        {new int[]{1, 2, 3}, new int[]{3, 1, 4}, new int[]{2, 1}},
        {new int[]{1, 2, 3}, new int[]{4, 1, 1}, new int[]{2, 1}}
    };
  }

  public static Object[][] makeEndsDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{1, 3}},
        {new int[]{1, 2, 3, 4}, new int[]{1, 4}},
        {new int[]{7, 4, 6, 2}, new int[]{7, 2}},
        {new int[]{1, 2, 2, 2, 2, 2, 2, 3}, new int[]{1, 3}},
        {new int[]{7, 4}, new int[]{7, 4}},
        {new int[]{7}, new int[]{7, 7}},
        {new int[]{5, 2, 9}, new int[]{5, 9}},
        {new int[]{2, 3, 4, 1}, new int[]{2, 1}}
    };
  }

  public static Object[][] has23DataProvider() {
    return new Object[][]{
        {new int[]{2, 5}, true},
        {new int[]{4, 3}, true},
        {new int[]{4, 5}, false},
        {new int[]{2, 2}, true},
        {new int[]{3, 2}, true},
        {new int[]{3, 3}, true},
        {new int[]{7, 7}, false},
        {new int[]{3, 9}, true},
        {new int[]{9, 5}, false}
    };
  }

  public static Object[][] no23DataProvider() {
    return new Object[][]{
        {new int[]{4, 5}, true},
        {new int[]{4, 2}, false},
        {new int[]{3, 5}, false},
        {new int[]{1, 9}, true},
        {new int[]{2, 9}, false},
        {new int[]{1, 3}, false},
        {new int[]{1, 1}, true},
        {new int[]{2, 2}, false},
        {new int[]{3, 3}, false},
        {new int[]{7, 8}, true},
        {new int[]{8, 7}, true}
    };
  }

  public static Object[][] makeLastDataProvider() {
    return new Object[][]{
        {new int[]{4, 5, 6}, new int[]{0, 0, 0, 0, 0, 6}},
        {new int[]{1, 2}, new int[]{0, 0, 0, 2}},
        {new int[]{3}, new int[]{0, 3}},
        {new int[]{0}, new int[]{0, 0}},
        {new int[]{7, 7, 7}, new int[]{0, 0, 0, 0, 0, 7}},
        {new int[]{3, 1, 4}, new int[]{0, 0, 0, 0, 0, 4}},
        {new int[]{1, 2, 3, 4}, new int[]{0, 0, 0, 0, 0, 0, 0, 4}},
        {new int[]{1, 2, 3, 0}, new int[]{0, 0, 0, 0, 0, 0, 0, 0}},
        {new int[]{2, 4}, new int[]{0, 0, 0, 4}}
    };
  }

  public static Object[][] double23DataProvider() {
    return new Object[][]{
        {new int[]{2, 2}, true},
        {new int[]{3, 3}, true},
        {new int[]{2, 3}, false},
        {new int[]{3, 2}, false},
        {new int[]{4, 5}, false},
        {new int[]{2}, false},
        {new int[]{3}, false},
        {new int[]{}, false},
        {new int[]{3, 4}, false}
    };
  }

  public static Object[][] fix23DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{1, 2, 0}},
        {new int[]{2, 3, 5}, new int[]{2, 0, 5}},
        {new int[]{1, 2, 1}, new int[]{1, 2, 1}},
        {new int[]{3, 2, 1}, new int[]{3, 2, 1}},
        {new int[]{2, 2, 3}, new int[]{2, 2, 0}},
        {new int[]{2, 3, 3}, new int[]{2, 0, 3}}
    };
  }

  public static Object[][] start1DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{1, 3}, 2},
        {new int[]{7, 2, 3}, new int[]{1}, 1},
        {new int[]{1, 2}, new int[]{}, 1},
        {new int[]{}, new int[]{1, 2}, 1},
        {new int[]{7}, new int[]{}, 0},
        {new int[]{7}, new int[]{1}, 1},
        {new int[]{1}, new int[]{1}, 2},
        {new int[]{7}, new int[]{8}, 0},
        {new int[]{}, new int[]{}, 0},
        {new int[]{1, 3}, new int[]{1}, 2}
    };
  }

  public static Object[][] biggerTwoDataProvider() {
    return new Object[][]{
        {new int[]{1, 2}, new int[]{3, 4}, new int[]{3, 4}},
        {new int[]{3, 4}, new int[]{1, 2}, new int[]{3, 4}},
        {new int[]{1, 1}, new int[]{1, 2}, new int[]{1, 2}},
        {new int[]{2, 1}, new int[]{1, 1}, new int[]{2, 1}},
        {new int[]{2, 2}, new int[]{1, 3}, new int[]{2, 2}},
        {new int[]{1, 3}, new int[]{2, 2}, new int[]{1, 3}},
        {new int[]{6, 7}, new int[]{3, 1}, new int[]{6, 7}}
    };
  }

  public static Object[][] makeMiddleDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3, 4}, new int[]{2, 3}},
        {new int[]{7, 1, 2, 3, 4, 9}, new int[]{2, 3}},
        {new int[]{1, 2}, new int[]{1, 2}},
        {new int[]{5, 2, 4, 7}, new int[]{2, 4}},
        {new int[]{9, 0, 4, 3, 9, 1}, new int[]{4, 3}}
    };
  }

  public static Object[][] plusTwoDataProvider() {
    return new Object[][]{
        {new int[]{1, 2}, new int[]{3, 4}, new int[]{1, 2, 3, 4}},
        {new int[]{4, 4}, new int[]{2, 2}, new int[]{4, 4, 2, 2}},
        {new int[]{9, 2}, new int[]{3, 4}, new int[]{9, 2, 3, 4}}
    };
  }

  public static Object[][] swapEndsDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3, 4}, new int[]{4, 2, 3, 1}},
        {new int[]{1, 2, 3}, new int[]{3, 2, 1}},
        {new int[]{8, 6, 7, 9, 5}, new int[]{5, 6, 7, 9, 8}},
        {new int[]{3, 1, 4, 1, 5, 9}, new int[]{9, 1, 4, 1, 5, 3}},
        {new int[]{1, 2}, new int[]{2, 1}},
        {new int[]{1}, new int[]{1}}
    };
  }

  public static Object[][] midThreeDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4}},
        {new int[]{8, 6, 7, 5, 3, 0, 9}, new int[]{7, 5, 3}},
        {new int[]{1, 2, 3}, new int[]{1, 2, 3}}
    };
  }

  public static Object[][] maxTripleDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, 3},
        {new int[]{1, 5, 3}, 5},
        {new int[]{5, 2, 3}, 5},
        {new int[]{1, 2, 3, 1, 1}, 3},
        {new int[]{1, 7, 3, 1, 5}, 5},
        {new int[]{5, 1, 3, 7, 1}, 5},
        {new int[]{5, 1, 7, 3, 7, 8, 1}, 5},
        {new int[]{5, 1, 7, 9, 7, 8, 1}, 9},
        {new int[]{5, 1, 7, 3, 7, 8, 9}, 9},
        {new int[]{2, 2, 5, 1, 1}, 5}
    };
  }

  public static Object[][] frontPieceDataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{1, 2}},
        {new int[]{1, 2}, new int[]{1, 2}},
        {new int[]{1}, new int[]{1}},
        {new int[]{}, new int[]{}},
        {new int[]{6, 5, 0}, new int[]{6, 5}},
        {new int[]{6, 5}, new int[]{6, 5}},
        {new int[]{3, 1, 4, 1, 5}, new int[]{3, 1}},
        {new int[]{6}, new int[]{6}}
    };
  }

  public static Object[][] unlucky1DataProvider() {
    return new Object[][]{
        {new int[]{1, 3, 4, 5}, true},
        {new int[]{2, 1, 3, 4, 5}, true},
        {new int[]{1, 1, 1}, false},
        {new int[]{1, 3, 1}, true},
        {new int[]{1, 1, 3}, true},
        {new int[]{1, 2, 3}, false},
        {new int[]{3, 3, 3}, false},
        {new int[]{1, 3}, true},
        {new int[]{1, 4}, false},
        {new int[]{1}, false},
        {new int[]{}, false},
        {new int[]{1, 1, 1, 3, 1}, false},
        {new int[]{1, 1, 3, 1, 1}, true},
        {new int[]{1, 1, 1, 1, 3}, true},
        {new int[]{1, 4, 1, 5}, false},
        {new int[]{1, 1, 2, 3}, false},
        {new int[]{2, 3, 2, 1}, false},
        {new int[]{2, 3, 1, 3}, true},
        {new int[]{1, 2, 3, 4, 1, 3}, true}
    };
  }

  public static Object[][] make2DataProvider() {
    return new Object[][]{
        {new int[]{4, 5}, new int[]{1, 2, 3}, new int[]{4, 5}},
        {new int[]{4}, new int[]{1, 2, 3}, new int[]{4, 1}},
        {new int[]{}, new int[]{1, 2}, new int[]{1, 2}},
        {new int[]{1, 2}, new int[]{}, new int[]{1, 2}},
        {new int[]{3}, new int[]{1, 2, 3}, new int[]{3, 1}},
        {new int[]{3}, new int[]{1}, new int[]{3, 1}},
        {new int[]{3, 1, 4}, new int[]{}, new int[]{3, 1}},
        {new int[]{1}, new int[]{1}, new int[]{1, 1}},
        {new int[]{1, 2, 3}, new int[]{7, 8}, new int[]{1, 2}},
        {new int[]{7, 8}, new int[]{1, 2, 3}, new int[]{7, 8}},
        {new int[]{7}, new int[]{1, 2, 3}, new int[]{7, 1}},
        {new int[]{5, 4}, new int[]{2, 3, 7}, new int[]{5, 4}}
    };
  }

  public static Object[][] front11DataProvider() {
    return new Object[][]{
        {new int[]{1, 2, 3}, new int[]{7, 9, 8}, new int[]{1, 7}},
        {new int[]{1}, new int[]{2}, new int[]{1, 2}},
        {new int[]{1, 7}, new int[]{}, new int[]{1}},
        {new int[]{}, new int[]{2, 8}, new int[]{2}},
        {new int[]{}, new int[]{}, new int[]{}},
        {new int[]{3}, new int[]{1, 4, 1, 9}, new int[]{3, 1}},
        {new int[]{1, 4, 1, 9}, new int[]{}, new int[]{1}}
    };
  }
}
