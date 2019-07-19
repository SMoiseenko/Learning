package by.moiseenko.controller.restcontroller;

import by.moiseenko.entity.Author;
import by.moiseenko.service.AuthorService;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@RestController
@RequestMapping(value ="/rest")
public class AuthorControllerREST {
  private static final Logger LOG = LogManager.getLogger(AuthorControllerREST.class.getName());

  private AuthorService authorService;

  @Autowired
  public AuthorControllerREST(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping(value ="allAuthors")
  public List<Author> restAllAuthors(){
    return authorService.getAllAuthors();
  }

  @GetMapping(value="author/{id}")
  public Author restAuthorById(@PathVariable(value = "id") Long id){
    return authorService.getAuthorById(id);
  }
}
