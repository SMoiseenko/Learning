package by.moiseenko;

import by.moiseenko.entity.Button;
import by.moiseenko.entity.Person;
import by.moiseenko.entity.Sex;
import by.moiseenko.entity.TheMan;
import by.moiseenko.utils.Handler;
import by.moiseenko.utils.PersonCreator;
import by.moiseenko.utils.TheManCreator;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;
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
    exampleWithCallBack(false);
    someLambdaExample(false);
    exampleWithStreams(true);
  }

  private static void exampleWithCallBack(boolean isActive) {
    if (isActive) {
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
    }
  }

  private static void someLambdaExample(boolean isActive) {
    if (isActive) {
      i++;
      Predicate<String> predicate = x -> x.length() >= 5 + i;
      LOG.debug(predicate.test("hello"));
      LOG.debug(predicate.test("big string"));

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

  private static void exampleWithStreams(boolean isActive) {
    if (isActive) {
      List<Integer> intList = new ArrayList<>();
      IntStream.range(0, 100).forEach(i -> intList.add(new Random().nextInt(1000)));
      String pathTomSoyer =
          "/home/moiseenko-s/IdeaProjects/Learning/LearningLambdasAndStreams/src/main/resources/TOM_SOYER.txt";
      Stream<String> textStream = readStringFromFile(pathTomSoyer);
      // filter
      intList.stream().filter((i) -> i % 100 == 0).forEach(LOG::debug);
      LOG.debug("***");
      // sorted
      intList.stream().sorted(Comparator.reverseOrder()).limit(10).forEach(LOG::debug);
      LOG.debug("***");
      //      textStream.forEach(LOG::debug);
      //      LOG.debug("***");
      List<Person> personList = createPersonList();
      personList.stream()
          .filter(p -> p.getAge() >= 18)
          .sorted(Comparator.comparing(Person::getName))
          .skip(0)
          .limit(10)
          .forEach(LOG::debug);
      LOG.debug("***");
      LOG.debug(
          personList.stream()
              .filter(p -> p.getSex() == Sex.MALE && p.getAge() >= 18)
              .mapToInt(Person::getAge)
              .average()
              .orElse(Double.NaN));
      LOG.debug("***");
      personList.stream()
          .filter(p -> p.getAge() < 18)
          .map(p -> new Person(p.getName(), 0, p.getSex()))
          .forEach(LOG::debug);
      LOG.debug("***");
      personList.stream().sorted(Comparator.comparing(Person::getAge)).forEach(LOG::debug);
      LOG.debug("***");
      long mans = personList.stream().filter(p -> p.getSex() == Sex.MALE).count();
      LOG.debug(mans);
      LOG.debug("***");
      boolean ffTears = personList.stream().anyMatch(p -> p.getAge() == 55);
      LOG.debug(ffTears);
      LOG.debug("***");
      LOG.debug(
          personList.stream()
              .max((p1, p2) -> Integer.compare(p1.getName().length(), p2.getName().length())));
      LOG.debug("***");
      personList.stream()
          .map(Person::getName)
          .map(p -> String.valueOf(p.charAt(0)))
          .sorted()
          .forEach(LOG::debug);
      LOG.debug("***");
      Collector<String, LinkedHashMap<String, Integer>, LinkedHashMap<String, Integer>> toMap =
          Collector.of(
              LinkedHashMap::new,
              (s, i) -> {
                if (s.containsKey(i)) {
                  s.replace(i, s.get(i) + 1);
                } else {
                  s.put(i, 1);
                }
              },
              (m1, m2) -> {
                m1.putAll(m2);
                return m1;
              });
      LinkedHashMap<String, Integer> result =
          personList.stream()
              .map(Person::getName)
              .map(p -> String.valueOf(p.charAt(0)))
              .sorted()
              .collect(toMap);
      for (Entry<String, Integer> entry : result.entrySet()) {
        LOG.debug("[ " + entry.getKey() + " - " + entry.getValue() + " ]");
      }
      LOG.debug("***");
      personList.stream().takeWhile(p->p.getName().length()<=6).forEach(LOG::debug);
      LOG.debug("***");
      LOG.debug(
          personList.stream()
              .map(Person::getName)
              .sorted()
              .reduce("All people names:\n", (n1, n2) -> n1 + n2+", "));
    }
  }

  private static List<Person> createPersonList() {
    String dataFile =
        "/home/moiseenko-s/IdeaProjects/Learning/LearningLambdasAndStreams/src/main/resources/PERSON.txt";
    List<Person> personList = new ArrayList<>();
    PersonCreator personCreator = Person::new;
    readStringFromFile(dataFile)
        .forEach(
            p -> {
              String[] personInfo = p.split(",");
              personList.add(
                  personCreator.create(
                      personInfo[0],
                      Integer.valueOf(personInfo[1]),
                      Enum.valueOf(Sex.class, personInfo[2].toUpperCase())));
            });
    return personList;
  }

  private static Stream<String> readStringFromFile(String paths) {
    Stream<String> textStream = null;
    try {
      textStream = Files.lines(Path.of(paths));
    } catch (IOException e) {
      LOG.error(e);
    }
    return textStream;
  }
}
