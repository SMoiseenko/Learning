package by.moiseenko;

import by.moiseenko.entity.*;
import by.moiseenko.exception.MethodDoNotRealizeException;
import by.moiseenko.exception.YouForgetAnnotationException;
import by.moiseenko.util.*;
import by.moiseenko.util.impl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

import static java.util.List.of;

public class Runner {
  private static final Logger logger = LogManager.getLogger(Runner.class);

  public static void main(String[] args) throws MethodDoNotRealizeException {
    TransportCreatorImpl transportCreator = new TransportCreatorImpl();

    Transport car = transportCreator.create("Mazda", "6", 4);
    Transport car1 = transportCreator.create("Toyota", "Corrola", 5);
    Transport car2 = transportCreator.create("Vaz", "Kopeyka", 2);

    Transport bike = transportCreator.create("Iz", "Planeta 5");
    Transport bike1 = transportCreator.create("Honda", "CBR 600");
    Transport bike2 = transportCreator.create("Harley-Davidson", "Inferno");

    List<Transport> transportList = of(car, car1, car2, bike, bike1, bike2);

    printAllElements(transportList);

    Drivable<Car> drivableCar = new DrivableCarImpl();
    Drivable<Bike> drivableBike = new DrivableBikeImpl();

    for (Transport t : transportList) {
      if (t instanceof Car) {
        drivableCar.driveBack((Car) t);
      } else if (t instanceof Bike) {
        drivableBike.driveFront((Bike) t);
      }
    }

    transportList.stream()
        .filter(ex -> ex instanceof Car)
        .forEach((tran) -> drivableCar.turnLeft((Car) tran));
    transportList.stream()
        .filter(ex -> ex instanceof Bike)
        .forEach((tran) -> drivableBike.turnRight((Bike) tran));

    printAllElements(transportList);

    Drivable.doAction();

    AToBSummableImpl aToBSummable = new AToBSummableImpl();
    Bclass bclass = new Bclass(5, 7);
    int c = aToBSummable.summaAandB(bclass);
    logger.debug(bclass + "  " + c + "  " + bclass.mult());

    ManCreator manCreator = new ManCreatorImpl();
    try {
      Man man = manCreator.createMan("Boris", 15);
      System.out.println(man);
    } catch (YouForgetAnnotationException | IllegalArgumentException ex) {
      logger.debug(ex);
    }

    try {
      Man man = manCreator.createMan("Boris", 30);
      System.out.println(man);
    } catch (YouForgetAnnotationException | IllegalArgumentException ex) {

      logger.debug(ex);
    }

    try {
      Man man = manCreator.createMan("Boris", 300);
      System.out.println(man);
    } catch (YouForgetAnnotationException | IllegalArgumentException ex) {

      logger.debug(ex);
    }

    ClassUtils myClassUtils = new ClassUtilsImpl();
    myClassUtils.printAllClassElementsInfo(car2);

    AccountOperationManager account = new AccountOperationManagerImpl();
    AccountOperationManager securityAccount = SecurityFactory.createSecurityObject(account);

    securityAccount.depositInCash(154, 6);
    securityAccount.withdraw(7854, 54);
    securityAccount.convert(58.47d);
    securityAccount.transfer(547, 5874);

    Button printButton = new Button(new ButtonEventHandlerImpl());
    printButton.click();
    printButton.click();

    Button tvButton =
        new Button(
            new ButtonEventHandler() {
              @Override
              public void execute() {
                System.out.println("tv button pushed");
              }
            });

    tvButton.click();

    List<Button> buttonList = List.of(printButton, tvButton);
    for (Button b : buttonList) {
      b.click();
    }

    //
    String strToArray = "HELLO WORLD)))";
    ByteArrayStreamTest byteArrayStreamTest = new ByteArrayStreamTest();
    byteArrayStreamTest.byteToArrayInputStreamTest(strToArray);

    //
    File myFile = new File("./result.txt");
    Scanner2PrintWriter scanner2PrintWriter = new Scanner2PrintWriter();
    scanner2PrintWriter.fromTheConsoleToTheFile(myFile);

    //
    BufferdInputReaderTest birt = new BufferdInputReaderTestImpl();
    String newPath = System.getProperty("user.home") + "/Release.key";
    System.out.println(newPath);
    birt.readFromFile(newPath, 128);

    //
    Serrialaz serrialaz = new Serrialaz();
    serrialaz.serrializeObject2File("./serBike.dat", bike);

    Transport bikeser = (Transport) serrialaz.serrializeObject4romFile("./serBike.dat");
    logger.debug(bike.equals(bikeser) + "\n" + bikeser.toString());

    NIOTest nioTest = new NIOTest();
    nioTest.doAction();
  }
  // http://www.quizful.net/post/java-nio-tutorial

  private static void printAllElements(@NotNull List<?> collection) {

    for (Object e : collection) {
      logger.debug(e);
    }
    //        Iterator collectionListIterator = collection.listIterator();
    //        while (collectionListIterator.hasNext()){
    //            logger.debug(collectionListIterator.next());
    //       }

  };
}
