package by.moiseenko.controller.restcontroller;

import by.moiseenko.entity.Book;
import by.moiseenko.repository.impl.CriteriaExamples;
import java.math.BigDecimal;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@RestController
@RequestMapping("/rest")
public class ManyDiffSelectControllerREST {
  private static final Logger LOG = LogManager.getLogger(ManyDiffSelectControllerREST.class.getName());

  private CriteriaExamples criteriaExamples;

  @Autowired
  public ManyDiffSelectControllerREST(CriteriaExamples criteriaExamples) {
    this.criteriaExamples = criteriaExamples;
  }

  @GetMapping("getBooks/{maxPrice}")
  public List<Book> getBooksWithPriceLess(@PathVariable("maxPrice") String maxPrice){
    return criteriaExamples.bookWithPriceLess(new BigDecimal(maxPrice));
  }
}
