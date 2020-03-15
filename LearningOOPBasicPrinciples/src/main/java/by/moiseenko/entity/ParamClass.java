package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ParamClass<T> {

  private static final Logger LOG = LogManager.getLogger(ParamClass.class.getName());

  private T param;

  public ParamClass(T param) {
    this.param = param;
  }

  public <U> void change(U[] array, int a, int b) {
    U temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  public <F extends AutoCloseable> void closeAll(ArrayList<F> elements) throws Exception {
    for (F e : elements) {
      e.close();
    }
  }

  public static void findByPredicate(
      ArrayList<? extends MazdaCar> carList, Predicate<? super MazdaCar> filter) {
    for (MazdaCar car : carList) {
      if (filter.test(car)) {
        LOG.debug(car);
      }
    }
  }

  public static char findChar(
      List<? extends CharSequence> list, Predicate<? super CharSequence> filter) {
    char result = 0;
    for (CharSequence cs : list) {

      if (filter.test(cs)) {
        LOG.debug(cs);
        result = cs.charAt(0);
      }
    }

    return result;
  }

  public static <Z> List<Z> sortCollection(List<Z> list, Predicate<? super Z> filter) {
    List<Z> result = new ArrayList<>();
    for (Z el : list) {
      if (filter.test(el)) {
        result.add(el);
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "ParamClass{" + "param=" + param + '}';
  }
}
