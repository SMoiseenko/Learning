package warmup1;

/**
 * Harder array problems -- 2 loops, more complex logic.o
 */
public interface Array3 {

  /**
   * Consider the leftmost and righmost appearances of some value in an array. We'll say that the
   * "span" is the number of elements between the two inclusive. A single value has a span of 1.
   * Returns the largest span found in the given array. (Efficiency is not a priority.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code maxSpan([1, 2, 1, 1, 3]) → 4}
   * <p>
   * {@code maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6}
   * <p>
   * {@code maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6}
   */
  int maxSpan(int[] nums);

  /**
   * Return an array that contains exactly the same numbers as the given array, but rearranged so
   * that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may
   * move. The array contains the same number of 3's and 4's, every 3 has a number after it that is
   * not a 3, and a 3 appears in the array before any 4.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fix34([1, 3, 1, 4]) → [1, 3, 4, 1]}
   * <p>
   * {@code fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]}
   * <p>
   * {@code fix34([3, 2, 2, 4]) → [3, 4, 2, 2]}
   */
  int[] fix34(int[] nums);

  /**
   * (This is a slightly harder version of the fix34 problem.) Return an array that contains exactly
   * the same numbers as the given array, but rearranged so that every 4 is immediately followed by
   * a 5. Do not move the 4's, but every other number may move. The array contains the same number
   * of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may
   * appear anywhere in the original array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]}
   * <p>
   * {@code fix45([1, 4, 1, 5]) → [1, 4, 5, 1]}
   * <p>
   * {@code fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]}
   */
  int[] fix45(int[] nums);

  /**
   * Given a non-empty array, return true if there is a place to split the array so that the sum of
   * the numbers on one side is equal to the sum of the numbers on the other side.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code canBalance([1, 1, 1, 2, 1]) → true}
   * <p>
   * {@code canBalance([2, 1, 1, 2, 1]) → false}
   * <p>
   * {@code canBalance([10, 10]) → true}
   */
  boolean canBalance(int[] nums);

  /**
   * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the
   * numbers in inner appear in outer. The best solution makes only a single "linear" pass of both
   * arrays, taking advantage of the fact that both arrays are already in sorted order.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code linearIn([1, 2, 4, 6], [2, 4]) → true}
   * <p>
   * {@code linearIn([1, 2, 4, 6], [2, 3, 4]) → false}
   * <p>
   * {@code linearIn([1, 2, 4, 4, 6], [2, 4]) → true}
   */
  boolean linearIn(int[] outer, int[] inner);

  /**
   * Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0,
   * 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]}
   * <p>
   * {@code squareUp(2) → [0, 1, 2, 1]}
   * <p>
   * {@code squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]}
   */
  int[] squareUp(int n);

  /**
   * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
   * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... +
   * n, which is known to sum to exactly n*(n + 1)/2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code seriesUp(3) → [1, 1, 2, 1, 2, 3]}
   * <p>
   * {@code seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]}
   * <p>
   * {@code seriesUp(2) → [1, 1, 2]}
   */
  int[] seriesUp(int n);

  /**
   * We'll say that a "mirror" section in an array is a group of contiguous elements such that
   * somewhere in the array, the same group appears in reverse order. For example, the largest
   * mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of
   * the largest mirror section found in the given array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3}
   * <p>
   * {@code maxMirror([1, 2, 1, 4]) → 3}
   * <p>
   * {@code maxMirror([7, 1, 2, 9, 7, 2, 1]) → 2}
   */
  int maxMirror(int[] nums);

  /**
   * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
   * Return the number of clumps in the given array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countClumps([1, 2, 2, 3, 4, 4]) → 2}
   * <p>
   * {@code countClumps([1, 1, 2, 1, 1]) → 2}
   * <p>
   * {@code countClumps([1, 1, 1, 1, 1]) → 1}
   */
  int countClumps(int[] nums);

}