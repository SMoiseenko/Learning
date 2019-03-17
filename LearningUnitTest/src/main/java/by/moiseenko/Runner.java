package by.moiseenko;

import by.moiseenko.entity.Sex;
import by.moiseenko.entity.User;

import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Runner {
  private static String salt = "HELLO";
  private static String text = "WORLD";

  public static void main(String[] args) throws Throwable {
    byte[] res1 = new byte[0];
    byte[] res2 = new byte[0];
    byte[] res3 = new byte[0];
    byte[] res4 = new byte[0];
    byte[] res5 = new byte[0];
    MessageDigest md = MessageDigest.getInstance("MD5");
    res1 = md.digest(salt.concat(text).getBytes(StandardCharsets.UTF_8));
    System.out.println(byteArrayToHexString(res1) + " - result digest HELLOWORLD string");

    md.update(salt.getBytes(StandardCharsets.UTF_8));
    res2 = md.digest(text.getBytes(StandardCharsets.UTF_8));
    System.out.println(byteArrayToHexString(res2) + " - result first update HELLO and then digest WORLD");

    md.update(text.getBytes(StandardCharsets.UTF_8));
    res3 = md.digest(salt.getBytes(StandardCharsets.UTF_8));
    System.out.println(byteArrayToHexString(res3) + " - result first update WORLD and then digest HELLO");

    res4 = md.digest(text.concat(salt).getBytes(StandardCharsets.UTF_8));
    System.out.println(byteArrayToHexString(res4) + " - result digest WORLDHELLO string");

    md.update(text.getBytes(StandardCharsets.UTF_8));
    md.update(salt.getBytes(StandardCharsets.UTF_8));
    res5 = md.digest();
    System.out.println(byteArrayToHexString(res5) + " - result update WORLD then update HELLO then digest without parameters");


  }

  private static String byteArrayToHexString(byte[] salt) {
    StringBuilder sb = new StringBuilder();
    for (byte b : salt) {
      sb.append(String.format("%02X", b));
    }
    return sb.toString();
  }
}
