package by.moiseenko;

import by.moiseenko.entity.TheMan;
import by.moiseenko.entity.TheManComparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class TestClass {

  private static final Logger LOG = LogManager.getLogger(TestClass.class.getName());
  private String text;

  @Test
  void doTest() {
    LOG.debug("TEST");
  }

  @Test
  void testCompareMan() {

    List<TheMan> mansList =
        Arrays.asList(new TheMan("Ben"), new TheMan("Alfred"), new TheMan("Ollof"));
    mansList.sort(TheMan::compareTo);
    mansList.sort(new TheManComparator());
    mansList.forEach(LOG::debug);
    mansList.removeIf(Objects::isNull);
    Assertions.assertEquals(1, 1);
  }

  @Test
  void testL() {
    for (int i = 0; i < 20; i++) {
      new Thread(
              () -> {
                LOG.debug("HELLO");
              })
          .start();
    }
  }

  @Test
  void sortArray() {
    Integer[] array = {20, 54, 2, 89, 65, 47, 356, 412, 589, 3, 79, 562};
    Arrays.sort(array, Collections.reverseOrder());
    LOG.debug(Arrays.toString(array));
  }

  @Test
  void sortMans() {
    TheMan[] manArray = {new TheMan("Pet"), new TheMan("Vasya"), new TheMan("Lios")};

    Arrays.sort(
        manArray,
        new Comparator<TheMan>() {
          @Override
          public int compare(TheMan o1, TheMan o2) {
            int result = o1.getName().length() - o2.getName().length();
            LOG.debug(
                String.format("%d, %d, %d", o1.getName().length(), o2.getName().length(), result));
            return result;
          }
        });
    for (TheMan man : manArray) {
      LOG.debug(man.toString());
    }
  }
}
