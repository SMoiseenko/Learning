package by.moiseenko.utils;

import by.moiseenko.entity.House;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface HouseUtils {

  House[] houseArrayWithRoomsQty(int roomsQty);

  House[] houseArrayWithRoomsQtyOnFloorsInterval(int roomsQty, int fromFloor, int tillFloor);

  House[] houseArrayWithFlatSquareMoreThan(Double square);

}
