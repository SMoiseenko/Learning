package by.moiseenko.impl;

import by.moiseenko.Logic2;
import java.util.Arrays;

/**
 * My Implementation of Logic2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Logic2Impl implements Logic2 {

  @Override
  public boolean makeBricks(int small, int big, int goal) {
    int maxBig = goal / 5;
    return (big >= maxBig)
        ? ((goal - (5 * maxBig)) <= small)
        : ((goal - (5 * big)) <= small);
  }

  @Override
  public int loneSum(int a, int b, int c) {
    if (a == b & b == c) {
      return 0;
    }
    if (a == b) {
      return c;
    }
    if (a == c) {
      return b;
    }
    if (c == b) {
      return a;
    }
    return a + b + c;
  }

  @Override
  public int luckySum(int a, int b, int c) {
    if (a == 13) {
      return 0;
    }
    if (b == 13) {
      return a;
    }
    if (c == 13) {
      return a + b;
    }
    return a + b + c;
  }

  @Override
  public int noTeenSum(int a, int b, int c) {
    return fixTeen(a) + fixTeen(b) + fixTeen(c);
  }

  private int fixTeen(int a) {
    return (a >= 13 && a < 15 || a > 16 && a <= 19) ? 0 : a;
  }

  @Override
  public int roundSum(int a, int b, int c) {
    return round10(a) + round10(b) + round10(c);
  }

  private int round10(int a) {
    return (a % 10 >= 5) ? (a / 10) * 10 + 10 : (a / 10) * 10;
  }

  @Override
  public boolean closeFar(int a, int b, int c) {
    return (Math.abs(b - a) <= 1 && Math.abs(c - b) >= 2 && Math.abs(c - a) >= 2) ||
        (Math.abs(c - a) <= 1 && Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2);
  }

  @Override
  public int blackjack(int a, int b) {
    return Math.max(fix21(a), fix21(b));
  }

  private int fix21(int a) {
    return a > 21 ? 0 : a;
  }

  @Override
  public boolean evenlySpaced(int a, int b, int c) {
    int[] arr = new int[]{a, b, c};
    Arrays.sort(arr);
    return arr[2] - arr[1] == arr[1] - arr[0];
  }

  @Override
  public int makeChocolate(int small, int big, int goal) {
    return (big >= goal / 5)
        ? ((goal - goal / 5 * 5 <= small) ? goal - goal / 5 * 5 : -1)
        : ((goal - big * 5 <= small) ? goal - big * 5 : -1);
  }
}
