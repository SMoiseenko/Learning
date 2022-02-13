package by.moiseenko.dataprovider;

import java.util.List;

/**
 * Data provider for Functional1Test
 */
public class Functional1TestDataProvider {

  public static List<?>[][] doublingDataProvider() {
    return new List[][]{
        {List.of(1, 2, 3), List.of(2, 4, 6)},
        {List.of(6, 8, 6, 8, -1), List.of(12, 16, 12, 16, -2)},
        {List.of(), List.of()},
        {List.of(5), List.of(10)},
        {List.of(5, 10), List.of(10, 20)},
        {List.of(8, -5, 7, 3, 109), List.of(16, -10, 14, 6, 218)},
        {List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4)},
        {List.of(3, 1, 4, 1, 5, 9), List.of(6, 2, 8, 2, 10, 18)}
    };

  }

  public static List<?>[][] squareDataProvider() {
    return new List[][]{
        {List.of(1, 2, 3), List.of(1, 4, 9)},
        {List.of(6, 8, -6, -8, 1), List.of(36, 64, 36, 64, 1)},
        {List.of(), List.of()},
        {List.of(12), List.of(144)},
        {List.of(5, 10), List.of(25, 100)},
        {List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4)}
    };
  }

  public static List<?>[][] addStarDataProvider() {
    return new List[][]{
        {List.of("a", "bb", "ccc"), List.of("a*", "bb*", "ccc*")},
        {List.of("hello", "there"), List.of("hello*", "there*")},
        {List.of(), List.of()},
        {List.of("kittens", "and", "chocolate", "and"),
            List.of("kittens*", "and*", "chocolate*", "and*")},
        {List.of("empty", "string", ""), List.of("empty*", "string*", "*")}
    };
  }

  public static List<?>[][] copies3DataProvider() {
    return new List[][]{
        {List.of("a", "bb", "ccc"), List.of("aaa", "bbbbbb", "ccccccccc")},
        {List.of("24", "a", ""), List.of("242424", "aaa", "")},
        {List.of("hello", "there"), List.of("hellohellohello", "theretherethere")},
        {List.of("no"), List.of("nonono")},
        {List.of(), List.of()},
        {List.of("this", "and", "that", "and"),
            List.of("thisthisthis", "andandand", "thatthatthat", "andandand")}
    };
  }

  public static List<?>[][] moreYDataProvider() {
    return new List[][]{
        {List.of("a", "b", "c"), List.of("yay", "yby", "ycy")},
        {List.of("hello", "there"), List.of("yhelloy", "ytherey")},
        {List.of("yay"), List.of("yyayy")},
        {List.of("", "a", "xx"), List.of("yy", "yay", "yxxy")},
        {List.of(), List.of()},
        {List.of("xx", "yy", "zz"), List.of("yxxy", "yyyy", "yzzy")}
    };
  }

  public static List<?>[][] math1DataProvider() {
    return new List[][]{
        {List.of(1, 2, 3), List.of(20, 30, 40)},
        {List.of(6, 8, 6, 8, 1), List.of(70, 90, 70, 90, 20)},
        {List.of(10), List.of(110)},
        {List.of(), List.of()},
        {List.of(5, 10), List.of(60, 110)},
        {List.of(-1, -2, -3, -2, -1), List.of(0, -10, -20, -10, 0)},
        {List.of(6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2),
            List.of(70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30)}
    };
  }

  public static List<?>[][] rightDigitDataProvider() {
    return new List[][]{
        {List.of(1, 22, 93), List.of(1, 2, 3)},
        {List.of(16, 8, 886, 8, 1), List.of(6, 8, 6, 8, 1)},
        {List.of(10, 0), List.of(0, 0)},
        {List.of(), List.of()},
        {List.of(5, 10), List.of(5, 0)},
        {List.of(5, 50, 500, 5000, 5000), List.of(5, 0, 0, 0, 0)},
        {List.of(6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2), List.of(6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2)}
    };
  }

  public static List<?>[][] lowerDataProvider() {
    return new List[][]{
        {List.of("Hello", "Hi"), List.of("hello", "hi")},
        {List.of("AAA", "BBB", "ccc"), List.of("aaa", "bbb", "ccc")},
        {List.of("KitteN", "ChocolaTE"), List.of("kitten", "chocolate")},
        {List.of(), List.of()},
        {List.of("EMPTY", ""), List.of("empty", "")},
        {List.of("aaX", "bYb", "Ycc", "ZZZ"), List.of("aax", "byb", "ycc", "zzz")}
    };
  }

  public static List<?>[][] noXDataProvider() {
    return new List[][]{
        {List.of("ax", "bb", "cx"), List.of("a", "bb", "c")},
        {List.of("xxax", "xbxbx", "xxcx"), List.of("a", "bb", "c")},
        {List.of("x"), List.of("")},
        {List.of(""), List.of("")},
        {List.of(), List.of()},
        {List.of("the", "taxi"), List.of("the", "tai")},
        {List.of("the", "xxtxaxixxx"), List.of("the", "tai")},
        {List.of("this", "is", "the", "x"), List.of("this", "is", "the", "")}
    };
  }

}
