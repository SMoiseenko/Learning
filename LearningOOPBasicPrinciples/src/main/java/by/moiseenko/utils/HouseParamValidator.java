package by.moiseenko.utils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseParamValidator {
boolean validateFlatNumber(int flatNumber);
boolean validateFlatSquare(BigDecimal flatSquare);
boolean validateFloor (int floor);
boolean validateQtyRooms(int qtyRooms);
boolean validateStreet(String street);
boolean validateLifeTime(LocalDate lifetime);

}
