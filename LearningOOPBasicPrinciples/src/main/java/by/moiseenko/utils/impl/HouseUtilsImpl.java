package by.moiseenko.utils.impl;

import by.moiseenko.entity.House;
import by.moiseenko.entity.HouseRepoType;
import by.moiseenko.utils.HouseRepository;
import by.moiseenko.utils.HouseUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class HouseUtilsImpl implements HouseUtils {

  private static final Logger LOG = LogManager.getLogger(HouseUtilsImpl.class.getName());
  private House[] allHousesArray;

  public HouseUtilsImpl(HouseRepoType repoType, String FILE_STORAGE_NAME) {
    HouseRepository houseRepository;
    switch (repoType) {
      case ARRAY:
        houseRepository = new HouseRepositoryArrayImpl();
        break;
      case JSON:
      default:
        houseRepository = new HouseRepositoryJSONImpl(FILE_STORAGE_NAME);
    }
    this.allHousesArray = houseRepository.loadFromRepo();
  }

  @Override
  public House[] houseArrayWithRoomsQty(int roomsQty) {
    int resultArraySize = 0;
    House[] result = new House[resultArraySize];
    House[] tempHouseArray;

    for (House house : allHousesArray) {
      if (house.getQtyRooms() == roomsQty) {
        resultArraySize++;
        tempHouseArray = Arrays.copyOf(result, resultArraySize);
        tempHouseArray[resultArraySize - 1] = house;
        result = tempHouseArray;
      }
    }

    return result;
  }

  @Override
  public House[] houseArrayWithRoomsQtyOnFloorsInterval(int roomsQty, int fromFloor,
      int tillFloor) {
    int resultArraySize = 0;
    House[] result = new House[resultArraySize];
    House[] tempHouseArray;

    for (House house : allHousesArray) {
      if (house.getQtyRooms() == roomsQty && house.getFloor() >= fromFloor
          && house.getFloor() <= tillFloor) {
        resultArraySize++;
        tempHouseArray = Arrays.copyOf(result, resultArraySize);
        tempHouseArray[resultArraySize - 1] = house;
        result = tempHouseArray;
      }
    } return result;
  }

  @Override
  public House[] houseArrayWithFlatSquareMoreThan(Double square) {
    int resultArraySize = 0;
    House[] result = new House[resultArraySize];
    House[] tempHouseArray;

    for (House house : allHousesArray) {
      if (house.getFlatSquare().compareTo(BigDecimal.valueOf(square).setScale(2, RoundingMode.HALF_UP)) >=0) {
        resultArraySize++;
        tempHouseArray = Arrays.copyOf(result, resultArraySize);
        tempHouseArray[resultArraySize - 1] = house;
        result = tempHouseArray;
      }
    } return result;
  }
}
