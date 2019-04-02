package by.moiseenko.entity;

import java.math.BigDecimal;
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
    m1 = message4;
    Short str1 = (Short) m1.getData();
    LOG.debug(str1);
    m1.setData(new Float(45f));
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
  }
}
