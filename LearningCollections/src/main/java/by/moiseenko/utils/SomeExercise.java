package by.moiseenko.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class SomeExercise {

  private static final Logger LOG = LogManager.getLogger(SomeExercise.class.getName());

  public static void readFromFileToArrayAndReverseIt(String filePath) {
    File file = new File(System.getProperty("user.home") + filePath);
    if (file.exists()) {
      List<String> textList = new ArrayList<>();
      Scanner scanner = null;
      try {
        scanner = new Scanner(file);
      } catch (FileNotFoundException e) {
        LOG.error(e);
      }
      scanner.useDelimiter("\\n");
      while (scanner.hasNext()) {
        textList.add(scanner.next());
      }
      Collections.reverse(textList);

      for (String s : textList) {
        LOG.debug(s);
      }
    } else {
      LOG.debug("FILE NOT EXIST");
    }
  }

  public static void numbersInStack() {

    Scanner scanner = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();
    LOG.debug("Enter number. For exit push CTRL+D");
    while (scanner.hasNextLine()) {
      stack.clear();
      int number = scanner.nextInt();
      while (number > 0) {
        stack.push(number % 10);
        number /= 10;
      }
      int result = 0;
      int stackSize = stack.size();
      for (int i = 0; i < stackSize; i++) {
        result += stack.pop() * Math.pow(10, i);
      }
      LOG.debug(result);
    }
  }
}
