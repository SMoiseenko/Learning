package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.utils.MySessionFactory;
import by.moiseenko.utils.impl.HibernateSessionFactoryUtil;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static void main(String[] args) {
    //
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MySessionFactory sessionFactory = context.getBean(HibernateSessionFactoryUtil.class);
    Transaction tx = null;
    try (Session session = sessionFactory.getSessionFactory().openSession()) {
      tx = session.beginTransaction();
      LocalDate thisDate = LocalDate.parse("1987-03-20");
      boolean sortBy = true;
      String sort = sortBy ? "ASC" : "DESC";
      Query select =
          session.createQuery(
              "select y.year From YearOfPublish y where year<:paramName order by y.year " + sort);
      select.setParameter("paramName", thisDate);
      List<LocalDate> result = select.getResultList();
      result.forEach(LOG::debug);
      Query qtyBooksQuery = session.createQuery("select count(b.id) from Book b");
      Long qtyBooks = (Long) qtyBooksQuery.getSingleResult();
      LOG.debug(qtyBooks + " raws in Books table by HQL");
      LocalDate fromDate = LocalDate.parse("1950-01-01");
      LocalDate tillDate = LocalDate.parse("1959-12-31");
      Query booksListBeetwenDatesHQL = session.createQuery("select b.name, b.yearOfPublish.year from Book b where b.yearOfPublish.year between :fromD and :tillD" );


      Criteria criteria1 =
          session
              .createCriteria(Book.class)
              .add(
                  Restrictions.between(
                      "yearOfPublish.getYear", fromDate, tillDate));
      List<Book> bookList = criteria1.list();
      LOG.debug("****Books list***");
      bookList.forEach(LOG::debug);
      tx.commit();
    } catch (HibernateException he) {
      LOG.error(he);
      if (tx != null) tx.rollback();
    }
  }
}
