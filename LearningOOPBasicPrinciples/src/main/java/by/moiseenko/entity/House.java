package by.moiseenko.entity;

import by.moiseenko.utils.HouseParamValidator;
import by.moiseenko.utils.Impl.HouseParamValidatorImpl;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class House {
  private static final Logger LOG = LogManager.getLogger(House.class.getName());
  private static final HouseParamValidator validator = new HouseParamValidatorImpl();

  private long id;
  private int flatNumber;
  private BigDecimal flatSquare;
  private int floor;
  private int qtyRooms;
  private String street;
  private BuldingType buldingType;
  private LocalDate lifetime;

  public House() {}

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(int flatNumber) {
    if (validator.validateFlatNumber(flatNumber)) {
      this.flatNumber = flatNumber;
    }
  }

  public BigDecimal getFlatSquare() {
    return flatSquare;
  }

  public void setFlatSquare(Double flatSquare) {
    BigDecimal flatSquareB = BigDecimal.valueOf(flatSquare);
    flatSquareB = flatSquareB.round(new MathContext(2, RoundingMode.HALF_UP));
    if (validator.validateFlatSquare(flatSquareB)) {
      this.flatSquare = flatSquareB;
    }
  }

  public int getFloor() {
    return floor;
  }

  public void setFloor(int floor) {
    if (validator.validateFloor(floor)) {
      this.floor = floor;
    }
  }

  public int getQtyRooms() {
    return qtyRooms;
  }

  public void setQtyRooms(int qtyRooms) {
    if (validator.validateQtyRooms(qtyRooms)) {
      this.qtyRooms = qtyRooms;
    }
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    if (validator.validateStreet(street)) {
      this.street = street;
    }
  }

  public BuldingType getBuldingType() {
    return buldingType;
  }

  public void setBuldingType(BuldingType buldingType) {
    this.buldingType = buldingType;
  }

  public void setBuldingType(String buildingType){
    this.buldingType = Enum.valueOf(BuldingType.class, buildingType.toUpperCase());
  }

  public LocalDate getLifetime() {
    return lifetime;
  }

  public void setLifetime(LocalDate lifetime) {
    if (validator.validateLifeTime(lifetime)) {
      this.lifetime = lifetime;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    House house = (House) o;
    return flatNumber == house.flatNumber
        && floor == house.floor
        && qtyRooms == house.qtyRooms
        && Objects.equals(flatSquare, house.flatSquare)
        && Objects.equals(street, house.street)
        && buldingType == house.buldingType
        && Objects.equals(lifetime, house.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, flatSquare, floor, qtyRooms, street, buldingType, lifetime);
  }

  @Override
  public String toString() {
    return "House{"
        + "id="
        + id
        + "flatNumber="
        + flatNumber
        + ", flatSquare="
        + flatSquare
        + ", floor="
        + floor
        + ", qtyRooms="
        + qtyRooms
        + ", street='"
        + street
        + '\''
        + ", buldingType="
        + buldingType
        + ", lifetime="
        + lifetime
        + '}';
  }
}
