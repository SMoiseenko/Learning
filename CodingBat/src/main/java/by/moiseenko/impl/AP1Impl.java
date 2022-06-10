package by.moiseenko.impl;

import by.moiseenko.AP1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * My Implementation of AP1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class AP1Impl implements AP1 {

  @Override
  public boolean scoresIncreasing(int[] scores) {
    for (int i = 0; i < scores.length - 1; i++) {
      if (scores[i] > scores[i + 1]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public boolean scores100(int[] scores) {
    for (int i = 0; i < scores.length - 1; i++) {
      if (scores[i] == 100 && scores[i + 1] == 100) {
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean scoresClump(int[] scores) {
    for (int i = 0; i < scores.length - 2; i++) {
      if (scores[i + 2] - scores[i] <= 2) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int scoresAverage(int[] scores) {
    int leftAvrg = 0, rightAvrg = 0;

    for (int i = 0; i < scores.length / 2; i++) {
      leftAvrg += scores[i];
    }
    for (int i = scores.length / 2; i < scores.length; i++) {
      rightAvrg += scores[i];
    }
    return (leftAvrg >= rightAvrg) ? leftAvrg / (scores.length / 2)
        : rightAvrg / (scores.length / 2);
  }

  @Override
  public int wordsCount(String[] words, int len) {
    int counter = 0;
    for (String word : words) {
      if (word.length() == len) {
        counter++;
      }
    }
    return counter;
  }

  @Override
  public String[] wordsFront(String[] words, int n) {
    String[] result = new String[n];
    System.arraycopy(words, 0, result, 0, n);
    return result;
  }

  @Override
  public List<String> wordsWithoutList(String[] words, int len) {
    return Arrays.stream(words).filter(s -> s.length() != len).collect(Collectors.toList());
  }

  @Override
  public boolean hasOne(int n) {
    return String.valueOf(n).contains("1");
  }

  @Override
  public boolean dividesSelf(int n) {
    if (n < 0) {
      return false;
    }
    int tempN = n;
    int lastDigit;
    int length = (int) (Math.log10(n) + 1);
    while (tempN > 0) {
      lastDigit = tempN % 10;
      if (lastDigit == 0 || n % lastDigit != 0) {
        return false;
      }
      tempN /= 10;
    }
    return true;
  }

  @Override
  public int[] copyEvens(int[] nums, int count) {
    return Arrays.stream(nums).filter(n -> n % 2 == 0).limit(count).toArray();
  }

  @Override
  public int[] copyEndy(int[] nums, int count) {
    return Arrays.stream(nums).filter(s -> (s >= 0 && s <= 10) || (s >= 90 && s <= 100))
        .limit(count).toArray();
  }

  @Override
  public int matchUp(String[] a, String[] b) {
    return (int) IntStream.range(0, a.length)
        .filter(i -> !a[i].isEmpty() && !b[i].isEmpty() && a[i].substring(0, 1)
            .equals(b[i].substring(0, 1))).count();
  }

  @Override
  public int scoreUp(String[] key, String[] answers) {
    return IntStream.range(0, key.length).map(i -> {
      if (answers[i].equals("?")) {
        return 0;
      }
      if (answers[i].equals(key[i])) {
        return 4;
      }
      return -1;
    }).sum();
  }

  @Override
  public String[] wordsWithout(String[] words, String target) {
    return Arrays.stream(words).filter(w -> !w.equals(target)).toArray(String[]::new);
  }

  @Override
  public int scoresSpecial(int[] a, int[] b) {
    return Arrays.stream(a).filter(n -> n % 10 == 0).max().orElse(0) +
        Arrays.stream(b).filter(n -> n % 10 == 0).max().orElse(0);
  }

  @Override
  public int sumHeights(int[] heights, int start, int end) {
    return IntStream.range(start, end).map(i -> Math.abs(heights[i] - heights[i + 1])).sum();
  }

  @Override
  public int sumHeights2(int[] heights, int start, int end) {
    return IntStream.range(start, end).map(
        i -> (heights[i + 1] > heights[i]) ? Math.abs(heights[i] - heights[i + 1]) * 2
            : Math.abs(heights[i] - heights[i + 1])).sum();
  }

  @Override
  public int bigHeights(int[] heights, int start, int end) {
    return
        (int) IntStream.range(start, end)
            .map(i -> Math.abs(heights[i] - heights[i + 1]))
            .filter(n -> n >= 5)
            .count();
  }

  @Override
  public int userCompare(String aName, int aId, String bName, int bId) {
    int t1 = aName.compareTo(bName);
    if (t1 > 0) {
      return 1;
    }
    if (t1 < 0) {
      return -1;
    }
    return Integer.compare(aId, bId);
  }

  @Override
  public String[] mergeTwo(String[] a, String[] b, int n) {
    List<String> arrayList = new ArrayList<>();
    Collections.addAll(arrayList, a);
    Collections.addAll(arrayList, b);
    return arrayList.stream().distinct().sorted().limit(n).toArray(String[]::new);
  }

  @Override
  public int commonTwo(String[] a, String[] b) {
    List<String> arrayList = Arrays.stream(a).distinct().collect(Collectors.toList());
    arrayList.addAll(Arrays.stream(b).distinct().toList());
    return arrayList.size() - arrayList.stream().distinct().toArray().length;
  }
}
