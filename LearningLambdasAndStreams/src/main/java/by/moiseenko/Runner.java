package by.moiseenko;

import by.moiseenko.entity.Button;
import by.moiseenko.utils.Handler;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  private static int i = 1;

  public static void main(String[] args) {

    Predicate<String> predicate = x -> x.length() >= 5 + i;
    LOG.debug(predicate.test("hello"));
    LOG.debug(predicate.test("big string"));
    i++;

    Handler action1 = (x) -> System.out.println(x + " pushed. Bomb activated");
    Handler action2 = (x) -> System.out.println(x + " pushed. Bomb disarmed");

    Button but1 = new Button("ACTIVATE");
    Button but2 = new Button("DISARMED");
    Button but3 = new Button("WAIT");
    Button but4 = new Button("DESTROY");
    but1.click(action1);
    but2.click(action2);
    but3.click(
        new Handler() {
          @Override
          public void onClick(String buttonName) {
            System.out.println(buttonName + " pushed. Bomb slept");
          }
        });
    but4.click((x) -> System.out.println(x + " pushed. Bomb destroyed"));

    String[] stringArray = new String[]{"a","B","A","b"};
    Arrays.sort(stringArray, String::compareToIgnoreCase);
    LOG.debug(Arrays.toString(stringArray));


  }
}
