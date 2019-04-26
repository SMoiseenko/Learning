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
public class NetworkUserExamples {
  private static final Logger LOG = LogManager.getLogger(NetworkUserExamples.class.getName());


  public static void showMustGoOn(boolean isActive) {
    if (isActive) {

      NetworkUserService nus = new NetworkUserService();
      nus.showSortedBy(NetworkUserEnum.GENDER, true);

      nus.showSortedByTwoCriteria(NetworkUserEnum.GENDER, false, NetworkUserEnum.AGE, true);
      //END IS HERE
    }
  }
}
