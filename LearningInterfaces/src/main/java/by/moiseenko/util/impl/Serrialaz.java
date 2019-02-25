package by.moiseenko.util.impl;

import java.io.*;

public class Serrialaz {

  public Serrialaz() {
    super();
  }

  public boolean serrializeObject2File(String filePath, Object obj) {

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
      oos.writeObject(obj);
      return true;
    } catch (IOException ex) {
      System.err.println(ex);
      return false;
    }
  }

  public Object serrializeObject4romFile(String filePath) {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
      return ois.readObject();
    } catch (IOException | ClassNotFoundException ex) {
      System.err.println(ex);
      return null;
    }
  }
}
