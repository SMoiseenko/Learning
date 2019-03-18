package by.moiseenko;

import by.moiseenko.entity.BlueRayDisk;
import by.moiseenko.entity.Keyboard;
import by.moiseenko.entity.Ship;
import by.moiseenko.entity.Ship.Boart;
import by.moiseenko.entity.StandAloneEngine;
import by.moiseenko.utils.EventHandler;
import by.moiseenko.utils.Sunny;
import by.moiseenko.utils.impl.OutdoorIllumination;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
  private static final Logger LOG = LogManager.getLogger(Runner.class.getName());
  static Ship nullShip = new Ship();

  public static void main(String[] args) {
    Ship.Engine shipEngine = new Ship().new Engine(); // create inner class instance
    shipEngine.doAction();
    Ship ship = new Ship();
    Ship.Engine shipEngine1 = ship.new Engine();
    ship.getFromEngine();
    shipEngine1.doAction();
    ship.readPrivateFieldFromInnerClass();
    ship.exsecutePrivateMethodFromInnerClass();
    ship.haveShipTheBoart();
    Ship.Boart.willAnswerMyself();
    Boart.engine.doAction();

    StandAloneEngine standAloneEngine = new StandAloneEngine(nullShip);
    standAloneEngine.doAction();
    Sunny sunny = new OutdoorIllumination();
    LOG.debug("Is sunny now outside:" + sunny.isThereTheSunNow());
    Ship.Boart boart = new Ship.Boart(); // create static nested class instance
    boart.tryGetOuterMessage();

    new Sunny() {
      @Override
      public boolean isThereTheSunNow() {
        LOG.debug("I AM ANONYMOUS CLASS");
        return false;
      }
    }.isThereTheSunNow();

    s12.isThereTheSunNow();

    new Thread(
        new Runnable() {
          @Override
          public void run() {
            LOG.debug("I AM NEW THREAD");
          }
        },
        "ANOTHER_THREAD")
        .start();

    Thread thread = new Thread() {
      @Override
      public void run() {
        Thread.currentThread().setName("THREAD");
        super.run();
        LOG.debug("I AM RUNNING IN NEW THREAD");
      }
    };
    thread.start();

    Ship sh1 = new Ship() {
      @Override
      public void getFromEngine() {
        LOG.debug(
            "YO-HO-HO I AM ANONYMOUS CLASS THAT EXTENDS BY SHEEP AND I OVERWRITE HIS METHOD!!!");
      }
    };

    ship.getFromEngine();
    sh1.getFromEngine();

    Keyboard keyboard = new Keyboard(new EventHandler() {
      private final Logger LOG = LogManager.getLogger(Keyboard.class.getName());

      @Override
      public void execute() {
        LOG.debug("EVENT WAS FOUND");
      }
    });
    keyboard.pushKey1();
    keyboard.pushKey2();
    keyboard.pushKey3();

    BlueRayDisk emptyDisk = new BlueRayDisk();
    emptyDisk.printAllFilesOnTheDisk();
    BlueRayDisk disk = new BlueRayDisk("film.avi", "music.mp3", "picture.jpeg");
    disk.printAllFilesOnTheDisk();

  }

  static Sunny s12 =
      () -> {
        LOG.debug("I AM LAMBDA");
        return false;
      };
}
