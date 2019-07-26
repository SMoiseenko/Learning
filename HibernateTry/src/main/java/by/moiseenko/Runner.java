package by.moiseenko;

import by.moiseenko.configuration.SpringConfig;
import by.moiseenko.repository.impl.CriteriaExamples;
import by.moiseenko.repository.impl.QueryExamples;
import by.moiseenko.utils.MySessionFactory;
import by.moiseenko.utils.impl.HibernateSessionFactoryUtil;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());

  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  @SuppressWarnings(value = "element-type-mismatch")
  public static void main(String[] args) {
    //
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    MySessionFactory sessionFactory = context.getBean(HibernateSessionFactoryUtil.class);
    QueryExamples queryExamples = context.getBean(QueryExamples.class);
    CriteriaExamples criteriaExamples = context.getBean(CriteriaExamples.class);

    BigDecimal maxPrice = new BigDecimal("1000.00");
    criteriaExamples.bookWithPriceLess(maxPrice).forEach(System.out::println);
    LOG.debug("************");
    Long minPopulation = 1_000_000_000L;
    queryExamples.getCountriesWithPopulationsMore(minPopulation).forEach(c->System.out.println(ANSI_CYAN+c+ANSI_RESET));

    //    LocalDate thisDate = LocalDate.parse("1987-03-20");
    //    boolean sortBy = true;
    //    List<LocalDate> result = queryExamples.findDatesLessThan(thisDate, sortBy);
    //    result.forEach(d -> System.out.println(ANSI_BLUE + d + ANSI_RESET));
    //
    //    Long qtyBooks = queryExamples.calculateRawsInTable(Book.class);
    //    System.out.println(ANSI_BLUE + qtyBooks + " raws in Books table by HQL" + ANSI_RESET);
    //
    //    LocalDate fromDate = LocalDate.parse("1950-01-01");
    //    LocalDate tillDate = LocalDate.parse("1959-12-31");
    //
    //    Map<String, LocalDate> bookYearMap =
    //        queryExamples.returnMapBookYearBetweenTwoDates( fromDate, tillDate);
    //    Set<Entry<String, LocalDate>> entrySet = bookYearMap.entrySet();
    //    entrySet.forEach(
    //        es ->
    //            System.out.printf(
    //                (ANSI_PURPLE + "KEY = %s, VALUE = %s\n" + ANSI_RESET), es.getKey(),
    // es.getValue()));
    //
    //    Map<String, YearOfPublish> bookYearOfPublishMap =
    //        criteriaExamples.getMapBookYearOfPublishBetween( fromDate, tillDate);
    //    Set<Entry<String, YearOfPublish>> entrySet1 = bookYearOfPublishMap.entrySet();
    //    entrySet1.forEach(
    //        o ->
    //            System.out.printf(
    //                ANSI_BLUE + "BOOK = %s, YEAR = %S\n", o.getKey(), o.getValue() + ANSI_RESET));
  }
}
