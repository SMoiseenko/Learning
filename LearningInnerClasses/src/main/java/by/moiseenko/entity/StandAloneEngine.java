package by.moiseenko.entity;

import by.moiseenko.entity.Ship.Engine;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class StandAloneEngine extends Ship.Engine {
  private static final Logger LOG = LogManager.getLogger(StandAloneEngine.class.getName());

  public StandAloneEngine(@NotNull Ship ship) {
    ship.super();
  }


}
