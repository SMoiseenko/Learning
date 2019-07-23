package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.YearOfPublish;
import by.moiseenko.utils.MySessionFactory;
import by.moiseenko.utils.impl.HibernateSessionFactoryUtil;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Query;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.type.StringType;
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
      String sort = sortBy ? "ASC":"DESC";
      Query select = session.createQuery("select y.year From YearOfPublish y where year<:paramName order by y.year "+ sort);
      select.setParameter("paramName", thisDate);
      List<LocalDate> result = select.getResultList();
      result.forEach(LOG::debug);
      Query qtyBooksQuery = session.createQuery("select count(b.id) from Book b");
      Long qtyBooks =(Long)qtyBooksQuery.getSingleResult();
      LOG.debug(qtyBooks + " raws in Books table");
      tx.commit();
    } catch (HibernateException he){
      LOG.error(he);
      if(tx!= null) tx.rollback();
    }

  }
}
