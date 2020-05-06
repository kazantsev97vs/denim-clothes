package wellink.test.task.repositories.types;

import org.springframework.stereotype.Repository;
import wellink.test.task.entities.types.EmployeeTypes;
import wellink.test.task.interfaces.BaseEntityCrudRepository;

@Repository
public interface EmployeeTypesRepository extends BaseEntityCrudRepository<EmployeeTypes, Long>  {
}