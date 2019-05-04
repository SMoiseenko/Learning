package by.moiseenko.entity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
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
    if (isAction) {
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
      LOG.debug((replaced != null) ? replaced + " key was used before" : "first key use");

      Set<Map.Entry<Character, String>> countryMapEntrySet = countyMap.entrySet();

      for (Map.Entry<Character, String> entry : countyMap.entrySet()) {
        LOG.debug(entry.getKey() + " - " + entry.getValue());
      }

      Set<Character> keySet = countyMap.keySet();
      LOG.debug(keySet);

      List<String> valuesArray = new ArrayList<>(countyMap.values());
      LOG.debug(valuesArray);

      Properties dbProp = new Properties();
      dbProp.setProperty("db.driver", "com.mysql.jdbc.Driver");
      dbProp.setProperty("db.url", "jdbc:mysql://127.0.0.1:3306/testDB");
      dbProp.setProperty("db.user", "root");
      dbProp.setProperty("db.password", "pass");
      dbProp.setProperty("db.poolsize", "5");

      try {

        dbProp.storeToXML(
            new FileOutputStream(
                "src"
                    + File.separator
                    + "main"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "dbProp.xml"),
            "DEFAULT DB_CONNECTOR PROPERTIES");
      } catch (IOException e) {
        LOG.error(e);
      }

      Properties useThisProp = new Properties();
      try {
        useThisProp.loadFromXML(
            new FileInputStream(
                "src"
                    + File.separator
                    + "main"
                    + File.separator
                    + "resources"
                    + File.separator
                    + "dbProp.xml"));
      } catch (IOException e) {
        LOG.error(e);
      }
      Enumeration<String> propNames = (Enumeration<String>) useThisProp.propertyNames();
      while (propNames.hasMoreElements()) {
        String key = propNames.nextElement();
        String value = useThisProp.getProperty(key);
        LOG.debug(key + " -=- " + value);
      }

      // END IS HERE
    }
  }
}
