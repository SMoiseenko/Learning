package by.moiseenko.impl;

import by.moiseenko.String1;

/**
 * My Implementation of String1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class String1Impl implements String1 {

  @Override
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  @Override
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  @Override
  public String makeTags(String tag, String word) {
    return String.format("<%s>%s</%s>", tag, word, tag);
  }

  @Override
  public String makeOutWord(String out, String word) {
    return out.substring(0, out.length() / 2) + word + out.substring(out.length() / 2);
  }

  @Override
  public String extraEnd(String str) {
    String sub = str.substring(str.length() - 2);
    return sub + sub + sub;
  }

  @Override
  public String firstTwo(String str) {
    return (str.length() > 1) ? str.substring(0, 2) : str;
  }

  @Override
  public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
  }

  @Override
  public String withoutEnd(String str) {
    return str.substring(1, str.length() - 1);
  }

  @Override
  public String comboString(String a, String b) {
    return (a.length() > b.length()) ? b + a + b : a + b + a;
  }

  @Override
  public String nonStart(String a, String b) {
    return a.substring(1) + b.substring(1);
  }

  @Override
  public String left2(String str) {
    return str.substring(2) + str.substring(0, 2);
  }

  @Override
  public String right2(String str) {
    return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
  }

  @Override
  public String theEnd(String str, boolean front) {
    return (front) ? str.substring(0, 1) : str.substring(str.length() - 1);
  }

  @Override
  public String withouEnd2(String str) {
    return (str.length() > 1) ? str.substring(1, str.length() - 1) : "";
  }

  @Override
  public String middleTwo(String str) {
    return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
  }

  @Override
  public boolean endsLy(String str) {
    return (str.length() > 1 && str.substring(str.length() - 2).equals("ly"));
  }

  @Override
  public String nTwice(String str, int n) {
    return str.substring(0, n).concat(str.substring(str.length() - n));
  }

  @Override
  public String twoChar(String str, int index) {
    return (index > -1 && str.length() - index >= 2) ? str.substring(index, index + 2)
        : str.substring(0, 2);
  }

  @Override
  public String middleThree(String str) {
    return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
  }

  @Override
  public boolean hasBad(String str) {
    return ((str.length() > 2 && str.substring(0, 3).equals("bad")) || (str.length() > 3
        && str.substring(1, 4).equals("bad")));
  }

  @Override
  public String atFirst(String str) {
    return str.concat("@@").substring(0, 2);
  }

  @Override
  public String lastChars(String a, String b) {
    return (a.concat("@").charAt(0)) + ("@".concat(b).substring(b.length()));
  }

  @Override
  public String conCat(String a, String b) {
    return (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) ? a
        + b.substring(1) : a + b;
  }

  @Override
  public String lastTwo(String str) {
    return (str.length() > 1)
        ? str.substring(0, str.length() - 2)
        + str.substring(str.length() - 1)
        + str.charAt(str.length() - 2)
        : str;
  }

  @Override
  public String seeColor(String str) {
    String result = "";
    if (str.startsWith("red")) {
      result = "red";
    }
    if (str.startsWith("blue")) {
      result = "blue";
    }
    return result;
  }

  @Override
  public boolean frontAgain(String str) {
    return str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2));
  }

  @Override
  public String minCat(String a, String b) {
    return
        (a.length() - b.length() >= 0)
            ? a.substring(a.length() - b.length()) + b
            : a + b.substring((a.length() - b.length()) * -1);
  }

  @Override
  public String extraFront(String str) {
    return
        (str.length() > 1)
            ? str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2)
            : str + str + str;
  }

  @Override
  public String without2(String str) {
    return
        (str.length() > 1 &&
            str.substring(0, 2).equals(str.substring(str.length() - 2)))
            ? str.substring(2)
            : str;
  }

  @Override
  public String deFront(String str) {
    String result = "";
    if (str.length() > 0 && str.charAt(0) == 'a') {
      result += "a";
    }
    if (str.length() > 1 && str.charAt(1) == 'b') {
      result += "b";
    }
    if (str.length() > 2) {
      result += str.substring(2);
    }
    return result;
  }

  @Override
  public String startWord(String str, String word) {
    String cut = "";
    if (str.length() >= word.length()) {
      cut = str.substring(0, word.length());
    }
    if (cut.length() > 1 && !cut.substring(1, cut.length())
        .equals(word.substring(1, word.length()))) {
      cut = "";
    }
    return cut;
  }

  @Override
  public String withoutX(String str) {
    if (!str.isEmpty() && str.charAt(0) == 'x') {
      str = str.substring(1);
    }
    if (!str.isEmpty() && str.charAt(str.length() - 1) == 'x') {
      str = str.substring(0, str.length() - 1);
    }
    return str;
  }

  @Override
  public String withoutX2(String str) {
    if (str.startsWith("xx")) {
      str = str.substring(2);
    }
    if (str.length() > 1 && str.charAt(1) == 'x') {
      str = str.substring(0, 1).concat(str.substring(2));
    }
    if (str.length() > 0 && str.charAt(0) == 'x') {
      str = str.substring(1);
    }
    return str;
  }
}
