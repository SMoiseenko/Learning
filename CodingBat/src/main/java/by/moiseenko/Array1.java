package by.moiseenko;

/**
 * Basic array problems -- no loops.. Use a[0], a[1], ... to access elements in an array, a.length
 * is the length (note that s.length() is for Strings). Allocate a new array like this: int[] a =
 * new int[10]; // length 10 array.
 */
public interface Array1 {

  /**
   * Given an array of ints, return true if 6 appears as either the first or last element in the
   * array. The array will be length 1 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code firstLast6([1, 2, 6]) → true}
   * <p>
   * {@code firstLast6([6, 1, 2, 3]) → true}
   * <p>
   * {@code firstLast6([13, 6, 1, 2, 3]) → false}
   */
  boolean firstLast6(int[] nums);

  /**
   * Given an array of ints, return true if the array is length 1 or more, and the first element and
   * the last element are equal.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sameFirstLast([1, 2, 3]) → false}
   * <p>
   * {@code sameFirstLast([1, 2, 3, 1]) → true}
   * <p>
   * {@code sameFirstLast([1, 2, 1]) → true}
   */
  boolean sameFirstLast(int[] nums);

  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makePi() → [3, 1, 4]
   */
  int[] makePi();

  /**
   * Given 2 arrays of ints, a and b, return true if they have the same first element or they have
   * the same last element. Both arrays will be length 1 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code commonEnd([1, 2, 3], [7, 3]) → true}
   * <p>
   * {@code commonEnd([1, 2, 3], [7, 3, 2]) → false}
   * <p>
   * {@code commonEnd([1, 2, 3], [1, 3]) → true}
   */
  boolean commonEnd(int[] a, int[] b);

  /**
   * Given an array of ints length 3, return the sum of all the elements.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sum3([1, 2, 3]) → 6}
   * <p>
   * {@code sum3([5, 11, 2]) → 18}
   * <p>
   * {@code sum3([7, 0, 0]) → 7}
   */
  int sum3(int[] nums);

  /**
   * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3}
   * yields {2, 3, 1}.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code rotateLeft3([1, 2, 3]) → [2, 3, 1]}
   * <p>
   * {@code rotateLeft3([5, 11, 9]) → [11, 9, 5]}
   * <p>
   * {@code rotateLeft3([7, 0, 0]) → [0, 0, 7]}
   */
  int[] rotateLeft3(int[] nums);

  /**
   * Given an array of ints length 3, return a new array with the elements in reverse order, so {1,
   * 2, 3} becomes {3, 2, 1}.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code reverse3([1, 2, 3]) → [3, 2, 1]}
   * <p>
   * {@code reverse3([5, 11, 9]) → [9, 11, 5]}
   * <p>
   * {@code reverse3([7, 0, 0]) → [0, 0, 7]}
   */
  int[] reverse3(int[] nums);

  /**
   * Given an array of ints length 3, figure out which is larger, the first or last element in the
   * array, and set all the other elements to be that value. Return the changed array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code maxEnd3([1, 2, 3]) → [3, 3, 3]}
   * <p>
   * {@code maxEnd3([11, 5, 9]) → [11, 11, 11]}
   * <p>
   * {@code maxEnd3([2, 11, 3]) → [3, 3, 3]}
   */
  int[] maxEnd3(int[] nums);

  /**
   * Given an array of ints, return the sum of the first 2 elements in the array. If the array
   * length is less than 2, just sum up the elements that exist, returning 0 if the array is length
   * 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sum2([1, 2, 3]) → 3}
   * <p>
   * {@code sum2([1, 1]) → 2}
   * <p>
   * {@code sum2([1, 1, 1, 1]) → 2}
   */
  int sum2(int[] nums);

  /**
   * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle
   * elements.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]}
   * <p>
   * {@code middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]}
   * <p>
   * {@code middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]}
   */
  int[] middleWay(int[] a, int[] b);

  /**
   * Given an array of ints, return a new array length 2 containing the first and last elements from
   * the original array. The original array will be length 1 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makeEnds([1, 2, 3]) → [1, 3]}
   * <p>
   * {@code makeEnds([1, 2, 3, 4]) → [1, 4]}
   * <p>
   * {@code makeEnds([7, 4, 6, 2]) → [7, 2]}
   */
  int[] makeEnds(int[] nums);

  /**
   * Given an int array length 2, return true if it contains a 2 or a 3.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code has23([2, 5]) → true}
   * <p>
   * {@code has23([4, 3]) → true}
   * <p>
   * {@code has23([4, 5]) → false}
   */
  boolean has23(int[] nums);

  /**
   * Given an int array length 2, return true if it does not contain a 2 or 3.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code no23([4, 5]) → true}
   * <p>
   * {@code no23([4, 2]) → false}
   * <p>
   * {@code no23([3, 5]) → false}
   */
  boolean no23(int[] nums);

