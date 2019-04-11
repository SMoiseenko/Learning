package by.moiseenko.utils;

import by.moiseenko.entity.House;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface HouseRepository {

  void storeInRepo(House house);
  House[] loadFromRepo();

}
