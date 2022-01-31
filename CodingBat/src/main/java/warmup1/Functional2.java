package warmup1;

import java.util.List;

/**
 * Functional filtering and mapping operations on lists with lambdas. See the Java Functional
 * Filtering page for an introduction. The main computation for each of these problems can be done
 * with 1 or 2 lines of lambda code.
 */
public interface Functional2 {

  /**
   * Given a list of integers, return a list of the integers, omitting any that are less than 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noNeg([1, -2]) → [1]}
   * <p>
   * {@code noNeg([-3, -3, 3, 3]) → [3, 3]}
   * <p>
   * {@code noNeg([-1, -1, -1]) → []}
   */
  List<Integer> noNeg(List<Integer> nums);

  /**
   * Given a list of non-negative integers, return a list of those numbers except omitting any that
   * end with 9. (Note: % by 10)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code no9([1, 2, 19]) → [1, 2]}
   * <p>
   * {@code no9([9, 19, 29, 3]) → [3]}
   * <p>
   * {@code no9([1, 2, 3]) → [1, 2, 3]}
   */
  List<Integer> no9(List<Integer> nums);

  /**
   * Given a list of integers, return a list of those numbers, omitting any that are between 13 and
   * 19 inclusive.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noTeen([12, 13, 19, 20]) → [12, 20]}
   * <p>
   * {@code noTeen([1, 14, 1]) → [1, 1]}
   * <p>
   * {@code noTeen([15]) → []}
   */
  List<Integer> noTeen(List<Integer> nums);

  /**
   * Given a list of strings, return a list of the strings, omitting any string that contains a "z".
   * (Note: the str.contains(x) method returns a boolean)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]}
   * <p>
   * {@code noZ(["hziz", "hzello", "hi"]) → ["hi"]}
   * <p>
   * {@code  noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]}
   */
  List<String> noZ(List<String> strings);

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 4 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noLong(["this", "not", "too", "long"]) → ["not", "too"]}
   * <p>
   * {@code noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]}
   * <p>
   * {@code noLong(["cccc", "cccc", "cccc"]) → []}
   */
  List<String> noLong(List<String> strings);

  /**
   * Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code no34(["a", "bb", "ccc"]) → ["a", "bb"]}
   * <p>
   * {@code no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]}
   * <p>
   * {@code no34(["ccc", "dddd", "apple"]) → ["apple"]}
   */
  List<String> no34(List<String> strings);

  /**
   * Given a list of strings, return a list where each string has "y" added at its end, omitting any
   * resulting strings that contain "yy" as a substring anywhere.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noYY(["a", "b", "c"]) → ["ay", "by", "cy"]}
   * <p>
   * {@code noYY(["a", "b", "cy"]) → ["ay", "by"]}
   * <p>
   * {@code noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]}
   */
  List<String> noYY(List<String> strings);

  /**
   * Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting
   * any of the resulting numbers that end in 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code two2([1, 2, 3]) → [4, 6]}
   * <p>
   * {@code two2([2, 6, 11]) → [4]}
   * <p>
   * {@code two2([0]) → [0]}
   */
  List<Integer> two2(List<Integer> nums);

  /**
   * Given a list of integers, return a list of those numbers squared and the product added to 10,
   * omitting any of the resulting numbers that end in 5 or 6.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code square56([3, 1, 4]) → [19, 11]}
   * <p>
   * {@code square56([1]) → [11]}
   * <p>
   * {@code square56([2]) → [14]}
   */
  List<Integer> square56(List<Integer> nums);
}