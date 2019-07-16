package by.moiseenko.service;

import by.moiseenko.entity.Country;
import java.util.List;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface CountryService {

  Country createCounty(Country country);

  List<Country> getAlCountries();

  void updateCountry(Country country);

  void deleteCountry(Country country);
}
