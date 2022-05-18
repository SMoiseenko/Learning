package by.moiseenko.impl;

import by.moiseenko.Warmup1;

/**
 * My Implementation of Warmup1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Warmup1Impl implements Warmup1 {

  @Override
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }

  @Override
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return !aSmile ^ bSmile;
  }

  @Override
  public int sumDouble(int a, int b) {
    return (a == b) ? 4 * a : a + b;
  }

  @Override
  public int diff21(int n) {
    return (n > 21) ? 2 * (n - 21) : 21 - n;
  }

  @Override
  public boolean parrotTrouble(boolean talking, int hour) {
    return (talking && (hour < 7 || hour > 20));
  }

  @Override
  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

  @Override
  public boolean nearHundred(int n) {
    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
  }

  @Override
  public boolean posNeg(int a, int b, boolean negative) {
    return (a * b < 0 && !negative) || (negative && a < 0 && b < 0);
  }

  @Override
  public String notString(String str) {
    return (str.startsWith("not")) ? str : "not ".concat(str);
  }

  @Override
  public String missingChar(String str, int n) {
    return str.substring(0, n).concat(str.substring(n + 1));
  }

  @Override
  public String frontBack(String str) {
    if (str.isEmpty()) {
      return str;
    }
    char[] strArr = str.toCharArray();
    char temp = strArr[strArr.length - 1];
    strArr[strArr.length - 1] = strArr[0];
    strArr[0] = temp;
    return new String(strArr);
  }

  @Override
  public String front3(String str) {
    return (str.length() > 3) ? new String(new char[3]).replace("\0", str.substring(0, 3))
        : new String(new char[3]).replace("\0", str);
  }

  @Override
  public String backAround(String str) {
    String last = String.valueOf(str.charAt(str.length() - 1));
    return last.concat(str).concat(last);
  }

  @Override
  public boolean or35(int n) {
    return (n % 3 == 0) || (n % 5 == 0);
  }

  @Override
  public String front22(String str) {
    if (str.length() < 3) {
      return str.concat(str).concat(str);
    }
    String s = str.substring(0, 2);
    return s.concat(str).concat(s);
  }

  @Override
  public boolean startHi(String str) {
    return str.length() > 1 && "hi".equals(str.substring(0, 2));
  }

  @Override
  public boolean icyHot(int temp1, int temp2) {
    return (temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0);
  }

  @Override
  public boolean in1020(int a, int b) {
    return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
  }

  @Override
  public boolean hasTeen(int a, int b, int c) {
    return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
  }

  @Override
  public boolean loneTeen(int a, int b) {
    return (a >= 13 && a <= 19) ^
        (b >= 13 && b <= 19);
  }

  @Override
  public String delDel(String str) {
    return (str.length() > 3 && str.substring(1, 4).equals("del"))
        ? str.substring(0, 1).concat(str.substring(4))
        : str;
  }

  @Override
  public boolean mixStart(String str) {
    return str.length() > 2 && str.substring(1, 3).equals("ix");
  }

  @Override
  public String startOz(String str) {
    if (str.isEmpty()) {
      return "";
    }
    if (str.startsWith("oz")) {
      return "oz";
    }
    if (str.charAt(0) == 'o') {
      return "o";
    }
    if (str.length() > 1 && str.charAt(1) == 'z') {
      return "z";
    }
    return "";
  }

  @Override
  public int intMax(int a, int b, int c) {
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    return max;
  }

  @Override
  public int close10(int a, int b) {
    int diff = Math.abs(10 - a) - Math.abs(10 - b);
    if (diff > 0) {
      return b;
    }
    if (diff < 0) {
      return a;
    }
    return 0;
  }

  @Override
  public boolean in3050(int a, int b) {
    return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
        ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
  }

  @Override
  public int max1020(int a, int b) {
    if ((a < 10 || a > 20) && (b < 10 || b > 20)) {
      return 0;
    }
    if ((a < 10 || a > 20)) {
      return b;
    }
    if ((b < 10 || b > 20)) {
      return a;
    }
    if ((a - b) > 0) {
      return a;
    }
    if ((a - b) < 0) {
      return b;
    }
    return 0;
  }

  @Override
  public boolean stringE(String str) {
    int eQty = 0;
    char[] strArr = str.toCharArray();
    for (char c : strArr) {
      if (c == 'e') {
        eQty++;
      }
    }
    return eQty >= 1 && eQty <= 3;
  }

  @Override
  public boolean lastDigit(int a, int b) {
    String a1 = String.valueOf(a);
    String b1 = String.valueOf(b);
    return a1.charAt(a1.length() - 1) == b1.charAt(b1.length() - 1);
  }

  @Override
  public String endUp(String str) {
    if (str.length() < 3) {
      return str.toUpperCase();
    }
    return str.substring(0, str.length() - 3).concat(str.substring(str.length() - 3).toUpperCase());
  }

  @Override
  public String everyNth(String str, int n) {
    String result = String.valueOf(str.charAt(0));
    for (int i = n; i < str.length(); i += n) {
      result = result.concat(String.valueOf(str.charAt(i)));
    }
    return result;
  }
}
