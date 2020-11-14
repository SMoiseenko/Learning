package by.moiseenko.service;

import by.moiseenko.entity.Role;
import by.moiseenko.entity.User;
import by.moiseenko.repository.RoleRepository;
import by.moiseenko.repository.UserRepository;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
@Service
public class UserService implements UserDetailsService {

  private static final Logger LOG = LogManager.getLogger(UserService.class.getName());

  @PersistenceContext
  private EntityManager entityManager;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private RoleRepository roleRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    User user = userRepository.findByUsername(s);
    if (user == null) {
      throw new UsernameNotFoundException("User not found");
    }

    return user;
  }

  public User findUserById(Long userId) {
    Optional<User> userFromBD = userRepository.findById(userId);
    return userFromBD.orElse(new User());
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public boolean saveUSer(User user) {
    User userFromDB = userRepository.findByUsername(user.getUsername());
    if (userFromDB != null) {
      return false;
    }

    user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userRepository.save(user);
    return true;
  }

  public boolean deleteUser(Long id) {
    if (userRepository.findById(id).isPresent()) {
      userRepository.deleteById(id);
      return true;
    }
    return false;
  }

  public List<User> usergtList(Long idMin) {
    return entityManager.createQuery("SELECT u FROM User u WHERE u.id > :paramId", User.class)
        .setParameter("paramId", idMin).getResultList();
  }


}
