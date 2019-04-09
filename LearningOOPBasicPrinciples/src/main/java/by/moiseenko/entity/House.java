package by.moiseenko.entity;

import java.math.BigDecimal;
import java.util.Date;
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

  private static long id;
  private int flatNumber;
  private BigDecimal flatSquare;
  private int floor;
  private int qtyRooms;
  private String street;
  private BuldingType buldingType;
  private Date lifetime;

  public House() {
  }

  public static long getId() {
    return id;
  }

  public static void setId(long id) {
    House.id = id;
  }

  public int getFlatNumber() {
    return flatNumber;
  }

  public void setFlatNumber(int flatNumber) {
    this.flatNumber = flatNumber;
  }

  public BigDecimal getFlatSquare() {
    return flatSquare;
  }

  public void setFlatSquare(BigDecimal flatSquare) {
    this.flatSquare = flatSquare;
  }

  public int getFloor() {
    return floor;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public int getQtyRooms() {
    return qtyRooms;
  }

  public void setQtyRooms(int qtyRooms) {
    this.qtyRooms = qtyRooms;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public BuldingType getBuldingType() {
    return buldingType;
  }

  public void setBuldingType(BuldingType buldingType) {
    this.buldingType = buldingType;
  }

  public Date getLifetime() {
    return lifetime;
  }

  public void setLifetime(Date lifetime) {
    this.lifetime = lifetime;
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
    return flatNumber == house.flatNumber &&
        floor == house.floor &&
        qtyRooms == house.qtyRooms &&
        Objects.equals(flatSquare, house.flatSquare) &&
        Objects.equals(street, house.street) &&
        buldingType == house.buldingType &&
        Objects.equals(lifetime, house.lifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flatNumber, flatSquare, floor, qtyRooms, street, buldingType, lifetime);
  }

  @Override
  public String toString() {
    return "House{" +
        "id=" + id +
        "flatNumber=" + flatNumber +
        ", flatSquare=" + flatSquare +
        ", floor=" + floor +
        ", qtyRooms=" + qtyRooms +
        ", street='" + street + '\'' +
        ", buldingType=" + buldingType +
        ", lifetime=" + lifetime +
        '}';
  }
}
