package by.moiseenko.dataprovider;

import java.util.List;

/**
 * Data provider for AP1Test
 */
public class AP1TestDataProvider {

  public static Object[][] scoresIncreasingDataProvider() {
    return new Object[][]{
        {new int[]{1, 3, 4}, true},
        {new int[]{1, 3, 2}, false},
        {new int[]{1, 1, 4}, true},
        {new int[]{1, 1, 2, 4, 4, 7}, true},
        {new int[]{1, 1, 2, 4, 3, 7}, false},
        {new int[]{-5, 4, 11}, true}
    };
  }

  public static Object[][] scores100DataProvider() {
    return new Object[][]{
        {new int[]{1, 100, 100}, true},
        {new int[]{1, 100, 99, 100}, false},
        {new int[]{100, 1, 100, 100}, true},
        {new int[]{100, 1, 100, 1}, false},
        {new int[]{1, 2, 3, 4, 5}, false},
        {new int[]{1, 2, 100, 4, 5}, false}
    };
  }

  public static Object[][] scoresClumpDataProvider() {
    return new Object[][]{
        {new int[]{3, 4, 5}, true},
        {new int[]{3, 4, 6}, false},
        {new int[]{1, 3, 5, 5}, true},
        {new int[]{2, 4, 5, 6}, true},
        {new int[]{2, 4, 5, 7}, false},
        {new int[]{2, 4, 4, 7}, true},
        {new int[]{3, 3, 6, 7, 9}, false},
        {new int[]{3, 3, 7, 7, 9}, true},
        {new int[]{4, 5, 8}, false}
    };
  }

  public static Object[][] scoresAverageDataProvider() {
    return new Object[][]{
        {new int[]{2, 2, 4, 4}, 4},
        {new int[]{4, 4, 4, 2, 2, 2}, 4},
        {new int[]{3, 4, 5, 1, 2, 3}, 4},
        {new int[]{5, 6}, 6},
        {new int[]{5, 4}, 5},
        {new int[]{5, 4, 5, 6, 2, 1, 2, 3}, 5}
    };
  }

  public static Object[][] wordsCountDataProvider() {
    return new Object[][]{
        {new String[]{"a", "bb", "b", "ccc"}, 1, 2},
        {new String[]{"a", "bb", "b", "ccc"}, 3, 1},
        {new String[]{"a", "bb", "b", "ccc"}, 4, 0},
        {new String[]{"xx", "yyy", "x", "yy", "z"}, 1, 2},
        {new String[]{"xx", "yyy", "x", "yy", "z"}, 2, 2},
        {new String[]{"xx", "yyy", "x", "yy", "z"}, 3, 1},
    };
  }

