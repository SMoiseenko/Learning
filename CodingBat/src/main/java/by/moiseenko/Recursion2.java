package by.moiseenko;

/**
 * Harder recursion problems. Currently, these are all recursive backtracking problems with arrays.
 */
public interface Recursion2 {

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the
   * group sums to the given target? This is a classic backtracking recursion problem. Once you
   * understand the recursive backtracking strategy in this problem, you can use the same pattern
   * for many problems to search a space of choices. Rather than looking at the whole array, our
   * convention is to consider the part of the array starting at index start and continuing to the
   * end of the array. The caller can specify the whole array simply by passing start as 0. No loops
   * are needed -- the recursive calls progress down the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code groupSum(0, [2, 4, 8], 10) → true}
   * <p>
   * {@code groupSum(0, [2, 4, 8], 14) → true}
   * <p>
   * {@code groupSum(0, [2, 4, 8], 9) → false}
   */
  boolean groupSum(int start, int[] nums, int target);

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, beginning at the
   * start index, such that the group sums to the given target? However, with the additional
   * constraint that all 6's must be chosen. (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code groupSum6(0, [5, 6, 2], 8) → true}
   * <p>
   * {@code groupSum6(0, [5, 6, 2], 9) → false}
   * <p>
   * {@code groupSum6(0, [5, 6, 2], 7) → false}
   */
  boolean groupSum6(int start, int[] nums, int target);

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the
   * group sums to the given target with this additional constraint: If a value in the array is
   * chosen to be in the group, the value immediately following it in the array must not be chosen.
   * (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code groupNoAdj(0, [2, 5, 10, 4], 12) → true}
   * <p>
   * {@code groupNoAdj(0, [2, 5, 10, 4], 14) → false}
   * <p>
   * {@code groupNoAdj(0, [2, 5, 10, 4], 7) → false}
   */
  boolean groupNoAdj(int start, int[] nums, int target);

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the
   * group sums to the given target with these additional constraints: all multiples of 5 in the
   * array must be included in the group. If the value immediately following a multiple of 5 is 1,
   * it must not be chosen. (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code groupSum5(0, [2, 5, 10, 4], 19) → true}
   * <p>
   * {@code groupSum5(0, [2, 5, 10, 4], 17) → true}
   * <p>
   * {@code groupSum5(0, [2, 5, 10, 4], 12) → false}
   */
  boolean groupSum5(int start, int[] nums, int target);

  /**
   * Given an array of ints, is it possible to choose a group of some of the ints, such that the
   * group sums to the given target, with this additional constraint: if there are numbers in the
   * array that are adjacent and the identical value, they must either all be chosen, or none of
   * them chosen. For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle
   * must be chosen or not, all as a group. (one loop can be used to find the extent of the
   * identical values).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code groupSumClump(0, [2, 4, 8], 10) → true}
   * <p>
   * {@code groupSumClump(0, [1, 2, 4, 8, 1], 14) → true}
   * <p>
   * {@code groupSumClump(0, [2, 4, 4, 8], 14) → false}
   */
  boolean groupSumClump(int start, int[] nums, int target);

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sums of
   * the two groups are the same. Every int must be in one group or the other. Write a recursive
   * helper method that takes whatever arguments you like, and make the initial call to your
   * recursive helper from splitArray(). (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code splitArray([2, 2]) → true}
   * <p>
   * {@code splitArray([2, 3]) → false}
   * <p>
   * {@code splitArray([5, 2, 3]) → true}
   */
  boolean splitArray(int[] nums);

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
   * one group is a multiple of 10, and the sum of the other group is odd. Every int must be in one
   * group or the other. Write a recursive helper method that takes whatever arguments you like, and
   * make the initial call to your recursive helper from splitOdd10(). (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code splitOdd10([5, 5, 5]) → true}
   * <p>
   * {@code splitOdd10([5, 5, 6]) → false}
   * <p>
   * {@code splitOdd10([5, 5, 6, 1]) → true}
   */
  boolean splitOdd10(int[] nums);

  /**
   * Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
   * the two groups is the same, with these constraints: all the values that are multiple of 5 must
   * be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be
   * in the other. (No loops needed.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code split53([1, 1]) → true}
   * <p>
   * {@code split53([1, 1, 1]) → false}
   * <p>
   * {@code split53([2, 4, 2]) → true}
   */
  boolean split53(int[] nums);

}
