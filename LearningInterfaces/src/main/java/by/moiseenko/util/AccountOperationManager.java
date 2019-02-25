package by.moiseenko.util;

public interface AccountOperationManager {
  public double depositInCash(int accountNumber, int amount);

  public boolean withdraw(int accountNumber, int amount);

  public boolean convert(double amount);

  public boolean transfer(int accountNumber, int amount);
}
