package by.moiseenko.utils;

import by.moiseenko.entity.NetworkUser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class NetworkUserStorage {
  private static final Logger LOG = LogManager.getLogger(NetworkUserStorage.class.getName());

  public static List<NetworkUser> loadNetworkUsers() {
    List<NetworkUser> result = new ArrayList<>();
    ObjectMapper om = new ObjectMapper();
    try {
      result =
          om.readValue(
              new File("src/main/resources/MOCK_DATA.json"),
              new TypeReference<List<NetworkUser>>() {});
    } catch (IOException e) {
      LOG.error(e);
    }
    return result;
  }

  public static boolean saveNetworkUsers(List<NetworkUser> listToSave) {
    boolean result = false;
    ObjectMapper om = new ObjectMapper();

    try {
      om.writeValue(new File("src/main/resources/MOCK_DATA_new.json"), listToSave.toArray(new NetworkUser[0]));
      result = true;
    } catch (IOException e) {
      LOG.error(e);
    }
    return result;
  }
}
