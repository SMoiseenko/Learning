package by.moiseenko;

/**
 * Basic recursion problems. Recursion strategy: first test for one or two base cases that are so
 * simple, the answer can be returned immediately. Otherwise, make a recursive a call for a smaller
 * case (that is, a case which is a step towards the base case). Assume that the recursive call
 * works correctly, and fix up what it returns to make the answer.
 */
public interface Recursion1 {

  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
   * result recursively (without loops).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code factorial(1) → 1}
   * <p>
   * {@code factorial(2) → 2}
   * <p>
   * {@code factorial(3) → 6}
   */
  int factorial(int n);

  /**
   * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the
   * total number of ears across all the bunnies recursively (without loops or multiplication).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code bunnyEars(0) → 0}
   * <p>
   * {@code bunnyEars(1) → 2}
   * <p>
   * {@code bunnyEars(2) → 4}
   */
  int bunnyEars(int bunnies);

  /**
   * The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive
   * definition. The first two values in the sequence are 0 and 1 (essentially 2 base cases). Each
   * subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2,
   * 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) method that returns the nth
   * fibonacci number, with n=0 representing the start of the sequence.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code fibonacci(0) → 0}
   * <p>
   * {@code fibonacci(1) → 1}
   * <p>
   * {@code fibonacci(2) → 1}
   */
  int fibonacci(int n);

  /**
   * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the
   * normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a
   * raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without
   * loops or multiplication).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code bunnyEars2(0) → 0}
   * <p>
   * {@code bunnyEars2(1) → 2}
   * <p>
   * {@code bunnyEars2(2) → 5}
   */
  int bunnyEars2(int bunnies);

  /**
   * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
   * the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the
   * total number of blocks in such a triangle with the given number of rows.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code triangle(0) → 0}
   * <p>
   * {@code triangle(1) → 1}
   * <p>
   * {@code triangle(2) → 3}
   */
  int triangle(int rows);

  /**
   * Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod
   * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the
   * rightmost digit (126 / 10 is 12).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sumDigits(126) → 9}
   * <p>
   * {@code sumDigits(49) → 13}
   * <p>
   * {@code sumDigits(12) → 3}
   */
  int sumDigits(int n);

  /**
   * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example
   * 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
   * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code count7(717) → 2}
   * <p>
   * {@code count7(7) → 1}
   * <p>
   * {@code count7(123) → 0}
   */
  int count7(int n);

  /**
   * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as
   * a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields
   * 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
   * removes the rightmost digit (126 / 10 is 12).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code count8(8) → 1}
   * <p>
   * {@code count8(818) → 2}
   * <p>
   * {@code count8(8818) → 4}
   */
  int count8(int n);

  /**
   * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to
   * the n power, so powerN(3, 2) is 9 (3 squared).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code powerN(3, 1) → 3}
   * <p>
   * {@code powerN(3, 2) → 9}
   * <p>
   * {@code powerN(3, 3) → 27}
   */
  int powerN(int base, int n);

  /**
   * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the
   * string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countX("xxhixx") → 4}
   * <p>
   * {@code countX("xhixhix") → 3}
   * <p>
   * {@code countX("hi") → 0}
   */
  int countX(String str);

  /**
   * Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in
   * the string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countHi("xxhixx") → 1}
   * <p>
   * {@code countHi("xhixhix") → 2}
   * <p>
   * {@code countHi("hi") → 1}
   */
  int countHi(String str);

  /**
   * Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars
   * have been changed to 'y' chars.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code changeXY("codex") → "codey"}
   * <p>
   * {@code changeXY("xxhixx") → "yyhiyy"}
   * <p>
   * {@code changeXY("xhixhix") → "yhiyhiy"}
   */
  String changeXY(String str);

  /**
   * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have
   * been replaced by "3.14".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code changePi("xpix") → "x3.14x"}
   * <p>
   * {@code changePi("pipi") → "3.143.14"}
   * <p>
   * {@code changePi("pip") → "3.14p"}
   */
  String changePi(String str);

  /**
   * Given a string, compute recursively a new string where all the 'x' chars have been removed.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noX("xaxb") → "ab"}
   * <p>
   * {@code noX("abc") → "abc"}
   * <p>
   * {@code noX("xx") → ""}
   */
  String noX(String str);

  /**
   * Given an array of ints, compute recursively if the array contains a 6. We'll use the convention
   * of considering only the part of the array that begins at the given index. In this way, a
   * recursive call can pass index+1 to move down the array. The initial call will pass in index as
   * 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code array6([1, 6, 4], 0) → true}
   * <p>
   * {@code array6([1, 4], 0) → false}
   * <p>
   * {@code array6([6], 0) → true}
   */
  boolean array6(int[] nums, int index);

  /**
   * Given an array of ints, compute recursively the number of times that the value 11 appears in
   * the array. We'll use the convention of considering only the part of the array that begins at
   * the given index. In this way, a recursive call can pass index+1 to move down the array. The
   * initial call will pass in index as 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code array11([1, 2, 11], 0) → 1}
   * <p>
   * {@code array11([11, 11], 0) → 2}
   * <p>
   * {@code array11([1, 2, 3, 4], 0) → 0}
   */
  int array11(int[] nums, int index);

  /**
   * Given an array of ints, compute recursively if the array contains somewhere a value followed in
   * the array by that value times 10. We'll use the convention of considering only the part of the
   * array that begins at the given index. In this way, a recursive call can pass index+1 to move
   * down the array. The initial call will pass in index as 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code array220([1, 2, 20], 0) → true}
   * <p>
   * {@code array220([3, 30], 0) → true}
   * <p>
   * {@code array220([3], 0) → false}
   */
  boolean array220(int[] nums, int index);

  /**
   * Given a string, compute recursively a new string where all the adjacent chars are now separated
   * by a "*".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code allStar("hello") → "h*e*l*l*o"}
   * <p>
   * {@code allStar("abc") → "a*b*c"}
   * <p>
   * {@code allStar("ab") → "a*b"}
   */
  String allStar(String str);

  /**
   * Given a string, compute recursively a new string where identical chars that are adjacent in the
   * original string are separated from each other by a "*".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code pairStar("hello") → "hel*lo"}
   * <p>
   * {@code pairStar("xxyy") → "x*xy*y"}
   * <p>
   * {@code pairStar("aaaa") → "a*a*a*a"}
   */
  String pairStar(String str);

  /**
   * Given a string, compute recursively a new string where all the lowercase 'x' chars have been
   * moved to the end of the string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code endX("xxre") → "rexx"}
   * <p>
   * {@code endX("xxhixx") → "hixxxx"}
   * <p>
   * {@code endX("xhixhix") → "hihixxx"}
   */
  String endX(String str);

  /**
   * We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA"
   * the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
   * Recursively compute the number of pairs in the given string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countPairs("axa") → 1}
   * <p>
   * {@code countPairs("axax") → 2}
   * <p>
   * {@code countPairs("axbx") → 1}
   */
  int countPairs(String str);

  /**
   * Count recursively the total number of "abc" and "aba" substrings that appear in the given
   * string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countAbc("abc") → 1}
   * <p>
   * {@code countAbc("abcxxabc") → 2}
   * <p>
   * {@code countAbc("abaxxaba") → 2}
   */
  int countAbc(String str);

  /**
   * Given a string, compute recursively (no loops) the number of "11" substrings in the string. The
   * "11" substrings should not overlap.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code count11("11abc11") → 2}
   * <p>
   * {@code count11("abc11x11x11") → 3}
   * <p>
   * {@code count11("111") → 1}
   */
  int count11(String str);

  /**
   * Given a string, return recursively a "cleaned" string where adjacent chars that are the same
   * have been reduced to a single char. So "yyzzza" yields "yza".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringClean("yyzzza") → "yza"}
   * <p>
   * {@code stringClean("abbbcdd") → "abcd"}
   * <p>
   * {@code stringClean("Hello") → "Helo"}
   */
  String stringClean(String str);

  /**
   * Given a string, compute recursively the number of times lowercase "hi" appears in the string,
   * however do not count "hi" that have an 'x' immedately before them.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countHi2("ahixhi") → 1}
   * <p>
   * {@code countHi2("ahibhi") → 2}
   * <p>
   * {@code countHi2("xhixhi") → 0}
   */
  int countHi2(String str);

  /**
   * Given a string that contains a single pair of parenthesis, compute recursively a new string
   * made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code parenBit("xyz(abc)123") → "(abc)"}
   * <p>
   * {@code parenBit("x(hello)") → "(hello)"}
   * <p>
   * {@code parenBit("(xy)1") → "(xy)"}
   */
  String parenBit(String str);

  /**
   * Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like
   * "(())" or "((()))". Suggestion: check the first and last chars, and then recur on what's inside
   * them.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code nestParen("(())") → true}
   * <p>
   * {@code nestParen("((()))") → true}
   * <p>
   * {@code nestParen("(((x))") → false}
   */
  boolean nestParen(String str);

  /**
   * Given a string and a non-empty substring sub, compute recursively the number of times that sub
   * appears in the string, without the sub strings overlapping.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code strCount("catcowcat", "cat") → 2}
   * <p>
   * {@code strCount("catcowcat", "cow") → 1}
   * <p>
   * {@code strCount("catcowcat", "dog") → 0}
   */
  int strCount(String str, String sub);

  /**
   * Given a string and a non-empty substring sub, compute recursively if at least n copies of sub
   * appear in the string somewhere, possibly with overlapping. N will be non-negative.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code strCopies("catcowcat", "cat", 2) → true}
   * <p>
   * {@code strCopies("catcowcat", "cow", 2) → false}
   * <p>
   * {@code strCopies("catcowcat", "cow", 1) → true}
   */
  boolean strCopies(String str, String sub, int n);

  /**
   * Given a string and a non-empty substring sub, compute recursively the largest substring which
   * starts and ends with sub and return its length.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code strDist("catcowcat", "cat") → 9}
   * <p>
   * {@code strDist("catcowcat", "cow") → 3}
   * <p>
   * {@code strDist("cccatcowcatxx", "cat") → 9}
   */
  int strDist(String str, String sub);
}
