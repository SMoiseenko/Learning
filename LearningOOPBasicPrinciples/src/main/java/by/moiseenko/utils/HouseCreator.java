package by.moiseenko.utils;

import by.moiseenko.entity.BuldingType;
import by.moiseenko.entity.House;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseCreator {
  House createHouse(int flatNumber, BigDecimal flatSquare, int floor, int qtyRooms,
      String street, BuldingType buldingType, Date lifetime);
}
