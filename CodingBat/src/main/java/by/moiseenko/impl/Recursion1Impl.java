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
    return null;
  }

  @Override
  public int countPairs(String str) {
    return 0;
  }

  @Override
  public int countAbc(String str) {
    return 0;
  }

  @Override
  public int count11(String str) {
    return 0;
  }

  @Override
  public String stringClean(String str) {
    return null;
  }

  @Override
  public int countHi2(String str) {
    return 0;
  }

  @Override
  public String parenBit(String str) {
    return null;
  }

  @Override
  public boolean nestParen(String str) {
    return false;
  }

  @Override
  public int strCount(String str, String sub) {
    return 0;
  }

  @Override
  public boolean strCopies(String str, String sub, int n) {
    return false;
  }

  @Override
  public int strDist(String str, String sub) {
    return 0;
  }
}
