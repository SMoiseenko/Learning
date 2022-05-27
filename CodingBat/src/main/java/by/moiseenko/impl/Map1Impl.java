package by.moiseenko.impl;

import by.moiseenko.Map1;
import java.util.Map;

/**
 * My Implementation of Map1 interfaces from CodingBat.com
 *
 * @author moiseenko-s
 */
public class Map1Impl implements Map1 {

  @Override
  public Map<String, String> mapBully(Map<String, String> map) {
    String aVal = map.get("a");
    if (aVal != null) {
      map.put("b", aVal);
      map.put("a", "");
    }
    return map;
  }

  @Override
  public Map<String, String> mapShare(Map<String, String> map) {
    map.remove("c");
    String aVal = map.get("a");
    if (aVal != null) {
      map.put("b", aVal);
    }
    return map;
  }

  @Override
  public Map<String, String> mapAB(Map<String, String> map) {
    String aVal, bVal;
    if ((aVal = map.get("a")) != null && (bVal = map.get("b")) != null) {
      map.put("ab", aVal.concat(bVal));
    }
    return map;
  }

  @Override
  public Map<String, String> topping1(Map<String, String> map) {
    String iKey = "ice cream", newIVal = "cherry";
    map.put("bread", "butter");

    if (map.get(iKey) != null) {
      map.put(iKey, newIVal);
    }
    return map;
  }

  @Override
  public Map<String, String> topping2(Map<String, String> map) {
    String iVal,
        iKey = "ice cream",
        yKey = "yogurt",
        sKey = "spinach",
        sVal = "nuts";

    if (map.get(sKey) != null) {
      map.put(sKey, sVal);
    }
    if ((iVal = map.get(iKey)) != null) {
      map.put(yKey, iVal);
    }
    return map;
  }

  @Override
  public Map<String, String> topping3(Map<String, String> map) {
    String
        pVal,
        pKey = "potato",
        fKey = "fries",
        saVal,
        saKey = "salad",
        spKey = "spinach";
    if ((pVal = map.get(pKey)) != null) {
      map.put(fKey, pVal);
    }
    if ((saVal = map.get(saKey)) != null) {
      map.put(spKey, saVal);
    }
    return map;
  }

  @Override
  public Map<String, String> mapAB2(Map<String, String> map) {
    String
        aKey = "a",
        bKey = "b";

    if (map.get(aKey) != null && map.get(bKey) != null &&
        map.get(aKey).equals(map.get(bKey))) {
      map.remove(aKey);
      map.remove(bKey);
    }
    return map;
  }

  @Override
  public Map<String, String> mapAB3(Map<String, String> map) {
    String
        aKey = "a",
        aVal = map.get(aKey),
        bKey = "b",
        bVal = map.get(bKey);

    if (aVal == null && bVal != null) {

      map.put(aKey, bVal);
    }
    if (bVal == null && aVal != null) {
      map.put(bKey, aVal);
    }
    return map;
  }

  @Override
  public Map<String, String> mapAB4(Map<String, String> map) {
    String
        aKey = "a",
        aVal = map.get(aKey),
        bKey = "b",
        bVal = map.get(bKey),
        cKey = "c";
    if (aVal == null || bVal == null) {
      return map;
    }
    if (aVal.length() == bVal.length()) {
      map.put(aKey, "");
      map.put(bKey, "");
    } else if (aVal.length() > bVal.length()) {
      map.put(cKey, aVal);
    } else {
      map.put(cKey, bVal);
    }
    return map;
  }
}