  public static Object[][] wordsFrontDataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "c", "d"}, 1, new String[]{"a"}},
        {new String[]{"a", "b", "c", "d"}, 2, new String[]{"a", "b"}},
        {new String[]{"a", "b", "c", "d"}, 3, new String[]{"a", "b", "c"}},
        {new String[]{"a", "b", "c", "d"}, 4, new String[]{"a", "b", "c", "d"}},
        {new String[]{"Hi", "There"}, 1, new String[]{"Hi"}},
        {new String[]{"Hi", "There"}, 2, new String[]{"Hi", "There"}}
    };
  }

  public static Object[][] wordsWithoutListDataProvider() {
    return new Object[][]{
        {new String[]{"a", "bb", "b", "ccc"}, 1, List.of("bb", "ccc")},
        {new String[]{"a", "bb", "b", "ccc"}, 3, List.of("a", "bb", "b")},
        {new String[]{"a", "bb", "b", "ccc"}, 4, List.of("a", "bb", "b", "ccc")},
        {new String[]{"xx", "yyy", "x", "yy", "z"}, 1, List.of("xx", "yyy", "yy")},
        {new String[]{"xx", "yyy", "x", "yy", "z"}, 2, List.of("yyy", "x", "z")}
    };

  }

  public static Object[][] hasOneDataProvider() {
    return new Object[][]{
        {10, true},
        {22, false},
        {220, false},
        {212, true},
        {1, true},
        {9, false},
        {211112, true},
        {121121, true},
        {222222, false},
        {56156, true},
        {56556, false}
    };
  }

  public static Object[][] dividesSelfDataProvider() {
    return new Object[][]{
        {128, true},
        {12, true},
        {120, false},
        {122, true},
        {13, false},
        {32, false},
        {22, true},
        {42, false},
        {212, true},
        {213, false},
        {162, true}
    };
  }

  public static Object[][] copyEvensDataProvider() {
    return new Object[][]{
        {new int[]{3, 2, 4, 5, 8}, 2, new int[]{2, 4}},
        {new int[]{3, 2, 4, 5, 8}, 3, new int[]{2, 4, 8}},
        {new int[]{6, 1, 2, 4, 5, 8}, 3, new int[]{6, 2, 4}},
        {new int[]{6, 1, 2, 4, 5, 8}, 4, new int[]{6, 2, 4, 8}},
        {new int[]{3, 1, 4, 1, 5}, 1, new int[]{4}},
        {new int[]{2}, 1, new int[]{2}},
        {new int[]{6, 2, 4, 8}, 2, new int[]{6, 2}},
        {new int[]{6, 2, 4, 8}, 3, new int[]{6, 2, 4}},
        {new int[]{6, 2, 4, 8}, 4, new int[]{6, 2, 4, 8}},
        {new int[]{1, 8, 4}, 1, new int[]{8}},
        {new int[]{1, 8, 4}, 2, new int[]{8, 4}},
        {new int[]{2, 8, 4}, 2, new int[]{2, 8}}
    };

  }

  public static Object[][] copyEndyDataProvider() {
    return new Object[][]{
        {new int[]{9, 11, 90, 22, 6}, 2, new int[]{9, 90}},
        {new int[]{9, 11, 90, 22, 6}, 3, new int[]{9, 90, 6}},
        {new int[]{12, 1, 1, 13, 0, 20}, 2, new int[]{1, 1}},
        {new int[]{12, 1, 1, 13, 0, 20}, 3, new int[]{1, 1, 0}},
        {new int[]{0}, 1, new int[]{0}},
        {new int[]{10, 11, 90}, 2, new int[]{10, 90}},
        {new int[]{90, 22, 100}, 2, new int[]{90, 100}},
        {new int[]{12, 11, 10, 89, 101, 4}, 1, new int[]{10}},
        {new int[]{13, 2, 2, 0}, 2, new int[]{2, 2}},
        {new int[]{13, 2, 2, 0}, 3, new int[]{2, 2, 0}},
        {new int[]{13, 2, 13, 2, 0, 30}, 2, new int[]{2, 2}},
        {new int[]{13, 2, 13, 2, 0, 30}, 3, new int[]{2, 2, 0}}
    };
  }

  public static Object[][] matchUpDataProvider() {
    return new Object[][]{
        {new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "xx", "bb"}, 1},
        {new String[]{"aa", "bb", "cc"}, new String[]{"aaa", "b", "bb"}, 2},
        {new String[]{"aa", "bb", "cc"}, new String[]{"", "", "ccc"}, 1},
        {new String[]{"", "", "ccc"}, new String[]{"aa", "bb", "cc"}, 1},
        {new String[]{"", "", ""}, new String[]{"", "bb", "cc"}, 0},
        {new String[]{"aa", "bb", "cc"}, new String[]{"", "", ""}, 0},
        {new String[]{"aa", "", "ccc"}, new String[]{"", "bb", "cc"}, 1},
        {new String[]{"x", "y", "z"}, new String[]{"y", "z", "x"}, 0},
        {new String[]{"", "y", "z"}, new String[]{"", "y", "x"}, 1},
        {new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", "zzz"}, 3},
        {new String[]{"x", "y", "z"}, new String[]{"xx", "yyy", ""}, 2},
        {new String[]{"b", "x", "y", "z"}, new String[]{"a", "xx", "yyy", "zzz"}, 3},
        {new String[]{"aaa", "bb", "c"}, new String[]{"aaa", "xx", "bb"}, 1}
    };
  }

  public static Object[][] scoreUpDataProvider() {
    return new Object[][]{
        {new String[]{"a", "a", "b", "b"}, new String[]{"a", "c", "b", "c"}, 6},
        {new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "c"}, 11},
        {new String[]{"a", "a", "b", "b"}, new String[]{"a", "a", "b", "b"}, 16},
        {new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "b", "?"}, 3},
        {new String[]{"a", "a", "b", "b"}, new String[]{"?", "c", "?", "?"}, -1},
        {new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "b"}, 7},
        {new String[]{"a", "a", "b", "b"}, new String[]{"c", "?", "b", "?"}, 3},
        {new String[]{"a", "b", "c"}, new String[]{"a", "c", "b"}, 2},
        {new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "a", "c", "a", "c"}, 4},
        {new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "a", "c"}, 6},
        {new String[]{"a", "a", "b", "b", "c", "c"}, new String[]{"a", "c", "?", "?", "c", "c"},
            11},
        {new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}, 12}
    };
  }

  public static Object[][] wordsWithoutDataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "c", "a"}, "a", new String[]{"b", "c"}},
        {new String[]{"a", "b", "c", "a"}, "b", new String[]{"a", "c", "a"}},
        {new String[]{"a", "b", "c", "a"}, "c", new String[]{"a", "b", "a"}},
        {new String[]{"b", "c", "a", "a"}, "b", new String[]{"c", "a", "a"}},
        {new String[]{"xx", "yyy", "x", "yy", "x"}, "x", new String[]{"xx", "yyy", "yy"}},
        {new String[]{"xx", "yyy", "x", "yy", "x"}, "yy", new String[]{"xx", "yyy", "x", "x"}},
        {new String[]{"aa", "ab", "ac", "aa"}, "aa", new String[]{"ab", "ac"}}
    };

  }

  public static Object[][] scoresSpecialDataProvider() {
    return new Object[][]{
        {new int[]{12, 10, 4}, new int[]{2, 20, 30}, 40},
        {new int[]{20, 10, 4}, new int[]{2, 20, 10}, 40},
        {new int[]{12, 11, 4}, new int[]{2, 20, 31}, 20},
        {new int[]{1, 20, 2, 50}, new int[]{3, 4, 5}, 50},
        {new int[]{3, 4, 5}, new int[]{1, 50, 2, 20}, 50},
        {new int[]{10, 4, 20, 30}, new int[]{20}, 50},
        {new int[]{10, 4, 20, 30}, new int[]{20}, 50},
        {new int[]{10, 4, 20, 30}, new int[]{3, 20, 99}, 50},
        {new int[]{10, 4, 20, 30}, new int[]{30, 20, 99}, 60},
        {new int[]{}, new int[]{2}, 0},
        {new int[]{}, new int[]{20}, 20},
        {new int[]{14, 10, 4}, new int[]{4, 20, 30}, 40}
    };
  }

  public static Object[][] sumHeightsDataProvider() {
    return new Object[][]{
        {new int[]{5, 3, 6, 7, 2}, 2, 4, 6},
        {new int[]{5, 3, 6, 7, 2}, 0, 1, 2},
        {new int[]{5, 3, 6, 7, 2}, 0, 4, 11},
        {new int[]{5, 3, 6, 7, 2}, 1, 1, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 3},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 11},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8, 8},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6, 3},
        {new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4, 1},
        {new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5, 2}
    };
  }

  public static Object[][] sumHeights2DataProvider() {
    return new Object[][]{
        {new int[]{5, 3, 6, 7, 2}, 2, 4, 7},
        {new int[]{5, 3, 6, 7, 2}, 0, 1, 2},
        {new int[]{5, 3, 6, 7, 2}, 0, 4, 15},
        {new int[]{5, 3, 6, 7, 2}, 1, 1, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 6},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 19},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8, 16},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6, 4},
        {new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 4, 1},
        {new int[]{10, 8, 7, 7, 7, 6, 7}, 1, 5, 2}
    };
  }

  public static Object[][] bigHeightsDataProvider() {
    return new Object[][]{
        {new int[]{5, 3, 6, 7, 2}, 2, 4, 1},
        {new int[]{5, 3, 6, 7, 2}, 0, 1, 0},
        {new int[]{5, 3, 6, 7, 2}, 0, 4, 1},
        {new int[]{5, 3, 6, 7, 3}, 0, 4, 0},
        {new int[]{5, 3, 6, 7, 2}, 1, 1, 0},
        {new int[]{5, 13, 6, 7, 2}, 1, 2, 1},
        {new int[]{5, 13, 6, 7, 2}, 0, 2, 2},
        {new int[]{5, 13, 6, 7, 2}, 1, 4, 2},
        {new int[]{5, 13, 6, 7, 2}, 0, 4, 3},
        {new int[]{5, 13, 6, 7, 2}, 0, 3, 2},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3, 0},
        {new int[]{1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8, 1},
        {new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3, 1},
        {new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8, 1},
        {new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8, 2},
        {new int[]{1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8, 3}
    };
  }

  public static Object[][] userCompareDataProvider() {
    return new Object[][]{
        {"bb", 1, "zz", 2, -1},
        {"bb", 1, "aa", 2, 1},
        {"bb", 1, "bb", 1, 0},
        {"bb", 5, "bb", 1, 1},
        {"bb", 5, "bb", 10, -1},
        {"adam", 1, "bob", 2, -1},
        {"bob", 1, "bob", 2, -1},
        {"bzb", 1, "bob", 2, 1}
    };
  }

  public static Object[][] mergeTwoDataProvider() {
    return new Object[][]{
        {new String[]{"a", "c", "z"}, new String[]{"b", "f", "z"}, 3, new String[]{"a", "b", "c"}},
        {new String[]{"a", "c", "z"}, new String[]{"c", "f", "z"}, 3, new String[]{"a", "c", "f"}},
        {new String[]{"f", "g", "z"}, new String[]{"c", "f", "g"}, 3, new String[]{"c", "f", "g"}},
        {new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 3, new String[]{"a", "c", "z"}},
        {new String[]{"a", "b", "c", "z"}, new String[]{"a", "c", "z"}, 3,
            new String[]{"a", "b", "c"}},
        {new String[]{"a", "c", "z"}, new String[]{"a", "b", "c", "z"}, 3,
            new String[]{"a", "b", "c"}},
        {new String[]{"a", "c", "z"}, new String[]{"a", "c", "z"}, 2, new String[]{"a", "c"}},
        {new String[]{"a", "c", "z"}, new String[]{"a", "c", "y", "z"}, 3,
            new String[]{"a", "c", "y"}},
        {new String[]{"x", "y", "z"}, new String[]{"a", "b", "z"}, 3, new String[]{"a", "b", "x"}}
    };

  }

  public static Object[][] commonTwoDataProvider() {
    return new Object[][]{
        {new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}, 2},
        {new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}, 3},
        {new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}, 3},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "c"}, 3},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}, 3},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"a", "b", "b", "c", "c"}, 3},
        {new String[]{"b", "b", "b", "b", "c"}, new String[]{"a", "b", "b", "b", "c"}, 2},
        {new String[]{"a", "b", "c", "c", "d"}, new String[]{"a", "b", "b", "c", "d", "d"}, 4},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b"}, 1},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"c", "c"}, 1},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b", "b", "x"}, 1},
        {new String[]{"a", "a", "b", "b", "c"}, new String[]{"b", "b"}, 1},
        {new String[]{"a"}, new String[]{"a", "b"}, 1},
        {new String[]{"a"}, new String[]{"b"}, 0},
        {new String[]{"a", "a"}, new String[]{"b", "b"}, 0},
        {new String[]{"a", "b"}, new String[]{"a", "b"}, 2}
    };
  }
}
