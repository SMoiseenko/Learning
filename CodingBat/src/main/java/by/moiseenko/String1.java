package by.moiseenko;

/**
 * Basic string problems -- no loops. Use + to combine Strings, str.length() is the number of chars
 * in a String, str.substring(i, j) extracts the substring starting at index i and running up to but
 * not including index j.
 */
public interface String1 {

  /**
   * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code helloName("Bob") → "Hello Bob!"}
   * <p>
   * {@code helloName("Alice") → "Hello Alice!"}
   * <p>
   * {@code helloName("X") → "HelloX!"}
   */
  String helloName(String name);

  /**
   * Given two strings, a and b, return the result of putting them together in the order abba, e.g.
   * "Hi" and "Bye" returns "HiByeByeHi".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makeAbba("Hi", "Bye") → "HiByeByeHi"}
   * <p>
   * {@code makeAbba("Yo", "Alice") → "YoAliceAliceYo"}
   * <p>
   * {@code makeAbba("What", "Up") → "WhatUpUpWhat"}
   */
  String makeAbba(String a, String b);

  /**
   * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this
   * example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word
   * strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makeTags("i", "Yay") → "<i>Yay</i>"}
   * <p>
   * {@code makeTags("i", "Hello") → "<i>Hello</i>"}
   * <p>
   * {@code makeTags("cite","Yay") → "<cite>Yay</cite>"}
   */
  String makeTags(String tag, String word);

  /**
   * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
   * is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract
   * the String starting at index i and going up to but not including index j.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code  makeOutWord("<<>>", "Yay") → "<<Yay>>"}
   * <p>
   * {@code makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"}
   * <p>
   * {@code makeOutWord("[[]]", "word") → "[[word]]"}
   */
  String makeOutWord(String out, String word);

  /**
   * Given a string, return a new string made of 3 copies of the last 2 chars of the original
   * string. The string length will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code extraEnd("Hello") → "lololo"}
   * <p>
   * {@code extraEnd("ab") → "ababab"}
   * <p>
   * {@code extraEnd("Hi") → "HiHiHi"}
   */
  String extraEnd(String str);

  /**
   * Given a string, return the string made of its first two chars, so the String "Hello" yields
   * "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
   * the empty string "" yields the empty string "". Note that str.length() returns the length of a
   * string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code firstTwo("Hello") → "He"}
   * <p>
   * {@code firstTwo("abcdefg") → "ab"}
   * <p>
   * {@code firstTwo("ab") → "ab"}
   */
  String firstTwo(String str);

  /**
   * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code firstHalf("WooHoo") → "Woo"}
   * <p>
   * {@code firstHalf("HelloThere") → "Hello"}
   * <p>
   * {@code firstHalf("abcdef") → "abc"}
   */
  String firstHalf(String str);

  /**
   * Given a string, return a version without the first and last char, so "Hello" yields "ell". The
   * string length will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code  withoutEnd("Hello") → "ell"}
   * <p>
   * {@code withoutEnd("java") → "av"}
   * <p>
   * {@code withoutEnd("coding") → "odin"}
   */
  String withoutEnd(String str);

  /**
   * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
   * on the outside and the longer string on the inside. The strings will not be the same length,
   * but they may be empty (length 0).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code comboString("Hello", "hi") → "hiHellohi"}
   * <p>
   * {@code comboString("hi", "Hello") → "hiHellohi"}
   * <p>
   * {@code comboString("aaa", "b") → "baaab"}
   */
  String comboString(String a, String b);

  /**
   * Given 2 strings, return their concatenation, except omit the first char of each. The strings
   * will be at least length 1.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code nonStart("Hello", "There") → "ellohere"}
   * <p>
   * {@code nonStart("java", "code") → "avaode"}
   * <p>
   * {@code nonStart("shotl", "java") → "hotlava"}
   */
  String nonStart(String a, String b);

  /**
   * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
   * The string length will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code left2("Hello") → "lloHe"}
   * <p>
   * {@code left2("java") → "vaja"}
   * <p>
   * {@code left2("Hi") → "Hi"}
   */
  String left2(String str);

  /**
   * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
   * start. The string length will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code right2("Hello") → "loHel"}
   * <p>
   * {@code right2("java") → "vaja"}
   * <p>
   * {@code right2("Hi") → "Hi"}
   */
  String right2(String str);

  /**
   * Given a string, return a string length 1 from its front, unless front is false, in which case
   * return a string length 1 from its back. The string will be non-empty.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code theEnd("Hello", true) → "H"}
   * <p>
   * {@code theEnd("Hello", false) → "o"}
   * <p>
   * {@code theEnd("oh", true) → "o"}
   */
  String theEnd(String str, boolean front);

  /**
   * Given a string, return a version without both the first and last char of the string. The string
   * may be any length, including 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code  withouEnd2("Hello") → "ell"}
   * <p>
   * {@code withouEnd2("abc") → "b"}
   * <p>
   * {@code withouEnd2("ab") → ""}
   */
  String withouEnd2(String str);

  /**
   * Given a string of even length, return a string made of the middle two chars, so the string
   * "string" yields "ri". The string length will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code middleTwo("string") → "ri"}
   * <p>
   * {@code middleTwo("code") → "od"}
   * <p>
   * {@code middleTwo("Practice") → "ct"}
   */
  String middleTwo(String str);

  /**
   * Given a string, return true if it ends in "ly".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code endsLy("oddly") → true}
   * <p>
   * {@code endsLy("y") → false}
   * <p>
   * {@code endsLy("oddy") → false}
   */
  boolean endsLy(String str);

