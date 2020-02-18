package by.moiseenko;

import by.moiseenko.entity.TheMan;
import by.moiseenko.entity.TheManComparator;
import java.util.Arrays;
import java.util.List;
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
}
