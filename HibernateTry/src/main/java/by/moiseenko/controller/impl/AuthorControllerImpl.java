package by.moiseenko.controller.impl;

import by.moiseenko.controller.AuthorController;
import by.moiseenko.entity.Author;
import by.moiseenko.entity.Country;
import by.moiseenko.service.AuthorService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class AuthorControllerImpl implements AuthorController {

  private static final Logger LOG = LogManager.getLogger(AuthorControllerImpl.class.getName());

  private AuthorService authorService;

  @Autowired
  public AuthorControllerImpl(AuthorService authorService) {
    this.authorService = authorService;
  }

  @Override
  @GetMapping("/allAuthors")
  public String getAllAuthors(Model model) {
    model.addAttribute("authorSet", authorService.getAllAuthors());
    return "allAuthors";
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/createNewAuthor")
  public String createAuthor(Model model) {
    Set<Country> countrySet = new HashSet<>(Arrays.asList(Country.values()));
    model.addAttribute("countrySet", countrySet);
    model.addAttribute("new Author", new Author());
    return "createAuthor";
  }

  @PostMapping(value = "/createNewAuthor")
  public String createAuthorNew(@ModelAttribute Author author) {
    author = authorService.create(author);
    LOG.debug(author);
    return "redirect:/allAuthors";
  }
}
