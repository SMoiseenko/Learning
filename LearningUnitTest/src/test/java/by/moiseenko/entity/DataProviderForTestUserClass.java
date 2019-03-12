package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

public class DataProviderForTestUserClass {
  private static final Logger LOG = LogManager.getLogger(DataProviderForTestUserClass.class.getName());

  @DataProvider
  private Object[][] testGetAllUsersData() {
    User vasya = new User("Vasya", 23, Sex.MALE);
    User petya = new User("Petya", 44, Sex.MALE);
    User olya = new User("Olya", 18, Sex.FEMALE);

    List<User> expected = new ArrayList<>();
    expected.add(vasya);
    expected.add(petya);
    expected.add(olya);
    LOG.debug(expected);
    return new Object[][] {{expected}};
  }

  @DataProvider
  private Object[][] testGetAllUsersDataBySex() {
    User vasya = new User("Vasya", 23, Sex.MALE);
    User petya = new User("Petya", 44, Sex.MALE);
    User olya = new User("Olya", 18, Sex.FEMALE);
    List<User> expectedMALE = new ArrayList<>();
    expectedMALE.add(vasya);
    expectedMALE.add(petya);
    List<User> expectedFEMALE = new ArrayList<>();
    expectedFEMALE.add(olya);
    LOG.debug(expectedFEMALE);
    LOG.debug(expectedFEMALE);
    return new Object[][] {{expectedMALE, Sex.MALE}, {expectedFEMALE, Sex.FEMALE}};
  }
}
