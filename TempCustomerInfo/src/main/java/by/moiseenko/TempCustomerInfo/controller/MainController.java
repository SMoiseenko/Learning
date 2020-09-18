package by.moiseenko.TempCustomerInfo.controller;

import by.moiseenko.TempCustomerInfo.entity.MyEntity;
import by.moiseenko.TempCustomerInfo.repository.MyEntityCRUDRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Slf4j
@Controller
public class MainController {

  private final MyEntityCRUDRepository repository;

  public MainController(MyEntityCRUDRepository repository) {
    this.repository = repository;
  }


  @GetMapping("/")
  public String homePage(){
    return "index";
  }

  @GetMapping("/getAll")
  public String getAll(Model model){
    List<MyEntity> allInfo = StreamSupport.stream(repository.findAll().spliterator(),false).collect(
        Collectors.toList());
    model.addAttribute("allInfo", allInfo);
    return "allInfo";
  }
  @GetMapping("/addInfo")
  public String addInfo(Model model){
    model.addAttribute("info", new MyEntity());
    return "addInfo";
  }
  @PostMapping("/addInfo")
  public String appInfoPost(MyEntity myEntity){
    repository.save(myEntity);
    return "redirect:/getAll";
  }

  @GetMapping("/edit/{id}")
  public String editById(@PathVariable Long id, Model model){
    MyEntity info = repository.findById(id).orElse(new MyEntity());
    log.info(info.toString());
    model.addAttribute("info", info);
    return "editInfo";
  }

  @PostMapping("/edit")
    public String editByIdPost(MyEntity info){
    repository.save(info);
    return "redirect:/getAll";
    }





}
