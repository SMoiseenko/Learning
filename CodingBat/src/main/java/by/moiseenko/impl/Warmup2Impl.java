package by.moiseenko.impl;

import by.moiseenko.Warmup2;

/**
 * My Implementation of Warmup2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Warmup2Impl implements Warmup2 {

  @Override
  public String stringTimes(String str, int n) {
    return new String(new char[n]).replace("\0", str);
  }

  @Override
  public String frontTimes(String str, int n) {
    String substring = (str.length() > 2) ? str.substring(0, 3) : str;
    String result = "";
    for (int i = 0; i < n; i++) {
      result = result + substring;
    }
    return result;
  }

  @Override
  public int countXX(String str) {
    int result = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x' && i + 1 < str.length() && str.charAt(i + 1) == 'x') {
        result++;
      }
    }
    return result;
  }

  @Override
  public boolean doubleX(String str) {
    boolean result = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'x') {
        if (i + 1 < str.length() && str.charAt(i + 1) != 'x') {
          return false;
        }
        result = false;
        while (i + 1 < str.length() && str.charAt(i + 1) == 'x') {
          i++;
          result = true;
        }
      }
    }
    return result;
  }

  @Override
  public String stringBits(String str) {
    char[] arr = new char[(str.length() + 1) / 2];
    for (int i = 0, k = 0; i < str.length(); i += 2, k++) {
      arr[k] = str.charAt(i);
    }
    return new String(arr);
  }

  @Override
  public String stringSplosion(String str) {
    String result = "";
    for (int i = 1; i <= str.length(); i++) {
      result += str.substring(0, i);
    }
    return result;
  }

  @Override
  public int last2(String str) {
    if (str.length() < 3) {
      return 0;
    }
    int result = 0;
    String last2char = str.substring(str.length() - 2);
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 2).equals(last2char)) {
        result++;
      }
    }
    return result;
  }

  @Override
  public int arrayCount9(int[] nums) {
    int result = 0;
    for (int num : nums) {
      if (num == 9) {
        result++;
      }
    }
    return result;
  }

  @Override
  public boolean arrayFront9(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i > 3) {
        break;
      }
      if (nums[i] == 9) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int stringMatch(String a, String b) {
    int result = 0;
    for (int i = 0; i < Math.min(a.length(), b.length()) - 1; i++) {
      if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
        result++;
      }
    }
    return result;
  }

  @Override
  public String stringX(String str) {
    return (str.length() > 3) ?
        str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(
            str.length() - 1) : str;
  }

  @Override
  public String altPairs(String str) {
    String result = "";
    for (int i = 0, k = 0; i < str.length(); i++, k++) {
      result = result + str.charAt(i);
      if (k == 1) {
        i += 2;
        k = -1;
      }
    }
    return result;
  }

  @Override
  public String stringYak(String str) {
    return str.replaceAll("y.k", "");
  }

  @Override
  public int array667(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
        result++;
      }
    }
    return result;
  }

  @Override
  public boolean noTriples(int[] nums) {
    for (int i = 0; i <= nums.length - 3; i++) {
      if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean has271(int[] nums) {
    //2 [-1:3]  2 3     2 -1
    for (int i = 0; i <= nums.length - 3; i++) {
      if (nums[i] == nums[i + 1] - 5 && nums[i] >= nums[i + 2] - 1 && nums[i] <= nums[i + 2] + 3) {
        return true;
      }
    }
    return false;
  }
}
