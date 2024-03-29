package by.moiseenko;

/**
 * Medium array problems -- 1 loop.
 */
public interface Array2 {

  /**
   * Return the number of even ints in the given array. Note: the % "mod" operator computes the
   * remainder, e.g. 5 % 2 is 1.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countEvens([2, 1, 2, 3, 4]) → 3}
   * <p>
   * {@code countEvens([2, 2, 0]) → 3}
   * <p>
   * {@code countEvens([1, 3, 5]) → 0}
   */
  int countEvens(int[] nums);

  /**
   * Given an array length 1 or more of ints, return the difference between the largest and smallest
   * values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return
   * the smaller or larger of two values.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code bigDiff([10, 3, 5, 6]) → 7}
   * <p>
   * {@code bigDiff([7, 2, 10, 9]) → 8}
   * <p>
   * {@code bigDiff([2, 10, 7, 2]) → 8}
   */
  int bigDiff(int[] nums);

  /**
   * Return the "centered" average of an array of ints, which we'll say is the mean average of the
   * values, except ignoring the largest and smallest values in the array. If there are multiple
   * copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int
   * division to produce the final average. You may assume that the array is length 3 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code  centeredAverage([1, 2, 3, 4, 100]) → 3}
   * <p>
   * {@code centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5}
   * <p>
   * {@code centeredAverage([-10, -4, -2, -4, -2, 0]) → -3}
   */
  int centeredAverage(int[] nums);

  /**
   * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number
   * 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do
   * not count.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sum13([1, 2, 2, 1]) → 6}
   * <p>
   * {@code sum13([1, 1]) → 2}
   * <p>
   * {@code sum13([1, 2, 2, 1, 13]) → 6}
   */
  int sum13(int[] nums);

  /**
   * Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6
   * and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no
   * numbers.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sum67([1, 2, 2]) → 5}
   * <p>
   * {@code sum67([1, 2, 2, 6, 99, 99, 7]) → 5}
   * <p>
   * {@code sum67([1, 1, 6, 7, 2]) → 4}
   */
  int sum67(int[] nums);

  /**
   * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code has22([1, 2, 2]) → true}
   * <p>
   * {@code has22([1, 2, 1, 2]) → false}
   * <p>
   * {@code has22([2, 1, 2]) → false}
   */
  boolean has22(int[] nums);

  /**
   * Given an array of ints, return true if the array contains no 1's and no 3's.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code lucky13([0, 2, 4]) → true}
   * <p>
   * {@code lucky13([1, 2, 3]) → false}
   * <p>
   * {@code lucky13([1, 2, 4]) → false}
   */
  boolean lucky13(int[] nums);

  /**
   * Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sum28([2, 3, 2, 2, 4, 2]) → true}
   * <p>
   * {@code sum28([2, 3, 2, 2, 4, 2, 2]) → false}
   * <p>
   * {@code sum28([1, 2, 3, 4]) → false}
   */
  boolean sum28(int[] nums);

  /**
   * Given an array of ints, return true if the number of 1's is greater than the number of 4's
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code more14([1, 4, 1]) → true}
   * <p>
   * {@code more14([1, 4, 1, 4]) → false}
   * <p>
   * {@code more14([1, 1]) → true}
   */
  boolean more14(int[] nums);

  /**
   * Given a number n, create and return a new int array of length n, containing the numbers 0, 1,
   * 2, ... n-1. The given n may be 0, in which case just return a length 0 array. You do not need a
   * separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in
   * that case, so it just works. The syntax to make a new int array is: new int[desired_length]
   * (See also: FizzBuzz Code)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fizzArray(4) → [0, 1, 2, 3]}
   * <p>
   * {@code fizzArray(1) → [0]}
   * <p>
   * {@code fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]}
   */
  int[] fizzArray(int n);

  /**
   * Given an array of ints, return true if every element is a 1 or a 4.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code only14([1, 4, 1, 4]) → true}
   * <p>
   * {@code only14([1, 4, 2, 4]) → false}
   * <p>
   * {@code only14([1, 1]) → true}
   */
  boolean only14(int[] nums);

  /**
   * Given a number n, create and return a new string array of length n, containing the strings "0",
   * "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array. Note:
   * String.valueOf(xxx) will make the String form of most types. The syntax to make a new string
   * array is: new String[desired_length]  (See also: FizzBuzz Code)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fizzArray2(4) → ["0", "1", "2", "3"]}
   * <p>
   * {@code fizzArray2(10) → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]}
   * <p>
   * {@code fizzArray2(2) → ["0", "1"]}
   */
  String[] fizzArray2(int n);

