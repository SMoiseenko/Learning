package by.moiseenko.customers_info.repository;

import by.moiseenko.customers_info.entity.SQLVersion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public interface SQLVersionRepository extends CrudRepository<SQLVersion, Long> {

}
