package by.moiseenko.utils;

import by.moiseenko.entity.Man;

import java.util.Scanner;

public class ManCreator {

  private Scanner sc = new Scanner(System.in);
  private Man man = new Man();
  private String scLine;
  private Validator validator = new Validator();

  public Man create() {
    setName();
    setPassword();

    System.out.println(man);
    return man;
  }

  private void setName() {
    System.out.println("Enter name:");
    scLine = sc.nextLine();
    if (!validator.validateName(scLine)) {
      System.out.printf("%s - not valid name", scLine);
      setName();
    } else man.setName(scLine);
  }

  private void setPassword(){
    System.out.println("Enter password:");
    scLine = sc.nextLine();
      if (!validator.validatePassword(scLine)) {
          System.out.printf("%s - not valid name", scLine);
          setPassword();
      } else man.setPassword(scLine);
  }
}
