package by.moiseenko;

import by.moiseenko.utils.GetWeatherScheduledTask;
import by.moiseenko.utils.ResourceManager;
import by.moiseenko.utils.ScheduledManCreatorTask;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

  private static final Logger logger = LogManager.getLogger(Runner.class);

  public static void main(String[] args) {
    // String constructors
    String str1 = "Java";
    String str2 = new String("Java");
    logger.debug(str1.equals(str2));
    logger.debug(str1 == str2);
    str2 = str2.intern();
    logger.debug(str1 == str2);

    String str3 = new String(new char[] {'H', 'e', 'J', 'a', 'v', 'a'}, 2, 4);
    logger.debug(str3.equals(str1));

    int str1Length;
    str1Length = str1.length();
    logger.debug(str1Length + " " + str1);

    String emptyString = "";
    String nullString = null;

    if (emptyString != null && emptyString.length() != 0) {
      logger.debug("String is not empty");
    } else {
      logger.debug("String is empty");
    }

    if (nullString != null && nullString.length() != 0) {
      logger.debug("String is not empty");
    } else {
      logger.debug("String is empty or null");
    }

    // String methods

    String str4 = " v.11.0.1";
    logger.debug(str1 + str4);
    logger.debug(str1.concat(str4));

    String str5 = "JAVA";
    boolean res1 = str1.equals(str5);
    boolean res2 = str1.equalsIgnoreCase(str5);
    logger.debug(res1);
    logger.debug(res2);
    int res3 = str1.compareTo(str5);
    int res4 = str5.compareTo(str1);
    int res5 = str1.compareToIgnoreCase(str5);
    logger.debug(res3);
    logger.debug(res4);
    logger.debug(res5);

    StringBuffer str6 = new StringBuffer(str5);
    StringBuilder str7 = new StringBuilder(str1);

    boolean res6 = str5.contentEquals(str6);
    boolean res7 = str5.contentEquals(str7);
    logger.debug(res6);
    logger.debug(res7);

    String str8 = "0123-Java is the best programming language !)";
    String str9 = str8.substring(5);
    String str10 = str8.substring(0, 5);
    logger.debug(str9);
    logger.debug(str10);

    int res8 = str8.length();
    logger.debug(res8);

    int res9 = str8.indexOf('a');
    int res10 = str8.indexOf(0x61); // char 'a' = 0x61 = 97
    int res11 = str8.indexOf('z');
    logger.debug(res9);
    logger.debug(res10);
    logger.debug(res11);

    String str11 = str8.toUpperCase();
    String str12 = str8.toLowerCase();
    logger.debug(str11);
    logger.debug(str12);

    String str13 = str8.replace('a', 'A');
    logger.debug(str13);

    boolean res12 = emptyString.isEmpty();
    logger.debug(res12);

    char[] str11Array = str11.toCharArray();
    logger.debug(str11Array[1]);
    logger.debug(str11Array[10]);

    // Pattern + Matcher
    String regex = "\\w*\\d{3}\\w*";
    String stringForMatcher = "asd456dsa   54df 4 fd 565654sdf";
    String stringForMatcher2 = (new StringBuilder(stringForMatcher)).reverse().toString();
    Pattern pattern = Pattern.compile(regex);
    Pattern pattern2 = Pattern.compile("\\s+");
    Matcher matcher = pattern.matcher(stringForMatcher);
    while (matcher.find()) {
      logger.debug(matcher.group());
    }
    matcher = matcher.reset(stringForMatcher2);

    while (matcher.find()) {
      logger.debug(matcher.group());
    }

    String[] resultPatternSplit = pattern2.split(stringForMatcher);
    logger.debug(Arrays.toString(resultPatternSplit));

    Locale currentLocale = Locale.getDefault();
    logger.debug(currentLocale);

    // Locale
    logger.debug(currentLocale);
    logger.debug(currentLocale.getCountry());
    logger.debug(currentLocale.getDisplayCountry());
    logger.debug(currentLocale.getLanguage());
    logger.debug(currentLocale.getDisplayLanguage());

    // DateFormat
    DateFormat dfLocal = DateFormat.getDateInstance();
    DateFormat dfGE = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMANY);
    DateFormat dfCH = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINESE);
    Date dateNow = java.sql.Date.valueOf(LocalDate.now());
    logger.debug(dfLocal.format(dateNow));
    logger.debug(dfGE.format(dateNow));
    logger.debug(dfCH.format(dateNow));

    Calendar calendar = Calendar.getInstance();
    logger.debug(calendar);
    logger.debug(calendar.getCalendarType());

    try {
      Date date = dfGE.parse("Montag, 26. Januar 2019");
      logger.debug(dfLocal.format(date));
    } catch (ParseException e) {
      logger.debug("Parse exception");
    }

    // System.getProperties
    logger.debug("Total Memory = " + Runtime.getRuntime().totalMemory() / 8 / 1024 / 1024 + "Gb");
    logger.debug(System.getProperty("os.name"));

    // ResourceManager
    ResourceManager resManager = ResourceManager.INSTANCE;
    logger.debug(resManager.getString("key1"));
    resManager.changeResource(new Locale("be", "By"));
    logger.debug(resManager.getString("key1"));

    Enumeration<String> keyNames = resManager.getResourceBundle().getKeys();
    while (keyNames.hasMoreElements()) {
      logger.debug(keyNames.nextElement());
    }
    Set<String> keyNameSet = resManager.getResourceBundle().keySet();
    keyNameSet.stream().forEach(logger::debug);

    logger.debug(resManager.getResourceBundle().containsKey("key4"));

    // NumberFormat
    NumberFormat nfLocal = NumberFormat.getInstance();
    NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
    Currency currencyLocal = Currency.getInstance(Locale.getDefault());
    Currency currencyUS = Currency.getInstance(Locale.US);
    Currency currencyGE = Currency.getInstance(Locale.GERMANY);

    float price = 2154.16f;
    logger.debug(price);
    logger.debug(nfLocal.format(price) + currencyLocal.getSymbol());
    logger.debug(nfUS.format(price) + currencyUS.getSymbol());
    try {
      float priceFloat = nfUS.parse("2,154.17").floatValue();
      logger.debug(priceFloat + currencyGE.getSymbol());
    } catch (ParseException e) {
      logger.debug("Parse exception");
    }

    // Formatter
    Locale.setDefault(new Locale("be", "BY"));
    Formatter formatter = new Formatter();
    formatter.format("This %s is about %n%S %c", "book", "java", '8');
    logger.debug(formatter);
    // formatter = new Formatter();
    formatter.format("%nDecimal: %d, Hex: %X, Octal: %o.", 255, 255, 255, 255);
    logger.debug(formatter);
    formatter = new Formatter();
    formatter.format("Decimal: %d, Hex: %X, Octal: %o.", 255, 255, 255, 255);
    logger.debug(formatter);

    // Calendar calendar = new Calendar(); instance created above
    formatter = new Formatter();
    formatter.format("%n%tr %n%tT %n%tc %n%tA", calendar, calendar, calendar, calendar);
    logger.debug(formatter);
    float formFloat = 5.45f;
    formatter = new Formatter();
    formatter.format("|%7.3f|", formFloat);
    logger.debug(formatter);
    formatter = new Formatter();
    formatter.format("|%-7.3f|", formFloat);
    logger.debug(formatter);

    formatter = new Formatter();
    formatter.format("%.16S", "Now I know class java.util.Formatter");
    logger.debug(formatter);

    Timer timer = new Timer();
    GetWeatherScheduledTask weatherTask = new GetWeatherScheduledTask();
    timer.schedule(weatherTask, 1000L);

//    timer.scheduleAtFixedRate(new ScheduledManCreatorTask(), 5000L, 1000L);
//
//    for (int i = 0; i<10; i++) {
//
//      try {
//        logger.debug(new Date() + " thread id = " + Thread.currentThread().getId());
//        Thread.sleep(2500L);
//      } catch (InterruptedException ie) {
//        logger.error(ie);
//      }
//    }
//    timer.cancel();
//    logger.debug("schedule canceled");
    logger.debug("main thread stop");

  }
}
