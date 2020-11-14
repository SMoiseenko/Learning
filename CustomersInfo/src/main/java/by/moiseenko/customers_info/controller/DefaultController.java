package by.moiseenko.customers_info.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class DefaultController {

  private static final Logger LOG = LogManager.getLogger(DefaultController.class.getName());

  @GetMapping("/")
  public String homePage() {
    return "index";
  }
/*
  @GetMapping("/header")
  public String header() {
    return "header";
  }

  @GetMapping("/footer")
  public String footer() {
    return "footer";
  }
*/
}
