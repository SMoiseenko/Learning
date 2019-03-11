package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserTest {
  private static final Logger LOG = LogManager.getLogger("TestLog");

  @AfterMethod
  private void resetData() {
    User.resetUser();
  }

  @Test(
      dataProvider = "testGetAllUsersData",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsers(List<User> expected) {
    List<User> actual = User.getAllUsers();
    LOG.debug(String.format("%nactual: %s%nexpected: %s", actual.toString(), expected.toString()));
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testGetAllUsersNPE() {
    List<User> actual = User.getAllUsers();
    LOG.debug("%nactual: %s", actual);
    Assert.assertNotNull(actual);
  }

  @Test(
      dataProvider = "testGetAllUsersDataBySex",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsersBySex(List<User> expected, Sex sex) {
    List<User> actual = User.getAllUsers(sex);
    LOG.debug(String.format("%nactual: %s%nexpected: %s", actual.toString(), expected.toString()));
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testGetHowManyUsers() {}

  @Test
  public void testGetHowManyUsers1() {}

  @Test
  public void testGetAllUsersAge() {}

  @Test
  public void testGetAverageAgeOfAllUsers() {}

  @Test
  public void testGetAverageAgeOfAllUsers1() {}

  @Test
  public void testGetAllUsersAge1() {}
}
