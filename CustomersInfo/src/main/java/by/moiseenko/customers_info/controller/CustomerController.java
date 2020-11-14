package by.moiseenko.customers_info.controller;

import by.moiseenko.customers_info.entity.Customer;
import by.moiseenko.customers_info.repository.CustomerRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
public class CustomerController {
  private static final Logger LOG = LogManager.getLogger(CustomerController.class.getName());

  private final CustomerRepository customerRepository;

  public CustomerController(
      CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }

  @GetMapping("/getAllCustomers")
  public String getAllCustomers(Model model){
    List<Customer> customerList = StreamSupport.stream((customerRepository.findAll()).spliterator(), false).collect(
        Collectors.toList());
    model.addAttribute("customerList", customerList);
    return "getAllCustomers";
  }

@GetMapping("/addNewCustomer")
  public String addNewCustomer(Customer customer){
  return "addNewCustomer";
}

@PostMapping("/addCustomer")
  public String addCustomer(Customer customer, BindingResult result, Model model){
  customerRepository.save(customer);
  return "redirect:/getAllCustomers";
}



}
