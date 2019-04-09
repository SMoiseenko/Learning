package by.moiseenko.utils.Impl;

import by.moiseenko.utils.HouseParamValidator;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HouseParamValidatorImpl implements HouseParamValidator {

  private static final Logger LOG = LogManager.getLogger(HouseParamValidatorImpl.class.getName());

  @Override
  public boolean validateFlatNumber(int flatNumber) {
    if (flatNumber > 0 && flatNumber <= 9999){
      return true;
    }else throw new IllegalArgumentException(String.format("Flat number must be in interval [1-9999], your value is:%d", flatNumber));
  }

  @Override
  public boolean validateFlatSquare(BigDecimal flatSquare) {
    if (flatSquare.compareTo(BigDecimal.ZERO) > 0 ){
      return true;
    }else throw new IllegalArgumentException(String.format("Flat square must be more than 0, your value is:%s",
        new DecimalFormat("#0.##").format(flatSquare)));
  }

  @Override
  public boolean validateFloor(int floor) {
    return false;
  }

  @Override
  public boolean validateQtyRooms(int qtyRooms) {
    return false;
  }

  @Override
  public boolean validateStreet(String street) {
    return false;
  }

  @Override
  public boolean validateLifeTime(Date lifetime) {
    return false;
  }
}
