package by.moiseenko.impl;

import by.moiseenko.Array1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * My Implementation of Array1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Array1Impl implements Array1 {

  @Override
  public boolean firstLast6(int[] nums) {
    return nums[0] == 6 || nums[nums.length - 1] == 6;
  }

  @Override
  public boolean sameFirstLast(int[] nums) {
    return nums.length > 0 && nums[0] == nums[nums.length - 1];
  }

  @Override
  public int[] makePi() {
    int pi = (int) (Math.PI * 100);
    return new int[]{pi / 100, (pi / 10) % 10, pi % 10};
  }

  @Override
  public boolean commonEnd(int[] a, int[] b) {
    return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
  }

  @Override
  public int sum3(int[] nums) {
    return Arrays.stream(nums).sum();
  }

  @Override
  public int[] rotateLeft3(int[] nums) {
    int fElement = nums[0];
    System.arraycopy(nums, 1, nums, 0, nums.length - 1);
    nums[nums.length - 1] = fElement;
    return nums;
  }

  @Override
  public int[] reverse3(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;
    return nums;
  }

  @Override
  public int[] maxEnd3(int[] nums) {
    return Arrays.stream(nums).map(n -> Math.max(nums[0], nums[nums.length - 1])).toArray();
  }

  @Override
  public int sum2(int[] nums) {
    return Arrays.stream(nums).limit(2).sum();
  }

  @Override
  public int[] middleWay(int[] a, int[] b) {
    return new int[]{a[a.length / 2], b[b.length / 2]};
  }

  @Override
  public int[] makeEnds(int[] nums) {
    return new int[]{nums[0], nums[nums.length - 1]};
  }

  @Override
  public boolean has23(int[] nums) {
    return Arrays.stream(nums).anyMatch(n -> n == 2 || n == 3);
  }

  @Override
  public boolean no23(int[] nums) {
    return Arrays.stream(nums).noneMatch(n -> n == 2 || n == 3);
  }

  @Override
  public int[] makeLast(int[] nums) {
    int[] result = new int[nums.length * 2];
    result[result.length - 1] = nums[nums.length - 1];
    return result;
  }

  @Override
  public boolean double23(int[] nums) {
    return Arrays.stream(nums).filter(n -> n == 2).count() == 2
        || Arrays.stream(nums).filter(n -> n == 3).count() == 2;

  }

  @Override
  public int[] fix23(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 2 && nums[i + 1] == 3) {
        nums[i + 1] = 0;
      }
    }
    return nums;
  }

  @Override
  public int start1(int[] a, int[] b) {
    int a1 = (a.length > 0 && a[0] == 1) ? 1 : 0;
    int b1 = (b.length > 0 && b[0] == 1) ? 1 : 0;
    return a1 + b1;
  }

  @Override
  public int[] biggerTwo(int[] a, int[] b) {
    return (Arrays.stream(a).sum() >= Arrays.stream(b).sum()) ? a : b;
  }

  @Override
  public int[] makeMiddle(int[] nums) {
    return new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
  }

  @Override
  public int[] plusTwo(int[] a, int[] b) {
    return new int[]{a[0], a[1], b[0], b[1]};
  }

  @Override
  public int[] swapEnds(int[] nums) {
    int temp = nums[0];
    nums[0] = nums[nums.length - 1];
    nums[nums.length - 1] = temp;
    return nums;
  }

  @Override
  public int[] midThree(int[] nums) {
    return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2], nums[nums.length / 2 + 1]};
  }

  @Override
  public int maxTriple(int[] nums) {
    return Arrays.stream(new int[]{nums[0], nums[nums.length / 2], nums[nums.length - 1]}).max()
        .orElse(0);
  }

  @Override
  public int[] frontPiece(int[] nums) {
    return Arrays.stream(nums).limit(2).toArray();
  }

  @Override
  public boolean unlucky1(int[] nums) {
    return (nums.length > 1)
        && (nums[0] == 1 && nums[1] == 3
        || nums[1] == 1 && nums[2] == 3
        || nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
  }

  @Override
  public int[] make2(int[] a, int[] b) {
    List<Integer> arrayA = Arrays.stream(a).boxed().collect(Collectors.toList());
    arrayA.addAll(Arrays.stream(b).boxed().toList());
    return arrayA.stream().limit(2).mapToInt(Integer::intValue).toArray();
  }

  @Override
  public int[] front11(int[] a, int[] b) {
    List<Integer> list = Arrays.stream(a).boxed().limit(1).collect(Collectors.toList());
    list.addAll(Arrays.stream(b).boxed().limit(1).toList());
    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}
