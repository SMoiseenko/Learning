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
    setHexValue();
    setSlug();
    seteMail();
    setUrl();
    setIpAdress();
    setHtmlTag();


    System.out.println(man);
    return man;
  }

  private void setName() {
    System.out.println("Enter name:");
    scLine = sc.nextLine();
    if (!validator.validateName(scLine)) {
      System.out.printf("%s - not valid name.%n", scLine);
      setName();
    } else man.setName(scLine);
  }

  private void setPassword(){
    System.out.println("Enter password:");
    scLine = sc.nextLine();
      if (!validator.validatePassword(scLine)) {
          System.out.printf("%s - not valid password.%n", scLine);
          setPassword();
      } else man.setPassword(scLine);
  }

  private void setHexValue(){
    System.out.println("Enter Hex value:");
    scLine = sc.nextLine();
    if (!validator.validateHexValue(scLine)) {
      System.out.printf("%s - not valid hex value.%n", scLine);
      setHexValue();
    } else man.setHexValue(scLine);
  }

  private  void setSlug(){
    System.out.println("Enter slug:");
    scLine = sc.nextLine();
    if (!validator.validateSlug(scLine)) {
      System.out.printf("%s - not valid slug.%n", scLine);
      setSlug();
    } else man.setSlug(scLine);
  }

  public void seteMail() {
    System.out.println("Enter email:");
    scLine = sc.nextLine();
    if (!validator.validateEMail(scLine)) {
      System.out.printf("%s - not valid email.%n", scLine);
      seteMail();
    } else man.seteMail(scLine);
  }

  public void setUrl() {
    System.out.println("Enter URL :");
    scLine = sc.nextLine();
    if (!validator.validateURL(scLine)) {
      System.out.printf("%s - not valid URL.%n", scLine);
      setUrl();
    } else man.setUrl(scLine);
  }

  public void setIpAdress() {
    System.out.println("Enter IP Address:");
    scLine = sc.nextLine();
    if (!validator.validateIPAdress(scLine)) {
      System.out.printf("%s - not valid ip address.%n", scLine);
      setIpAdress();
    } else man.setIpAdress(scLine);
      }

  public void setHtmlTag() {
    System.out.println("Enter HTML Tag:");
    scLine = sc.nextLine();
    if (!validator.validateHTMLTag(scLine)) {
      System.out.printf("%s - not valid HTML Tag.%n", scLine);
      setHtmlTag();
    } else man.setHtmlTag(scLine);
  }











}
