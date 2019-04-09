package by.moiseenko.utils.Impl;

import by.moiseenko.entity.BuldingType;
import by.moiseenko.entity.House;
import by.moiseenko.utils.HouseCreator;
import by.moiseenko.utils.HouseParamValidator;
import java.math.BigDecimal;
import java.util.Date;
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
  public House createHouse(int flatNumber, BigDecimal flatSquare, int floor, int qtyRooms,
      String street, BuldingType buldingType, Date lifetime) {
    House house = new House(){};


    return house;
  }
}
