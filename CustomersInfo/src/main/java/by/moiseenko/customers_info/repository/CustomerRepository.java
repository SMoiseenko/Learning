package by.moiseenko.customers_info.repository;

import by.moiseenko.customers_info.entity.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {


}
