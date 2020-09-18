package by.moiseenko.customers_info.repository;

import by.moiseenko.customers_info.entity.WindowsVersion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public interface WindowsVersionRepository extends CrudRepository<WindowsVersion, Long> {

}
