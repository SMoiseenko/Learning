package by.moiseenko.impl;

import by.moiseenko.Logic1;

/**
 * My Implementation of Logic1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Logic1Impl implements Logic1 {

  @Override
  public boolean cigarParty(int cigars, boolean isWeekend) {
    return (isWeekend && cigars >= 40) || (cigars >= 40 && cigars <= 60);
  }

  @Override
  public int dateFashion(int you, int date) {
    if (you <= 2 || date <= 2) {
      return 0;
    }
    if (you >= 8 || date >= 8) {
      return 2;
    }
    return 1;
  }

  @Override
  public boolean squirrelPlay(int temp, boolean isSummer) {
    int high = (isSummer) ? 100 : 90;
    return temp >= 60 && temp <= high;
  }


  @Override
  public int caughtSpeeding(int speed, boolean isBirthday) {
    if (isBirthday) {
      speed -= 5;
    }
    if (speed <= 60) {
      return 0;
    }
    if (speed <= 80) {
      return 1;
    }
    return 2;
  }


  @Override
  public int sortaSum(int a, int b) {
    int c = a + b;
    return (c >= 10 && c <= 19) ? 20 : c;
  }


  @Override
  public String alarmClock(int day, boolean vacation) {
    if (day == 0 || day == 6) {
      if (vacation) {
        return "off";
      } else {
        return "10:00";
      }
    } else {
      if (vacation) {
        return "10:00";
      } else {
        return "7:00";
      }
    }
  }

  @Override
  public boolean love6(int a, int b) {
    return a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6;
  }

  @Override
  public boolean in1To10(int n, boolean outsideMode) {
    if (!outsideMode && n >= 1 && n <= 10) {
      return true;
    }
    return outsideMode && (n <= 1 || n >= 10);
  }

  @Override
  public boolean specialEleven(int n) {
    return n % 11 == 0 || (n - 1) % 11 == 0;
  }

  @Override
  public boolean more20(int n) {
    return n % 20 == 1 || n % 20 == 2;
  }

  @Override
  public boolean old35(int n) {
    return n % 3 == 0 ^ n % 5 == 0;
  }


  @Override
  public boolean less20(int n) {
    return n % 20 == 18 || n % 20 == 19;
  }

  @Override
  public boolean nearTen(int num) {
    return num % 10 < 3 || num % 10 > 7;
  }

  @Override
  public int teenSum(int a, int b) {
    return (a >= 13 && a <= 19 || b >= 13 && b <= 19) ? 19 : a + b;
  }

  @Override
  public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
    if (isAsleep) {
      return false;
    }
    return !isMorning || (isMom);
  }

  @Override
  public int teaParty(int tea, int candy) {
    if (tea < 5 || candy < 5) {
      return 0;
    }
    if (tea >= candy * 2 || candy >= tea * 2) {
      return 2;
    }
    return 1;
  }

  @Override
  public String fizzString(String str) {
    if (str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b') {
      return "FizzBuzz";
    }
    if (str.charAt(0) == 'f') {
      return "Fizz";
    }
    if (str.charAt(str.length() - 1) == 'b') {
      return "Buzz";
    }
    return str;
  }

  @Override
  public String fizzString2(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "FizzBuzz!";
    }
    if (n % 3 == 0) {
      return "Fizz!";
    }
    if (n % 5 == 0) {
      return "Buzz!";
    }
    return n + "!";
  }

  @Override
  public boolean twoAsOne(int a, int b, int c) {
    if (a >= b && a >= c) {
      return (a == Math.abs(b) + Math.abs(c));
    }
    if (b >= a && b >= c) {
      return (b == Math.abs(a) + Math.abs(c));
    }
    return c == Math.abs(a) + Math.abs(b);
  }

  @Override
  public boolean inOrder(int a, int b, int c, boolean bOk) {
    if (c <= b) {
      return false;
    }
    return bOk || b > a;
  }


  @Override
  public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    return (equalOk) ? (c >= b && b >= a) : (c > b && b > a);
  }

  @Override
  public boolean lastDigit(int a, int b, int c) {
    return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
  }

  @Override
  public boolean lessBy10(int a, int b, int c) {
    int min = Math.min(Math.min(a, b), c);
    int max = Math.max(Math.max(a, b), c);
    return max - min >= 10;
  }

  @Override
  public int withoutDoubles(int die1, int die2, boolean noDoubles) {
    if (die1 != die2 || !noDoubles) {
      return die1 + die2;
    }
    return (die1 == 6) ? 7 : die1 + die2 + 1;
  }

  @Override
  public int maxMod5(int a, int b) {
    if (a == b) {
      return 0;
    }
    return (a % 5 == b % 5) ? Math.min(a, b) : Math.max(a, b);
  }

  @Override
  public int redTicket(int a, int b, int c) {
    if (a + b + c == 6) {
      return 10;
    }
    if (a == b && b == c) {
      return 5;
    }
    if (b != a && c != a) {
      return 1;
    }
    return 0;
  }

  @Override
  public int greenTicket(int a, int b, int c) {
    if (a == b && b == c) {
      return 20;
    }
    if (a == b || b == c || a == c) {
      return 10;
    }
    return 0;
  }

  @Override
  public int blueTicket(int a, int b, int c) {
    if (a + b == 10 || b + c == 10 || c + a == 10) {
      return 10;
    }
    if (a + b == b + c + 10 || a + b == c + a + 10) {
      return 5;
    }
    return 0;
  }

  @Override
  public boolean shareDigit(int a, int b) {
    return (a / 10 == b / 10 || a / 10 == b % 10 || b / 10 == a % 10 || a % 10 == b % 10);
  }

  @Override
  public int sumLimit(int a, int b) {
    return (String.valueOf(a + b).length() > String.valueOf(a).length()) ? a : a + b;
  }
}
