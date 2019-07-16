package by.moiseenko.controller;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Country;
import by.moiseenko.service.AuthorService;
import by.moiseenko.service.CountryService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
public class AuthorControllerImpl{

  private static final Logger LOG = LogManager.getLogger(AuthorControllerImpl.class.getName());

  private AuthorService authorService;
  private CountryService countryService;

  @Autowired
  public AuthorControllerImpl(AuthorService authorService, CountryService countryService) {
    this.authorService = authorService;
    this.countryService = countryService;
  }

  @GetMapping("/allAuthors")
  public String getAllAuthors(Model model) {
    model.addAttribute("authorList", authorService.getAllAuthors());
    return "allAuthors";
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/createNewAuthor")
  public String createAuthor(Model model) {
    List<Country> countrySet = countryService.getAlCountries();
    model.addAttribute("countrySet", countrySet);
    return "createAuthor";
  }

  @PostMapping(value = "/createNewAuthor")
  public String createNewAuthor(
      @RequestParam("name") String name, @RequestParam("countryOfBorn") String countryOfBorn) {
    Author author = new Author();
    author.setName(name);
    Country newCountry = new Country();
    newCountry.setName(countryOfBorn);
    author.setCountryOfBorn(newCountry);
    authorService.create(author);
    return "redirect:/allAuthors";
  }

  @GetMapping("/editAuthor/{author_id}")
  public String getAuthorById(@PathVariable("author_id") int id, Model model) {
    model.addAttribute("author", authorService.getAuthorById(id));
    model.addAttribute("countryList", countryService.getAlCountries());
    return "editAuthor";
  }

  @RequestMapping(value = "/updateAuthor", method = RequestMethod.POST)
  public ModelAndView updateAuthor(
      @ModelAttribute("author") Author author) {
    ModelAndView mav = new ModelAndView();
    authorService.updateAuthor(author);
    mav.setViewName("redirect:/allAuthors");
    return mav;
  }


}