  /**
   * Given an int array, return a new array with double the length where its last element is the
   * same as the original array, and all the other elements are 0. The original array will be length
   * 1 or more. Note: by default, a new int array contains all 0's.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]}
   * <p>
   * {@code makeLast([1, 2]) → [0, 0, 0, 2]}
   * <p>
   * {@code makeLast([3]) → [0, 3]}
   */
  int[] makeLast(int[] nums);

  /**
   * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be
   * length 0, 1, or 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code double23([2, 2]) → true}
   * <p>
   * {@code double23([3, 3]) → true}
   * <p>
   * {@code double23([2, 3]) → false}
   */
  boolean double23(int[] nums);

  /**
   * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the
   * 3 element to 0. Return the changed array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fix23([1, 2, 3]) → [1, 2, 0]}
   * <p>
   * {@code fix23([2, 3, 5]) → [2, 0, 5]}
   * <p>
   * {@code fix23([1, 2, 1]) → [1, 2, 1]}
   */
  int[] fix23(int[] nums);

  /**
   * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their
   * first element.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code start1([1, 2, 3], [1, 3]) → 2}
   * <p>
   * {@code start1([7, 2, 3], [1]) → 1}
   * <p>
   * {@code start1([1, 2], []) → 1}
   */
  int start1(int[] a, int[] b);

  /**
   * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
   * Return the array which has the largest sum. In event of a tie, return a.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code biggerTwo([1, 2], [3, 4]) → [3, 4]}
   * <p>
   * {@code biggerTwo([3, 4], [1, 2]) → [3, 4]}
   * <p>
   * {@code biggerTwo([1, 1], [1, 2]) → [1, 2]}
   */
  int[] biggerTwo(int[] a, int[] b);

  /**
   * Given an array of ints of even length, return a new array length 2 containing the middle two
   * elements from the original array. The original array will be length 2 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makeMiddle([1, 2, 3, 4]) → [2, 3]}
   * <p>
   * {@code makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]}
   * <p>
   * {@code makeMiddle([1, 2]) → [1, 2]}
   */
  int[] makeMiddle(int[] nums);

  /**
   * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]}
   * <p>
   * {@code plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]}
   * <p>
   * {@code plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]}
   */
  int[] plusTwo(int[] a, int[] b);

  /**
   * Given an array of ints, swap the first and last elements in the array. Return the modified
   * array. The array length will be at least 1.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]}
   * <p>
   * {@code swapEnds([1, 2, 3]) → [3, 2, 1]}
   * <p>
   * {@code swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]}
   */
  int[] swapEnds(int[] nums);

  /**
   * Given an array of ints of odd length, return a new array length 3 containing the elements from
   * the middle of the array. The array length will be at least 3.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code midThree([1, 2, 3, 4, 5]) → [2, 3, 4]}
   * <p>
   * {@code midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]}
   * <p>
   * {@code midThree([1, 2, 3]) → [1, 2, 3]}
   */
  int[] midThree(int[] nums);

  /**
   * Given an array of ints of odd length, look at the first, last, and middle values in the array
   * and return the largest. The array length will be a least 1.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code maxTriple([1, 2, 3]) → 3}
   * <p>
   * {@code maxTriple([1, 5, 3]) → 5}
   * <p>
   * {@code maxTriple([5, 2, 3]) → 5}
   */
  int maxTriple(int[] nums);

  /**
   * Given an int array of any length, return a new array of its first 2 elements. If the array is
   * smaller than length 2, use whatever elements are present.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code frontPiece([1, 2, 3]) → [1, 2]}
   * <p>
   * {@code frontPiece([1, 2]) → [1, 2]}
   * <p>
   * {@code frontPiece([1]) → [1]}
   */
  int[] frontPiece(int[] nums);

  /**
   * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if
   * the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code unlucky1([1, 3, 4, 5]) → true}
   * <p>
   * {@code unlucky1([2, 1, 3, 4, 5]) → true}
   * <p>
   * {@code unlucky1([1, 1, 1]) → false}
   */
  boolean unlucky1(int[] nums);

  /**
   * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the
   * elements from a followed by the elements from b. The arrays may be any length, including 0, but
   * there will be 2 or more elements available between the 2 arrays.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code make2([4, 5], [1, 2, 3]) → [4, 5]}
   * <p>
   * {@code make2([4], [1, 2, 3]) → [4, 1]}
   * <p>
   * {@code make2([], [1, 2]) → [1, 2]}
   */
  int[] make2(int[] a, int[] b);

  /**
   * Given 2 int arrays, a and b, of any length, return a new array with the first element of each
   * array. If either array is length 0, ignore that array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code front11([1, 2, 3], [7, 9, 8]) → [1, 7]}
   * <p>
   * {@code front11([1], [2]) → [1, 2]}
   * <p>
   * {@code front11([1, 7], []) → [1]}
   */
  int[] front11(int[] a, int[] b);
}
