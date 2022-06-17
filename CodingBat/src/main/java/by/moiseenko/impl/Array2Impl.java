package by.moiseenko.impl;

import by.moiseenko.Array2;
import java.util.Arrays;
import java.util.Comparator;
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
    for (int i = 0; i < nums.length - 2; i++) {
      if ((nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0)
          || (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean haveThree(int[] nums) {
    int counter3 = 0;
    boolean is3 = false;
    for (int num : nums) {
      if (num == 3) {
        if (is3) {
          return false;
        } else if (counter3 < 4) {
          counter3++;
          is3 = true;
        } else {
          return false;
        }
      } else {
        is3 = false;
      }
    }
    return counter3 == 3;
  }

  @Override
  public boolean twoTwo(int[] nums) {
    if (nums.length == 0) {
      return true;
    }
    if (nums.length == 1) {
      return nums[0] != 2;
    }
    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] == 2) {
        if (!(nums[i - 1] == 2 || nums[i + 1] == 2)) {
          return false;
        }
      }
    }
    return nums[nums.length - 1] != 2 || (nums[nums.length - 1] == 2 && nums[nums.length - 2] == 2);
  }

  @Override
  public boolean sameEnds(int[] nums, int len) {
    for (int i = 0; i < len; i++) {
      if (nums[i] != nums[nums.length - len + i]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean tripleUp(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int[] fizzArray3(int start, int end) {
    return IntStream.range(start, end).toArray();
  }

  @Override
  public int[] shiftLeft(int[] nums) {
    if (nums.length < 2) {
      return nums;
    }
    int firstDigit = nums[0];
    System.arraycopy(nums, 1, nums, 0, nums.length - 1);
    nums[nums.length - 1] = firstDigit;
    return nums;
  }

  @Override
  public int[] tenRun(int[] nums) {
    int multiplied10 = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 10 == 0) {
        multiplied10 = nums[i];
      }
      if (multiplied10 != -1) {
        nums[i] = multiplied10;
      }
    }
    return nums;
  }

  @Override
  public int[] pre4(int[] nums) {
    int index4 = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        index4 = i;
        break;
      }
    }
    int[] result = new int[index4];
    System.arraycopy(nums, 0, result, 0, result.length);
    return result;
  }

  @Override
  public int[] post4(int[] nums) {
    int index4 = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 4) {
        index4 = i;
      }
    }
    int[] result = new int[nums.length - index4 - 1];
    System.arraycopy(nums, index4 + 1, result, 0, result.length);
    return result;
  }

  @Override
  public int[] notAlone(int[] nums, int val) {
    for (int i = 1; i < nums.length - 1; i++) {
      if (nums[i] == val && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
        nums[i] = Math.max(nums[i - 1], nums[i + 1]);
      }
    }
    return nums;
  }

  @Override
  public int[] zeroFront(int[] nums) {
    return Arrays.stream(nums).boxed().sorted(Comparator.comparingInt(Math::abs)).mapToInt(i -> i)
        .toArray();
  }

  @Override
  public int[] withoutTen(int[] nums) {
    int[] resul = new int[nums.length];
    int[] without10 = Arrays.stream(nums).filter(i -> i != 10).toArray();
    System.arraycopy(without10, 0, resul, 0, without10.length);
    return resul;
  }

  @Override
  public int[] zeroMax(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        int maxRight = 0;
        for (int j = i; j < nums.length; j++) {
          if (nums[j] % 2 != 0) {
            maxRight = Math.max(maxRight, nums[j]);
          }
        }
        nums[i] = maxRight;
      }
    }
    return nums;
  }

  @Override
  public int[] evenOdd(int[] nums) {
    int indexLastOdd = -1;
    int temp;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] % 2 != 0) {
        if (indexLastOdd == -1) {
          indexLastOdd = i;
        }
      } else if (indexLastOdd != -1) {
        temp = nums[indexLastOdd];
        nums[indexLastOdd] = nums[i];
        nums[i] = temp;
        i = indexLastOdd; //наоборот?
        indexLastOdd = -1;
      }
    }
    return nums;
  }

  @Override
  public String[] fizzBuzz(int start, int end) {
    String[] result = new String[end - start];
    for (int i = 0; i < result.length; i++) {
      if ((i + start) % 3 == 0 && (i + start) % 5 == 0) {
        result[i] = "FizzBuzz";
      } else if ((i + start) % 5 == 0) {
        result[i] = "Buzz";
      } else if ((i + start) % 3 == 0) {
        result[i] = "Fizz";
      } else {
        result[i] = String.valueOf(i + start);
      }
    }
    return result;
  }
}
