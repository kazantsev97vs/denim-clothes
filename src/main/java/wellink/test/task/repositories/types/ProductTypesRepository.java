package wellink.test.task.repositories.types;

import org.springframework.stereotype.Repository;
import wellink.test.task.entities.types.ProductTypes;
import wellink.test.task.interfaces.BaseEntityCrudRepository;

@Repository
public interface ProductTypesRepository extends BaseEntityCrudRepository<ProductTypes, Long> {
}