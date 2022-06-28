package by.moiseenko.impl;

import by.moiseenko.Array3;
import java.util.Arrays;

/**
 * My Implementation of Array3 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Array3Impl implements Array3 {

  @Override
  public int maxSpan(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int result = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      for (int k = i + 1; k < nums.length; k++) {
        if (nums[i] == nums[k]) {
          result = Math.max(result, k - i + 1);
        }
      }
    }
    return result;
  }

  @Override
  public int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 3) {
        if (nums[i + 1] != 4) {
          int iTemp = i;
          while (nums[i] != 4) {
            i++;
          }
          nums[i] = nums[iTemp + 1];
          nums[iTemp + 1] = 4;
          i = iTemp;
        }
        i++;
      } else if (nums[i] == 4) {
        int iTemp = i;
        for (; i < nums.length; i++) {
          if (nums[i] == 3 && nums[i + 1] != 4) {
            break;
          }
        }
        nums[iTemp] = nums[i + 1];
        nums[i + 1] = 4;
        i = iTemp;
      }
    }
    return nums;
  }

  @Override
  public int[] fix45(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        if (nums[i + 1] != 5) {
          int iTemp = i;
          while (nums[i] != 5) {
            i++;
          }
          nums[i] = nums[iTemp + 1];
          nums[iTemp + 1] = 5;
          i = iTemp;
        }
        i++;
      } else if (nums[i] == 5) {
        int iTemp = i;
        for (; i < nums.length; i++) {
          if (nums[i] == 4 && nums[i + 1] != 5) {
            break;
          }
        }
        nums[iTemp] = nums[i + 1];
        nums[i + 1] = 5;
        i = iTemp;
      }
    }
    return nums;
  }

  @Override
  public boolean canBalance(int[] nums) {
    if (nums.length < 2) {
      return false;
    }
    for (int i = 1; i <= nums.length; i++) {
      if (Arrays.stream(nums).limit(i).sum() == Arrays.stream(nums).skip(i).sum()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean linearIn(int[] outer, int[] inner) {
    int outerIndex = 0;
    for (int j : inner) {
      while (outer[outerIndex] != j) {
        outerIndex++;
        if (outerIndex >= outer.length) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public int[] squareUp(int n) {
    int[] result = new int[n * n];
    int counter = 0;
    for (int i = 1; i <= n; i++) {
      for (int k = n; k >= 1; k--) {
        result[counter++] = ((i - k) >= 0) ? k : 0;
      }
    }
    return result;
  }

  @Override
  public int[] seriesUp(int n) {
    int[] result = new int[n * (n + 1) / 2];
    int counter = 0;
    for (int i = 1; i <= n; i++) {
      for (int k = 1; k <= i; k++) {
        result[counter++] = k;
      }
    }
    return result;
  }

  @Override
  public int maxMirror(int[] nums) {
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = nums.length - 1; j >= 0; j--) {
        if (nums[i] == nums[j]) {
          int tempCounter = 0;
          int tempI = i;
          int tempJ = j;
          while (i < nums.length && j >= 0 && nums[i] == nums[j]) {
            tempCounter++;
            i++;
            j--;
          }
          counter = Math.max(counter, tempCounter);
          i = tempI;
          j = tempJ;
        }
      }
    }
    return counter;
  }

  @Override
  public int countClumps(int[] nums) {
    int counter = 0;
    boolean hasSeries = false;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        if (!hasSeries) {
          counter++;
          hasSeries = true;
        }
      } else {
        hasSeries = false;
      }
    }
    return counter;
  }
}
