package by.moiseenko.entity;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
  private static final Logger LOG = LogManager.getLogger(User.class);
  private static int count = 0;
  private static Map<Integer, User> allUsers = new HashMap<>();
  private int id;
  private String name;
  private int age;
  private Sex sex;
  private Password password;
  private static final String PRIVATE_MESSAGE = "YOUR HACKED ME ;)";

  public User(){

  }

  public User(String name, int age, Sex sex, String password) {
    if (name != null && !name.equals("") && age > 0 && sex != null) {

      this.name = name;
      this.age = age;
      this.sex = sex;
      this.password = new Password(password);

      if (!hasUser()) {
        count++;
        this.id = count;
        allUsers.put(id, this);
      }
    }
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

  public Password getPassword() {
    return password;
  }

  public String getPrivateMessage(String password) {
    return (this.password.checkPassword(password)) ? PRIVATE_MESSAGE : "PASSWORD INVALID";
  }

  //  public String getSalt() {
  //    return salt;
  //  }

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





  public class Password {
    private String hashedPassword;
    private String salt;

    public Password(String password) {
      this.hashedPassword = encodePassword(password);
    }

    public String getHashedPassword() {
      return hashedPassword;
    }

    public String getSalt() {
      return salt;
    }

    private void generateSalt() {
      SecureRandom secureRandom = new SecureRandom();
      byte[] salt = new byte[16];
      secureRandom.nextBytes(salt);
      this.salt = byteArrayToHexString(salt);
    }

    //    private byte[] generateSalt(int size) {
    //      SecureRandom secureRandom = new SecureRandom();
    //      byte[] salt = new byte[size];
    //      secureRandom.nextBytes(salt);
    //      return salt;
    //    }

    private String encodePassword(String password) {
      if (this.salt == null) {
        generateSalt();
      }

      try {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        md.update(hexStringToByteArray(this.salt));
        byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
        return byteArrayToHexString(hashedPassword);
      } catch (NoSuchAlgorithmException e) {
        LOG.error(e);
      }
      return null;
    }

    public boolean checkPassword(String password) {
      return this.hashedPassword.equals(encodePassword(password));
    }

    private String byteArrayToHexString(byte[] salt) {
      StringBuilder sb = new StringBuilder();
      for (byte b : salt) {
        sb.append(String.format("%02X", b));
      }
      return sb.toString();
    }

    private byte[] hexStringToByteArray(String hexString) {
      int len = hexString.length();
      byte[] data = new byte[len / 2];
      for (int i = 0; i < len; i += 2) {
        data[i / 2] =
            (byte)
                ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
      }
      return data;
    }
  }

}
