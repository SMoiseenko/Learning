package by.moiseenko.controller.impl;

import by.moiseenko.controller.ProgramController;
import by.moiseenko.model.Person;
import by.moiseenko.model.Product;
import by.moiseenko.service.PersonService;
import by.moiseenko.service.ProductService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class ProgramControllerImpl implements ProgramController {

  private static final Logger LOG = LogManager.getLogger(ProgramControllerImpl.class.getName());
  private PersonService personService;
  private ProductService productService;
  private Person loggedPerson;
  private Product choosedProduct;

  public ProgramControllerImpl(PersonService personService, ProductService productService) {
    this.personService = personService;
    this.productService = productService;
    start();
  }

  private void start() {
    Scanner scanner = new Scanner(System.in);
    int point = -1;
    while (true) {
      if (loggedPerson == null) {
        System.out.println("Welcome to PERSON service!");
        System.out.println(
            "Chose what you want to do:"
                + "\n1. Create account"
                + "\n2. Login system"
                + "\n0. Exit program");

        point = scanner.nextInt();
        switch (point) {
          case 1:
            Person person = new Person();
            scanner.nextLine();
            System.out.println("Enter login:");
            person.setLogin(scanner.nextLine());
            System.out.println("Enter password:");
            person.setPassword(scanner.nextLine());
            System.out.println("Enter first name:");
            person.setFirstName(scanner.nextLine());
            System.out.println("Enter last name:");
            person.setLastName(scanner.nextLine());
            System.out.println("Enter day of birth in format\"dd.mm.yyyy\"");
            person.setDateOfBirth(
                LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("d.M.y")));
            System.out.println("Enter salary:");
            person.setSalary(new BigDecimal(scanner.next()));
            long personId = personService.createPerson(person);
            loggedPerson = personService.findPerson(personId);
            LOG.debug(loggedPerson + " was created.");
            break;

          case 2:
            scanner.nextLine();
            System.out.println("Enter login:");
            String login = (scanner.nextLine());
            System.out.println("Enter password:");
            String password = (scanner.nextLine());

            try {
              loggedPerson = personService.loginInSystem(login, password);
              loggedPerson.setProductList(getUserProductList());
              LOG.debug(loggedPerson);
            } catch (IllegalArgumentException iae) {
              LOG.error(iae);
            }
            break;

          case 0:
            System.exit(0);
            break;
          default:
            LOG.error("Please, choose only from points below!");
        }
      } else {
        System.out.printf(
            "Welcome %S %S.\n", loggedPerson.getFirstName(), loggedPerson.getLastName());
        System.out.println(
            "Chose what you want to do:"
                + "\n1. Create product."
                + "\n2. Show all user products."
                + "\n3. Show user info."
                + "\n4. Update product info."
                + "\n5. Delete product."
                + "\n6. Update account."
                + "\n7. Delete account."
                + "\n0. Log out.");
        point = scanner.nextInt();
        switch (point) {
          case 1:
            Product product = new Product();
            scanner.nextLine();
            System.out.println("Enter product name:");
            product.setProductName(scanner.nextLine());
            System.out.println("Enter product price:");
            product.setPrice(new BigDecimal(scanner.next()));

            product.setPerson(loggedPerson);

            long productID = productService.addProductToDB(product);
            LOG.debug(productID + " was created");

            break;
          case 2:
            System.out.println("**********");
            if (loggedPerson.getProductList().size() == 0) {
              System.out.println("No any product");
            } else {
              loggedPerson.getProductList().forEach(System.out::println);
            }
            System.out.println("**********");
            break;
          case 3:
            System.out.println("**********");
            System.out.println(loggedPerson);
            System.out.println("**********");
            break;
          case 7:
            personService.deletePerson(loggedPerson.getId());
            System.out.println("**********");
            System.out.println(String.format("%s %s was deleted.", loggedPerson.getFirstName(), loggedPerson.getLastName()));
            System.out.println("**********");
            loggedPerson = null;
            break;
          case 0:
            loggedPerson = null;
            break;
          default:
            LOG.error("Please, choose only from points below!");
        }
      }
    }
  }

  private List<Product> getUserProductList() {
    List<Product> productList = productService.getAllProducts();
    return productList.stream()
        .filter(p -> p.getPerson().getId() == loggedPerson.getId())
        .peek(p -> p.setPerson(loggedPerson))
        .collect(Collectors.toList());
  }

  @Override
  public void createPerson() {}

  @Override
  public void updatePerson() {}

  @Override
  public void retrievePerson() {}

  @Override
  public void deletePerson() {}
}
