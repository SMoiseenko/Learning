package by.moiseenko.utils.Impl;

import by.moiseenko.entity.House;
import by.moiseenko.utils.HouseRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class HouseRepositoryArrayImpl implements HouseRepository {

  private static final Logger LOG = LogManager.getLogger(HouseRepositoryArrayImpl.class.getName());
  private static House[] houseStorage = new House[0];

  @Override
  public void storeInRepo(House house) {
    int houseStorageLength = houseStorage.length;
    int tmpHouseStorageLength = houseStorageLength + 1;
    House[] tmpHouseStorage = new House[tmpHouseStorageLength];
    house.setId(tmpHouseStorageLength);
    System.arraycopy(houseStorage, 0, tmpHouseStorage,0,houseStorageLength);
    tmpHouseStorage[houseStorageLength] = house;
    houseStorage = tmpHouseStorage;
  }


  @Override
  public House[] loadFromRepo() {
    return houseStorage;
  }
}
