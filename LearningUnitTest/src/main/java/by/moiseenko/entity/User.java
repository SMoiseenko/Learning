package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class User {
  private int id;
  private String name;
  private int age;
  private Sex sex;

  private static int count = 0;
  private static Map<Integer, User> allUsers = new HashMap<>();
  private static final Logger LOG = LogManager.getLogger(User.class);

  public User(String name, int age, Sex sex) {

    this.name = name;
    this.age = age;
    this.sex = sex;

    if (!hasUser()) {
      count++;
      this.id = count;
      allUsers.put(id, this);
    }
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Sex getSex() {
    return sex;
  }

  private boolean hasUser() {
    for (User user : allUsers.values()) {
      if (user.getName().equals(this.name) && user.getAge() == this.age && user.getSex() == this.sex) {
        this.id = user.getId();
        return true;
      }
    }
    return false;
  }

  public static void deleteAllUsers(){
    allUsers.clear();
    count = 0;
  }

  public static List<User> getAllUsers() {
    return new ArrayList<>(allUsers.values());
  }

  public static List<User> getAllUsers(Sex sex) {
    List<User> userList = new ArrayList<>();
    for (User user : allUsers.values()) {
      if (user.sex == sex) {
        userList.add(user);
      }
    }
    return userList;
  }

  public static int getHowManyUsers() {
    return allUsers.size();
  }

  public static int getHowManyUsers(Sex sex) {
    return getAllUsers(sex).size();
  }

  public static int getAllUsersAge() {
    int totalAges = 0;
    for (User user : allUsers.values()) {
      totalAges += user.age;
    }
    return totalAges;
  }

  public static int getAverageAgeOfAllUsers() {
    return getAllUsersAge() / getHowManyUsers();
  }

  public static int getAverageAgeOfAllUsers(Sex sex) {
    return getAllUsersAge(sex) / getHowManyUsers(sex);
  }

  public static int getAllUsersAge(Sex sex) {
    int totalAges = 0;
    for (User user : getAllUsers(sex)) {
      totalAges += user.age;
    }
    return totalAges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return id == user.id && age == user.age && name.equals(user.name) && sex == user.sex;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, age, sex);
  }

  @Override
  public String toString() {
    return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", sex=" + sex + '}';
  }
}
