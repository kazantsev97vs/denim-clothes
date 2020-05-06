package wellink.test.task.services.impl.types;

import org.springframework.stereotype.Service;
import wellink.test.task.entities.types.EquipmentTypes;
import wellink.test.task.repositories.types.EquipmentTypesRepository;
import wellink.test.task.services.types.EquipmentTypesService;
import wellink.test.task.super_classes.BaseEntityCRUDImpl;

/**
 * Реализация CRUD-сервиса для сущности 'Типы оборудования'
 */
@Service
public class EquipmentTypesServiceImpl
        extends BaseEntityCRUDImpl<EquipmentTypes, Long, EquipmentTypesRepository>
        implements EquipmentTypesService {

    public EquipmentTypesServiceImpl(EquipmentTypesRepository repository) {
        super(repository);
    }
}