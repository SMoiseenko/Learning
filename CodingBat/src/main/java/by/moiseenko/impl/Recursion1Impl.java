package by.moiseenko.impl;

import by.moiseenko.Recursion1;

/**
 * My Implementation of Recursion1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Recursion1Impl implements Recursion1 {

  @Override
  public int factorial(int n) {
    if (n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  @Override
  public int bunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

  @Override
  public int fibonacci(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacci(n - 2) + fibonacci(n - 1);
  }

  @Override
  public int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    return ((bunnies % 2 == 0) ? 3 : 2) + bunnyEars2(bunnies - 1);
  }

  @Override
  public int triangle(int rows) {
    if (rows == 0) {
      return 0;
    }
    return rows + triangle(rows - 1);
  }

  @Override
  public int sumDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return n % 10 + sumDigits(n / 10);
  }

  @Override
  public int count7(int n) {
    if (n == 0) {
      return 0;
    }
    return ((n % 10 == 7) ? 1 : 0) + count7(n / 10);
  }

  @Override
  public int count8(int n) {
    if (n == 0) {
      return 0;
    }
    return ((n % 100 == 88) ? 2 : ((n % 10 == 8) ? 1 : 0)) + count8(n / 10);
  }

  @Override
  public int powerN(int base, int n) {
    if (n == 1) {
      return base;
    }
    return base * powerN(base, n - 1);
  }

  @Override
  public int countX(String str) {
    if (str.isEmpty()) {
      return 0;
    }
    return ((str.charAt(str.length() - 1) == 'x') ? 1 : 0) + countX(
        str.substring(0, str.length() - 1));
  }

  @Override
  public int countHi(String str) {
    if (str.isEmpty()) {
      return 0;
    }
    return ((str.endsWith("hi")) ? 1 : 0) + countHi(
        str.substring(0, str.length() - 1));
  }

  @Override
  public String changeXY(String str) {
    if (str.isEmpty()) {
      return "";
    }
    return (str.startsWith("x") ? "y"
        : str.charAt(0)) + changeXY(str.substring(1));
  }

  @Override
  public String changePi(String str) {
    if (str.isEmpty()) {
      return "";
    }
    return str.startsWith("pi")
        ? "3.14" + changePi(str.substring(2))
        : str.charAt(0) + changePi(str.substring(1));
  }

  @Override
  public String noX(String str) {
    if (str.isEmpty()) {
      return "";
    }
    return (str.charAt(0) == 'x'
        ? ""
        : str.charAt(0))
        + noX(str.substring(1));
  }

  @Override
  public boolean array6(int[] nums, int index) {
    if (nums.length == index) {
      return false;
    }
    return nums[index] == 6 || array6(nums, index + 1);
  }

  @Override
  public int array11(int[] nums, int index) {
    int counter = 0;
    if (nums.length == index) {
      return counter;
    }
    return (nums[index] == 11 ? ++counter : 0) + array11(nums, index + 1);
  }

  @Override
  public boolean array220(int[] nums, int index) {
    if (nums.length - index < 2) {
      return false;
    }
    return nums[index + 1] == nums[index] * 10 || array220(nums, index + 1);
  }

  @Override
  public String allStar(String str) {
    if (str.length() - 1 < 0) {
      return "";
    }
    return ((str.length() > 1)
        ? str.charAt(0) + "*"
        : str.charAt(0))
        + allStar(str.substring(1));
  }

  @Override
  public String pairStar(String str) {
    if (str.length() == 0) {
      return "";
    }
    return (str.length() > 1 && str.charAt(0) == str.charAt(1)
        ? str.charAt(0) + "*"
        : str.charAt(0))
        + pairStar(str.substring(1));
  }

  @Override
  public String endX(String str) {
    if (str.length() == 0 || str.matches("\\bx+\\b")) {
      return str;
    }
    return (str.charAt(0) == 'x')
        ? endX(str.substring(1) + 'x')
        : str.charAt(0) + endX(str.substring(1));
  }

  @Override
  public int countPairs(String str) {
    int counter = 0;
    if (str.length() < 3) {
      return counter;
    }
    return (str.charAt(0) == str.charAt(2))
        ? counter + 1 + countPairs(str.substring(1))
        : countPairs(str.substring(1));
  }

  @Override
  public int countAbc(String str) {
    int counter = 0;
    if (str.length() < 3) {
      return counter;
    }
    return (str.startsWith("abc") || str.startsWith("aba"))
        ? ++counter + countAbc(str.substring(2))
        : countAbc(str.substring(1));
  }

  @Override
  public int count11(String str) {
    int counter = 0;
    if (str.length() < 2) {
      return counter;
    }
    return str.startsWith("11")
        ? ++counter + count11(str.substring(2))
        : count11(str.substring(1));
  }

  @Override
  public String stringClean(String str) {
    if (str.length() < 2) {
      return str;
    }
    return (str.charAt(0) == str.charAt(1)
        ? ""
        : str.charAt(0))
        + stringClean(str.substring(1));
  }

  @Override
  public int countHi2(String str) {
    int counter = 0;
    if (str.length() < 2) {
      return counter;
    }
    return str.startsWith("xhi")
        ? countHi2(str.substring(3))
        : (str.startsWith("hi")
            ? ++counter + countHi2(str.substring(1))
            : countHi2(str.substring(1)));
  }

  @Override
  public String parenBit(String str) {
    if (str.startsWith("(") && str.endsWith(")")) {
      return str;
    }
    return str.startsWith("(")
        ? parenBit(str.substring(0, str.indexOf(")") + 1))
        : parenBit(str.substring(1));
  }

  @Override
  public boolean nestParen(String str) {
    if (str.length() == 0) {
      return true;
    }
    return str.charAt(0) == '(' && str.charAt(str.length() - 1) == ')' && nestParen(
        str.substring(1, str.length() - 1));
  }

  @Override
  public int strCount(String str, String sub) {
    int counter = 0;
    if (str.length() == 0) {
      return counter;
    }
    return (str.startsWith(sub))
        ? ++counter + strCount(str.substring(sub.length()), sub)
        : strCount(str.substring(1), sub);
  }

  @Override
  public boolean strCopies(String str, String sub, int n) {
    if (str.length() == 0) {
      return n == 0;
    }
    return (str.startsWith(sub))
        ? strCopies(str.substring(1), sub, --n)
        : strCopies(str.substring(1), sub, n);
  }

  @Override
  public int strDist(String str, String sub) {
    if (str.isEmpty() || (str.startsWith(sub) && str.endsWith(sub))) {
      return str.length();
    }
    return !str.startsWith(sub)
        ? strDist(str.substring(1), sub)
        : (!str.endsWith(sub)
            ? strDist(str.substring(0, str.length() - 1), sub)
            : 0);
  }
}
