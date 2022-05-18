package by.moiseenko;

/**
 * Harder String problems -- 2 loops.
 */
public interface String3 {

  /**
   * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
   * 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
   * is at the end of a word if there is not an alphabetic letter immediately following it. (Note:
   * Character.isLetter(char) tests if a char is an alphabetic letter.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countYZ("fez day") → 2}
   * <p>
   * {@code countYZ("day fez") → 2}
   * <p>
   * {@code countYZ("day fyyyz") → 2}
   */
  int countYZ(String str);

  /**
   * Given two strings, base and remove, return a version of the base string where all instances of
   * the remove string have been removed (not case sensitive). You may assume that the remove string
   * is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
   * "x".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code withoutString("Hello there", "llo") → "He there"}
   * <p>
   * {@code withoutString("Hello there", "e") → "Hllo thr"}
   * <p>
   * {@code withoutString("Hello there", "x") → "Hello there"}
   */
  String withoutString(String base, String remove);

  /**
   * Given a string, return true if the number of appearances of "is" anywhere in the string is
   * equal to the number of appearances of "not" anywhere in the string (case sensitive).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code equalIsNot("This is not") → false}
   * <p>
   * {@code equalIsNot("This is notnot") → true}
   * <p>
   * {@code equalIsNot("noisxxnotyynotxisi") → true}
   */
  boolean equalIsNot(String str);

  /**
   * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to
   * its left or right. Return true if all the g's in the given string are happy.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code gHappy("xxggxx") → true}
   * <p>
   * {@code gHappy("xxgxx") → false}
   * <p>
   * {@code gHappy("xxggyygxx") → false}
   */
  boolean gHappy(String str);

  /**
   * We'll say that a "triple" in a string is a char appearing three times in a row. Return the
   * number of triples in the given string. The triples may overlap.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countTriple("abcXXXabc") → 1}
   * <p>
   * {@code countTriple("xxxabyyyycd") → 3}
   * <p>
   * {@code countTriple("a") → 0}
   */
  int countTriple(String str);

  /**
   * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
   * characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests
   * if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
   * an int.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sumDigits("aa1bc2d3") → 6}
   * <p>
   * {@code sumDigits("aa11b33") → 8}
   * <p>
   * {@code sumDigits("Chocolate") → 0}
   */
  int sumDigits(String str);

  /**
   * Given a string, return the longest substring that appears at both the beginning and end of the
   * string without overlapping. For example, sameEnds("abXab") is "ab".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sameEnds("abXYab") → "ab"}
   * <p>
   * {@code sameEnds("xx") → "x"}
   * <p>
   * {@code sameEnds("xxx") → "x"}
   */
  String sameEnds(String string);

  /**
   * Given a string, look for a mirror image (backwards) string at both the beginning and end of the
   * given string. In other words, zero or more characters at the very begining of the given string,
   * and at the very end of the string in reverse order (possibly overlapping). For example, the
   * string "abXYZba" has the mirror end "ab".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mirrorEnds("abXYZba") → "ab"}
   * <p>
   * {@code mirrorEnds("abca") → "a"}
   * <p>
   * {@code mirrorEnds("aba") → "aba"}
   */
  String mirrorEnds(String string);

  /**
   * Given a string, return the length of the largest "block" in the string. A block is a run of
   * adjacent chars that are the same.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code maxBlock("hoopla") → 2}
   * <p>
   * {@code maxBlock("abbCCCddBBBxx") → 3}
   * <p>
   * {@code maxBlock("") → 0}
   */
  int maxBlock(String str);

  /**
   * Given a string, return the sum of the numbers appearing in the string, ignoring all other
   * characters. A number is a series of 1 or more digit chars in a row. (Note:
   * Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
   * Integer.parseInt(string) converts a string to an int.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sumNumbers("abc123xyz") → 123}
   * <p>
   * {@code sumNumbers("aa11b33") → 44}
   * <p>
   * {@code sumNumbers("7 11") → 18}
   */
  int sumNumbers(String str);

  /**
   * Given a string, return a string where every appearance of the lowercase word "is" has been
   * replaced with "is not". The word "is" should not be immediately preceeded or followed by a
   * letter -- so for example the "is" in "this" does not count. (Note: Character.isLetter(char)
   * tests if a char is a letter.)
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code notReplace("is test") → "is not test"}
   * <p>
   * {@code notReplace("is-is") → "is not-is not"}
   * <p>
   * {@code notReplace("This is right") → "This is not right"}
   */
  String notReplace(String str);

}
