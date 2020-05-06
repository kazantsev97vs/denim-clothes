package wellink.test.task.repositories.types;

import org.springframework.stereotype.Repository;
import wellink.test.task.entities.types.MaterialTypes;
import wellink.test.task.interfaces.BaseEntityCrudRepository;

@Repository
public interface MaterialTypesRepository extends BaseEntityCrudRepository<MaterialTypes, Long> {
}