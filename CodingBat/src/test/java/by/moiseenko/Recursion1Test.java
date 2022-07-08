package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.impl.Recursion1Impl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * Change implementation in init() method to your.
 */
class Recursion1Test {

  private static Recursion1 r1;

  @BeforeAll
  private static void init() {
    r1 = new Recursion1Impl();
  }

  @ParameterizedTest(name = "{index} => factorial value of {0} is {1}")
  @CsvSource(delimiterString = "->", textBlock = """
      1 -> 1
      2 -> 2
      3 -> 6
      4 -> 24
      5 -> 120
      6 -> 720
      7 -> 5040
      8 -> 40320
      12 -> 479001600
      """)
  void factorial(int n, int expected) {
    assertEquals(expected, r1.factorial(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
         0, 0
         1, 2
         2, 4
         3, 6
         4, 8
         5, 10
         12, 24
         50, 100
         234, 468
      """)
  void bunnyEars(int bunnies, int expected) {
    assertEquals(expected, r1.bunnyEars(bunnies));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
        0, 0
      1, 1
      2, 1
      3, 2
      4, 3
      5, 5
      6, 8
      7, 13
        """)
  void fibonacci(int n, int expected) {
    assertEquals(expected, r1.fibonacci(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      0, 0
      1, 2
      2, 5
      3, 7
      4, 10
      5, 12
      6, 15
      10, 25
      """)
  void bunnyEars2(int bunnies, int expected) {
    assertEquals(expected, r1.bunnyEars2(bunnies));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      0, 0
      1, 1
      2, 3
      3, 6
      4, 10
      5, 15
      6, 21
      7, 28
      """)
  void triangle(int rows, int expected) {
    assertEquals(expected, r1.triangle(rows));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      126, 9
      49, 13
      12, 3
      10, 1
      1, 1
      0, 0
      730, 10
      1111, 4
      11111, 5
      10110, 3
      235, 10
      """)
  void sumDigits(int n, int expected) {
    assertEquals(expected, r1.sumDigits(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      717, 2
      7, 1
      123, 0
      77, 2
      7123, 1
      771237, 3
      771737, 4
      47571, 2
      777777, 6
      70701277, 4
      777576197, 5
      99999, 0
      99799, 1
      """)
  void count7(int n, int expected) {
    assertEquals(expected, r1.count7(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      8, 1
      818, 2
      8818, 4
      8088, 4
      123, 0
      81238, 2
      88788, 6
      8234, 1
      2348, 1
      23884, 3
      0, 0
      1818188, 5
      8818181, 5
      1080, 1
      188, 3
      88888, 9
      9898, 2
      78, 1
      """)
  void count8(int n, int expected) {
    assertEquals(expected, r1.count8(n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      3, 1, 3
      3, 2, 9
      3, 3, 27
      2, 1, 2
      2, 2, 4
      2, 3, 8
      2, 4, 16
      2, 5, 32
      10, 1, 10
      10, 2, 100
      10, 3, 1000
      """)
  void powerN(int base, int n, int expected) {
    assertEquals(expected, r1.powerN(base, n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xxhixx, 4
      xhixhix, 3
      hi, 0
      h, 0
      x, 1
      '', 0
      hihi, 0
      hiAAhi12hi, 0
      """)
  void countX(String str, int expected) {
    assertEquals(expected, r1.countX(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xxhixx, 1
      xhixhix, 2
      hi, 1
      hihih, 2
      h, 0
      '', 0
      ihihihihih, 4
      ihihihihihi, 5
      hiAAhi12hi, 3
      xhixhxihihhhih, 3
      ship, 1
      """)
  void countHi(String str, int expected) {
    assertEquals(expected, r1.countHi(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      codex, codey
      xxhixx, yyhiyy
      xhixhix, yhiyhiy
      hiy, hiy
      h, h
      x, y
      '',''
      xxx, yyy
      yyhxyi, yyhyyi
      hihi, hihi
      """)
  void changeXY(String str, String expected) {
    assertEquals(expected, r1.changeXY(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xpix, x3.14x
      pipi, 3.143.14
      pip, 3.14p
      pi, 3.14
      hip, hip
      p, p
      x, x
      '',''
      pixx, 3.14xx
      xyzzy, xyzzy
      """)
  void changePi(String str, String expected) {
    assertEquals(expected, r1.changePi(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xaxb, ab
      abc, abc
      xx,''
      '',''
      axxbxx, ab
      Hellox, Hello
      """)
  void noX(String str, String expected) {
    assertEquals(expected, r1.noX(str));
  }


  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion1TestDataProvider#array6DataProvider")
  void array6(int[] nums, int index, boolean expected) {
    assertEquals(expected, r1.array6(nums, index));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion1TestDataProvider#array11DataProvider")
  void array11(int[] nums, int index, int expected) {
    assertEquals(expected, r1.array11(nums, index));
  }

  @ParameterizedTest
  @MethodSource("by.moiseenko.dataprovider.Recursion1TestDataProvider#array220DataProvider")
  void array220(int[] nums, int index, boolean expected) {
    assertEquals(expected, r1.array220(nums, index));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      hello, h*e*l*l*o
      abc, a*b*c
      ab, a*b
      a, a
      '', ''
      3.14, 3*.*1*4
      Chocolate, C*h*o*c*o*l*a*t*e
      1234, 1*2*3*4
      """)
  void allStar(String str, String expected) {
    assertEquals(expected, r1.allStar(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      hello, hel*lo
      xxyy, x*xy*y
      aaaa, a*a*a*a
      aaab, a*a*ab
      aa, a*a
      a, a
      '', ''
      noadjacent, noadjacent
      abba, ab*ba
      abbba, ab*b*ba
      """)
  void pairStar(String str, String expected) {
    assertEquals(expected, r1.pairStar(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xxre, rexx
      xxhixx, hixxxx
      xhixhix, hihixxx
      hiy, hiy
      h, h
      x, x
      xx, xx
      '', ''
      bxx, bxx
      bxax, baxx
      axaxax, aaaxxx
      xxhxi, hixxx
      """)
  void endX(String str, String expected) {
    assertEquals(expected, r1.endX(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      axa, 1
      axax, 2
      axbx, 1
      hi, 0
      hihih, 3
      ihihhh, 3
      ihjxhh, 0
      '', 0
      a, 0
      aa, 0
      aaa, 1
      """)
  void countPairs(String str, int expected) {
    assertEquals(expected, r1.countPairs(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      abc, 1
      abcxxabc, 2
      abaxxaba, 2
      ababc, 2
      abxbc, 0
      aaabc, 1
      hello, 0
      '', 0
      ab, 0
      aba, 1
      aca, 0
      aaa, 0
      """)
  void countAbc(String str, int expected) {
    assertEquals(expected, r1.countAbc(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      11abc11, 2
      abc11x11x11, 3
      111, 1
      1111, 2
      1, 0
      '', 0
      hi, 0
      11x111x1111, 4
      1x111, 1
      1Hello1, 0
      Hello, 0
      """)
  void count11(String str, int expected) {
    assertEquals(expected, r1.count11(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      yyzzza, yza
      abbbcdd, abcd
      Hello, Helo
      XXabcYY, XabcY
      112ab445, 12ab45
      Hello Bookkeeper, Helo Bokeper
      """)
  void stringClean(String str, String expected) {
    assertEquals(expected, r1.stringClean(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      ahixhi, 1
      ahibhi, 2
      xhixhi, 0
      hixhi, 1
      hixhhi, 2
      hihihi, 3
      hihihix, 3
      xhihihix, 2
      xxhi, 0
      hixxhi, 1
      hi, 1
      xxxx, 0
      h, 0
      x, 0
      '', 0
      Hellohi, 1
      """)
  void countHi2(String str, int expected) {
    assertEquals(expected, r1.countHi2(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      xyz(abc)123, (abc)
      x(hello), (hello)
      (xy)1, (xy)
      not really (possible), (possible)
      (abc), (abc)
      (abc)xyz, (abc)
      (abc)x, (abc)
      (x), (x)
      (), ()
      res (ipsa) loquitor, (ipsa)
      hello(not really)there, (not really)
      ab(ab)ab,(ab)
      """)
  void parenBit(String str, String expected) {
    assertEquals(expected, r1.parenBit(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      (()),true
      ((())),true
      (((x)),false
      ((()),false
      ((()(),false
      (),true
      '', true
      (yy), false
      (()), true
      (((y)), false
      ((y))), false
      ((())), true
      (()))), false
      ((yy()))), false
      (((()))), true
      """)
  void nestParen(String str, boolean expected) {
    assertEquals(expected, r1.nestParen(str));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      catcowcat, cat, 2
      catcowcat, cow, 1
      catcowcat, dog, 0
      cacatcowcat, cat, 2
      xyx, x, 2
      iiiijj, i, 4
      iiiijj, ii, 2
      iiiijj, iii, 1
      iiiijj, j, 2
      iiiijj, jj, 1
      aaabababab, ab, 4
      aaabababab, aa, 1
      aaabababab, a, 6
      aaabababab, b, 4
      """)
  void strCount(String str, String sub, int expected) {
    assertEquals(expected, r1.strCount(str, sub));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      catcowcat, cat, 2, true
      catcowcat, cow, 2, false
      catcowcat, cow, 1, true
      iiijjj, i, 3, true
      iiijjj, i, 4, false
      iiijjj, ii, 2, true
      iiijjj, ii, 3, false
      iiijjj, x, 3, false
      iiijjj, x, 0, true
      iiiiij, iii, 3, true
      iiiiij, iii, 4, false
      ijiiiiij, iiii, 2, true
      ijiiiiij, iiii, 3, false
      dogcatdogcat, dog, 2, true
      """)
  void strCopies(String str, String sub, int n, boolean expected) {
    assertEquals(expected, r1.strCopies(str, sub, n));
  }

  @ParameterizedTest
  @CsvSource(delimiter = ',', textBlock = """
      catcowcat, cat, 9
      catcowcat, cow, 3
      cccatcowcatxx, cat, 9
      abccatcowcatcatxyz, cat, 12
      xyx, x, 3
      xyx, y, 1
      xyx, z, 0
      z, z, 1
      x, z, 0
      '', z, 0
      hiHellohihihi, hi, 13
      hiHellohihihi, hih, 5
      hiHellohihihi, o, 1
      hiHellohihihi, ll, 2
      """)
  void strDist(String str, String sub, int expected) {
    assertEquals(expected, r1.strDist(str, sub));
  }
}