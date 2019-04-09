package by.moiseenko.utils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseParamValidator {

//  private int flatNumber;
//  private BigDecimal flatSquare;
//  private int floor;
//  private int qtyRooms;
//  private String street;
//  private BuldingType buldingType;
//  private Date lifetime;
boolean validateFlatNumber(int flatNumber);
boolean validateFlatSquare(BigDecimal flatSquare);
boolean validateFloor (int floor);
boolean validateQtyRooms(int qtyRooms);
boolean validateStreet(String street);
boolean validateLifeTime(Date lifetime);

}
