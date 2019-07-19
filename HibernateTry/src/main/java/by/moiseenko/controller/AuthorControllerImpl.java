package by.moiseenko.controller;

import by.moiseenko.entity.Author;
import by.moiseenko.entity.Book;
import by.moiseenko.entity.Country;
import by.moiseenko.service.AuthorService;
import by.moiseenko.service.CountryService;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
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

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class AuthorControllerImpl {

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
    model.addAttribute("countryList", countrySet);
    model.addAttribute("newAuthor", new Author());
    return "createAuthor";
  }

  @PostMapping(value = "/createNewAuthor")
  public String createNewAuthor(@ModelAttribute("newAuthor") Author author) {
    Country country = countryService.findCountryById(author.getCountryOfBorn().getId());
    author.setCountryOfBorn(country);
    authorService.create(author);
    return "redirect:/allAuthors";
  }

  @GetMapping("/editAuthor/{author_id}")
  public String getAuthorById(@PathVariable("author_id") Long id, Model model) {
    model.addAttribute("editedAuthor", authorService.getAuthorById(id));
    model.addAttribute("countryList", countryService.getAlCountries());
    return "editAuthor";
  }

  @RequestMapping(value = "/updateAuthor", method = RequestMethod.POST)
  public String updateAuthor(@ModelAttribute("editedAuthor") Author author) {
    Country country = countryService.findCountryById(author.getCountryOfBorn().getId());
    author = authorService.getAuthorById(author.getId());
    author.setCountryOfBorn(country);
    authorService.updateAuthor(author);
    return "redirect:/allAuthors";
  }

  @GetMapping(value = "/deleteAuthor/{id}")
  public String deleteAuthor(@PathVariable("id") Long id) {
    Author author = authorService.getAuthorById(id);
    authorService.deleteAuthor(author);
    return "redirect:/allAuthors";
  }

  @GetMapping("/newBook")
  public String newBook(Model model) {
    Book book = new Book();
    List<Author> authorsList = authorService.getAllAuthors();
    authorsList.forEach(a->a.setCountryOfBorn(null));
    model.addAttribute("newBook", book);
    model.addAttribute("authorsList", authorsList);
    return "createNewBook";
  }

  @PostMapping("/publicNewBook")
  public String publicNewBook(@ModelAttribute("newBook") Book book) {
    LOG.debug(book);
    return "redirect:/allAuthors";
  }
}
