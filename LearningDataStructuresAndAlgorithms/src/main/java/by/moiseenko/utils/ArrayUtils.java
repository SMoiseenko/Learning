package by.moiseenko.utils;

import java.util.Arrays;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ArrayUtils {

  public int binarySearch(int[] arr, int a){
    int low, mid, high;
    low = 0; high = arr.length-1;
    while (low<=high) {
      mid = (low+high)/2;
      if (arr[mid]< a){
        low = mid+1;
      } else if (arr[mid]> a){
        high = mid-1;
      } else return mid;
    }
    return -1;
  }

}
