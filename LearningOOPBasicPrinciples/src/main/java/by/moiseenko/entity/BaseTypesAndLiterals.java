package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc for {@code BaseTypesAndLiterals}
 *
 * @see Object
 * @author moiseenko-s
 * @param
 * @version JDK 1.0
 */
public class BaseTypesAndLiterals {

  private static final Logger LOG = LogManager.getLogger(BaseTypesAndLiterals.class.getName());
  /**
   * Bellow you can see example of javadoc for fields
   *
   * <p>MORE COMMENTS HERE
   *
   * @serial
   */
  private int decIntValue = 15;

  private int hexIntValue = 0x0f;
  private int octIntValue = 024;
  private int binIntValue = 0b0000_1111;
  private int bigInt = 1_000_000;

  /**
   * @see String
   * @return {@code false}
   * @exception {@code NPE}
   */
  public void intLiterals() {
    LOG.debug(String.format("Dec literal %d", decIntValue));
    LOG.debug(String.format("Dec %d, hex 0x%02X,", hexIntValue, hexIntValue));
    LOG.debug(String.format("Dec %d, oct 0%o", octIntValue, octIntValue));
    LOG.debug(String.format("Dec %d, bin %s", binIntValue, Integer.toBinaryString(binIntValue)));
    LOG.debug(String.format("Dec 1_000_000 literal is %d", bigInt));
  }

  public void incapabilityTypes() {
    // byte and short after arithmetic's automatically convert to int
    byte a = 10;
    byte b = (byte) (a + 10);
    // if byte or short are constant, they do not convert to int
    final byte c = 10;
    b = c + 60;
    // b = -b; incapability types
    b = (byte) -b;

    final int i = 129;
    b = (byte) i;
    LOG.debug(b);
  }

  public void wrapperClasses() {
    Byte b1 = Byte.parseByte("A", 11);
    LOG.debug(String.format("Result of parsing string A with radix 15: 0x%02X", b1));
    Character myChar = '\u0041';
    LOG.debug(myChar);
    String arg = "121";
    try {
      int res1 = Integer.parseInt(arg, 10);
      int res2 = Integer.valueOf(arg, 10);
      int res3 = Integer.decode(arg);
      int res4 = new Integer(arg);
      LOG.debug(
          String.format(
              "parse: %d, valueOf: %d, decode: %d, new Integer: %d", res1, res2, res3, res4));
    } catch (NumberFormatException nfe) {
      LOG.error(nfe);
    }
    int arg1 = 121;
    String res1s = Integer.toString(arg1);
    String res2s = String.valueOf(arg1);

    Integer i1 = arg1;
    Number i2 = arg1;

    LOG.debug(String.format("toString: %s, valueOf: %s", res1s, res2s));
    LOG.debug(String.format("Compare Integer and int via == : %b", i1==arg1));
    LOG.debug(String.format("Compare two Integer via == : %b", i1==i2));
    LOG.debug(String.format("Compare Integer and int via equals(): %b", i1.equals(arg1)));
    int j = -3;
    GOTO: while(true){
      for(;;){
        while(j<10){
          if(j==0){
            LOG.debug(String.format("j = %d, time to break and go to GOTO", j));
            break GOTO;
          } else{
            LOG.debug(String.format("j = %d, wait j = 0", j++));
          }
        }
      }
    }
  }
}
