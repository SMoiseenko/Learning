package by.moiseenko.util.impl;

import by.moiseenko.annotation.BankingAnnotation;
import by.moiseenko.entity.SecurityLevelEnum;
import by.moiseenko.util.AccountOperationManager;

import static by.moiseenko.entity.SecurityLevelEnum.HIGH;

public class AccountOperationManagerImpl implements AccountOperationManager {

  @Override
  @BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
  public double depositInCash(int accountNumber, int amount) {
    System.out.println("depositInCash default implementation");
    return 0;
  }

  @Override
  @BankingAnnotation(securityLevel = HIGH)
  public boolean withdraw(int accountNumber, int amount) {
    System.out.println("withdraw default implementation");
    return false;
  }

  @Override
  @BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
  public boolean convert(double amount) {
    System.out.println("convert default implementation");
    return false;
  }

  @Override
  @BankingAnnotation
  public boolean transfer(int accountNumber, int amount) {
    System.out.println("transfer default implementation");
    return false;
  }
}
