package by.moiseenko.utils.impl;

import by.moiseenko.entity.House;
import by.moiseenko.utils.HouseCreator;
import by.moiseenko.utils.HouseRepository;
import java.time.LocalDate;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class HouseCreatorImpl implements HouseCreator {

  private static final Logger LOG = LogManager.getLogger(HouseCreatorImpl.class.getName());
  private HouseRepository houseRepository = new HouseRepositoryJSONImpl("house_db.json");

  @Override
  public House createHouse(int flatNumber, Double flatSquare, int floor, int qtyRooms,
      String street, String buildingType, LocalDate lifetime) {

    House house = new House();
    house.setFlatNumber(flatNumber);
    house.setFlatSquare(flatSquare);
    house.setFloor(floor);
    house.setQtyRooms(qtyRooms);
    house.setStreet(street);
    house.setBuildingType(buildingType);
    house.setLifetime(lifetime);
    if (Arrays.asList(houseRepository.loadFromRepo()).contains(house)) {
      LOG.debug("Building exist!!!");
      return Arrays.asList((houseRepository.loadFromRepo()))
          .get(Arrays.asList(houseRepository.loadFromRepo()).indexOf(house));
    } else {
      houseRepository.storeInRepo(house);
      LOG.debug("New Building Created Successfully.");
      return house;
    }
  }
}
