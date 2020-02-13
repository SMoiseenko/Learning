package by.moiseenko.structural.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Department implements SayYourName{
  private static final Logger LOG = LogManager.getLogger(Department.class.getName());
  private List<SayYourName> listOfWorkers;
  private String departmentName;

  public Department(String departmentName) {
    this.listOfWorkers = new ArrayList<>();
    this.departmentName = departmentName;
  }

  public void addWorker(SayYourName worker){
    listOfWorkers.add(worker);
  }
  public void dismissWorker(SayYourName worker){
    listOfWorkers.remove(worker);
  }

  @Override
  public BigDecimal getSalary() {
    BigDecimal result = null;
    for(SayYourName next: listOfWorkers){
      if (result == null) {
        result = new BigDecimal(0);
      }
      result = result.add(next.getSalary());
    }

    return result;
  }

  @Override
  public void SayName() {
    LOG.debug("Department: " + departmentName + " has next workers:");
    for(SayYourName next: listOfWorkers){
      next.SayName();
    }



  }
}
