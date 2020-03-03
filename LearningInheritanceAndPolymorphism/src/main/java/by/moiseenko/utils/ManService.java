package by.moiseenko.utils;

import by.moiseenko.entity.Man;
import by.moiseenko.entity.Passport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public class ManService {

  private static final Logger LOG = LogManager.getLogger(ManService.class.getName());
public void manHardChanger(Man man){

  try {
    man = man.clone();
    man.setPassport((Passport) man.getPassport().clone());
  } catch (CloneNotSupportedException e) {
    e.printStackTrace();
  }
  man.setId(555666);
  man.setName("R.I.P.");
  man.setAge(1000);
  man.getPassport().setNumber(987654321L);
  LOG.debug(man);
}
}