  /**
   * Given an array of ints, return true if it contains no 1's or it contains no 4's.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code no14([1, 2, 3]) → true}
   * <p>
   * {@code no14([1, 2, 3, 4]) → false}
   * <p>
   * {@code no14([2, 3, 4]) → true}
   */
  boolean no14(int[] nums);

  /**
   * We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in
   * the array, at least one of the pair is that value. Return true if the given value is everywhere
   * in the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code isEverywhere([1, 2, 1, 3], 1) → true}
   * <p>
   * {@code isEverywhere([1, 2, 1, 3], 2) → false}
   * <p>
   * {@code isEverywhere([1, 2, 1, 3, 4], 1) → false}
   */
  boolean isEverywhere(int[] nums, int val);

  /**
   * Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4,
   * but not both.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code either24([1, 2, 2]) → true}
   * <p>
   * {@code either24([4, 4, 1]) → true}
   * <p>
   * {@code either24([4, 4, 1, 2, 2]) → false}
   */
  boolean either24(int[] nums);

  /**
   * Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the
   * corresponding element in nums2 (at the same index). Return the count of the number of times
   * that the two elements differ by 2 or less, but are not equal.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code matchUp([1, 2, 3], [2, 3, 10]) → 2}
   * <p>
   * {@code matchUp([1, 2, 3], [2, 3, 5]) → 3}
   * <p>
   * {@code matchUp([1, 2, 3], [2, 3, 3]) → 2}
   */
  int matchUp(int[] nums1, int[] nums2);

  /**
   * Given an array of ints, return true if the array contains two 7's next to each other, or there
   * are two 7's separated by one element, such as with {7, 1, 7}.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code has77([1, 7, 7]) → true}
   * <p>
   * {@code has77([1, 7, 1, 7]) → true}
   * <p>
   * {@code has77([1, 7, 1, 1, 7]) → false}
   */
  boolean has77(int[] nums);

  /**
   * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in
   * the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code has12([1, 3, 2]) → true}
   * <p>
   * {@code has12([3, 1, 2]) → true}
   * <p>
   * {@code has12([3, 1, 4, 5, 2]) → true}
   */
  boolean has12(int[] nums);

  /**
   * Given an array of ints, return true if the array contains either 3 even or 3 odd values all
   * next to each other.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code modThree([2, 1, 3, 5]) → true}
   * <p>
   * {@code modThree([2, 1, 2, 5]) → false}
   * <p>
   * {@code modThree([2, 4, 2, 5]) → true}
   */
  boolean modThree(int[] nums);

  /**
   * Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no
   * 3's are next to each other.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code haveThree([3, 1, 3, 1, 3]) → true}
   * <p>
   * {@code haveThree([3, 1, 3, 3]) → false}
   * <p>
   * {@code haveThree([3, 4, 3, 3, 4]) → false}
   */
  boolean haveThree(int[] nums);

  /**
   * Given an array of ints, return true if every 2 that appears in the array is next to another 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code twoTwo([4, 2, 2, 3]) → true}
   * <p>
   * {@code twoTwo([2, 2, 4]) → true}
   * <p>
   * {@code twoTwo([2, 2, 4, 2]) → false}
   */
  boolean twoTwo(int[] nums);

  /**
   * Return true if the group of N numbers at the start and end of the array are the same. For
   * example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for
   * n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false}
   * <p>
   * {@code sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true}
   * <p>
   * {@code sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false}
   */
  boolean sameEnds(int[] nums, int len);

  /**
   * Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5,
   * 6, ... or 23, 24, 25.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code tripleUp([1, 4, 5, 6, 2]) → true}
   * <p>
   * {@code tripleUp([1, 2, 3]) → true}
   * <p>
   * {@code tripleUp([1, 2, 4]) → false}
   */
  boolean tripleUp(int[] nums);

  /**
   * Given start and end numbers, return a new array containing the sequence of integers from start
   * up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will
   * be greater or equal to the start number. Note that a length-0 array is valid. (See also:
   * FizzBuzz Code)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fizzArray3(5, 10) → [5, 6, 7, 8, 9]}
   * <p>
   * {@code fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]}
   * <p>
   * {@code fizzArray3(1, 3) → [1, 2]}
   */
  int[] fizzArray3(int start, int end);

