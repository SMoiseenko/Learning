package by.moiseenko.impl;

import by.moiseenko.String3;

/**
 * My Implementation of String3 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class String3Impl implements String3 {

  @Override
  public int countYZ(String str) {
    int result = 0;
    String[] strArr = str.split("[^a-zA-Z]");
    for (String s : strArr) {
      if (s.endsWith("y") || s.endsWith("Y") || s.endsWith("z") || s.endsWith("Z")) {
        result++;
      }
    }
    return result;
  }

  @Override
  public String withoutString(String base, String remove) {
    return base.replaceAll("(?i)"+remove, "");
  }

  @Override
  public boolean equalIsNot(String str) {
    int isQty = 0;
    int notQty = 0;
    String strIsNot = str.replace("is", "-");
    strIsNot = strIsNot.replace("not", "+");
    for (char c : strIsNot.toCharArray()) {
      if (c == '-') {
        isQty++;
      }
      if (c == '+') {
        notQty++;
      }
    }
    return isQty == notQty;
  }


  @Override
  public boolean gHappy(String str) {
    boolean result = str.isEmpty();
    char[] strArr = str.toCharArray();
    for (int i = 0; i < strArr.length; i++) {
      if (strArr[i] == 'g') {
        result =
            (i != 0 && strArr[i - 1] == 'g') || (i + 1 < strArr.length && strArr[i + 1] == 'g');
        if (!result) {
          return result;
        }
      }
    }
    return result;
  }


  @Override
  public int countTriple(String str) {
    int result = 0;
    char[] strArr = str.toCharArray();

    for (int i = 0; i < strArr.length; i++) {
      if ((i + 2 < strArr.length) && strArr[i] == strArr[i + 1] && strArr[i] == strArr[i + 2]) {
        result++;
      }
    }
    return result;
  }

  @Override
  public int sumDigits(String str) {
    int result = 0;
    char[] strArr = str.toCharArray();
    for (char c : strArr) {
      if (Character.isDigit(c)) {
        result += c - 48;
      }
    }
    return result;
  }


  @Override
  public String sameEnds(String string) {
    int mid = string.length() / 2;
    int i = 0;
    int a = string.length() % 2;
    while (i < mid && !string.substring(0, mid - i).equals(string.substring(mid + a + i))) {
      i++;
    }
    return string.substring(0, mid - i);
  }


  @Override
  public String mirrorEnds(String string) {
    char[] strArr = string.toCharArray();
    int i = 0;
    while (i< string.length() && strArr[i]==strArr[strArr.length-1-i]){
      i++;
    }
    return string.substring(0,i);
  }

  @Override
  public int maxBlock(String str) {
    int maxQty = 0;
    int qty = 1;
    char[] strArr = str.toCharArray();
    for (int i = 0; i < strArr.length - 1; i++) {

      qty = (strArr[i] == strArr[i + 1]) ? qty + 1 : 1;

      if (qty > maxQty) {
        maxQty = qty;
      }
    }
    return maxQty;
  }

  @Override
  public int sumNumbers(String str) {
    String[] strArr = str.split("\\D+");
    int result = 0;
    for (String s : strArr) {
      if (!s.isEmpty()) {
        result += Integer.parseInt(s);
      }
    }
    return result;
  }

  @Override
  public String notReplace(String str) {
    return str.replaceAll("\\bis\\b", "is not");
  }

}
