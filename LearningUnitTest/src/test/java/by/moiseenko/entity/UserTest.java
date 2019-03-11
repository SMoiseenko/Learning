package by.moiseenko.entity;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserTest {

  @AfterMethod
  private void deleteData() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    User user = new User("Vasya", 23, Sex.MALE);
    Method method = User.class.getMethod("deleteAllUsers");
    method.setAccessible(true);
    method.invoke(user);
  }

  @Test
  public void testGetAllUsers() {
    User vasya = new User("Vasya", 23, Sex.MALE);
    User petya = new User("Petya", 44, Sex.MALE);
    User olya = new User("Olya", 18, Sex.FEMALE);

    List<User> expected = new ArrayList<>();
    expected.add(vasya);
    expected.add(petya);
    expected.add(olya);

    List<User> actual = User.getAllUsers();
    Assert.assertEquals(actual, expected);
  }

  @Test
  public void testGetAllUsersBySex() {
    User vasya = new User("Vasya", 23, Sex.MALE);
    User petya = new User("Petya", 44, Sex.MALE);
    User olya = new User("Olya", 18, Sex.FEMALE);
    List<User> expectedMALE = new ArrayList<>();
    expectedMALE.add(vasya);
    expectedMALE.add(petya);

    List<User> actual = User.getAllUsers(Sex.MALE);
    Assert.assertEquals(actual, expectedMALE);
  }

  @Test
  public void testGetAllUsers_NOT_NULL() {
    List<User> actual = User.getAllUsers();
    System.out.println(actual);
    Assert.assertNotNull(actual);
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
