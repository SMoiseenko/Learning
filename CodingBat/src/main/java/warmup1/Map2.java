package warmup1;

import java.util.Map;

/**
 * Maps with bulk data and loops.
 */
public interface Map2 {

  /**
   * Given an array of strings, return a Map<String, Integer> containing a key for every different
   * string in the array, always with the value 0. For example the string "hello" makes the pair
   * "hello":0. We'll do more complicated counting later, but for this problem the value is simply
   * 0.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}}
   * <p>
   * {@code word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}}
   * <p>
   * {@code word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}}
   */
  Map<String, Integer> word0(String[] strings);

  /**
   * Given an array of strings, return a Map<String, Integer> containing a key for every different
   * string in the array, and the value is that string's length.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}}
   * <p>
   * {@code wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}}
   * <p>
   * {@code wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}}
   */
  Map<String, Integer> wordLen(String[] strings);

  /**
   * Given an array of non-empty strings, create and return a Map<String, String> as follows: for
   * each string add its first character as a key with its last character as the value.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code pairs(["code", "bug"]) → {"b": "g", "c": "e"}}
   * <p>
   * {@code pairs(["man", "moon", "main"]) → {"m": "n"}}
   * <p>
   * {@code pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}}
   */
  Map<String, String> pairs(String[] strings);

  /**
   * The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with
   * a key for each different string, with the value the number of times that string appears in the
   * array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}}
   * <p>
   * {@code wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}}
   * <p>
   * {@code wordCount(["c", "c", "c", "c"]) → {"c": 4}}
   */
  Map<String, Integer> wordCount(String[] strings);

  /**
   * Given an array of non-empty strings, return a Map<String, String> with a key for every
   * different first character seen, with the value of all the strings starting with that character
   * appended together in the order they appear in the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}}
   * <p>
   * {@code firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c":
   * "cccCC", "d": "d"}}
   * <p>
   * {@code firstChar([]) → {}}
   */
  Map<String, String> firstChar(String[] strings);

  /**
   * Loop over the given array of strings to build a result string like this: when a string appears
   * the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty
   * string if no string appears a 2nd time.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code wordAppend(["a", "b", "a"]) → "a"}
   * <p>
   * {@code wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"}
   * <p>
   * {@code wordAppend(["a", "", "a"]) → "a"}
   */
  String wordAppend(String[] strings);

  /**
   * Given an array of strings, return a Map<String, Boolean> where each different string is a key
   * and its value is true if that string appears 2 or more times in the array.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}}
   * <p>
   * {@code wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}}
   * <p>
   * {@code wordMultiple(["c", "c", "c", "c"]) → {"c": true}}
   */
  Map<String, Boolean> wordMultiple(String[] strings);

  /**
   * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop
   * over and then return the given array of non-empty strings as follows: if a string matches an
   * earlier string in the array, swap the 2 strings in the array. When a position in the array has
   * been swapped, it no longer matches anything. Using a map, this can be solved making just one
   * pass over the array. More difficult than it looks.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code allSwap(["ab", "ac"]) → ["ac", "ab"]}
   * <p>
   * {@code allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx",
   * "bx", "ax", "azz", "aaa"]}
   * <p>
   * {@code allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx",
   * "aj", "ai", "by", "bx"]}
   */
  String[] allSwap(String[] strings);

  /**
   * We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Loop
   * over and then return the given array of non-empty strings as follows: if a string matches an
   * earlier string in the array, swap the 2 strings in the array. A particular first char can only
   * cause 1 swap, so once a char has caused a swap, its later swaps are disabled. Using a map, this
   * can be solved making just one pass over the array. More difficult than it looks.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code firstSwap(["ab", "ac"]) → ["ac", "ab"]}
   * <p>
   * {@code firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx",
   * "bx", "ax", "aaa", "azz"]}
   * <p>
   * {@code firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx",
   * "ai", "aj", "bx", "by"]}
   */
  String[] firstSwap(String[] strings);
}
