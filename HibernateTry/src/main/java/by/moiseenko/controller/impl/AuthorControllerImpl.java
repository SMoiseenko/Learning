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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    return "createAuthor";
  }

  @PostMapping(value = "/createNewAuthor")
  public String createNewAuthor(
      @RequestParam("name") String name, @RequestParam("countryOfBorn") String countryOfBorn) {
    Author author = new Author();
    author.setName(name);
    author.setCountryOfBorn(Enum.valueOf(Country.class, countryOfBorn));
    authorService.create(author);
    return "redirect:/allAuthors";
  }

  @GetMapping("/editAuthor")
  public String getAuthorById(@RequestParam("id") int id, Model model) {
    model.addAttribute("author", authorService.getAuthorById(id));
    model.addAttribute("countrySet", new HashSet<>(Arrays.asList(Country.values())));
    return "editAuthor";
  }

  @RequestMapping(value = "/updateAuthor", method = RequestMethod.POST)
  public ModelAndView updateAuthor(
      @RequestParam("id") int id,
      @RequestParam("name") String name,
      @RequestParam("countryOfBorn") String country) {
    ModelAndView mav = new ModelAndView();
    Author author = new Author();
    author.setId(id);
    author.setName(name);
    author.setCountryOfBorn(Enum.valueOf(Country.class, country));
    authorService.updateAuthor(author);
    mav.setViewName("redirect:/allAuthors");
    return mav;
  }
}
