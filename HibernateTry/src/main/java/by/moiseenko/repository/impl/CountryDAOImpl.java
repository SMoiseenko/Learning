package by.moiseenko.repository.impl;

import by.moiseenko.entity.Country;
import by.moiseenko.repository.CountryDAO;
import by.moiseenko.utils.MySessionFactory;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public class CountryDAOImpl implements CountryDAO {
  private static final Logger LOG = LogManager.getLogger(CountryDAOImpl.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public CountryDAOImpl(
      @Qualifier("hibernateSessionFactoryJBoss") MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @Override
  public Country createCounty(Country country) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Transaction tx = session.beginTransaction();
    session.save(country);
    tx.commit();
    session.close();
    return country;
  }

  @Override
  public List<Country> getAlCountries() {
    Session session = sessionFactory.getSessionFactory().openSession();
    List<Country> countriesList = session.createQuery("from Country", Country.class).list();
    session.close();
    return countriesList;
  }

  @Override
  public Country findCountryById(long id) {
    Session session = sessionFactory.getSessionFactory().openSession();
    Country country = session.get(Country.class, id);
    session.close();
    return country;
  }

  @Override
  public void updateCountry(Country country) {}

  @Override
  public void deleteCountry(Country country) {}
}
