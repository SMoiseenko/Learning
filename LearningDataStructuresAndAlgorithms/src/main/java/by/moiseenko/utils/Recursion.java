package by.moiseenko.utils;

public class Recursion {

  public int squareSplit(int width, int height) {
    int max = Math.max(width, height);
    int min = Math.min(width, height);
    int remain = max % min;

    return remain == 0 ? min : squareSplit(remain, min);
  }

  public long factorial(int i) {
    return i == 0 ? 1 : i* factorial(i - 1);
  }

}
