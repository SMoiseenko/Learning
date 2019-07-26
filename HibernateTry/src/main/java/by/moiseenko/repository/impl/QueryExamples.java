package by.moiseenko.repository.impl;

import by.moiseenko.entity.Country;
import by.moiseenko.entity.Entity;
import by.moiseenko.utils.MySessionFactory;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
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
public class QueryExamples {
  private static final Logger LOG = LogManager.getLogger(QueryExamples.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public QueryExamples(@Qualifier("hibernateSessionFactoryJBoss") MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  @SuppressWarnings(value = "unchecked")
  public List<LocalDate> findDatesLessThan(LocalDate lessThisDate, boolean sort) {
    Session session = openSession();
    String sortBy = sort ? "ASC" : "DESC";
    Query select =
        session.createQuery(
            "select y.year From YearOfPublish y where year<:paramName order by y.year " + sortBy);
    select.setParameter("paramName", lessThisDate);
    return select.getResultList();
  }

  public Long calculateRawsInTable(Class<? extends Entity> type) {
    Session session = openSession();
    String queryString = "select count(b.id) from " + type.getName() + " b";
    Query qtyRawsQuery = session.createQuery(queryString);
    return (Long) qtyRawsQuery.getSingleResult();
  }

  public Map<String, LocalDate> returnMapBookYearBetweenTwoDates(LocalDate fromDate, LocalDate tillDate) {
    Session session = openSession();
    Query booksListBetweenDatesHQL =
        session.createQuery(
            "Select b.name, b.yearOfPublish.year from Book b  where b.yearOfPublish.year between :fromD and :tillD");
    booksListBetweenDatesHQL.setParameter("fromD", fromDate);
    booksListBetweenDatesHQL.setParameter("tillD", tillDate);
    List<Object[]> resultListYearOfPublish = booksListBetweenDatesHQL.getResultList();
    Map<String, LocalDate> resultMap = new HashMap<>();
    resultListYearOfPublish.forEach(o -> resultMap.put((String) o[0], (LocalDate) o[1]));
    return resultMap;
  }

  public List<Country> getCountriesWithPopulationsMore(Long minPopulation){
    return openSession().createNamedQuery("selectWithPopulationsMoreThan",Country.class).setParameter("minPop", minPopulation).list();
  }

  private Session openSession() {
    return sessionFactory.getSessionFactory().openSession();
  }
}
