package by.moiseenko.entity;

import by.moiseenko.utils.HouseUtils;
import by.moiseenko.utils.impl.HouseCreatorImpl;
import by.moiseenko.utils.impl.HouseUtilsImpl;
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
    matrixShow();

    LOG.debug("\n*************************");
    houseExamples();
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
    String s3 = new String(new char[]{'J', 'a', 'v', 'a'}); // created in heap
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
    m2.setData(45f);
    m1 = message4;
    Short str1 = (Short) m1.getData();
    LOG.debug(str1);
    m1.setData(45f);
    m1.setData(128);
    m1.setData(null);
    LOG.debug(m1);
    LOG.debug(message2);
    if (message4 instanceof Message) {
      LOG.debug("message4 instanceof Message: true");
    }

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
        new String[]{"vasya", "petya", "kolia"},
        new int[]{1, 2, 3},
        new int[]{100, 200, 300},
        new int[]{10, 9, 8, 7, 6, 5});
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
    for (Season enumValue : values) {
      Integer key = enumValue.ordinal();
      mapOfSeason.put(key, enumValue.toString());
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

    LOG.debug(
        new StringBuilder()
            .append('[')
            .append(LikeEnumClass.AM)
            .append(", ")
            .append(LikeEnumClass.AM.opposite())
            .append(']'));
    LOG.debug(
        new StringBuilder()
            .append('[')
            .append(LikeEnumClass.PM)
            .append(", ")
            .append(LikeEnumClass.PM.opposite())
            .append(']'));

    Season autumn = Enum.valueOf(Season.class, "AUTUMN");
    LOG.debug(autumn);

    WarSkill archer = Season.valueOf(WarSkill.class, "ARCHER");
    LOG.debug(String.format("Val = %s, key = %d", archer.name(), archer.ordinal()));
  }

  private static void abstractClassMagic() {
    Bike threeWeels = Bike.createBike("Three-Weals-Bike");
    LOG.debug(threeWeels);
  }

  private static void matrixShow() {
    Matrix matrix = new Matrix(5, 4);
  }

  private static void houseExamples() {
    House house, house1, house2, house3, house4, house5, house6, house7, house8, house9;

    try {
      house =
          new HouseCreatorImpl()
              .createHouse(10, 55.22, 3, 2, "Kleckova str.", "retail", LocalDate.of(2020, 12, 31));
//      LOG.debug(house);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house1 = new HouseCreatorImpl()
          .createHouse(1, 100.00, 1, 3, "BLK str.", "office", LocalDate.of(2100, 3, 20));
//      LOG.debug(house1);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house2 = new HouseCreatorImpl()
          .createHouse(37, 55.66, 7, 2, "Ostrovskogo str.", "SPECIAL_PURPOSE",
              LocalDate.of(2025, 1, 15));
//      LOG.debug(house2);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house3 = new HouseCreatorImpl()
          .createHouse(12, 31.47, 3, 3, "Vilenskaya str.", "retail", LocalDate.of(2100, 6, 1));
//      LOG.debug(house3);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house4 = new HouseCreatorImpl()
          .createHouse(66, 31.47, 85, 3, "Ozeshko str.", "retail", LocalDate.of(2050, 3, 3));
//      LOG.debug(house4);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house5 = new HouseCreatorImpl()
          .createHouse(66, 135.14, 34, 7, "Kleckova str.", "office", LocalDate.of(2088, 4, 25));
//      LOG.debug(house5);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house6 = new HouseCreatorImpl()
          .createHouse(5, 350.00, 15, 30, "Gorkogo str.", "office", LocalDate.of(2088, 4, 25));
//      LOG.debug(house6);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house7 = new HouseCreatorImpl()
          .createHouse(26, 35.14, 1, 4, "BLK str.", "retail", LocalDate.of(2088, 4, 25));
//      LOG.debug(house7);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house8 = new HouseCreatorImpl()
          .createHouse(76, 333.33, 85, 20, "Lidskaya str.", "special_purpose",
              LocalDate.of(2088, 4, 25));
//      LOG.debug(house8);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }
    try {
      house9 = new HouseCreatorImpl()
          .createHouse(158, 140.40, 26, 1, "Olshanka str.", "nonono", LocalDate.of(2088, 4, 25));
//      LOG.debug(house9);
    } catch (IllegalArgumentException iae) {
      LOG.error(iae);
    }

    HouseUtils houseUtils = new HouseUtilsImpl(HouseRepoType.JSON, "house_db.json");
    House[] result = houseUtils.houseArrayWithRoomsQty(30);
    LOG.debug(Arrays.toString(result));

    result = houseUtils.houseArrayWithRoomsQtyOnFloorsInterval(3, 50, 100);
    LOG.debug(Arrays.toString(result));

    result = houseUtils.houseArrayWithFlatSquareMoreThan(300.00);
    LOG.debug(Arrays.toString(result));

  }
}
