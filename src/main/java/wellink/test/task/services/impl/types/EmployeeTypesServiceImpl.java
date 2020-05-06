package wellink.test.task.services.impl.types;

import org.springframework.stereotype.Service;
import wellink.test.task.entities.types.EmployeeTypes;
import wellink.test.task.repositories.types.EmployeeTypesRepository;
import wellink.test.task.services.types.EmployeeTypesService;
import wellink.test.task.super_classes.BaseEntityCRUDImpl;

/**
 * Реализация CRUD-сервиса для сущности 'Типы сотрудников'
 */
@Service
public class EmployeeTypesServiceImpl
        extends BaseEntityCRUDImpl<EmployeeTypes, Long, EmployeeTypesRepository>
        implements EmployeeTypesService {

    public EmployeeTypesServiceImpl(EmployeeTypesRepository repository) {
        super(repository);
    }
}