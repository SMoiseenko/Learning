package by.moiseenko;

import by.moiseenko.entity.Sex;
import by.moiseenko.entity.User;

import java.io.FileWriter;

public class Runner {
    private static String vasyaPassword = "1";
  public static void main(String[] args) throws Throwable {
    User vasya = new User("Vasya", 30, Sex.MALE, vasyaPassword);
    vasya.setPrivateMessage("YOUR_BUNNY_WROTE");
    System.out.println(vasya.getPrivateMessage("pas0"));
    System.out.println(vasya.getPrivateMessage(vasyaPassword));
    FileWriter fw = new FileWriter("./vasyapass.txt", true);
    fw.write(vasya.getPassword() + "\n");
    fw.flush();
    fw.close();
  }
}
