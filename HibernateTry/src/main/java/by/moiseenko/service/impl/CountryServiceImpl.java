package by.moiseenko.service.impl;

import by.moiseenko.entity.Country;
import by.moiseenko.repository.CountryDAO;
import by.moiseenko.service.CountryService;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Service
public class CountryServiceImpl implements CountryService {

  private static final Logger LOG = LogManager.getLogger(CountryServiceImpl.class.getName());

  private CountryDAO countryDAO;

  @Autowired
  public CountryServiceImpl(CountryDAO countryDAO) {
    this.countryDAO = countryDAO;
  }

  @Override
  public Country createCounty(Country country) {
    return countryDAO.createCounty(country);
  }

  @Override
  public List<Country> getAlCountries() {
    return countryDAO.getAlCountries();
  }

  @Override
  public void updateCountry(Country country) {
    countryDAO.updateCountry(country);
  }

  @Override
  public void deleteCountry(Country country) {
    countryDAO.deleteCountry(country);
  }

  @Override
  public Country findCountryById(Long id) {
    return countryDAO.findCountryById(id);
  }
}
