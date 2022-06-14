package by.moiseenko.impl;

import by.moiseenko.Array2;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * My Implementation of Array2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Array2Impl implements Array2 {

  @Override
  public int countEvens(int[] nums) {
    return (int) Arrays.stream(nums).filter(n -> n % 2 == 0).count();
  }

  @Override
  public int bigDiff(int[] nums) {
    Arrays.sort(nums);
    return Math.abs(nums[nums.length - 1] - nums[0]);
  }

  @Override
  public int centeredAverage(int[] nums) {
    return ((int) Arrays.stream(nums).sorted().skip(1).limit(nums.length - 2).average().orElse(0));
  }

  @Override
  public int sum13(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 13) {
        i++;
      } else {
        sum += nums[i];
      }
    }
    return sum;
  }

  @Override
  public int sum67(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 6) {
        while (nums[i] != 7) {
          i++;
        }
      } else {
        sum += nums[i];
      }
    }
    return sum;
  }

  @Override
  public boolean has22(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean lucky13(int[] nums) {
    return nums.length - Arrays.stream(nums).filter(n -> n != 1 && n != 3).count() == 0;
  }

  @Override
  public boolean sum28(int[] nums) {
    return Arrays.stream(nums).filter(n -> n == 2).sum() == 8;
  }

  @Override
  public boolean more14(int[] nums) {
    return Arrays.stream(nums).filter(n -> n == 1).count() > Arrays.stream(nums).filter(n -> n == 4)
        .count();
  }

  @Override
  public int[] fizzArray(int n) {
    return IntStream.rangeClosed(0, n - 1).toArray();
  }

  @Override
  public boolean only14(int[] nums) {
    return Arrays.stream(nums).filter(n -> n != 1 && n != 4).count() == 0;
  }

  @Override
  public String[] fizzArray2(int n) {
    return IntStream.rangeClosed(0, n - 1).boxed().map(String::valueOf).toArray(String[]::new);
  }

  @Override
  public boolean no14(int[] nums) {
    return Arrays.stream(nums).distinct().filter(n -> n == 1 || n == 4).count() != 2;
  }

  @Override
  public boolean isEverywhere(int[] nums, int val) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != val && nums[i + 1] != val) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean either24(int[] nums) {
    boolean hasTwo = false;
    boolean hasFour = false;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 2) {
        hasTwo = true;
      }
      if (nums[i] == 4 && nums[i + 1] == 4) {
        hasFour = true;
      }
    }

    return hasTwo ^ hasFour;
  }

  @Override
  public int matchUp(int[] nums1, int[] nums2) {
    return (int) IntStream.range(0, nums1.length)
        .filter(i -> Math.abs(nums1[i] - nums2[i]) <= 2 && nums1[i] != nums2[i]).count();
  }

  @Override
  public boolean has77(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 7 && nums[i + 1] == 7
          || nums[i + 2] == 7 && nums[i + 1] == 7
          || nums[i] == 7 && nums[i + 2] == 7) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean has12(int[] nums) {
    boolean has1 = false;
    boolean has2 = false;
    for (int num : nums) {
      if (num == 1) {
        has1 = true;
      }
      if (has1 && num == 2) {
        has2 = true;
      }
    }
    return has1 & has2;
  }

  @Override
  public boolean modThree(int[] nums) {
    return false;
  }

  @Override
  public boolean haveThree(int[] nums) {
    return false;
  }

  @Override
  public boolean twoTwo(int[] nums) {
    return false;
  }

  @Override
  public boolean sameEnds(int[] nums, int len) {
    return false;
  }

  @Override
  public boolean tripleUp(int[] nums) {
    return false;
  }

  @Override
  public int[] fizzArray3(int start, int end) {
    return new int[0];
  }

  @Override
  public int[] shiftLeft(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] tenRun(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] pre4(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] post4(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] notAlone(int[] nums, int val) {
    return new int[0];
  }

  @Override
  public int[] zeroFront(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] withoutTen(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] zeroMax(int[] nums) {
    return new int[0];
  }

  @Override
  public int[] evenOdd(int[] nums) {
    return new int[0];
  }

  @Override
  public String[] fizzBuzz(int start, int end) {
    return new String[0];
  }
}
