package by.moiseenko.dataprovider;

import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Functional2TestDataProvider {


  public static List<?>[][] noNegDataProvider() {
    return new List[][]{
        {List.of(1, -2), List.of(1)},
        {List.of(-3, -3, 3, 3), List.of(3, 3)},
        {List.of(-1, -1, -1), List.of()},
        {List.of(), List.of()},
        {List.of(0, 1, 2), List.of(0, 1, 2)},
        {List.of(3, -10, 1, -1, 4, -400), List.of(3, 1, 4)},
        {List.of(-1, 3, 1, -1, -10, -100, -111, 5), List.of(3, 1, 5)}
    };
  }

  public static List<?>[][] no9DataProvider() {
    return new List[][]{
        {List.of(1, 2, 19), List.of(1, 2)},
        {List.of(9, 19, 29, 3), List.of(3)},
        {List.of(1, 2, 3), List.of(1, 2, 3)},
        {List.of(45, 99, 90, 28, 13, 999, 0), List.of(45, 90, 28, 13, 0)},
        {List.of(), List.of()},
        {List.of(9), List.of()},
        {List.of(0, 9, 0), List.of(0, 0)}
    };
  }

  public static List<?>[][] noTeenDataProvider() {
    return new List[][]{
        {List.of(12, 13, 19, 20), List.of(12, 20)},
        {List.of(1, 14, 1), List.of(1, 1)},
        {List.of(15), List.of()},
        {List.of(-15), List.of(-15)},
        {List.of(), List.of()},
        {List.of(0, 1, 2, -3), List.of(0, 1, 2, -3)},
        {List.of(15, 17, 19, 21, 19), List.of(21)},
        {List.of(-16, 2, 15, 3, 16, 25), List.of(-16, 2, 3, 25)}
    };
  }

  public static List<?>[][] noZDataProvider() {
    return new List[][]{
        {List.of("aaa", "bbb", "aza"), List.of("aaa", "bbb")},
        {List.of("hziz", "hzello", "hi"), List.of("hi")},
        {List.of("hello", "howz", "are", "youz"), List.of("hello", "are")},
        {List.of(), List.of()},
        {List.of(""), List.of("")},
        {List.of("x", "y", "z"), List.of("x", "y")}
    };
  }

  public static List<?>[][] noLongDataProvider() {
    return new List[][]{
        {List.of("this", "not", "too", "long"), List.of("not", "too")},
        {List.of("a", "bbb", "cccc"), List.of("a", "bbb")},
        {List.of("cccc", "cccc", "cccc"), List.of()},
        {List.of(), List.of()},
        {List.of(""), List.of("")},
        {List.of("empty", "", "empty"), List.of("")},
        {List.of("a"), List.of("a")},
        {List.of("aaaa", "bbb", "***", "333"), List.of("bbb", "***", "333")}
    };
  }

  public static List<?>[][] no34DataProvider() {
    return new List[][]{
        {List.of("a", "bb", "ccc"), List.of("a", "bb")},
        {List.of("a", "bb", "ccc", "dddd"), List.of("a", "bb")},
        {List.of("ccc", "dddd", "apple"), List.of("apple")},
        {List.of("this", "not", "too", "long"), List.of()},
        {List.of("a", "bbb", "cccc", "xx"), List.of("a", "xx")},
        {List.of("dddd", "ddd", "xxxxxxx"), List.of("xxxxxxx")},
        {List.of(), List.of()},
        {List.of(""), List.of("")},
        {List.of("empty", "", "empty"), List.of("empty", "", "empty")},
        {List.of("a"), List.of("a")},
        {List.of("aaaa", "bbb", "*****", "333"), List.of("*****")}
    };
  }

  public static List<?>[][] noYYDataProvider() {
    return new List[][]{
        {List.of("a", "b", "c"), List.of("ay", "by", "cy")},
        {List.of("a", "b", "cy"), List.of("ay", "by")},
        {List.of("xx", "ya", "zz"), List.of("xxy", "yay", "zzy")},
        {List.of("xx", "yay", "zz"), List.of("xxy", "zzy")},
        {List.of("yyx", "y", "zzz"), List.of("zzzy")},
        {List.of("hello", "there"), List.of("helloy", "therey")},
        {List.of("ya"), List.of("yay")},
        {List.of(), List.of()},
        {List.of(""), List.of("y")},
        {List.of("xx", "yy", "zz"), List.of("xxy", "zzy")}
    };
  }

  public static List<?>[][] two2DataProvider() {
    return new List[][]{
        {List.of(1, 2, 3), List.of(4, 6)},
        {List.of(2, 6, 11), List.of(4)},
        {List.of(0), List.of(0)},
        {List.of(), List.of()},
        {List.of(1, 11, 111, 16), List.of()},
        {List.of(2, 3, 5, 7, 11), List.of(4, 6, 10, 14)},
        {List.of(3, 1, 4, 1, 6, 99, 0), List.of(6, 8, 198, 0)}
    };
  }

  public static List<?>[][] square56DataProvider() {
    return new List[][]{
        {List.of(3, 1, 4), List.of(19, 11)},
        {List.of(1), List.of(11)},
        {List.of(2), List.of(14)},
        {List.of(3), List.of(19)},
        {List.of(4), List.of()},
        {List.of(5), List.of()},
        {List.of(6), List.of()},
        {List.of(7), List.of(59)},
        {List.of(1, 2, 3, 4, 5, 6, 7), List.of(11, 14, 19, 59)},
        {List.of(3, -1, -4, 1, 5, 9), List.of(19, 11, 11, 91)}
    };
  }
}
