package warmup1.impl;

import java.util.List;
import java.util.stream.Collectors;
import warmup1.Functional1;

/**
 * My Implementation of Functional1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Functional1Impl implements Functional1 {

  @Override
  public List<Integer> doubling(List<Integer> nums) {
    return nums.stream().map(x -> x * 2).collect(Collectors.toList());
  }

  @Override
  public List<Integer> square(List<Integer> nums) {
    return
        nums.stream().
            map(x -> x * x).collect(Collectors.toList());
  }

  @Override
  public List<String> addStar(List<String> strings) {
    return
        strings.stream().
            map(s -> s.concat("*")).
            collect(Collectors.toList());
  }

  @Override
  public List<String> copies3(List<String> strings) {
    return
        strings.stream().
            map(x -> x.concat(x).concat(x)).
            collect(Collectors.toList());
  }

  @Override
  public List<String> moreY(List<String> strings) {
    return
        strings.stream().
            map(s -> "y".concat(s).concat("y")).
            collect(Collectors.toList());
  }

  @Override
  public List<Integer> math1(List<Integer> nums) {
    return
        nums.stream().
            map(n -> (n + 1) * 10).
            collect(Collectors.toList());
  }


  @Override
  public List<Integer> rightDigit(List<Integer> nums) {
    return
        nums.stream().
            map(n -> n % 10).
            collect(Collectors.toList());
  }

  @Override
  public List<String> lower(List<String> strings) {
    return
        strings.stream().
            map(String::toLowerCase).
            collect(Collectors.toList());
  }

  @Override
  public List<String> noX(List<String> strings) {
    return
        strings.stream().
            map(s -> s.replace("x", "")).
            collect(Collectors.toList());
  }
}
