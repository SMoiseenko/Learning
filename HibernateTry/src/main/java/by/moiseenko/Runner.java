package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.utils.MySessionFactory;
import by.moiseenko.utils.impl.HibernateSessionFactoryUtil;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
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
    Session session = sessionFactory.getSessionFactory().openSession();
    List<Object[]> queryResult =
        session
            .createSQLQuery("Select author_name from AUTHORS")
            .addScalar("author_name", StringType.INSTANCE)
            .list();
    for (Object[] o : queryResult) {
      String authorName = (String) o[0];
      LOG.debug(authorName);
    }
    session.close();
  }
}
