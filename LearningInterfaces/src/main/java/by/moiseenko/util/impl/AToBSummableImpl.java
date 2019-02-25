package by.moiseenko.util.impl;

import by.moiseenko.entity.Bclass;
import by.moiseenko.util.AToBSummable;

public class AToBSummableImpl implements AToBSummable {

  @Override
  public int summaAandB(Bclass b) {
    return b.getA() + b.getB();
  }
}
