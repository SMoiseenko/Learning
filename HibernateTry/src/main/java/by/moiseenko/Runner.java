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
      Book newBook = new Book();
      newBook.setName("Twin authors book");

      LocalDate dateOfPublish = LocalDate.parse("1935-01-01");
      YearOfPublish yearOfPublish = null;
      Query query = session.createQuery("from YearOfPublish where year =:mydate", YearOfPublish.class);
      query.setParameter("mydate", dateOfPublish);
      List<YearOfPublish> yearOfPublishList = query.getResultList();
     if(yearOfPublishList.size()==1){
        yearOfPublish = yearOfPublishList.get(0);
     } else {
       yearOfPublish = new YearOfPublish();
       yearOfPublish.setYear(dateOfPublish);
       session.saveOrUpdate(yearOfPublish);
     }

      newBook.setYearOfPublish(yearOfPublish);

      Author author8 = session.load(Author.class, 8L);
      Author author13 = session.load(Author.class, 11L);
      author8.getBooksList().add(newBook);
      author13.getBooksList().add(newBook);

      tx.commit();
    } catch (HibernateException he){
      LOG.error(he);
      if(tx!= null) tx.rollback();
    }

  }
}
