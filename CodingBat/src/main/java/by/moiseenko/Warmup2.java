package by.moiseenko;

/**
 * Medium warmup string/array loops
 */
public interface Warmup2 {

  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the
   * original string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringTimes("Hi", 2) → "HiHi"}
   * <p>
   * {@code stringTimes("Hi", 3) → "HiHiHi"}
   * <p>
   * {@code stringTimes("Hi", 1) → "Hi"}
   */
  String stringTimes(String str, int n);

  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the first 3
   * chars, or whatever is there if the string is less than length 3. Return n copies of the front;
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code frontTimes("Chocolate", 2) → "ChoCho"}
   * <p>
   * {@code frontTimes("Chocolate", 3) → "ChoChoCho"}
   * <p>
   * {@code frontTimes("Abc", 3) → "AbcAbcAbc"}
   */
  String frontTimes(String str, int n);

  /**
   * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx"
   * contains 2 "xx".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countXX("abcxx") → 1}
   * <p>
   * {@code countXX("xxx") → 2}
   * <p>
   * {@code countXX("xxxx") → 3
   */
  int countXX(String str);

  /**
   * Given a string, return true if the first instance of "x" in the string is immediately followed
   * by another "x".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code doubleX("axxbb") → true}
   * <p>
   * {@code doubleX("axaxax") → false}
   * <p>
   * {@code doubleX("xxxxx") → true}
   */
  boolean doubleX(String str);

  /**
   * Given a string, return a new string made of every other char starting with the first, so
   * "Hello" yields "Hlo".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringBits("Hello") → "Hlo"}
   * <p>
   * {@code stringBits("Hi") → "H"}
   * <p>
   * {@code stringBits("Heeololeo") → "Hello"}
   */
  String stringBits(String str);

  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringSplosion("Code") → "CCoCodCode"}
   * <p>
   * {@code stringSplosion("abc") → "aababc"}
   * <p>
   * {@code stringSplosion("ab") → "aab"}
   */
  String stringSplosion(String str);

  /**
   * Given a string, return the count of the number of times that a substring length 2 appears in
   * the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count
   * the end substring).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code last2("hixxhi") → 1}
   * <p>
   * {@code last2("xaxxaxaxx") → 1}
   * <p>
   * {@code last2("axxxaaxx") → 2}
   */
  int last2(String str);

  /**
   * Given an array of ints, return the number of 9's in the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code arrayCount9([1, 2, 9]) → 1}
   * <p>
   * {@code arrayCount9([1, 9, 9]) → 2}
   * <p>
   * {@code arrayCount9([1, 9, 9, 3, 9]) → 3}
   */
  int arrayCount9(int[] nums);

  /**
   * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The
   * array length may be less than 4.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code arrayFront9([1, 2, 9, 3, 4]) → true}
   * <p>
   * {@code arrayFront9([1, 2, 3, 4, 9]) → false}
   * <p>
   * {@code arrayFront9([1, 2, 3, 4, 5]) → false}
   */
  boolean arrayFront9(int[] nums);

  /**
   * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array
   * somewhere.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code array123([1, 1, 2, 3, 1]) → true}
   * <p>
   * {@code array123([1, 1, 2, 4, 1]) → false}
   * <p>
   * {@code array123([1, 1, 2, 1, 2, 3]) → true}
   */
  boolean array123(int[] nums);

  /**
   * Given 2 strings, a and b, return the number of the positions where they contain the same length
   * 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
   * appear in the same place in both strings.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringMatch("xxcaazz", "xxbaaz") → 3}
   * <p>
   * {@code stringMatch("abc", "abc") → 2}
   * <p>
   * {@code stringMatch("abc", "axc") → 0}
   */
  int stringMatch(String a, String b);

  /**
   * Given a string, return a version where all the "x" have been removed. Except an "x" at the very
   * start or end should not be removed.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringX("xxHxix") → "xHix"}
   * <p>
   * {@code stringX("abxxxcd") → "abcd"}
   * <p>
   * {@code stringX("xabxxxcdx") → "xabcdx"}
   */
  String stringX(String str);

  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
   * yields "kien".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code altPairs("kitten") → "kien"}
   * <p>
   * {@code altPairs("Chocolate") → "Chole"}
   * <p>
   * {@code altPairs("CodingHorror") → "Congrr"}
   */
  String altPairs(String str);

  /**
   * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are
   * removed, but the "a" can be any char. The "yak" strings will not overlap.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringYak("yakpak") → "pak"}
   * <p>
   * {@code sringYak("pakyak") → "pak"}
   * <p>
   * {@code stringYak("yak123ya") → "123ya"}
   */
  String stringYak(String str);

  /**
   * Given an array of ints, return the number of times that two 6's are next to each other in the
   * array. Also count instances where the second "6" is actually a 7.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code array667([6, 6, 2]) → 1}
   * <p>
   * {@code array667([6, 6, 2, 6]) → 1}
   * <p>
   * {@code array667([6, 7, 2, 6]) → 1}
   */
  int array667(int[] nums);

  /**
   * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the
   * array. Return true if the array does not contain any triples.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code noTriples([1, 1, 2, 2, 1]) → true}
   * <p>
   * {@code noTriples([1, 1, 2, 2, 2, 1]) → false}
   * <p>
   * {@code noTriples([1, 1, 1, 2, 2, 2, 1]) → false}
   */
  boolean noTriples(int[] nums);

  /**
   * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the
   * value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1"
   * differs by 2 or less from the correct value.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code has271([1, 2, 7, 1]) → true}
   * <p>
   * {@code has271([1, 2, 8, 1]) → false}
   * <p>
   * {@code has271([2, 7, 1]) → true}
   */
  boolean has271(int[] nums);
}
