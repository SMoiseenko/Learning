package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ClassA {

  private static final Logger LOG = LogManager.getLogger(ClassA.class.getName());

  public void sayName(String name){
    LOG.debug(name);
  }

  public static void sayStaticName(){
    LOG.debug("STATIC METHOD CLASS-A");
  }

  public void extendMethod(List<? extends Number> list){
    Number n = list.get(1);


  }

  public void superMethod(List<? super Number> list){
    Number n = (Number)list.get(1);
    Object o = list.get(0);
    list.add(1);
  }

  public void rawMethod(List list){
    Number n = (Number)list.get(1);
    Object o = list.get(0);
    list.add(1);
  }

  public void wildCard (List<?> list){
    List<?> muL = new ArrayList<String>();
   Number n = (Number) list.get(1);
   Object o = list.get(0);
  }

}
