package by.moiseenko.utils.Impl;

import by.moiseenko.entity.BuldingType;
import by.moiseenko.entity.House;
import by.moiseenko.utils.HouseCreator;
import by.moiseenko.utils.HouseParamValidator;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HouseCreatorImpl implements HouseCreator {

  private static final Logger LOG = LogManager.getLogger(HouseCreatorImpl.class.getName());

  @Override
  public House createHouse(int flatNumber, Double flatSquare, int floor, int qtyRooms,
      String street, String buldingType, LocalDate lifetime) {
    House house = new House(){};
    house.setFlatNumber(flatNumber);
    house.setFlatSquare(flatSquare);
    house.setFloor(floor);
    house.setQtyRooms(qtyRooms);
    house.setStreet(street);
    house.setBuldingType(buldingType);
    house.setLifetime(lifetime);
    return house;
  }
}
