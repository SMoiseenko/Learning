package by.moiseenko.entity;

import java.io.IOException;
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
    testStaticAndDynamicBinding();
    int i = 0;
    for (i = args.length-1; i >= 0; --i) {
      LOG.debug(args[i]);
    }
    Runner run = new Runner();
    LOG.debug(run.myString);

    BaseTypesAndLiterals btal = new BaseTypesAndLiterals();
    btal.intLiterals();
    btal.incapabilityTypes();
    btal.wrapperClasses();


  }

  private static strictfp void divide(double x, double y) {
    LOG.debug(x / y);
  }

  public static void testStaticAndDynamicBinding() {
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
  }

  private static void doPrivateFinalAndProtectedMethods(Car car) {
    car.publicMethod();
    car.finalMethod();
    car.protectedMethod();
    LOG.debug(car.doorsQty + " dorQty direct");
    LOG.debug(car.weelsQty + " weelsQty direct");
  }
}
