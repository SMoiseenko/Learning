package by.moiseenko.utils;

import by.moiseenko.entity.BuldingType;
import by.moiseenko.entity.House;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseCreator {
  House createHouse(int flatNumber, Double flatSquare, int floor, int qtyRooms,
      String street, String buldingType, LocalDate lifetime);
}
