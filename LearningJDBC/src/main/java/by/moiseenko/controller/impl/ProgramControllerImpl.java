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
import java.util.NoSuchElementException;
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

  private static final String ADMIN_LOGIN = "admin";
  private static final String ADMIN_PASSWORD = "IDDQD";

  public ProgramControllerImpl(PersonService personService, ProductService productService) {
    this.personService = personService;
    this.productService = productService;
    start();
  }

  private void start() {

    Scanner scanner = new Scanner(System.in);
    int point = -1;
    while (true) {
      try {
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

              if (login.equals(ADMIN_LOGIN) && password.equals(ADMIN_PASSWORD)) {
                godMode(scanner);
              } else {

                try {
                  loggedPerson = personService.loginInSystem(login, password);
                  loggedPerson.setProductList(getUserProductList());
                  LOG.debug(loggedPerson);
                } catch (IllegalArgumentException iae) {
                  LOG.error(iae);
                }
              }
              break;

            case 0:
              scanner.close();
              System.exit(0);
              break;
            default:
              LOG.error("Please, choose only from points below!");
          }
        } else {
          System.out.printf(
              "Welcome %s %s.\n", loggedPerson.getFirstName(), loggedPerson.getLastName());
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
              printPersonProductList();
              break;
            case 3:
              System.out.println("**********");
              System.out.println(loggedPerson);
              System.out.println("**********");
              break;
            case 4:
              printPersonProductList();
              if (loggedPerson.getProductList().size() == 0) {
                System.out.println("First you need to create at least one product.");
                break;
              } else {
                Product choseProduct = prepareProductForUpdateOrDelete(scanner);
                if (choseProduct == null) {
                  System.out.println("No product with chose ID.");
                  break;
                }
                System.out.println("Enter new product name:");
                String newData;
                scanner.nextLine();
                if (!(newData = scanner.nextLine()).equals("")) {
                  choseProduct.setProductName(newData);
                }
                System.out.println("Enter new product price:");
                if (!(newData = scanner.nextLine()).equals("")) {
                  choseProduct.setPrice(new BigDecimal(newData));
                }
                productService.updateProduct(choseProduct);
              }
              System.out.println("**********");
              break;
            case 5:
              printPersonProductList();
              if (loggedPerson.getProductList().size() == 0) {
                System.out.println("First you need to create at least one product.");
                break;
              } else {
                Product choseProduct = prepareProductForUpdateOrDelete(scanner);
                if (choseProduct == null) {
                  System.out.println("No product with chose ID.");
                  break;
                }
                productService.deleteProduct(choseProduct.getId());
                loggedPerson.getProductList().remove(choseProduct);
              }
              System.out.println("**********");
              break;
            case 6:
              scanner.nextLine();
              System.out.println("Enter person login");
              String newData;
              if (!(newData = scanner.nextLine()).equals("")) {
                loggedPerson.setLogin(newData);
              }
              System.out.println("Enter person password:");
              if (!(newData = scanner.nextLine()).equals("")) {
                loggedPerson.setPassword(newData);
              }
              System.out.println("Enter person first name:");
              if (!(newData = scanner.nextLine()).equals("")) {
                loggedPerson.setFirstName(newData);
              }
              System.out.println("Enter person last name:");
              if (!(newData = scanner.nextLine()).equals("")) {
                loggedPerson.setLastName(newData);
              }
              System.out.println("Enter person day of birth:");
              if (!(newData = scanner.nextLine()).equals("")) {
                loggedPerson.setDateOfBirth(LocalDate.parse(newData, DateTimeFormatter.ofPattern("d.M.y")));
              }
              int updatedRaws = personService.updatePerson(loggedPerson);
              LOG.debug(updatedRaws + " was updated");
              break;
            case 7:
              personService.deletePerson(loggedPerson.getId());
              System.out.println("**********");
              System.out.println(
                  String.format(
                      "%s %s was deleted.",
                      loggedPerson.getFirstName(), loggedPerson.getLastName()));
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
      } catch (NoSuchElementException nseE) {
        LOG.error(nseE);
        scanner = new Scanner(System.in);
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

  private void printPersonProductList() {
    System.out.println("**********");
    if (loggedPerson.getProductList().size() == 0) {
      System.out.println("No any product");
    } else {
      loggedPerson.getProductList().forEach(System.out::println);
    }
    System.out.println("**********");
  }

  private Product prepareProductForUpdateOrDelete(Scanner scanner) {
    System.out.println("Enter ID of the product that you want to change:");
    long choseID = scanner.nextBigInteger().longValue();

    return loggedPerson.getProductList().stream()
        .filter(p -> p.getId() == choseID)
        .collect(
            Collectors.collectingAndThen(
                Collectors.toList(), list -> (list.size() == 0) ? null : list.get(0)));
  }

  private void godMode(Scanner scanner) {
    boolean loginAsAdmin = true;
    int chosepoint = -1;
    while (loginAsAdmin) {
      System.out.println(
          "Welcome ADMIN."
              + "\nChose what you want to do:"
              + "\n1. Show all users."
              + "\n2. Show all products."
              + "\n3. Edit user."
              + "\n4. Edit product."
              + "\n5. Delete user."
              + "\n6. Delete product."
              + "\n0. Log out.");
      chosepoint = scanner.nextInt();
      switch (chosepoint) {
        case 1:
          System.out.println("**********");
          personService.getAllPersons().forEach(System.out::println);
          System.out.println("**********");
          break;
        case 2:
          System.out.println("**********");
          productService.getAllProducts().forEach(System.out::println);
          System.out.println("**********");
          break;
        case 3:
          System.out.println("**********");
          personService.getAllPersons().forEach(System.out::println);
          System.out.println("Enter user ID that you want to update:");
          Person person = personService.findPerson(scanner.nextInt());
          scanner.nextLine();
          System.out.println("Enter person login");
          String newData;
          if (!(newData = scanner.nextLine()).equals("")) {
            person.setLogin(newData);
          }
          System.out.println("Enter person password:");
          if (!(newData = scanner.nextLine()).equals("")) {
            person.setPassword(newData);
          }
          System.out.println("Enter person first name:");
          if (!(newData = scanner.nextLine()).equals("")) {
            person.setFirstName(newData);
          }
          System.out.println("Enter person last name:");
          if (!(newData = scanner.nextLine()).equals("")) {
            person.setLastName(newData);
          }
          System.out.println("Enter person day of birth:");
          if (!(newData = scanner.nextLine()).equals("")) {
            person.setDateOfBirth(LocalDate.parse(newData, DateTimeFormatter.ofPattern("d.M.y")));
          }
          int updatedRaws = personService.updatePerson(person);
          LOG.debug(updatedRaws + " was updated");
          break;
        case 4:
          System.out.println("**********");
          productService.getAllProducts().forEach(System.out::println);
          System.out.println("Enter user ID that you want to update:");
          Product product = productService.findProductById(scanner.nextInt());
          scanner.nextLine();
          System.out.println("Enter product name");
          if (!(newData = scanner.nextLine()).equals("")) {
            product.setProductName(newData);
          }
          productService.updateProduct(product);
          break;
        case 5:
          System.out.println("**********");
          personService.getAllPersons().forEach(System.out::println);
          System.out.println("Enter user ID that you want to delete:");
          personService.deletePerson(scanner.nextInt());
          break;
        case 6:
          System.out.println("**********");
          productService.getAllProducts().forEach(System.out::println);
          System.out.println("Enter user ID that you want to delete:");
          productService.deleteProduct(scanner.nextInt());

          break;

        case 0:
          loginAsAdmin = false;
          break;
      }
    }
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
