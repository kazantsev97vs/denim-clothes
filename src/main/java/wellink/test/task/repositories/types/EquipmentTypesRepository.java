package wellink.test.task.repositories.types;

import org.springframework.stereotype.Repository;
import wellink.test.task.entities.types.EquipmentTypes;
import wellink.test.task.interfaces.BaseEntityCrudRepository;

@Repository
public interface EquipmentTypesRepository extends BaseEntityCrudRepository<EquipmentTypes, Long> {
}