package warmup1;

/**
 Simple warmup problems to get started (solutions available).
 */
public interface Warmup1 {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sleepIn(false, false) → true}
   * <p>
   * {@code sleepIn(true, false) → false}
   * <p>
   * {@code sleepIn(false, true) → true}
   */
  boolean sleepIn(boolean weekday, boolean vacation);

  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
   * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
   * are in trouble.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code monkeyTrouble(true, true) → true}
   * <p>
   * {@code monkeyTrouble(false, false) → true}
   * <p>
   * {@code monkeyTrouble(true, false) → false}
   */
  boolean monkeyTrouble(boolean aSmile, boolean bSmile);

  /**
   * Given two int values, return their sum. Unless the two values are the same, then return double
   * their sum.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code sumDouble(1, 2) → 3}
   * <p>
   * {@code sumDouble(3, 2) → 5}
   * <p>
   * {@code sumDouble(2, 2) → 8}
   */
  int sumDouble(int a, int b);

  /**
   * Given an int n, return the absolute difference between n and 21, except return double the
   * absolute difference if n is over 21.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code diff21(19) → 2}
   * <p>
   * {@code diff21(10) → 11}
   * <p>
   * {@code diff21(21) → 0}
   */
  int diff21(int n);

  /**
   * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
   * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return
   * true if we are in trouble.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code parrotTrouble(true, 6) → true}
   * <p>
   * {@code parrotTrouble(true, 7) → false}
   * <p>
   * {@code parrotTrouble(false, 6) → false}
   */
  boolean parrotTrouble(boolean talking, int hour);

  /**
   * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code makes10(9, 10) → true}
   * <p>
   * {@code makes10(9, 9) → false}
   * <p>
   * {@code makes10(1, 9) → true}
   */
  boolean makes10(int a, int b);

  /**
   * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the
   * absolute value of a number.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code nearHundred(93) → true}
   * <p>
   * {@code nearHundred(90) → true}
   * <p>
   * {@code nearHundred(89) → false}
   */
  boolean nearHundred(int n);

  /**
   * Given 2 int values, return true if one is negative and one is positive. Except if the parameter
   * "negative" is true, then return true only if both are negative.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code posNeg(1, -1, false) → true}
   * <p>
   * {@code posNeg(-1, 1, false) → true}
   * <p>
   * {@code posNeg(-4, -5, true) → true}
   */
  boolean posNeg(int a, int b, boolean negative);

  /**
   * Given a string, return a new string where "not " has been added to the front. However, if the
   * string already begins with "not", return the string unchanged. Note: use .equals() to compare 2
   * strings.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code notString("candy") → "not candy"}
   * <p>
   * {@code notString("x") → "not x"}
   * <p>
   * {@code notString("not bad") → "not bad"}
   */
  String notString(String str);

  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has been
   * removed. The value of n will be a valid index of a char in the original string (i.e. n will be
   * in the range 0..str.length()-1 inclusive).
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code missingChar("kitten", 1) → "ktten"}
   * <p>
   * {@code missingChar("kitten", 0) → "itten"}
   * <p>
   * {@code missingChar("kitten", 4) → "kittn"}
   */
  String missingChar(String str, int n);

  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code frontBack("code") → "eodc"}
   * <p>
   * {@code frontBack("a") → "a"}
   * <p>
   * {@code frontBack("ab") → "ba"}
   */
  String frontBack(String str);

  /**
   * Given a string, we'll say that the front is the first 3 chars of the string. If the string
   * length is less than 3, the front is whatever is there. Return a new string which is 3 copies of
   * the front.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code front3("Java") → "JavJavJav"}
   * <p>
   * {@code front3("Chocolate") → "ChoChoCho"}
   * <p>
   * {@code front3("abc") → "abcabcabc"}
   */
  String front3(String str);

  /**
   * Given a string, take the last char and return a new string with the last char added at the
   * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code backAround("cat") → "tcatt"}
   * <p>
   * {@code backAround("Hello") → "oHelloo"}
   * <p>
   * {@code backAround("a") → "aaa"}
   */
  String backAround(String str);

  /**
   * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
   * "mod" operator -- see Introduction to Mod
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code or35(3) → true}
   * <p>
   * {@code or35(10) → true}
   * <p>
   * {@code or35(8) → false}
   */
  boolean or35(int n);

  /**
   * Given a string, take the first 2 chars and return the string with the 2 chars added at both the
   * front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use
   * whatever chars are there.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code front22("kitten") → "kikittenki"}
   * <p>
   * {@code front22("Ha") → "HaHaHa"}
   * <p>
   * {@code front22("abc") → "ababcab"}
   */
  String front22(String str);

  /**
   * Given a string, return true if the string starts with "hi" and false otherwise.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code startHi("hi there") → true}
   * <p>
   * {@code startHi("hi") → true}
   * <p>
   * {@code startHi("hello hi") → false}
   */
  boolean startHi(String str);

  /**
   * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code icyHot(120, -1) → true}
   * <p>
   * {@code icyHot(-1, 120) → true}
   * <p>
   * {@code icyHot(2, 120) → false}
   */
  boolean icyHot(int temp1, int temp2);

  /**
   * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code in1020(12, 99) → true}
   * <p>
   * {@code in1020(21, 12) → true}
   * <p>
   * {@code in1020(8, 99) → false}
   */
  boolean in1020(int a, int b);

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
   * return true if 1 or more of them are teen.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code hasTeen(13, 20, 10) → true}
   * <p>
   * {@code hasTeen(20, 19, 10) → true}
   * <p>
   * {@code hasTeen(20, 10, 13) → true}
   */
  boolean hasTeen(int a, int b, int c);

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
   * return true if one or the other is teen, but not both.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code loneTeen(13, 99) → true}
   * <p>
   * {@code loneTeen(21, 19) → true}
   * <p>
   * {@code loneTeen(13, 13) → false}
   */
  boolean loneTeen(int a, int b);

  /**
   * Given a string, if the string "del" appears starting at index 1, return a string where that
   * "del" has been deleted. Otherwise, return the string unchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code delDel("adelbc") → "abc"}
   * <p>
   * {@code delDel("adelHello") → "aHello"}
   * <p>
   * {@code delDel("adedbc") → "adedbc"}
   */
  String delDel(String str);

  /**
   * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
   * "9ix" .. all count.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mixStart("mix snacks") → true}
   * <p>
   * {@code mixStart("pix snacks") → true}
   * <p>
   * {@code mixStart("piz snacks") → false}
   */
  boolean mixStart(String str);

  /**
   * Given a string, return a string made of the first 2 chars (if present), however include first
   * char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code startOz("ozymandias") → "oz"}
   * <p>
   * {@code startOz("bzoo") → "z"}
   * <p>
   * {@code startOz("oxx") → "o"}
   */
  String startOz(String str);

  /**
   * Given three int values, a b c, return the largest.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code intMax(1, 2, 3) → 3}
   * <p>
   * {@code intMax(1, 3, 2) → 3}
   * <p>
   * {@code intMax(3, 2, 1) → 3}
   */
  int intMax(int a, int b, int c);

  /**
   * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event
   * of a tie. Note that Math.abs(n) returns the absolute value of a number.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code close10(8, 13) → 8}
   * <p>
   * {@code close10(13, 8) → 8}
   * <p>
   * {@code close10(13, 7) → 0}
   */
  int close10(int a, int b);

  /**
   * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are
   * both in the range 40..50 inclusive.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code in3050(30, 31) → true}
   * <p>
   * {@code in3050(30, 41) → false}
   * <p>
   * {@code in3050(40, 50) → true}
   */
  boolean in3050(int a, int b);

  /**
   * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
   * return 0 if neither is in that range.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code max1020(11, 19) → 19}
   * <p>
   * {@code max1020(19, 11) → 19}
   * <p>
   * {@code max1020(11, 9) → 11}
   */
  int max1020(int a, int b);

  /**
   * Return true if the given string contains between 1 and 3 'e' chars.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code stringE("Hello") → true}
   * <p>
   * {@code stringE("Heelle") → true}
   * <p>
   * {@code stringE("Heelele") → false}
   */
  boolean stringE(String str);

  /**
   * Given two non-negative int values, return true if they have the same last digit, such as with
   * 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code lastDigit(7, 17) → true}
   * <p>
   * {@code lastDigit(6, 17) → false}
   * <p>
   * {@code lastDigit(3, 113) → true}
   */
  boolean lastDigit(int a, int b);

  /**
   * Given a string, return a new string where the last 3 chars are now in upper case. If the string
   * has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the
   * uppercase version of a string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code endUp("Hello") → "HeLLO"}
   * <p>
   * {@code endUp("hi there") → "hi thERE"}
   * <p>
   * {@code endUp("hi") → "HI"}
   */
  String endUp(String str);

  /**
   * Given a non-empty string and an int N, return the string made starting with char 0, and then
   * every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code everyNth("Miracle", 2) → "Mrce"}
   * <p>
   * {@code everyNth("abcdefg", 2) → "aceg"}
   * <p>
   * {@code everyNth("abcdefg", 3) → "adg"}
   */
  String everyNth(String str, int n);
}
