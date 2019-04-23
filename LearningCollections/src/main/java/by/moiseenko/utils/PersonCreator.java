package by.moiseenko.utils;

import by.moiseenko.entity.Person;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PersonCreator {

  private static final Logger LOG = LogManager.getLogger(PersonCreator.class.getName());
  private final String ALPHABET_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public List<Person> generatePersonsList(int qty) {
    List<Person> result = new ArrayList<>();
    for (int i = 0; i < qty; i++) {
      Person p = new Person(generateRandomString(3, 8), generateRandomInt(1, 100));
      result.add(p);
    }
    return result;
  }

  private String generateRandomString(int min, int max) {
    if (min > 0 && max > min) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < generateRandomInt(min, max); i++) {
        sb.append(ALPHABET_STRING.charAt((int) (Math.random() * ALPHABET_STRING.length())));
      }
      return sb.toString();
    } else
      throw new IllegalArgumentException("Min and max mast be positive and mix be more than min");
  }

  private int generateRandomInt(int min, int max) {
    if (min > 0 && max > min) {
      return (int) (Math.random() * (max - min + 1) + min);
    } else
      throw new IllegalArgumentException("Min and max mast be positive and mix be more than min");
  }
}
