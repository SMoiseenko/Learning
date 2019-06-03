package by.moiseenko;

import by.moiseenko.entity.Button;
import by.moiseenko.entity.TheMan;
import by.moiseenko.utils.Handler;
import by.moiseenko.utils.TheManCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
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
    i++;
    Predicate<String> predicate = x -> x.length() >= 5 + i;
    LOG.debug(predicate.test("hello"));
    LOG.debug(predicate.test("big string"));

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

    List<String> stringArray = Arrays.asList("C", "B", "A", "b");
    stringArray.sort(String::compareToIgnoreCase);
    stringArray.forEach(LOG::debug);

    List<Integer> intList = new ArrayList<>();
    IntStream.range(0, 10).forEach(i -> intList.add(new Random().nextInt(100)));
    intList.forEach(LOG::debug);
    int sum = sumWithPredicate(intList, i -> i % 2 == 0);
    LOG.debug(sum);

    TheManCreator creator = TheMan::new;
    TheMan man = creator.create("PETYA");
    LOG.debug(man.getName());
  }

  public static int sumWithPredicate(List<Integer> intList, Predicate<Integer> predicate) {
    int summ = 0;
    for (Integer i : intList) {
      if (predicate.test(i)) {
        summ += i;
      }
    }
    return summ;
  }
}
