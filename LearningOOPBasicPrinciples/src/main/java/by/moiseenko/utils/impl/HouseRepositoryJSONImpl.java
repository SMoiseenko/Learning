package by.moiseenko.utils.impl;

import by.moiseenko.entity.House;
import by.moiseenko.utils.HouseRepository;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class HouseRepositoryJSONImpl implements HouseRepository {

  private static final Logger LOG = LogManager.getLogger(HouseRepositoryJSONImpl.class.getName());
  private final String FILE_STORAGE_NAME;

  public HouseRepositoryJSONImpl(String FILE_STORAGE_NAME) {
    this.FILE_STORAGE_NAME = FILE_STORAGE_NAME;
  }

  @Override
  public void storeInRepo(House house) {
    House[] houseStorage = loadFromRepo();
    int houseStorageLength = houseStorage.length;
    int tmpHouseStorageLength = houseStorageLength + 1;
    House[] tmpHouseStorage = new House[tmpHouseStorageLength];
    house.setId(tmpHouseStorageLength);
    System.arraycopy(houseStorage, 0, tmpHouseStorage, 0, houseStorageLength);
    tmpHouseStorage[houseStorageLength] = house;
    houseStorage = tmpHouseStorage;

    File jsonFile = returnGSONFile();
    ObjectMapper om = new ObjectMapper();
    om.configure(Feature.AUTO_CLOSE_SOURCE, true);

    try {
      om.writeValue(jsonFile, houseStorage);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
  }

  @Override
  public House[] loadFromRepo() {
    File jsonFile = returnGSONFile();
    ObjectMapper om = new ObjectMapper();
    om.configure(Feature.AUTO_CLOSE_SOURCE, true);
      House[] houses = new House[0];
    try {
      houses = om.readValue(jsonFile, House[].class);
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    return houses;

  }

  private File returnGSONFile() {
    File file = new File(FILE_STORAGE_NAME);
    try {
      file.createNewFile();
    } catch (IOException ioe) {
      LOG.error(ioe);
    }
    return file;
  }
}
