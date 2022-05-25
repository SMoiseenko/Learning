package by.moiseenko.impl;

import by.moiseenko.Functional2;
import java.util.List;
import java.util.stream.Collectors;

/**
 * My Implementation of Functional2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Functional2Impl implements Functional2 {

  @Override
  public List<Integer> noNeg(List<Integer> nums) {
    return nums.stream().filter(s -> s >= 0).collect(Collectors.toList());
  }

  @Override
  public List<Integer> no9(List<Integer> nums) {
    return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
  }

  @Override
  public List<Integer> noTeen(List<Integer> nums) {
    return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
  }

  @Override
  public List<String> noZ(List<String> strings) {
    return strings.stream().filter(s -> !s.contains("z")).collect(Collectors.toList());
  }

  @Override
  public List<String> noLong(List<String> strings) {
    return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
  }

  @Override
  public List<String> no34(List<String> strings) {
    return strings.stream().filter(s -> s.length() != 3 && s.length() != 4)
        .collect(Collectors.toList());
  }

  @Override
  public List<String> noYY(List<String> strings) {
    return strings.stream().map(s -> s.concat("y")).filter(s -> !s.contains("yy"))
        .collect(Collectors.toList());
  }

  @Override
  public List<Integer> two2(List<Integer> nums) {
    return nums.stream().map(n -> n * 2).filter(n -> n % 10 != 2).collect(Collectors.toList());
  }

  @Override
  public List<Integer> square56(List<Integer> nums) {
    return nums.stream().map(n -> n * n + 10).filter(n -> n % 10 != 5 && n % 10 != 6)
        .collect(Collectors.toList());
  }
}
