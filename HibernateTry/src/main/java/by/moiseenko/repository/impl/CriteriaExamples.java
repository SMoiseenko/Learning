package by.moiseenko.repository.impl;

import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
public class CriteriaExamples {
  private static final Logger LOG = LogManager.getLogger(CriteriaExamples.class.getName());

  @SuppressWarnings(value = "deprecation")
  public Map<String, YearOfPublish> getMapBookYearOfPublishBetween(
      Session session, LocalDate from, LocalDate till) {
    Criteria criteriaBook = session.createCriteria(Book.class, "b");
    criteriaBook.createCriteria("yearOfPublish", "y").add(Restrictions.between("year", from, till));
    ProjectionList properties = Projections.projectionList();
    properties.add(Projections.property("name"));
    properties.add(Projections.property("yearOfPublish"));
    criteriaBook.setProjection(properties);
    List<Object[]> resultListYearOfPublish = criteriaBook.list();
    Map<String, YearOfPublish> resultMap = new HashMap<>();
    resultListYearOfPublish.forEach(o -> resultMap.put((String) o[0], (YearOfPublish) o[1]));
    return resultMap;
  }
}
