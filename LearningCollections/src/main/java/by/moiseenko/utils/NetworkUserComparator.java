package by.moiseenko.utils;

import by.moiseenko.entity.NetworkUser;
import java.util.Comparator;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class NetworkUserComparator implements Comparator<NetworkUser> {
  private static final Logger LOG = LogManager.getLogger(NetworkUserComparator.class.getName());

  private NetworkUserEnum networkUserEnum;

  public NetworkUserComparator(NetworkUserEnum networkUserEnum, boolean ascend) {
    this.networkUserEnum = networkUserEnum;
    this.networkUserEnum.setAscend(ascend);
  }

  @Override
  public int compare(NetworkUser o1, NetworkUser o2) {
    switch (networkUserEnum) {
      case ID:
        return (int)
            ((networkUserEnum.isAscend()) ? o1.getId() - o2.getId() : o2.getId() - o1.getId());
      case FIRST_NAME:
        break;
      case LAST_NAME:
        break;
      case GENDER:
        return (networkUserEnum.isAscend())? o1.getGender().name().compareTo(o2.getGender().name()) : o2.getGender().name().compareTo(o1.getGender().name());
      case AGE:
        return (networkUserEnum.isAscend()) ? o1.getAge() - o2.getAge() : o2.getAge() - o1.getAge();
      case DAY_OF_BIRTH:
        break;
      case E_MAIL:
        break;
      case IP_ADDRESS:
        return
            (networkUserEnum.isAscend())
                ? Long.compare(toNumeric(o1.getIpAddress()), toNumeric(o2.getIpAddress()))
                : Long.compare(toNumeric(o2.getIpAddress()), toNumeric(o1.getIpAddress()));
    }
    return 0;
  }

  private long toNumeric(String ip) {
    Scanner sc = new Scanner(ip).useDelimiter("\\.");
    return (sc.nextLong() << 24) + (sc.nextLong() << 16) + (sc.nextLong() << 8) + (sc.nextLong());
  }
}
