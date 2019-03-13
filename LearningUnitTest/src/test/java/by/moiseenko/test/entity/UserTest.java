package by.moiseenko.test.entity;

import by.moiseenko.entity.Sex;
import by.moiseenko.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserTest {
  private static final Logger LOG = LogManager.getLogger(UserTest.class);

  //  @BeforeMethod
  //  private void beforeMethod(Method method) {
  //    String[] methodNames = new String[] {"testGetAllUsersNPE"};
  //    if (Arrays.stream(methodNames).anyMatch(method.getName()::equals)) {
  //      User.resetUser();
  //    }
  //  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAllUsers",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsers(List<User> expected) {
    List<User> actual = User.getAllUsers();
    LOG.debug(String.format("%nactual: %s%nexpected: %s", actual.toString(), expected.toString()));
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testGetAllUsersNPE() {
    List<User> actual = User.getAllUsers();
    LOG.debug(String.format("%nactual: %s", actual));
    Assert.assertNotNull(actual);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAllUsersBySex",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsersBySex(List<User> expected, Sex sex) {
    List<User> actual = User.getAllUsers(sex);
    LOG.debug(String.format("%nactual: %s%nexpected: %s", actual.toString(), expected.toString()));
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetHowManyUsers",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetHowManyUsers(int expected) {
    int actual = User.getHowManyUsers();
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetHowManyUsersBySex",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetHowManyUsersBySex(int expected, Sex sex) {
    int actual = User.getHowManyUsers(sex);
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAllUsersAge",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsersAge(int expected) {
    int actual = User.getAllUsersAge();
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAverageAgeOfAllUsers",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAverageAgeOfAllUsers(int expected) {
    int actual = User.getAverageAgeOfAllUsers();
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAverageAgeOfAllUsersBySex",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAverageAgeOfAllUsersBySex(int expected, Sex sex) {
    int actual = User.getAverageAgeOfAllUsers(sex);
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forGetAllUsersAgeBySex",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void testGetAllUsersAgeBySex(int expected, Sex sex) {
    int actual = User.getAllUsersAge(sex);
    Assert.assertEquals(actual, expected);
  }

  @Test(
      dependsOnMethods = "testGetAllUsersNPE",
      dataProvider = "forValidateUserData",
      dataProviderClass = DataProviderForTestUserClass.class)
  public void validateUserData() {
    if (User.getAllUsers().stream()
        .anyMatch(
            user ->
                user.getName() == null
                    || user.getName().equals("")
                    || user.getAge() < 0
                    || user.getSex() == null)) {
      LOG.debug("Bad User Data");
      Assert.fail("Bad User Data");
    }
    LOG.debug("USer protected from wrong or null data");
    User.resetUser();
  }
}
