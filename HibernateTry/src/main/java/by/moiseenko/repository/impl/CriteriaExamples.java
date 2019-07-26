package by.moiseenko.repository.impl;

import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.utils.MySessionFactory;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Component
@SuppressWarnings({"deprecation", "unchecked"})
public class CriteriaExamples {
  private static final Logger LOG = LogManager.getLogger(CriteriaExamples.class.getName());

  private MySessionFactory sessionFactory;

  @Autowired
  public CriteriaExamples(
      @Qualifier("hibernateSessionFactoryJBoss") MySessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

  public Map<String, YearOfPublish> getMapBookYearOfPublishBetween(LocalDate from, LocalDate till) {

    Session session = openSession();
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

  public List<Book> bookWithPriceLess(BigDecimal maxPrice) {

    return openSession()
        .createCriteria(Book.class)
        .add(Restrictions.le("price", maxPrice))
        .addOrder(Order.desc("price"))
        .list();
  }

  private Session openSession() {
    return sessionFactory.getSessionFactory().openSession();
  }
}
