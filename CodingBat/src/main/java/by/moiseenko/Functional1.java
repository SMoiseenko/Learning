package by.moiseenko;

import java.util.List;

/**
 * Functional mapping operations on lists with lambdas. See the Java Functional Mapping page for an
 * introduction. The main computation for each of these problems can be done with 1 line of lambda
 * code
 */
public interface Functional1 {

  /**
   * Given a list of integers, return a list where each integer is multiplied by 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code doubling([1, 2, 3]) → [2, 4, 6]}
   * <p>
   * {@code doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]}
   * <p>
   * {@code doubling([]) → []}
   */
  List<Integer> doubling(List<Integer> nums);

  /**
   * Given a list of integers, return a list where each integer is multiplied with itself.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code square([1, 2, 3]) → [1, 4, 9]}
   * <p>
   * {@code square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]}
   * <p>
   * {@code square([]) → []}
   */
  List<Integer> square(List<Integer> nums);

  /**
   * Given a list of strings, return a list where each string has "*" added at its end.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]}
   * <p>
   * {@code addStar(["hello", "there"]) → ["hello*", "there*"] addStar(["*"]) → ["**"]}
   */
  List<String> addStar(List<String> strings);

  /**
   * Given a list of strings, return a list where each string is replaced by 3 copies of the string
   * concatenated together.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]}
   * <p>
   * {@code copies3(["24", "a", ""]) → ["242424", "aaa", ""]}
   * <p>
   * {@code copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]}
   */
  List<String> copies3(List<String> strings);

  /**
   * Given a list of strings, return a list where each string has "y" added at its start and end.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]}
   * <p>
   * {@code moreY(["hello", "there"]) → ["yhelloy", "ytherey"] moreY(["yay"]) → ["yyayy"]}
   */
  List<String> moreY(List<String> strings);

  /**
   * Given a list of integers, return a list where each integer is added to 1 and the result is
   * multiplied by 10.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code math1([1, 2, 3]) → [20, 30, 40]}
   * <p>
   * {@code math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]}
   * <p>
   * {@code math1([10]) → [110]}
   */
  List<Integer> math1(List<Integer> nums);

  /**
   * Given a list of non-negative integers, return an integer list of the rightmost digits. (Note:
   * use %)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code rightDigit([1, 22, 93]) → [1, 2, 3]}
   * <p>
   * {@code rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]}
   * <p>
   * {@code rightDigit([10, 0]) → [0, 0]}
   */
  List<Integer> rightDigit(List<Integer> nums);

  /**
   * Given a list of strings, return a list where each string is converted to lower case (Note:
   * String toLowerCase() method).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code lower(["Hello", "Hi"]) → ["hello", "hi"]}
   * <p>
   * {@code lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]}
   * <p>
   * {@code lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]}
   */
  List<String> lower(List<String> strings);

  /**
   * Given a list of strings, return a list where each string has all its "x" removed.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]}
   * <p>
   * {@code noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]}
   * <p>
   * {@code noX(["x"]) → [""]}
   */
  List<String> noX(List<String> strings);
}
