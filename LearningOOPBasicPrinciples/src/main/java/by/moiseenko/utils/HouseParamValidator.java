package by.moiseenko.utils;

import by.moiseenko.entity.BuildingType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import org.apache.logging.log4j.core.layout.HtmlLayout.Builder;

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
boolean validateBuildingType(String buildingType);

}
