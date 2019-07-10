package by.moiseenko.controller.impl;

import by.moiseenko.controller.AuthorController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class AuthorControllerImpl implements AuthorController {

  private static final Logger LOG = LogManager.getLogger(AuthorControllerImpl.class.getName());

  @Override
  @GetMapping("/allAuthors")
  public String getAllAuthors(Model model) {
    return null;
  }

  @GetMapping("/")
  public String index(){
    return "/index";
  }
}
