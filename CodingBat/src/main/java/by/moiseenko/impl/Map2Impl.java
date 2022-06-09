package by.moiseenko.impl;

import by.moiseenko.Map2;
import java.util.HashMap;
import java.util.Map;

/**
 * My Implementation of Map2 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Map2Impl implements Map2 {

  @Override
  public Map<String, Integer> word0(String[] strings) {
    Map<String, Integer> result = new HashMap<>();
    for (String s : strings) {
      result.put(s, 0);
    }
    return result;
  }

  @Override
  public Map<String, Integer> wordLen(String[] strings) {
    Map<String, Integer> result = new HashMap<>();
    for (String string : strings) {
      result.put(string, string.length());
    }
    return result;
  }

  @Override
  public Map<String, String> pairs(String[] strings) {
    Map<String, String> result = new HashMap<>();
    for (String string : strings) {
      result.put(string.substring(0, 1), string.substring(string.length() - 1));
    }
    return result;
  }

  @Override
  public Map<String, Integer> wordCount(String[] strings) {
    Map<String, Integer> result = new HashMap<>();
    for (String string : strings) {
      if (result.containsKey(string)) {
        result.put(string, result.get(string) + 1);
      } else {
        result.put(string, 1);
      }
    }
    return result;
  }

  @Override
  public Map<String, String> firstChar(String[] strings) {
    Map<String, String> result = new HashMap<>();
    for (String string : strings) {
      if (result.containsKey(string.substring(0, 1))) {
        result.put(string.substring(0, 1), result.get(string.substring(0, 1)).concat(string));
      } else {
        result.put(string.substring(0, 1), string);
      }
    }
    return result;
  }

  @Override
  public String wordAppend(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String result = "";
    for (String string : strings) {
      if (map.containsKey(string)) {
        result = result.concat(string);
        map.remove(string);
      } else {
        map.put(string, 1);
      }
    }
    return result;
  }

  @Override
  public Map<String, Boolean> wordMultiple(String[] strings) {
    Map<String, Boolean> result = new HashMap<>();
    for (String string : strings) {
      if (result.containsKey(string)) {
        result.put(string, true);
      } else {
        result.put(string, false);
      }
    }
    return result;
  }

  @Override
  public String[] allSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String temp;
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i].substring(0, 1))) {

        temp = strings[map.get(strings[i].substring(0, 1))];
        strings[map.get(strings[i].substring(0, 1))] = strings[i];
        strings[i] = temp;

        map.remove(strings[i].substring(0, 1));
      } else {
        map.put(strings[i].substring(0, 1), i);
      }
    }
    return strings;
  }

  @Override
  public String[] firstSwap(String[] strings) {
    Map<String, Integer> map = new HashMap<>();
    String temp;
    for (int i = 0; i < strings.length; i++) {
      if (map.containsKey(strings[i].substring(0, 1))) {

        if (map.get(strings[i].substring(0, 1)) != -1) {
          temp = strings[map.get(strings[i].substring(0, 1))];
          strings[map.get(strings[i].substring(0, 1))] = strings[i];
          strings[i] = temp;
        }
        map.put(strings[i].substring(0, 1), -1);
      } else {
        map.put(strings[i].substring(0, 1), i);
      }
    }
    return strings;
  }
}
