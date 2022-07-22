package by.moiseenko.impl;

import by.moiseenko.String2;
import java.util.regex.Pattern;

/**
 * My Implementation of String2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class String2Impl implements String2 {

  @Override
  public String doubleChar(String str) {
    String result = "";
    if (str.length() == 0) {
      return result;
    }
    return result + str.charAt(0) + str.charAt(0) + doubleChar(str.substring(1));
  }

  @Override
  public int countHi(String str) {
    int counter = 0;
    if (str.length() < 2) {
      return counter;
    }
    return str.startsWith("hi")
        ? ++counter + countHi(str.substring(2))
        : countHi(str.substring(1));
  }

  @Override
  public boolean catDog(String str) {
    int catCounter = 0;
    int dogCounter = 0;
    while (str.length() > 2) {
      if (str.startsWith("cat")) {
        catCounter++;
        str = str.substring(3);
      } else if (str.startsWith("dog")) {
        dogCounter++;
        str = str.substring(3);
      } else {
        str = str.substring(1);
      }
    }
    return catCounter == dogCounter;
  }

  @Override
  public int countCode(String str) {
    int counter = 0;
    if (str.length() < 4) {
      return counter;
    }
    return str.matches("\\bco[a-zA-Z]e.*")
        ? ++counter + countCode(str.substring(4))
        : countCode(str.substring(1));
  }

  @Override
  public boolean endOther(String a, String b) {
    return b.toLowerCase().endsWith(a.toLowerCase())
        || a.toLowerCase().endsWith(b.toLowerCase());
  }

  @Override
  public boolean xyzThere(String str) {
    return str.startsWith("xyz") || str.matches(".*[^.]xyz.*");
  }

  @Override
  public boolean bobThere(String str) {
    return str.matches(".*b.b.*");
  }

  @Override
  public boolean xyBalance(String str) {
    return str.matches("(.*y[^x]*)|([^x]*)");
  }

  @Override
  public String mixString(String a, String b) {
    StringBuilder result = new StringBuilder();
    int minLength = Math.min(a.length(), b.length());
    for (int i = 0; i < minLength; i++) {
      result.append(a.charAt(i)).append(b.charAt(i));
    }
    result.append(a.length() > b.length() ? a.substring(minLength) : b.substring(minLength));
    return result.toString();
  }

  @Override
  public String repeatEnd(String str, int n) {
    StringBuilder result = new StringBuilder();
    String substring = str.substring(str.length() - n);
    result.append(substring.repeat(n));
    return result.toString();
  }

  @Override
  public String repeatFront(String str, int n) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < n; i++) {
      result.append(str, 0, n - i);
    }
    return result.toString();
  }

  @Override
  public String repeatSeparator(String word, String sep, int count) {
    if (count == 0) {
      return "";
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < count - 1; i++) {
      result.append(word).append(sep);
    }
    result.append(word);
    return result.toString();
  }

  @Override
  public boolean prefixAgain(String str, int n) {
    return str.substring(n).contains(str.substring(0, n));
  }

  @Override
  public boolean xyzMiddle(String str) {
    if (!str.contains("xyz")) {
      return false;
    }
    return (str.substring(str.length() / 2 - 1).startsWith("xyz")
        || (str.length() % 2 == 0 && str.substring(str.length() / 2 - 2).startsWith("xyz")));
  }

  @Override
  public String getSandwich(String str) {
    if (!str.matches("(.*bread){2}.*")) {
      return "";
    }
    return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
  }

  @Override
  public boolean sameStarChar(String str) {
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String oneTwo(String str) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < str.length() / 3; i++) {
      result.append(str.charAt(3 * i + 1)).append(str.charAt(3 * i + 2)).append(str.charAt(3 * i));
    }
    return result.toString();
  }

  @Override
  public String zipZap(String str) {
    return Pattern.compile("z \\w p", Pattern.COMMENTS).matcher(str).replaceAll("zp");
  }

  @Override
  public String starOut(String str) {
    return str.replaceAll("\\w?\\*+\\w?", "");
  }

  @Override
  public String plusOut(String str, String word) {
    String result = "";
    if (str.length() < 1) {
      return result;
    }
    return str.startsWith(word)
        ? result + word + plusOut(str.substring(word.length()), word)
        : result + "+" + plusOut(str.substring(1), word);
  }

  @Override
  public String wordEnds(String str, String word) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= str.length() - word.length(); i++) {
      if (str.startsWith(word, i)) {
        result.append((i == 0) ? "" : str.charAt(i - 1))
            .append((i == str.length() - word.length()) ? "" : str.charAt(i + word.length()));
        i += word.length() - 1;
      }
    }
    return result.toString();
  }
}