package by.moiseenko.entity;

import by.moiseenko.util.impl.ButtonEventHandler;

public class Button {
  private ButtonEventHandler buttonEventHandler;

  public Button(ButtonEventHandler buttonEventHandler) {
    this.buttonEventHandler = buttonEventHandler;
  }

  public void click() {
    buttonEventHandler.execute();
  }
}