  /**
   * Given a string and an int n, return a string made of the first and last n chars from the
   * string. The string length will be at least n.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code nTwice("Hello", 2) → "Helo"}
   * <p>
   * {@code nTwice("Chocolate", 3) → "Choate"}
   * <p>
   * {@code nTwice("Chocolate", 1) → "Ce"}
   */
  String nTwice(String str, int n);

  /**
   * Given a string and an index, return a string length 2 starting at the given index. If the index
   * is too big or too small to define a string length 2, use the first 2 chars. The string length
   * will be at least 2.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code twoChar("java", 0) → "ja"}
   * <p>
   * {@code twoChar("java", 2) → "va"}
   * <p>
   * {@code twoChar("java", 3) → "ja"}
   */
  String twoChar(String str, int index);

  /**
   * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields
   * "and". The string length will be at least 3.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code middleThree("Candy") → "and"}
   * <p>
   * {@code middleThree("and") → "and"}
   * <p>
   * {@code middleThree("solving") → "lvi"}
   */
  String middleThree(String str);

  /**
   * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
   * with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note:
   * use .equals() to compare 2 strings.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code hasBad("badxx") → true}
   * <p>
   * {@code hasBad("xbadxx") → true}
   * <p>
   * {@code hasBad("xxbadxx") → false}
   */
  boolean hasBad(String str);

  /**
   * Given a string, return a string length 2 made of its first 2 chars. If the string length is
   * less than 2, use '@' for the missing chars.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code atFirst("hello") → "he"}
   * <p>
   * {@code atFirst("hi") → "hi"}
   * <p>
   * {@code atFirst("h") → "h@"}
   */
  String atFirst(String str);

  /**
   * Given 2 strings, a and b, return a new string made of the first char of a and the last char of
   * b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code lastChars("last", "chars") → "ls"}
   * <p>
   * {@code lastChars("yo", "java") → "ya"}
   * <p>
   * {@code lastChars("hi", "") → "h@"}
   */
  String lastChars(String a, String b);

  /**
   * Given two strings, append them together (known as "concatenation") and return the result.
   * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and
   * "cat" yields "abcat".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code conCat("abc", "cat") → "abcat"}
   * <p>
   * {@code conCat("dog", "cat") → "dogcat"}
   * <p>
   * {@code conCat("abc", "") → "abc"}
   */
  String conCat(String a, String b);

  /**
   * Given a string of any length, return a new string where the last 2 chars, if present, are
   * swapped, so "coding" yields "codign".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code lastTwo("coding") → "codign"}
   * <p>
   * {@code lastTwo("cat") → "cta"}
   * <p>
   * {@code lastTwo("ab") → "ba"}
   */
  String lastTwo(String str);

  /**
   * Given a string, if the string begins with "red" or "blue" return that color string, otherwise
   * return the empty string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code seeColor("redxx") → "red"}
   * <p>
   * {@code seeColor("xxred") → ""}
   * <p>
   * {@code seeColor("blueTimes") → "blue"}
   */
  String seeColor(String str);

  /**
   * Given a string, return true if the first 2 chars in the string also appear at the end of the
   * string, such as with "edited".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code frontAgain("edited") → true}
   * <p>
   * {@code frontAgain("edit") → false}
   * <p>
   * {@code frontAgain("ed") → true}
   */
  boolean frontAgain(String str);

  /**
   * Given two strings, append them together (known as "concatenation") and return the result.
   * However, if the strings are different lengths, omit chars from the longer string so it is the
   * same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any
   * length.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code  minCat("Hello", "Hi") → "loHi"}
   * <p>
   * {@code minCat("Hello", "java") → "ellojava"}
   * <p>
   * {@code minCat("java", "Hello") → "javaello"}
   */
  String minCat(String a, String b);

  /**
   * Given a string, return a new string made of 3 copies of the first 2 chars of the original
   * string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code extraFront("Hello") → "HeHeHe"}
   * <p>
   * {@code extraFront("ab") → "ababab"}
   * <p>
   * {@code extraFront("H") → "HHH"}
   */
  String extraFront(String str);

  /**
   * Given a string, if a length 2 substring appears at both its beginning and end, return a string
   * without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap
   * with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code without2("HelloHe") → "lloHe"}
   * <p>
   * {@code without2("HelloHi") → "HelloHi"}
   * <p>
   * {@code without2("Hi") → ""}
   */
  String without2(String str);

  /**
   * Given a string, return a version without the first 2 chars. Except keep the first char if it is
   * 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code deFront("Hello") → "llo"}
   * <p>
   * {@code deFront("java") → "va"}
   * <p>
   * {@code deFront("away") → "aay"}
   */
  String deFront(String str);

  /**
   * Given a string and a second "word" string, we'll say that the word matches the string if it
   * appears at the front of the string, except its first char does not need to match exactly. On a
   * match, return the front of the string, or otherwise return the empty string. So, so with the
   * string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least
   * length 1.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code startWord("hippo", "hi") → "hi"}
   * <p>
   * {@code startWord("hippo", "xip") → "hip"}
   * <p>
   * {@code startWord("hippo", "i") → "h"}
   */
  String startWord(String str, String word);

  /**
   * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
   * and otherwise return the string unchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code withoutX("xHix") → "Hi"}
   * <p>
   * {@code withoutX("xHi") → "Hi"}
   * <p>
   * {@code withoutX("Hxix") → "Hxi"}
   */
  String withoutX(String str);

  /**
   * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x'
   * chars, and otherwise return the string unchanged. This is a little harder than it looks.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code withoutX2("xHi") → "Hi"}
   * <p>
   * {@code withoutX2("Hxi") → "Hi"}
   * <p>
   * {@code withoutX2("Hi") → "Hi"}
   */
  String withoutX2(String str);
}
