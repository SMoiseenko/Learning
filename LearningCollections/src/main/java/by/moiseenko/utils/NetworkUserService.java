package by.moiseenko.utils;

import by.moiseenko.entity.NetworkUser;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class NetworkUserService {
  private static final Logger LOG = LogManager.getLogger(NetworkUserService.class.getName());

  private List<NetworkUser> allNetworkUsers;

  public NetworkUserService() {
    this.allNetworkUsers = NetworkUserStorage.loadNetworkUsers();
  }

  public void showSortedBy(NetworkUserEnum networkUserEnum, boolean ascend) {
    allNetworkUsers.sort(new NetworkUserComparator(networkUserEnum, ascend));
    for (NetworkUser nu : allNetworkUsers) {
      LOG.debug(nu);
    }
  }

  public void showSortedByTwoCriteria(NetworkUserEnum networkUserEnum, boolean ascend, NetworkUserEnum networkUserEnum1, boolean ascend1){
    allNetworkUsers.sort(new NetworkUserComparator(networkUserEnum, ascend).thenComparing(new NetworkUserComparator(networkUserEnum1, ascend1)));
    for (NetworkUser nu : allNetworkUsers) {
      LOG.debug(nu);
    }
  }
}
