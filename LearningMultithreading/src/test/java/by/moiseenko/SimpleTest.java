package by.moiseenko;

import static org.junit.jupiter.api.Assertions.assertEquals;

import by.moiseenko.entity.MyThreadClass;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Log4j2
public class SimpleTest {

  @Test
  public void simpleTest() {
    assertEquals(1, 1);
    log.debug("Hello");
  }

  @Test
  public void testMeThreadClass() {
    Thread thread = new MyThreadClass("say my name");
    thread.start();
  }
}
