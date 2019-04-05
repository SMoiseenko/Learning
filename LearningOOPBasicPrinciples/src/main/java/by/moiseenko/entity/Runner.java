package by.moiseenko.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Runner {

  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  String myString = "LALALA";

  public static void main(String[] args) {

    int i = 0;
    for (i = args.length - 1; i >= 0; --i) {
      LOG.debug(args[i]);
    }
    Runner run = new Runner();
    LOG.debug(run.myString);

    testStaticAndDynamicBinding();
    baseTypeExecutor();
    arraysExecutor();
    warriorExecutor();
    messageGeneralizationExample();
    doEnum();
    abstractClassMagic();
  }

  private static strictfp void divide(double x, double y) {
    LOG.debug(x / y);
  }

  private static void testStaticAndDynamicBinding() {
    LOG.debug("!!!!!CAR = CAR!!!!!");
    Car car = new Car();
    doPrivateFinalAndProtectedMethods(car);

    LOG.debug("!!!!!CAR = MAZDA CAR!!!!!");
    Car carMazdaCar = new MazdaCar();
    doPrivateFinalAndProtectedMethods(carMazdaCar);

    LOG.debug("!!!!!MAZDA CAR = MAZDA CAR!!!!!");
    MazdaCar mazdaCar = new MazdaCar();
    doPrivateFinalAndProtectedMethods(mazdaCar);

    double x = 5;
    double y = 3;
    divide(x, y);

    String s1 = "Java"; // created in string pool
    String s2 = "Java";
    String s3 = new String(new char[] {'J', 'a', 'v', 'a'}); // created in heap
    LOG.debug(
        String.format(
            "Result of compare two links on Strong created by the same method: %B", s1 == s2));
    LOG.debug(
        String.format(
            "Result of compare two links on Strong created by different method: %B", s1 == s3));
    LOG.debug(s3 = s3.intern());
    LOG.debug(
        String.format(
            "Result of compare two links on Strong created by different method, but then putted to string pool : %B",
            s1 == s3));

    //    try {
    //      LOG.debug((char) System.in.read());
    //    } catch (IOException e) {
    //      LOG.error(e);
    //    }
    return;
  }

  private static void doPrivateFinalAndProtectedMethods(Car car) {
    car.publicMethod();
    car.finalMethod();
    car.protectedMethod();
    LOG.debug(car.doorsQty + " dorQty direct");
    LOG.debug(car.weelsQty + " weelsQty direct");
    car.showData(5);
  }

  private static void baseTypeExecutor() {
    BaseTypesAndLiterals btal = new BaseTypesAndLiterals();
    btal.intLiterals();
    btal.incapabilityTypes();
    btal.wrapperClasses();
  }

  private static void arraysExecutor() {
    MyArrays myArrays = new MyArrays("One");
    MyArrays myArrays1 = new MyArrays("Two");
    LOG.debug(myArrays.getInstanceName());
    LOG.debug(myArrays1.getInstanceName());
    myArrays.doAction();
  }

  private static void warriorExecutor() {
    Warrior warArcher = new Warrior("Sniper", WarSkill.ARCHER);
    Warrior warMagician = new Warrior("Witch", WarSkill.MAGICIAN);
    Warrior warTank = new Warrior("Sword", WarSkill.TANK);
    LOG.debug(warArcher);
    LOG.debug(warMagician);
    LOG.debug(warTank);
  }

  private static void messageGeneralizationExample() {
    LOG.debug("==================================");

    Message<Integer> message1 = new Message<>(100);
    message1.printThisAndAnotherClasses(new Message<>(500));
    message1.printThisAndAnotherClasses(new Message<>(700f));

    Message<Float> message2 = new Message<>(33.3f);
    Integer int1 = message1.getData();
    Float flo1 = message2.getData();
    Message<Number> message3 = new Message<>(555666L);
    Message<Short> message4 = new Message<>(((short) 128));
    Message m1 = new Message<>();
    Message<? super Float> m2 = new Message<Float>();
    m2.setData(new Float(45f));
    m1 = message4;
    Short str1 = (Short) m1.getData();
    LOG.debug(str1);
    m1.setData(45f);
    m1.setData(128);
    m1.setData(null);
    LOG.debug(m1);
    LOG.debug(message2);
    if (message4 instanceof Message) LOG.debug("message4 instanceof Message: true");

    MessageUtils mUtils = new MessageUtils();
    mUtils.getDataFromMessage(message1);
    mUtils.getDataFromMessage(message4);

    Payment<String, Integer> payment1 = new Payment<>("ONE HUNDRED", 100);
    LOG.debug(payment1);
    Payment<StringBuilder, BigDecimal> payment2 =
        new Payment<>(new StringBuilder("TEN POINT TEN"), new BigDecimal("10.10"));
    LOG.debug(payment2);

    Payment payment3 = new Payment<String, BigDecimal>("SixtySix", new BigDecimal("66"));
    payment3.setNameValue("FortyFor");
    LOG.debug(payment3);
    payment3.setDigitValue(LocalDate.now());
    LOG.debug(payment3);
    // payment3 = payment1;  but it work
    Payment.calculate(2, 4, 6, 8, 10);
    Payment.calculate(3, 9);

    Payment.printToLOG(
        new String[] {"vasya", "petya", "kolia"},
        new int[] {1, 2, 3},
        new int[] {100, 200, 300},
        new int[] {10, 9, 8, 7, 6, 5});
  }

  private static void doEnum() {
    Season season = Season.WINTER;
    StringBuilder sb =
        new StringBuilder()
            .append("\nseason.name() = ")
            .append(season.name())
            .append("\nseason.toString() = ")
            .append(season.toString())
            .append("\nseason.ordinal() = ")
            .append(season.ordinal());
    LOG.debug(String.valueOf(sb));

    season = (season == Season.WINTER) ? Season.SUMMER : season;

    LOG.debug(season);

    season = Season.valueOf("AUTUMN");
    LOG.debug(season);
    Season[] values = Season.values();
    String s = Arrays.toString(values);
    LOG.debug(s);

    Map<Integer, String> mapOfSeason = new HashMap<>();
    for(Season enumValue:values){
      Integer key = enumValue.ordinal();
      mapOfSeason.put(key,enumValue.toString());
    }
    mapOfSeason.entrySet().stream()
        .forEach(eS -> LOG.debug(String.format("<%d, %s>", eS.getKey(), eS.getValue())));


    season = Season.WINTER;
    while (season != Season.AUTUMN) {
      season = season.changeSeason();
      LOG.debug(season);
      }
    LOG.debug("WINTER: " + Season.WINTER.isGoodSeason());
    LOG.debug("SUMMER: " + Season.SUMMER.isGoodSeason());
    Season.WINTER.changeQuality();
    LOG.debug("WINTER: " + Season.WINTER.isGoodSeason());

    season = Season.WINTER;
    LOG.debug(season);

    LOG.debug(Arrays.toString(LikeEnumClass.values()));

    LOG.debug(new StringBuilder().append('[').append(LikeEnumClass.AM).append(", ").append(LikeEnumClass.AM.opposite()).append(']'));
    LOG.debug(new StringBuilder().append('[').append(LikeEnumClass.PM).append(", ").append(LikeEnumClass.PM.opposite()).append(']'));

    Season autumn = Enum.valueOf(Season.class, "AUTUMN");
    LOG.debug(autumn);

    WarSkill archer = Season.valueOf(WarSkill.class, "ARCHER");
    LOG.debug(String.format("Val = %s, key = %d", archer.name(), archer.ordinal()));

  }

  private static void abstractClassMagic(){
    Bike threeWeels = Bike.createBike("Three-Weals-Bike");
    LOG.debug(threeWeels);
  }


}
