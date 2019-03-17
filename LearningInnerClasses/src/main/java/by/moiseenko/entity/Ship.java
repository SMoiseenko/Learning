package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ship extends AShip {
  private final String message = "I AM SHIP";
  private Engine engine = new Engine();
  private int shipNumber = 10;
  private static int count = 0;

  public void getFromEngine(){
   new Engine().LOG.debug("I can take private fields from inner class");
  }

  public void readPrivateFieldFromInnerClass(){
    LOG.debug(engine.enginePrivatefield);
  }
   public void exsecutePrivateMethodFromInnerClass(){
    engine.enginePrivateMEthod();
   }

   public void haveShipTheBoart(){
    LOG.debug(Boart.boardMEssage);
   }

  public class Engine extends AEngine {
    private final Logger LOG = LogManager.getLogger(Engine.class.getName());

    private String enginePrivatefield = "I AM ENGINE PRIVATE FIELD";

    public int shipNumber = 1024;

    public Engine(){
      LOG.debug("I AM ENGINE DEFAULT CONSTRUCTOR");
    }

    private void enginePrivateMEthod(){
      LOG.debug("I AM ENGINE PRIVATE METHOD");
    }

    public void doAction() {
      LOG.debug(message);
      ALOG.debug(message);
      Ship.LOG.debug(message);

    }
    }
    public static class Boart{
    private static String boardMEssage = "I AM THE STATIC BOARD";
    public static Engine engine = new Ship().new Engine();
    public static void willAnswerMyself(){
      LOG.debug(boardMEssage);
    }
    public void tryGetOuterMessage(){
      count++;
      Ship ship = new Ship();
      LOG.debug(ship.shipNumber + " First create instance of outer class, than you have access to all fields");
    }

    }
}
