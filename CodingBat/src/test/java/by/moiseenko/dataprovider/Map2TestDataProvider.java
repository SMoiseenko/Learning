package by.moiseenko.dataprovider;

import java.util.HashMap;
import java.util.Map;

/**
 * Data provider for Map2Test
 */
public class Map2TestDataProvider {

  public static Object[][] word0DataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "a", "b"}, Map.of("a", 0, "b", 0)},
        {new String[]{"a", "b", "a", "c", "b"}, Map.of("a", 0, "b", 0, "c", 0)},
        {new String[]{"c", "b", "a"}, Map.of("a", 0, "b", 0, "c", 0)},
        {new String[]{"c", "c", "c", "c"}, Map.of("c", 0)},
        {new String[0], new HashMap<String, Integer>()}
    };
  }

  public static Object[][] wordLenDataProvider() {
    return new Object[][]{
        {new String[]{"a", "bb", "a", "bb"}, Map.of("bb", 2, "a", 1)},
        {new String[]{"this", "and", "that", "and"}, Map.of("that", 4, "and", 3, "this", 4)},
        {new String[]{"code", "code", "code", "bug"}, Map.of("code", 4, "bug", 3)},
        {new String[0], Map.of()},
        {new String[]{"z"}, Map.of("z", 1)}
    };
  }

  public static Object[][] pairsDataProvider() {
    return new Object[][]{
        {new String[]{"code", "bug"}, Map.of("b", "g", "c", "e")},
        {new String[]{"man", "moon", "main"}, Map.of("m", "n")},
        {new String[]{"man", "moon", "good", "night"}, Map.of("g", "d", "m", "n", "n", "t")},
        {new String[0], Map.of()},
        {new String[]{"a", "b"}, Map.of("a", "a", "b", "b")},
        {new String[]{"are", "codes", "and", "cods"}, Map.of("a", "d", "c", "s")},
        {new String[]{"apple", "banana", "tea", "coffee"},
            Map.of("a", "e", "b", "a", "c", "e", "t", "a")}
    };
  }

  public static Object[][] wordCountDataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "a", "c", "b"}, Map.of("a", 2, "b", 2, "c", 1)},
        {new String[]{"c", "b", "a"}, Map.of("a", 1, "b", 1, "c", 1)},
        {new String[]{"c", "c", "c", "c"}, Map.of("c", 4)},
        {new String[0], Map.of()},
        {new String[]{"this", "and", "this", ""}, Map.of("", 1, "and", 1, "this", 2)},
        {new String[]{"x", "y", "x", "Y", "X"}, Map.of("x", 2, "X", 1, "y", 1, "Y", 1)},
        {new String[]{"123", "0", "123", "1"}, Map.of("0", 1, "1", 1, "123", 2)},
        {new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b",
            "f", "x", "two", "b", "one", "two"},
            Map.of("a", 4, "b", 5, "d", 3, "e", 1, "f", 1, "one", 1, "x", 2, "z", 2, "two", 2)},
        {new String[]{"apple", "banana", "apple", "apple", "tea", "coffee", "banana"},
            Map.of("banana", 2, "apple", 3, "tea", 1, "coffee", 1)}
    };
  }

  public static Object[][] firstCharDataProvider() {
    return new Object[][]{
        {new String[]{"salt", "tea", "soda", "toast"}, Map.of("s", "saltsoda", "t", "teatoast")},
        {new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"},
            Map.of("a", "aaaAA", "b", "bb", "c", "cccCC", "d", "d")},
        {new String[0], Map.of()},
        {new String[]{"apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells"},
            Map.of("a", "appleaardvark", "b", "bellsbellsbells", "s", "saltsun", "z", "zen")}
    };
  }

  public static Object[][] wordAppendDataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "a"}, "a"},
        {new String[]{"a", "b", "a", "c", "a", "d", "a"}, "aa"},
        {new String[]{"a", "", "a"}, "a"},
        {new String[0], ""},
        {new String[]{"a", "b", "b", "a", "a"}, "ba"},
        {new String[]{"a", "b", "b", "b", "a", "c", "a", "a"}, "baa"},
        {new String[]{"a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a"}, "baaba"},
        {new String[]{"not", "and", "or", "and", "this", "and", "or", "that", "not"}, "andornot"},
        {new String[]{"a", "b", "c"}, ""},
        {new String[]{"this", "or", "that", "and", "this", "and", "that"}, "thisandthat"},
        {new String[]{"xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx"}, "xxyyzzxx"}
    };
  }

  public static Object[][] wordMultipleDataProvider() {
    return new Object[][]{
        {new String[]{"a", "b", "a", "c", "b"}, Map.of("a", true, "b", true, "c", false)},
        {new String[]{"c", "b", "a"}, Map.of("a", false, "b", false, "c", false)},
        {new String[]{"c", "c", "c", "c"}, Map.of("c", true)},
        {new String[0], new HashMap<String, Boolean>()},
        {new String[]{"this", "and", "this"}, Map.of("and", false, "this", true)},
        {new String[]{"d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x"},
            Map.of("a", true, "b", true, "d", true, "e", false, "x", false, "z", true)}
    };
  }

  public static Object[][] allSwapDataProvider() {
    return new Object[][]{
        {new String[]{"ab", "ac"}, new String[]{"ac", "ab"}},
        {new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"},
            new String[]{"ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"}},
        {new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"},
            new String[]{"ay", "by", "ax", "bx", "aj", "ai", "by", "bx"}},
        {new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"},
            new String[]{"ay", "bx", "cy", "ax", "cx", "abb", "aaa"}},
        {new String[]{"easy", "does", "it", "every", "ice", "eaten"},
            new String[]{"every", "does", "ice", "easy", "it", "eaten"}},
        {new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"},
            new String[]{"lily", "over", "water", "swims", "of", "list", "words", "wait"}},
        {new String[]{"4", "8", "15", "16", "23", "42"},
            new String[]{"42", "8", "16", "15", "23", "4"}},
        {new String[]{"aaa"}, new String[]{"aaa"}},
        {new String[0], new String[0]},
        {new String[]{"a", "b", "c", "xx", "yy", "zz"},
            new String[]{"a", "b", "c", "xx", "yy", "zz"}}
    };
  }

  public static Object[][] firstSwapDataProvider() {
    return new Object[][]{
        {new String[]{"ab", "ac"}, new String[]{"ac", "ab"}},
        {new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"},
            new String[]{"ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"}},
        {new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"},
            new String[]{"ay", "by", "ax", "bx", "ai", "aj", "bx", "by"}},
        {new String[]{"ax", "bx", "cx", "ay", "cy", "aaa", "abb"},
            new String[]{"ay", "bx", "cy", "ax", "cx", "aaa", "abb"}},
        {new String[]{"easy", "does", "it", "every", "ice", "eaten"},
            new String[]{"every", "does", "ice", "easy", "it", "eaten"}},
        {new String[]{"list", "of", "words", "swims", "over", "lily", "water", "wait"},
            new String[]{"lily", "over", "water", "swims", "of", "list", "words", "wait"}},
        {new String[]{"4", "8", "15", "16", "23", "42"},
            new String[]{"42", "8", "16", "15", "23", "4"}},
        {new String[]{"aaa"}, new String[]{"aaa"}},
        {new String[0], new String[0]},
        {new String[]{"a", "b", "c", "xx", "yy", "zz"},
            new String[]{"a", "b", "c", "xx", "yy", "zz"}}
    };
  }
}
