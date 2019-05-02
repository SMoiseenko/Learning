package by.moiseenko.entity;

import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class MapCollection {
  private static final Logger LOG = LogManager.getLogger(MapCollection.class.getName());

  public static void doAction(boolean isAction) {
    Map<Character, String> countyMap = new HashMap<>(30);
    countyMap.put('A', "Afghanistan");
    countyMap.put('B', "Belarus");
    countyMap.put('C', "Belarus");
    countyMap.put('D', "Belarus");
    countyMap.put('E', "Egypt");
    countyMap.put('F', "Fiji");
    countyMap.put('G', "Grenada");
    countyMap.put('H', "Honduras");
    countyMap.put('I', "Iran");
    countyMap.put('J', "Jamaica");
    countyMap.put('K', "Korea, North");
    countyMap.put('L', "Laos");
    countyMap.put('M', "Myanmar");
    countyMap.put('N', "New Zealand");
    countyMap.put('O', "Oman");
    countyMap.put('P', "Poland");
    countyMap.put('Q', "Qatar");
    countyMap.put('R', "Rwanda");
    countyMap.put('S', "Somalia");
    countyMap.put('T', "Thailand");
    countyMap.put('U', "United States");
    countyMap.put('V', "Vietnam");
    countyMap.put('W', null);
    countyMap.put('X', null);
    countyMap.put('Y', "Yemen");
    if (!countyMap.containsKey('Z')) {
      countyMap.put('Z', "Zimbabwe");
    }
    countyMap.put(null, null);
    String replaced = countyMap.put('Z', "Zakovia");
    LOG.debug((replaced != null)? replaced + " key was used before":"first key use");

    for (Map.Entry<Character, String> entry : countyMap.entrySet()) {
      LOG.debug(entry.getKey() + " - " + entry.getValue());
    }

    // END IS HERE
  }
}
