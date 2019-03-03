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
       return Pattern.compile(patternName).matcher(name).matches();
  }

  public boolean validatePassword(String password){
     return Pattern.compile(patternPassword).matcher(password).matches();
  }

  public boolean validateHexValue(String hexValue){
    return Pattern.compile(patternHexValue).matcher(hexValue).matches();
  }

  public boolean validateSlug(String slug){
    return Pattern.compile(patternSlug).matcher(slug).matches();
  }

  public boolean validateEMail(String eMail){
    return Pattern.compile(patternEMail).matcher(eMail).matches();
  }

  public boolean validateURL(String url){
    return Pattern.compile(patternURL).matcher(url).matches();
  }

  public boolean validateIPAdress(String ipAddress){
    return Pattern.compile(patternIPAdress).matcher(ipAddress).matches();
  }

  public boolean validateHTMLTag(String htmlTag){
    return Pattern.compile(patternHTMLTag).matcher(htmlTag).matches();
  }
}
