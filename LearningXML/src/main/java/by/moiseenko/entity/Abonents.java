package by.moiseenko.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 *
 * @author s-moiseenko
 */


public class Abonents {
  private static final Logger LOG = LogManager.getLogger(Abonents.class.getName());

  private List<Abonent> abonents;

  public void addAbonent(Abonent abonent){
    if (abonents == null) {
      abonents = new ArrayList<>();
    }
    abonents.add(abonent);
  }

  public List<Abonent> getAllAbonent(){
    return (abonents == null) ? new ArrayList<>() : abonents;
  }

}
