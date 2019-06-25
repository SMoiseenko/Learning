package by.moiseenko.controller.impl;

import by.moiseenko.controller.ProgramController;
import by.moiseenko.model.Person;
import by.moiseenko.service.PersonService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
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

  public ProgramControllerImpl(PersonService personService) {
    this.personService = personService;
    start();
  }

  private void start() {
    Scanner scanner = new Scanner(System.in);
        int point = -1;
    while (true) {
      System.out.println("Welcome to PERSON service!");
      System.out.println(
          "Chose what you want to do:"
              + "\n1. Create account"
              + "\n2. Login system"
              + "\n3. Update info"
              + "\n4. Delete account"
              + "\n5. See all accounts"
              + "\n0. Exit program");

      point = scanner.nextInt();
      switch (point) {
        case 1:
          Person person= new Person();
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
          System.out.println(personService.findPerson(personId) + " was created.");
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          List<Person> personList = personService.getAllPersons();
          personList.forEach(System.out::println);
          System.out.println("Total raw/s = "+ personList.size());
          break;
        case 0:
          System.exit(0);
          break;
        default:
          LOG.error("Please, choose only from points below!");
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
