package by.moiseenko.TempCustomerInfo.controller;

import by.moiseenko.TempCustomerInfo.entity.MyEntity;
import by.moiseenko.TempCustomerInfo.repository.MyEntityCRUDRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@RestController
public class MainRestController {

  private static final Logger LOG = LogManager.getLogger(MainRestController.class.getName());

  private final MyEntityCRUDRepository repository;

  public MainRestController(
      MyEntityCRUDRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/rest/getAll")
  public DataForDT restGetAll(){
    return new DataForDT();
  }

  class DataForDT{
    private List<MyEntity> data;
    public DataForDT() {
      this.data = StreamSupport.stream(repository.findAll().spliterator(),false).collect(
          Collectors.toList());;
    }

    public List<MyEntity> getData() {
      return data;
    }

    public void setData(List<MyEntity> data) {
      this.data = data;
    }
  }
}
