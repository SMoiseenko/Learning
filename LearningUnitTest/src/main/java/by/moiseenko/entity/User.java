package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.*;

public class User {
  private int id;
  private String name;
  private int age;
  private Sex sex;
  private String password;
  private String privateMessage;
  private String salt;

  private static int count = 0;
  private static Map<Integer, User> allUsers = new HashMap<>();
  private static final Logger LOG = LogManager.getLogger(User.class);

  public User(String name, int age, Sex sex, String password) {
    if (name != null && !name.equals("") && age > 0 && sex != null) {

      this.name = name;
      this.age = age;
      this.sex = sex;
      this.password = passwordEncoder(password);

      if (!hasUser()) {
        count++;
        this.id = count;
        allUsers.put(id, this);
      }
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

  public String getPassword() {
    return password;
  }

  public void setPrivateMessage(String privateMessage) {
    this.privateMessage = privateMessage;
  }

  public String getPrivateMessage(String password) {
    return (checkPassword(password)) ? privateMessage : "PASSWORD INVALID";
  }
  public String getSalt(){
    return salt;
  }

  private boolean hasUser() {
    for (User user : allUsers.values()) {
      if (user.getName().equals(this.name)
          && user.getAge() == this.age
          && user.getSex() == this.sex) {
        this.id = user.getId();
        return true;
      }
    }
    return false;
  }

  public static void resetUser() {
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
    return getAllUsers().size();
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

  private String passwordEncoder(String password) {
    if (password != null) {
      SecureRandom random = new SecureRandom();
      byte[] salt = new byte[16];
      random.nextBytes(salt);
      this.salt = byteArrayToString(salt);
      return cryptoPass(password, this.salt);
    }
    return null;
  }

  private boolean checkPassword(String password) {
    if (password != null) {
      if (cryptoPass(password, this.salt).equals(this.password)) {
        return true;
      }
    }
    return false;
  }

  private String cryptoPass(String password, String salt) {
    byte[] hashedPassword = new byte[0];
    byte[] saltArray = salt.getBytes();
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-512");
      md.update(saltArray);
      hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }

    return byteArrayToString(hashedPassword);
  }

  private String byteArrayToString(byte[] salt){
    StringBuilder sb = new StringBuilder();
    for (byte b : salt) {
      sb.append(String.format("%02X", b));
    }
    return sb.toString();
  }
}
