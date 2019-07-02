package by.moiseenko.service.impl;

import by.moiseenko.service.PasswordCrypt;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class PasswordCryptImpl implements PasswordCrypt {

  private static final Logger LOG = LogManager.getLogger(PasswordCryptImpl.class.getName());
  private final int logRounds;

  public PasswordCryptImpl(int logRounds) {
    this.logRounds = logRounds;
  }

    @Override
  public String hash(String password) {
    return BCrypt.hashpw(password, BCrypt.gensalt(logRounds));
  }

  @Override
  public boolean verifyHash(String password, String hash) {
    return BCrypt.checkpw(password, hash);
  }
}
