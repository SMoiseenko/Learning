package by.moiseenko.utils.impl;

import by.moiseenko.utils.EventHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EventHandlerImpl implements EventHandler {

  private final Logger LOG = LogManager.getLogger(EventHandlerImpl.class.getName());

  @Override
  public void execute() {
    LOG.debug("EVENT WAS FOUND");
  }
}
