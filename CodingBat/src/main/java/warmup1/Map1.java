package warmup1;

import java.util.Map;

/**
 * Basic Map get()/put(), no loops. These can be solved with just get(), put(), and containsKey().
 * No loops required.
 */
public interface Map1 {

  /**
   * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have
   * that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the
   * value and replacing it with the empty string.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}}
   * <p>
   * {@code mapBully({"a": "candy"}) → {"a": "", "b": "candy"}}
   * <p>
   * {@code mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c":
   * "meh"}}
   */
  Map<String, String> mapBully(Map<String, String> map);

  /**
   * Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have
   * that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}}
   * <p>
   * {@code mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}}
   * <p>
   * {@code mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}}
   */
  Map<String, String> mapShare(Map<String, String> map);

  /**
   * Modify and return the given map as follows: for this problem the map may or may not contain the
   * "a" and "b" keys. If both keys are present, append their 2 string values together and store the
   * result under the key "ab".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}}
   * <p>
   * {@code mapAB({"a": "Hi"}) → {"a": "Hi"} mapAB({"b": "There"}) → {"b": "There"}}
   */
  Map<String, String> mapAB(Map<String, String> map);

  /**
   * Given a map of food keys and topping values, modify and return the map as follows: if the key
   * "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have
   * the value "butter".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}}
   * <p>
   * {@code topping1({}) → {"bread": "butter"}}
   * <p>
   * {@code topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}}
   */
  Map<String, String> topping1(Map<String, String> map);

  /**
   * Given a map of food keys and their topping values, modify and return the map as follows: if the
   * key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key
   * "spinach" has a value, change that value to "nuts".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}}
   * <p>
   * {@code topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach":
   * "nuts", "ice cream": "cherry"}}
   * <p>
   * {@code topping2({"yogurt": "salt"}) → {"yogurt": "salt"}}
   */
  Map<String, String> topping2(Map<String, String> map);

  /**
   * Given a map of food keys and topping values, modify and return the map as follows: if the key
   * "potato" has a value, set that as the value for the key "fries". If the key "salad" has a
   * value, set that as the value for the key "spinach".
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code topping3({"potato": "ketchup"}) → {"potato": "ketchup", "fries": "ketchup"}}
   * <p>
   * {@code topping3({"potato": "butter"}) → {"potato": "butter", "fries": "butter"}}
   * <p>
   * {@code topping3({"salad": "oil", "potato": "ketchup"}) → {"spinach": "oil", "salad": "oil",
   * "potato": "ketchup", "fries": "ketchup"}}
   */
  Map<String, String> topping3(Map<String, String> map);

  /**
   * Modify and return the given map as follows: if the keys "a" and "b" are both in the map and
   * have equal values, remove them both.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}}
   * <p>
   * {@code mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}}
   * <p>
   * {@code mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}}
   */
  Map<String, String> mapAB2(Map<String, String> map);

  /**
   * Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value
   * in the map (but not both), set the other to have that same value in the map.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapAB3({"a": "aaa", "c": "cake"}) → {"a": "aaa", "b": "aaa", "c": "cake"}}
   * <p>
   * {@code mapAB3({"b": "bbb", "c": "cake"}) → {"a": "bbb", "b": "bbb", "c": "cake"}}
   * <p>
   * {@code mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) → {"a": "aaa", "b": "bbb", "c": "cake"}}
   */
  Map<String, String> mapAB3(Map<String, String> map);

  /**
   * Modify and return the given map as follows: if the keys "a" and "b" have values that have
   * different lengths, then set "c" to have the longer value. If the values exist and have the same
   * length, change them both to the empty string in the map.
   * <p>
   * <b>Example:</b>
   * <p>
   * {@code mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}}
   * <p>
   * {@code mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}}
   * <p>
   * {@code mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}}
   */
  Map<String, String> mapAB4(Map<String, String> map);

}
