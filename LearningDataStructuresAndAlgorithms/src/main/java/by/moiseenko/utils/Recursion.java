package by.moiseenko.utils;

import java.util.Arrays;

public class Recursion {

  public int squareSplit(int width, int height) {
    int max = Math.max(width, height);
    int min = Math.min(width, height);
    int remain = max % min;

    return remain == 0 ? min : squareSplit(remain, min);
  }

  public long factorial(int i) {
    return i == 0 ? 1 : i * factorial(i - 1);
  }

  public long sumOfArray(int[] arr) {
    return (arr.length == 1) ? arr[0] : arr[0] + sumOfArray(Arrays.copyOfRange(arr, 1, arr.length));
  }

  public int countOfArray(int[] arr) {
    return (arr.length == 0) ? 0 : 1 + countOfArray(Arrays.copyOfRange(arr, 1, arr.length));
  }

  public int maxOfArray(int[]arr){
    return 0;
    //if a[1] -> a1 max; if a[1,2] -> 1>2?1:2
  }

}
