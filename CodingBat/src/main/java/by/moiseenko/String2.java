package by.moiseenko;

/**
 * Medium String problems -- 1 loop.
 */
public interface String2 {

  /**
   * Given a string, return a string where for every char in the original, there are two chars.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code doubleChar("The") → "TThhee"}
   * <p>
   * {@code doubleChar("AAbb") → "AAAAbbbb"}
   * <p>
   * {@code doubleChar("Hi-There") → "HHii--TThheerree"}
   */
  String doubleChar(String str);

  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countHi("abc hi ho") → 1}
   * <p>
   * {@code countHi("ABChi hi") → 2}
   * <p>
   * {@code countHi("hihi") → 2}
   */
  int countHi(String str);

  /**
   * Return true if the string "cat" and "dog" appear the same number of times in the given string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code catDog("catdog") → true}
   * <p>
   * {@code catDog("catcat") → false}
   * <p>
   * {@code catDog("1cat1cadodog") → true}
   */
  boolean catDog(String str);

  /**
   * Return the number of times that the string "code" appears anywhere in the given string, except
   * we'll accept any letter for the 'd', so "cope" and "cooe" count.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code countCode("aaacodebbb") → 1}
   * <p>
   * {@code countCode("codexxcode") → 2 }
   * <p>
   * {@code countCode("cozexxcope") → 2}
   */
  int countCode(String str);

  /**
   * Given two strings, return true if either of the strings appears at the very end of the other
   * string, ignoring upper/lower case differences (in other words, the computation should not be
   * "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code endOther("Hiabc", "abc") → true}
   * <p>
   * {@code endOther("AbC", "HiaBc") → true}
   * <p>
   * {@code endOther("abc", "abXabc") → true}
   */
  boolean endOther(String a, String b);

  /**
   * Return true if the given string contains an appearance of "xyz" where the xyz is not directly
   * preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code xyzThere("abcxyz") → true}
   * <p>
   * {@code xyzThere("abc.xyz") → false}
   * <p>
   * {@code xyzThere("xyz.abc") → true}
   */
  boolean xyzThere(String str);

  /**
   * Return true if the given string contains a "bob" string, but where the middle 'o' char can be
   * any char.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code bobThere("abcbob") → true}
   * <p>
   * {@code bobThere("b9b") → true}
   * <p>
   * {@code bobThere("bac") → false}
   */
  boolean bobThere(String str);

  /**
   * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a
   * 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can
   * balance multiple 'x's. Return true if the given string is xy-balanced.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code xyBalance("aaxbby") → true}
   * <p>
   * {@code xyBalance("aaxbb") → false}
   * <p>
   * {@code xyBalance("yaaxbb") → false}
   */
  boolean xyBalance(String str);

  /**
   * Given two strings, a and b, create a bigger string made of the first char of a, the first char
   * of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end
   * of the result.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mixString("abc", "xyz") → "axbycz"}
   * <p>
   * {@code mixString("Hi", "There") → "HTihere"}
   * <p>
   * {@code mixString("xxxx", "There") → "xTxhxexre"}
   */
  String mixString(String a, String b);

  /**
   * Given a string and an int n, return a string made of n repetitions of the last n characters of
   * the string. You may assume that n is between 0 and the length of the string, inclusive.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code repeatEnd("Hello", 3) → "llollollo"}
   * <p>
   * {@code repeatEnd("Hello", 2) → "lolo"}
   * <p>
   * {@code repeatEnd("Hello", 1) → "o"}
   */
  String repeatEnd(String str, int n);

  /**
   * Given a string and an int n, return a string made of the first n characters of the string,
   * followed by the first n-1 characters of the string, and so on. You may assume that n is between
   * 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code repeatFront("Chocolate", 4) → "ChocChoChC"}
   * <p>
   * {@code repeatFront("Chocolate", 3) → "ChoChC"}
   * <p>
   * {@code repeatFront("Ice Cream", 2) → "IcI"}
   */
  String repeatFront(String str, int n);

  /**
   * Given two strings, word and a separator sep, return a big string made of count occurrences of
   * the word, separated by the separator string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code repeatSeparator("Word", "X", 3) → "WordXWordXWord"}
   * <p>
   * {@code repeatSeparator("This", "And", 2) → "ThisAndThis"}
   * <p>
   * {@code repeatSeparator("This", "And", 1) → "This"}
   */
  String repeatSeparator(String word, String sep, int count);

  /**
   * Given a string, consider the prefix string made of the first N chars of the string. Does that
   * prefix string appear somewhere else in the string? Assume that the string is not empty and that
   * N is in the range 1..str.length().
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code prefixAgain("abXYabc", 1) → true}
   * <p>
   * {@code prefixAgain("abXYabc", 2) → true}
   * <p>
   * {@code prefixAgain("abXYabc", 3) → false}
   */
  boolean prefixAgain(String str, int n);

  /**
   * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
   * the number of chars to the left and right of the "xyz" must differ by at most one. This problem
   * is harder than it looks.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code xyzMiddle("AAxyzBB") → true}
   * <p>
   * {@code xyzMiddle("AxyzBB") → true}
   * <p>
   * {@code xyzMiddle("AxyzBBB") → false}
   */
  boolean xyzMiddle(String str);

  /**
   * A sandwich is two pieces of bread with something in between. Return the string that is between
   * the first and last appearance of "bread" in the given string, or return the empty string "" if
   * there are not two pieces of bread.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code getSandwich("breadjambread") → "jam"}
   * <p>
   * {@code getSandwich("xxbreadjambreadyy") → "jam"}
   * <p>
   * {@code getSandwich("xxbreadyy") → ""}
   */
  String getSandwich(String str);

  /**
   * Returns true if for every '*' (star) in the string, if there are chars both immediately before
   * and after the star, they are the same.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sameStarChar("xy*yzz") → true}
   * <p>
   * {@code sameStarChar("xy*zzz") → false}
   * <p>
   * {@code sameStarChar("*xa*az") → true}
   */
  boolean sameStarChar(String str);

  /**
   * Given a string, compute a new string by moving the first char to come after the next two chars,
   * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef"
   * yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code oneTwo("abc") → "bca"}
   * <p>
   * {@code oneTwo("tca") → "cat"}
   * <p>
   * {@code oneTwo("tcagdo") → "catdog"}
   */
  String oneTwo(String str);

  /**
   * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
   * with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
   * yields "zpXzp".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code zipZap("zipXzap") → "zpXzp"}
   * <p>
   * {@code zipZap("zopzop") → "zpzp"}
   * <p>
   * {@code zipZap("zzzopzop") → "zzzpzp"}
   */
  String zipZap(String str);

  /**
   * Return a version of the given string, where for every star (*) in the string the star and the
   * chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also
   * yields "ad".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code starOut("ab*cd") → "ad"}
   * <p>
   * {@code starOut("ab**cd") → "ad"}
   * <p>
   * {@code starOut("sm*eilly") → "silly"}
   */
  String starOut(String str);

  /**
   * Given a string and a non-empty word string, return a version of the original String where all
   * chars have been replaced by pluses ("+"), except for appearances of the word string which are
   * preserved unchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code plusOut("12xy34", "xy") → "++xy++"}
   * <p>
   * {@code plusOut("12xy34", "1") → "1+++++"}
   * <p>
   * {@code plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"}
   */
  String plusOut(String str, String word);

  /**
   * Given a string and a non-empty word string, return a string made of each char just before and
   * just after every appearance of the word in the string. Ignore cases where there is no char
   * before or after the word, and a char may be included twice if it is between two words.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code wordEnds("abcXY123XYijk", "XY") → "c13i"}
   * <p>
   * {@code wordEnds("XY123XY", "XY") → "13"}
   * <p>
   * {@code wordEnds("XY1XY", "XY") → "11"}
   */
  String wordEnds(String str, String word);

}
