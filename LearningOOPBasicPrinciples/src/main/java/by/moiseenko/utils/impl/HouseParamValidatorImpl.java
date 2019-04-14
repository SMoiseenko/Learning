package by.moiseenko.utils.impl;

import by.moiseenko.entity.BuildingType;
import by.moiseenko.utils.HouseParamValidator;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HouseParamValidatorImpl implements HouseParamValidator {

  private static final Logger LOG = LogManager.getLogger(HouseParamValidatorImpl.class.getName());
  private static final String STREET_NAME_PATTERN = "(^[A-z\\ \\.]{3,})";
  private static final int MIN_FLAT_NUMBER = 0;
  private static final int MAX_FLAT_NUMBER = 9999;
  private static final int MIN_FLOOR = 0;
  private static final int MAX_FLOOR = 400;
  private static final int MIN_QTY_ROOMS = 0;
  private static final int MAX_QTY_ROOMS = 150;

  @Override
  public boolean validateFlatNumber(int flatNumber) {
    if (flatNumber > MIN_FLAT_NUMBER && flatNumber <= MAX_FLAT_NUMBER) {
      return true;
    } else {
      throw new IllegalArgumentException(
          String.format(
              "Flat number must be in interval [%d - %d], your value is:%d.",
              MIN_FLAT_NUMBER + 1, MAX_FLAT_NUMBER, flatNumber));
    }
  }

  @Override
  public boolean validateFlatSquare(BigDecimal flatSquare) {
    if (flatSquare.compareTo(BigDecimal.ZERO) > 0) {
      return true;
    } else {
      throw new IllegalArgumentException(
          String.format(
              "Flat square must be more than 0, your value is:%s.",
              new DecimalFormat("#0.##").format(flatSquare)));
    }
  }

  @Override
  public boolean validateFloor(int floor) {
    if (floor > MIN_FLOOR && floor <= MAX_FLOOR) {
      return true;
    } else {
      throw new IllegalArgumentException(
          String.format("Floor must be in interval [0-400], but your value is: %d.", floor));
    }
  }

  @Override
  public boolean validateQtyRooms(int qtyRooms) {
    if (qtyRooms > MIN_QTY_ROOMS && qtyRooms <= MAX_QTY_ROOMS) {
      return true;
    } else {
      throw new IllegalArgumentException(
          String.format(
              "Qty of a rooms must be in interval [0-20], but your value is: %d.", qtyRooms));
    }
  }

  @Override
  public boolean validateStreet(String street) {
    if (Pattern.compile(STREET_NAME_PATTERN).matcher(street).matches()) {
      return true;
    } else {
      throw new IllegalArgumentException();
    }
  }

  @Override
  public boolean validateLifeTime(LocalDate lifetime) {
    if (lifetime.compareTo(LocalDate.now()) > 0) {
      return true;
    } else {
      throw new IllegalArgumentException(
          String.format("Date must be after now, but your value is: %s", lifetime.toString()));
    }
  }

  @Override
  public boolean validateBuildingType(String buildingType) {
    try {
      Enum.valueOf(BuildingType.class, buildingType.toUpperCase());
    } catch (IllegalArgumentException iae) {
      throw new IllegalArgumentException(String.format("Building type can be only: %S",
          Arrays.toString(BuildingType.values())));
    }
    return true;
  }
}
