package by.moiseenko.TempCustomerInfo.repository;

import by.moiseenko.TempCustomerInfo.entity.MyEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Repository
public interface MyEntityCRUDRepository extends CrudRepository<MyEntity, Long> {

}
