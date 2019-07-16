package by.moiseenko.repository;

import by.moiseenko.entity.Country;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface CountryDAO {

  Country createCounty(Country country);

  List<Country> getAlCountries();

  void updateCountry(Country country);

  void deleteCountry(Country country);
}
