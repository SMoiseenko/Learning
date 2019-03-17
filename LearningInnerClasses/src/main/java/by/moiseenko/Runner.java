package by.moiseenko;

import by.moiseenko.entity.Ship;
import by.moiseenko.entity.Ship.Boart;
import by.moiseenko.entity.StandAloneEngine;
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
    LOG.debug("Is sunny now outside:" + sunny.isThereTheSunNow() );
    Ship.Boart boart = new Ship.Boart(); // create static nested class instance
    boart.tryGetOuterMessage();

    new Sunny() {
      @Override
      public boolean isThereTheSunNow() {
        LOG.debug("I AM ANONYMOUS CLASS");
        return false;
      }
    }.isThereTheSunNow();

      }
}
