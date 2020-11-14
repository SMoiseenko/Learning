package by.moiseenko.repository;

import by.moiseenko.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Default javadoc
 *
 * @author s-moiseenko
 */
public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);
}
