package by.moiseenko.controller;

import by.moiseenko.entity.User;
import by.moiseenko.service.UserService;
import javax.validation.Valid;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Controller
public class RegistrationController {

  private static final Logger LOG = LogManager.getLogger(RegistrationController.class.getName());

  private UserService userService;

  @Autowired
  public RegistrationController(UserService userService) {
    this.userService = userService;
  }
@GetMapping("/registration")
  public String registration(Model model){
    model.addAttribute("userForm", new User());
    return "registration";
  }

  @PostMapping("/registration")
  public String addUser(@ModelAttribute("userForm") @Valid User userForm, BindingResult bindingResult, Model model) {
    if (bindingResult.hasErrors()) {
      return "registration";
    }
    if (!userForm.getPassword().equals(userForm.getPasswordConfirm())) {
      model.addAttribute("passwordError", "Wrong Password");
      return "registration";
    }
    if (!userService.saveUSer(userForm)) {
      model.addAttribute("usernameError", "User already exist.");
      return "registration";
    }

    return "redirect:/";
  }

  }



