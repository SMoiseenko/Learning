package by.moiseenko.repository.impl;

import by.moiseenko.entity.Country;
import by.moiseenko.utils.MySessionFactory;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class JPACriteriaExample {

  private static final Logger LOG = LogManager.getLogger(JPACriteriaExample.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public JPACriteriaExample(
      @Qualifier("hibernateSessionFactoryJBoss") MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public Set<Country> getAllCountries() {
    Set<Country> result = null;
    Session session = sessionFactory.getSessionFactory().openSession();
    CriteriaBuilder cb = session.getCriteriaBuilder();
    CriteriaQuery<Country> cq = cb.createQuery(Country.class);
    Root<Country> root = cq.from(Country.class);
    cq.select(root);
    result = new HashSet<>(session.createQuery(cq).getResultList());
    session.close();
    return result;
  }
}
