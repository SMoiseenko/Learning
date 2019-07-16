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
  public CountryDAOImpl(MySessionFactory sessionFactory) {
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
  public void updateCountry(Country country) {}

  @Override
  public void deleteCountry(Country country) {}
}
