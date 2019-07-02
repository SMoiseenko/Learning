package by.moiseenko.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public interface PasswordCrypt {

  String hash(String password);

  boolean verifyHash(String password, String hash);
}
