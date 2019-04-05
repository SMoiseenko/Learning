package by.moiseenko.entity;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public abstract class LikeEnumClass {

  private static final Logger LOG = LogManager.getLogger(LikeEnumClass.class.getName());

  private  String name;
  private  int oposite;

  public static final LikeEnumClass AM;
  public static final LikeEnumClass PM;

  private LikeEnumClass(String name, int oposite){
    this.name = name;
    this.oposite = oposite;
  }

  static {
    AM = new LikeEnumClass("AM", 0){

    };

    PM = new LikeEnumClass("PM", 1){

    };
  }

  public static LikeEnumClass[] values(){
    return new LikeEnumClass[]{AM, PM};
  }

  public int opposite(){
    return this.oposite;
  }

  public String toString() {
    return this.name;
  }
}
