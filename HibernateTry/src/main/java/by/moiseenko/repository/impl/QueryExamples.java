package by.moiseenko.repository.impl;

import by.moiseenko.entity.Entity;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class QueryExamples {
  private static final Logger LOG = LogManager.getLogger(QueryExamples.class.getName());

  @SuppressWarnings(value = "unchecked")
  public List<LocalDate> findDatesLessThan(Session session, LocalDate lessThisDate, boolean sort) {
    String sortBy = sort ? "ASC" : "DESC";
    Query select =
        session.createQuery(
            "select y.year From YearOfPublish y where year<:paramName order by y.year " + sortBy);
    select.setParameter("paramName", lessThisDate);
    return select.getResultList();
  }

  public Long calculateRawsInTable(Session session, Class<? extends Entity> type) {

    String queryString = "select count(b.id) from " + type.getName() + " b";
    Query qtyRawsQuery = session.createQuery(queryString);
    return (Long) qtyRawsQuery.getSingleResult();
  }

  public Map<String, LocalDate> returnMapBookYearBetweenTwoDates(
      Session session, LocalDate fromDate, LocalDate tillDate) {
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
}
