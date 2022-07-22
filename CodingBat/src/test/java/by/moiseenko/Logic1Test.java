package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Logic1Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Change implementation in init() method to your.
 */
class Logic1Test {

  private static Logic1 l1;

  @BeforeAll
  private static void init() {
    l1 = new Logic1Impl();
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      30, false, false
      50, false, true
      70, true, true
      30, true, false
      50, true, true
      60, false, true
      61, false, false
      40, false, true
      39, false, false
      40, true, true
      39, true, false
      """)
  void cigarParty(int cigars, boolean isWeekend, boolean expected) {
    assertEquals(expected, l1.cigarParty(cigars, isWeekend));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      5, 10, 2
      5, 2, 0
      5, 5, 1
      3, 3, 1
      10, 2, 0
      2, 9, 0
      9, 9, 2
      10, 5, 2
      2, 2, 0
      3, 7, 1
      2, 7, 0
      6, 2, 0
      """)
  void dateFashion(int you, int date, int expected) {
    assertEquals(expected, l1.dateFashion(you, date));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      70, false, true
      95, false, false
      95, true, true
      90, false, true
      90, true, true
      50, false, false
      50, true, false
      100, false, false
      100, true, true
      105, true, false
      59, false, false
      59, true, false
      60, false, true
      """)
  void squirrelPlay(int temp, boolean isSummer, boolean expected) {
    assertEquals(expected, l1.squirrelPlay(temp, isSummer));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      60, false, 0
      65, false, 1
      65, true, 0
      80, false, 1
      85, false, 2
      85, true, 1
      70, false, 1
      75, false, 1
      75, true, 1
      40, false, 0
      40, true, 0
      90, false, 2
      """)
  void caughtSpeeding(int speed, boolean isBirthday, int expected) {
    assertEquals(expected, l1.caughtSpeeding(speed, isBirthday));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      3, 4, 7
      9, 4, 20
      10, 11, 21
      12, -3, 9
      -3, 12, 9
      4, 5, 9
      4, 6, 20
      14, 7, 21
      14, 6, 20
      """)
  void sortaSum(int a, int b, int expected) {
    assertEquals(expected, l1.sortaSum(a, b));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, false, 7:00
      5, false, 7:00
      0, false, 10:00
      6, false, 10:00
      0, true, off
      6, true, off
      1, true, 10:00
      3, true, 10:00
      5, true, 10:00
      """)
  void alarmClock(int day, boolean vacation, String expected) {
    assertEquals(expected, l1.alarmClock(day, vacation));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      6, 4, true
      4, 5, false
      1, 5, true
      1, 6, true
      1, 8, false
      1, 7, true
      7, 5, false
      8, 2, true
      6, 6, true
      -6, 2, false
      -4, -10, true
      -7, 1, false
      7, -1, true
      -6, 12, true
      -2, -4, false
      7, 1, true
      0, 9, false
      8, 3, false
      3, 3, true
      3, 4, false
      """)
  void love6(int a, int b, boolean expected) {
    assertEquals(expected, l1.love6(a, b));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      5, false, true
      11, false, false
      11, true, true
      10, false, true
      10, true, true
      9, false, true
      9, true, false
      1, false, true
      1, true, true
      0, false, false
      0, true, true
      -1, false, false
      -1, true, true
      99, false, false
      -99, true, true
      """)
  void in1To10(int n, boolean outsideMode, boolean expected) {
    assertEquals(expected, l1.in1To10(n, outsideMode));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      22, true
      23, true
      24, false
      21, false
      11, true
      12, true
      10, false
      9, false
      8, false
      0, true
      1, true
      2, false
      121, true
      122, true
      123, false
      46, false
      49, false
      52, false
      54, false
      55, true
      """)
  void specialEleven(int n, boolean expected) {
    assertEquals(expected, l1.specialEleven(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      20, false
      21, true
      22, true
      23, false
      25, false
      30, false
      31, false
      59, false
      60, false
      61, true
      62, true
      1020, false
      1021, true
      1000, false
      1001, true
      50, false
      55, false
      40, false
      41, true
      39, false
      42, true
      """)
  void more20(int n, boolean expected) {
    assertEquals(expected, l1.more20(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      3, true
      10, true
      15, false
      5, true
      9, true
      8, false
      7, false
      6, true
      17, false
      18, true
      29, false
      20, true
      21, true
      22, false
      45, false
      99, true
      """)
  void old35(int n, boolean expected) {
    assertEquals(expected, l1.old35(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      18, true
      19, true
      20, false
      8, false
      17, false
      23, false
      25, false
      30, false
      31, false
      58, true
      59, true
      60, false
      61, false
      62, false
      1017, false
      1018, true
      1019, true
      1020, false
      1021, false
      1022, false
      1023, false
      37, false
      """)
  void less20(int n, boolean expected) {
    assertEquals(expected, l1.less20(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      12, true
      17, false
      19, true
      31, true
      6, false
      10, true
      11, true
      21, true
      22, true
      23, false
      54, false
      155, false
      158, true
      3, false
      1, true
      """)
  void nearTen(int num, boolean expected) {
    assertEquals(expected, l1.nearTen(num));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      3, 4, 7
      10, 13, 19
      13, 2, 19
      3, 19, 19
      13, 13, 19
      10, 10, 20
      6, 14, 19
      15, 2, 19
      19, 19, 19
      19, 20, 19
      2, 18, 19
      12, 4, 16
      2, 20, 22
      2, 17, 19
      2, 16, 19
      6, 7, 13
      """)
  void teenSum(int a, int b, int expected) {
    assertEquals(expected, l1.teenSum(a, b));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      false, false, false, true
      false, false, true, false
      true, false, false, false
      true, true, false, true
      false, true, false, true
      true, true, true, false
      """)
  void answerCell(boolean isMorning, boolean isMom, boolean isAsleep, boolean expected) {
    assertEquals(expected, l1.answerCell(isMorning, isMom, isAsleep));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      6, 8, 1
      3, 8, 0
      20, 6, 2
      12, 6, 2
      11, 6, 1
      11, 4, 0
      4, 5, 0
      5, 5, 1
      6, 6, 1
      5, 10, 2
      5, 9, 1
      10, 4, 0
      10, 20, 2
      """)
  void teaParty(int tea, int candy, int expected) {
    assertEquals(expected, l1.teaParty(tea, candy));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      fig, Fizz
      dib, Buzz
      fib, FizzBuzz
      abc, abc
      fooo, Fizz
      booo, booo
      ooob, Buzz
      fooob, FizzBuzz
      f, Fizz
      b, Buzz
      abcb, Buzz
      Hello, Hello
      Hellob, Buzz
      af, af
      bf, bf
      fb, FizzBuzz
      """)
  void fizzString(String str, String expected) {
    assertEquals(expected, l1.fizzString(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, 1!
      2, 2!
      3, Fizz!
      4, 4!
      5, Buzz!
      6, Fizz!
      7, 7!
      8, 8!
      9, Fizz!
      15, FizzBuzz!
      16, 16!
      18, Fizz!
      19, 19!
      21, Fizz!
      44, 44!
      45, FizzBuzz!
      100, Buzz!
      """)
  void fizzString2(int n, String expected) {
    assertEquals(expected, l1.fizzString2(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, 2, 3, true
      3, 1, 2, true
      3, 2, 2, false
      2, 3, 1, true
      5, 3, -2, true
      5, 3, -3, false
      2, 5, 3, true
      9, 5, 5, false
      9, 4, 5, true
      5, 4, 9, true
      3, 3, 0, true
      3, 3, 2, false
      """)
  void twoAsOne(int a, int b, int c, boolean expected) {
    assertEquals(expected, l1.twoAsOne(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, 2, 4, false, true
      1, 2, 1, false, false
      1, 1, 2, true, true
      3, 2, 4, false, false
      2, 3, 4, false, true
      3, 2, 4, true, true
      4, 2, 2, true, false
      4, 5, 2, true, false
      2, 4, 6, true, true
      7, 9, 10, false, true
      7, 5, 6, true, true
      7, 5, 4, true, false
      """)
  void inOrder(int a, int b, int c, boolean bOk, boolean expected) {
    assertEquals(expected, l1.inOrder(a, b, c, bOk));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      2, 5, 11, false, true
      5, 7, 6, false, false
      5, 5, 7, true, true
      5, 5, 7, false, false
      2, 5, 4, false, false
      3, 4, 3, false, false
      3, 4, 4, false, false
      3, 4, 3, true, false
      3, 4, 4, true, true
      1, 5, 5, true, true
      5, 5, 5, true, true
      2, 2, 1, true, false
      9, 2, 2, true, false
      0, 1, 0, true, false
      """)
  void inOrderEqual(int a, int b, int c, boolean equalOk, boolean expected) {
    assertEquals(expected, l1.inOrderEqual(a, b, c, equalOk));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      23, 19, 13, true
      23, 19, 12, false
      23, 19, 3, true
      23, 19, 39, true
      1, 2, 3, false
      1, 1, 2, true
      1, 2, 2, true
      14, 25, 43, false
      14, 25, 45, true
      248, 106, 1002, false
      248, 106, 1008, true
      10, 11, 20, true
      0, 11, 0, true
      """)
  void lastDigit(int a, int b, int c, boolean expected) {
    assertEquals(expected, l1.lastDigit(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, 7, 11, true
      1, 7, 10, false
      11, 1, 7, true
      10, 7, 1, false
      -10, 2, 2, true
      2, 11, 11, false
      3, 3, 30, true
      3, 3, 3, false
      10, 1, 11, true
      10, 11, 1, true
      10, 11, 2, false
      3, 30, 3, true
      2, 2, -8, true
      2, 8, 12, true
      """)
  void lessBy10(int a, int b, int c, boolean expected) {
    assertEquals(expected, l1.lessBy10(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      2, 3, true, 5
      3, 3, true, 7
      3, 3, false, 6
      2, 3, false, 5
      5, 4, true, 9
      5, 4, false, 9
      5, 5, true, 11
      5, 5, false, 10
      6, 6, true, 7
      6, 6, false, 12
      1, 6, true, 7
      6, 1, false, 7
      """)
  void withoutDoubles(int die1, int die2, boolean noDoubles, int expected) {
    assertEquals(expected, l1.withoutDoubles(die1, die2, noDoubles));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      2, 3, 3
      6, 2, 6
      3, 2, 3
      8, 12, 12
      7, 12, 7
      11, 6, 6
      2, 7, 2
      7, 7, 0
      9, 1, 9
      9, 14, 9
      1, 2, 2
      """)
  void maxMod5(int a, int b, int expected) {
    assertEquals(expected, l1.maxMod5(a, b));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      2, 2, 2, 10
      2, 2, 1, 0
      0, 0, 0, 5
      2, 0, 0, 1
      1, 1, 1, 5
      1, 2, 1, 0
      1, 2, 0, 1
      0, 2, 2, 1
      1, 2, 2, 1
      0, 2, 0, 0
      1, 1, 2, 0
      """)
  void redTicket(int a, int b, int c, int expected) {
    assertEquals(expected, l1.redTicket(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      1, 2, 3, 0
      2, 2, 2, 20
      1, 1, 2, 10
      2, 1, 1, 10
      1, 2, 1, 10
      3, 2, 1, 0
      0, 0, 0, 20
      2, 0, 0, 10
      0, 9, 10, 0
      0, 10, 0, 10
      9, 9, 9, 20
           9, 0, 9, 10
      """)
  void greenTicket(int a, int b, int c, int expected) {
    assertEquals(expected, l1.greenTicket(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      9, 1, 0, 10
      9, 2, 0, 0
      6, 1, 4, 10
      6, 1, 5, 0
      10, 0, 0, 10
      15, 0, 5, 5
      5, 15, 5, 10
      4, 11, 1, 5
      13, 2, 3, 5
      8, 4, 3, 0
      8, 4, 2, 10
           8, 4, 1, 0
      """)
  void blueTicket(int a, int b, int c, int expected) {
    assertEquals(expected, l1.blueTicket(a, b, c));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      12, 23, true
      12, 43, false
      12, 44, false
      23, 12, true
      23, 39, true
      23, 19, false
      30, 90, true
      30, 91, false
      55, 55, true
      55, 44, false
      """)
  void shareDigit(int a, int b, boolean expected) {
    assertEquals(expected, l1.shareDigit(a, b));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      2, 3, 5
      8, 3, 8
      8, 1, 9
      11, 39, 50
      11, 99, 11
      0, 0, 0
      99, 0, 99
      99, 1, 99
      123, 1, 124
      1, 123, 1
      23, 60, 83
      23, 80, 23
      9000, 1, 9001
      90000000, 1, 90000001
      9000, 1000, 9000
      """)
  void sumLimit(int a, int b, int expected) {
    assertEquals(expected, l1.sumLimit(a, b));
  }
}
