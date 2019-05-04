package by.moiseenko.entity;

import by.moiseenko.utils.NetworkUserComparator;
import by.moiseenko.utils.NetworkUserEnum;
import by.moiseenko.utils.NetworkUserStorage;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class CollectionsClassExample {

  private static final Logger LOG = LogManager.getLogger(CollectionsClassExample.class.getName());

  public static void doAction(boolean isAction) {
    if (isAction) {
      List<NetworkUser> twentyUsersList = NetworkUserStorage.loadNetworkUsers().subList(20, 40);
      LOG.debug(twentyUsersList);
      List<NetworkUser> tenTimeTheSameUserList = twentyUsersList.subList(10, 20);
      Collections.fill(tenTimeTheSameUserList, twentyUsersList.get(10));
      LOG.debug(tenTimeTheSameUserList);
      int times = Collections.frequency(tenTimeTheSameUserList, twentyUsersList.get(10));
      LOG.debug(times);
      NetworkUser minAgeNetworkUser =
          Collections.min(twentyUsersList, new NetworkUserComparator(NetworkUserEnum.AGE, true));
      LOG.debug(minAgeNetworkUser);
    }
    // END IS HERE
  }
}
