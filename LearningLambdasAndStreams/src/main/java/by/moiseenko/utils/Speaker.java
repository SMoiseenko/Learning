package by.moiseenko.utils;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */

public interface Speaker {

  String MESSAGE = "HELLO";

  String revers(String reversMe);

  default void sayHello(){
    System.out.println(MESSAGE);
  }

  static void sayGoodBye(){
    
  }
}
