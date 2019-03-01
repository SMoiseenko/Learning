package by.moiseenko.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
  private final String patternName = "^[a-z0-9_-]{3,16}$";
  private final String patternPassword = "^[a-z0-9_-]{6,18}$";
  private final String patternHexValue = "^#?([a-f0-9]{6}|[a-f0-9]{3})$";
  private final String patternSlug = "^[a-z0-9-]+$";
  private final String patternEMail = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
  private final String patternURL =
      "^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$";
  private final String patternIPAdress =
      "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
  private final String patternHTMLTag = "^<([a-z]+)([^<]+)*(?:>(.*)<\\/\\1>|\\s+\\/>)$";

  public boolean validateName(String name) {
       return Pattern.compile(patternPassword).matcher(name).matches();
  }

  public boolean validatePassword(String password){
     return Pattern.compile(patternPassword).matcher(password).matches();
  }
}