  /**
   * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may
   * modify and return the given array, or return a new array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]}
   * <p>
   * {@code shiftLeft([1, 2]) → [2, 1]}
   * <p>
   * {@code shiftLeft([1]) → [1]}
   */
  int[] shiftLeft(int[] nums);

  /**
   * For each multiple of 10 in the given array, change all the values following it to be that
   * multiple of 10, until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2,
   * 10, 10, 10, 20, 20}.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]}
   * <p>
   * {@code tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]}
   * <p>
   * {@code tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]}
   */
  int[] tenRun(int[] nums);

  /**
   * Given a non-empty array of ints, return a new array containing the elements from the original
   * array that come before the first 4 in the original array. The original array will contain at
   * least one 4. Note that it is valid in java to create an array of length 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code pre4([1, 2, 4, 1]) → [1, 2]}
   * <p>
   * {@code pre4([3, 1, 4]) → [3, 1]}
   * <p>
   * {@code pre4([1, 4, 4]) → [1]}
   */
  int[] pre4(int[] nums);

  /**
   * Given a non-empty array of ints, return a new array containing the elements from the original
   * array that come after the last 4 in the original array. The original array will contain at
   * least one 4. Note that it is valid in java to create an array of length 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code post4([2, 4, 1, 2]) → [1, 2]}
   * <p>
   * {@code post4([4, 1, 4, 2]) → [2]}
   * <p>
   * {@code post4([4, 4, 1, 2, 3]) → [1, 2, 3]}
   */
  int[] post4(int[] nums);

  /**
   * We'll say that an element in an array is "alone" if there are values before and after it, and
   * those values are different from it. Return a version of the given array where every instance of
   * the given value which is alone is replaced by whichever value to its left or right is larger.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code notAlone([1, 2, 3], 2) → [1, 3, 3]}
   * <p>
   * {@code notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]}
   * <p>
   * {@code notAlone([3, 4], 3) → [3, 4]}
   */
  int[] notAlone(int[] nums, int val);

  /**
   * Return an array that contains the exact same numbers as the given array, but rearranged so that
   * all the zeros are grouped at the start of the array. The order of the non-zero numbers does not
   * matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make
   * a new array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]}
   * <p>
   * {@code zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]}
   * <p>
   * {@code zeroFront([1, 0]) → [0, 1]}
   */
  int[] zeroFront(int[] nums);

  /**
   * Return a version of the given array where all the 10's have been removed. The remaining
   * elements should shift left towards the start of the array as needed, and the empty spaces a the
   * end of the array should be 0. So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return
   * the given array or make a new array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]}
   * <p>
   * {@code withoutTen([10, 2, 10]) → [2, 0, 0]}
   * <p>
   * {@code withoutTen([1, 99, 10]) → [1, 99, 0]}
   */
  int[] withoutTen(int[] nums);

  /**
   * Return a version of the given array where each zero value in the array is replaced by the
   * largest odd value to the right of the zero in the array. If there is no odd value to the right
   * of the zero, leave the zero as a zero.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]}
   * <p>
   * {@code zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]}
   * <p>
   * {@code zeroMax([0, 1, 0]) → [1, 1, 0]}
   */
  int[] zeroMax(int[] nums);

  /**
   * Return an array that contains the exact same numbers as the given array, but rearranged so that
   * all the even numbers come before all the odd numbers. Other than that, the numbers can be in
   * any order. You may modify and return the given array, or make a new array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]}
   * <p>
   * {@code evenOdd([3, 3, 2]) → [2, 3, 3]}
   * <p>
   * {@code evenOdd([2, 2, 2]) → [2, 2, 2]}
   */
  int[] evenOdd(int[] nums);

  /**
   * This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given
   * as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the series of
   * numbers beginning at start and running up to but not including end, so for example start=1 and
   * end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the string form of
   * these numbers, except for multiples of 3, use "Fizz" instead of the number, for multiples of 5
   * use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, String.valueOf(xxx) will
   * make the String form of an int or other type. This version is a little more complicated than
   * the usual version since you have to allocate and index into an array instead of just printing,
   * and we vary the start/end instead of just always doing 1..100.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]}
   * <p>
   * {@code fizzBuzz(1, 8) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]}
   * <p>
   * {@code fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]}
   */
  String[] fizzBuzz(int start, int end);


}
