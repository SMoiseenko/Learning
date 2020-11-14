package by.moiseenko.controller;

import by.moiseenko.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Controller
public class AdminController {
  private static final Logger LOG = LogManager.getLogger(AdminController.class.getName());

  private final UserService userService;

  @Autowired
  public AdminController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/admin")
  public String userList(Model model) {
    model.addAttribute("allUsers", userService.getAllUsers());
    return "admin";
  }

  @PostMapping("/admin")
    public String deleteUser(@RequestParam(required = true, defaultValue = "")Long userId, @RequestParam(required = true, defaultValue = "")String action, Model model){
    if (action.equals("delete")){
      userService.deleteUser(userId);
    }
    return "redirect:/admin";
  }

  @GetMapping("/admin/gt/{userId}")
  public String gtUSer(@PathVariable("userId") Long userId, Model model){
    model.addAttribute("allUsers", userService.findUserById(userId));
    return "admin";
  }
}
