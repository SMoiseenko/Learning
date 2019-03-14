package by.moiseenko.test.entity;

import by.moiseenko.entity.Sex;
import by.moiseenko.entity.User;
import org.testng.annotations.DataProvider;

import java.util.List;

public class DataProviderForTestUserClass {
  private User user;
  private User user1;
  private User user2;

  @DataProvider
  private Object[][] forGetAllUsers() {
    initUserMap();
    return new Object[][] {{List.of(user, user1, user2)}};
  }

  @DataProvider
  private Object[][] forGetAllUsersBySex() {
    initUserMap();
    return new Object[][] {{List.of(user, user1), Sex.MALE}, {List.of(user2), Sex.FEMALE}};
  }

  @DataProvider
  private Object[][] forGetHowManyUsers() {
    initUserMap();
    return new Object[][] {{3}};
  }

  @DataProvider
  private Object[][] forGetHowManyUsersBySex() {
    initUserMap();
    return new Object[][] {{2, Sex.MALE}, {1, Sex.FEMALE}};
  }

  @DataProvider
  private Object[][] forGetAllUsersAge() {
    initUserMap();
    return new Object[][] {{85}};
  }

  @DataProvider
  private Object[][] forGetAverageAgeOfAllUsers() {
    initUserMap();
    return new Object[][] {{28}};
  }

  @DataProvider
  private Object[][] forGetAverageAgeOfAllUsersBySex() {
    initUserMap();
    return new Object[][] {{33, Sex.MALE}, {18, Sex.FEMALE}};
  }

  @DataProvider
  private Object[][] forGetAllUsersAgeBySex() {
    initUserMap();
    return new Object[][] {{67, Sex.MALE}, {18, Sex.FEMALE}};
  }

  @DataProvider
  private Object[][] forValidateUserData() {
    initUserMap();
    new User("", 23, Sex.MALE, "pass");
    new User("Petya", 44, null, "pass");
    new User("Olya", -30, Sex.FEMALE, "pass");
    new User(null, 130, Sex.FEMALE, "pass");
    int i = 0;
    return new Object[][] {{}};
  }

  private void initUserMap() {
    if (user == null || user1 == null || user2 == null) {
      user = new User("Vasya", 23, Sex.MALE, "pass");
      user1 = new User("Petya", 44, Sex.MALE, "pass");
      user2 = new User("Olya", 18, Sex.FEMALE, "pass");
    }
  }
}
