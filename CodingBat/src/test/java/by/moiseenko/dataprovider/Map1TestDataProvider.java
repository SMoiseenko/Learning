package by.moiseenko.dataprovider;

import java.util.HashMap;
import java.util.Map;

/**
 * Data provider for Map1Test
 */
public class Map1TestDataProvider {

  public static Map<?, ?>[][] mapBullyDataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "candy", "b", "dirt")),
            Map.of("a", "", "b", "candy")},
        {new HashMap<>(Map.of("a", "candy")), Map.of("a", "", "b", "candy")},
        {new HashMap<>(Map.of("a", "candy", "b", "carrot", "c", "meh")),
            Map.of("a", "", "b", "candy", "c", "meh")},
        {new HashMap<>(Map.of("b", "carrot")), Map.of("b", "carrot")},
        {new HashMap<>(Map.of("c", "meh")), Map.of("c", "meh")},
        {new HashMap<>(Map.of("a", "sparkle", "c", "meh")),
            Map.of("a", "", "b", "sparkle", "c", "meh")}
    };
  }

  public static Map<?, ?>[][] mapShareDataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "ccc")),
            Map.of("a", "aaa", "b", "aaa")},
        {new HashMap<>(Map.of("b", "xyz", "c", "ccc")), Map.of("b", "xyz")},
        {new HashMap<>(Map.of("a", "aaa", "c", "meh", "d", "hi")),
            Map.of("a", "aaa", "b", "aaa", "d", "hi")},
        {new HashMap<>(Map.of("a", "xyz", "b", "1234", "c", "yo", "z", "zzz")),
            Map.of("a", "xyz", "b", "xyz", "z", "zzz")},
        {new HashMap<>(
            Map.of("a", "xyz", "b", "1234", "c", "yo", "d", "ddd", "e", "everything")),
            Map.of("a", "xyz", "b", "xyz", "d", "ddd", "e", "everything")},
    };
  }

  public static Map<?, ?>[][] mapABDataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "Hi", "b", "There")),
            Map.of("a", "Hi", "ab", "HiThere", "b", "There")},
        {new HashMap<>(Map.of("a", "Hi")), Map.of("a", "Hi")},
        {new HashMap<>(Map.of("b", "There")), Map.of("b", "There")},
        {new HashMap<>(Map.of("c", "meh")), Map.of("c", "meh")},
        {new HashMap<>(Map.of("a", "aaa", "ab", "nope", "b", "bbb", "c", "ccc")),
            Map.of("a", "aaa", "ab", "aaabbb", "b", "bbb", "c", "ccc")},
        {new HashMap<>(Map.of("ab", "nope", "b", "bbb", "c", "ccc")),
            Map.of("ab", "nope", "b", "bbb", "c", "ccc")},
    };
  }

  public static Map<?, ?>[][] topping1DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("ice cream", "peanuts")),
            Map.of("bread", "butter", "ice cream", "cherry")},
        {new HashMap<String, String>(Map.of()), Map.of("bread", "butter")},
        {new HashMap<>(Map.of("pancake", "syrup")),
            Map.of("bread", "butter", "pancake", "syrup")},
        {new HashMap<>(Map.of("bread", "dirt", "ice cream", "strawberries")),
            Map.of("bread", "butter", "ice cream", "cherry")},
        {new HashMap<>(
            Map.of("bread", "jam", "ice cream", "strawberries", "salad", "oil")),
            Map.of("bread", "butter", "ice cream", "cherry", "salad", "oil")},
    };
  }

  public static Map<?, ?>[][] topping2DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("ice cream", "cherry")),
            Map.of("yogurt", "cherry", "ice cream", "cherry")},
        {new HashMap<>(Map.of("spinach", "dirt", "ice cream", "cherry")),
            Map.of("yogurt", "cherry", "spinach", "nuts", "ice cream", "cherry")},
        {new HashMap<>(Map.of("yogurt", "salt")), Map.of("yogurt", "salt")},
        {new HashMap<>(Map.of("yogurt", "salt", "bread", "butter")),
            Map.of("yogurt", "salt", "bread", "butter")},
        {new HashMap<String, String>(Map.of()), Map.of()},
        {new HashMap<>(Map.of("ice cream", "air", "salad", "oil")),
            Map.of("yogurt", "air", "ice cream", "air", "salad", "oil")},
    };
  }

  public static Map<?, ?>[][] topping3DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("potato", "ketchup")),
            Map.of("potato", "ketchup", "fries", "ketchup")},
        {new HashMap<>(Map.of("potato", "butter")),
            Map.of("potato", "butter", "fries", "butter")},
        {new HashMap<>(Map.of("salad", "oil", "potato", "ketchup")),
            Map.of("spinach", "oil", "salad", "oil", "potato", "ketchup", "fries", "ketchup")},
        {new HashMap<>(
            Map.of("toast", "butter", "salad", "oil", "potato", "ketchup")),
            Map.of("toast", "butter", "spinach", "oil", "salad", "oil", "potato", "ketchup",
                "fries", "ketchup")},
        {new HashMap<String, String>(Map.of()), Map.of()},
        {new HashMap<>(Map.of("salad", "pepper", "fries", "salt")),
            Map.of("spinach", "pepper", "salad", "pepper", "fries", "salt")},
    };
  }

  public static Map<?, ?>[][] mapAB2DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake")),
            Map.of("c", "cake")},
        {new HashMap<>(Map.of("a", "aaa", "b", "bbb")),
            Map.of("a", "aaa", "b", "bbb")},
        {new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa")),
            Map.of("a", "aaa", "b", "bbb", "c", "aaa")},
        {new HashMap<>(Map.of("a", "aaa")), Map.of("a", "aaa")},
        {new HashMap<>(Map.of("b", "bbb")), Map.of("b", "bbb")},
        {new HashMap<>(Map.of("a", "", "b", "", "c", "ccc")), Map.of("c", "ccc")},
        {new HashMap<String, String>(Map.of()), Map.of()},
        {new HashMap<>(Map.of("a", "a", "b", "b", "z", "zebra")),
            Map.of("a", "a", "b", "b", "z", "zebra")},
    };
  }

  public static Map<?, ?>[][] mapAB3DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "aaa", "c", "cake")),
            Map.of("a", "aaa", "b", "aaa", "c", "cake")},
        {new HashMap<>(Map.of("b", "bbb", "c", "cake")),
            Map.of("a", "bbb", "b", "bbb", "c", "cake")},
        {new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")),
            Map.of("a", "aaa", "b", "bbb", "c", "cake")},
        {new HashMap<>(Map.of("ccc", "ccc")), Map.of("ccc", "ccc")},
        {new HashMap<>(Map.of("c", "a", "d", "b")), Map.of("c", "a", "d", "b")},
        {new HashMap<String, String>(Map.of()), Map.of()},
        {new HashMap<>(Map.of("a", "")), Map.of("a", "", "b", "")},
        {new HashMap<>(Map.of("b", "")), Map.of("a", "", "b", "")},
        {new HashMap<>(Map.of("a", "", "b", "")), Map.of("a", "", "b", "")},
        {new HashMap<>(Map.of("aa", "aa", "a", "apple", "z", "zzz")),
            Map.of("aa", "aa", "a", "apple", "b", "apple", "z", "zzz")},
    };
  }

  public static Object[][] mapAB4DataProvider() {
    return new Map[][]{
        {new HashMap<>(Map.of("a", "aaa", "b", "bb", "c", "cake")),
            Map.of("a", "aaa", "b", "bb", "c", "aaa")},
        {new HashMap<>(Map.of("a", "aa", "b", "bbb", "c", "cake")),
            Map.of("a", "aa", "b", "bbb", "c", "bbb")},
        {new HashMap<>(Map.of("a", "aa", "b", "bbb")),
            Map.of("a", "aa", "b", "bbb", "c", "bbb")},
        {new HashMap<>(Map.of("a", "aaa")), Map.of("a", "aaa")},
        {new HashMap<>(Map.of("b", "bbb")), Map.of("b", "bbb")},
        {new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "cake")),
            Map.of("a", "", "b", "", "c", "cake")},
        {new HashMap<>(Map.of("a", "a", "b", "b", "c", "cake")),
            Map.of("a", "", "b", "", "c", "cake")},
        {new HashMap<>(Map.of("a", "", "b", "b", "c", "cake")),
            Map.of("a", "", "b", "b", "c", "b")},
        {new HashMap<>(Map.of("a", "a", "b", "", "c", "cake")),
            Map.of("a", "a", "b", "", "c", "a")},
        {new HashMap<>(Map.of("c", "cat", "d", "dog")),
            Map.of("c", "cat", "d", "dog")},
        {new HashMap<>(Map.of("ccc", "ccc")), Map.of("ccc", "ccc")},
        {new HashMap<>(Map.of("c", "a", "d", "b")), Map.of("c", "a", "d", "b")},
        {new HashMap<String, String>(Map.of()), Map.of()},
        {new HashMap<>(Map.of("a", "", "z", "z")), Map.of("a", "", "z", "z")},
        {new HashMap<>(Map.of("b", "", "z", "z")), Map.of("b", "", "z", "z")},
    };
  }
}
