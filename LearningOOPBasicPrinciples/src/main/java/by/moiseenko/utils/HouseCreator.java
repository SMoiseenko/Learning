package by.moiseenko.utils;

import by.moiseenko.entity.House;
import java.time.LocalDate;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseCreator {
  House createHouse(int flatNumber, Double flatSquare, int floor, int qtyRooms,
      String street, String buldingType, LocalDate lifetime);
}
