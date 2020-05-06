package wellink.test.task.services.impl.types;

import org.springframework.stereotype.Service;
import wellink.test.task.entities.types.MaterialTypes;
import wellink.test.task.repositories.types.MaterialTypesRepository;
import wellink.test.task.services.types.MaterialTypesService;
import wellink.test.task.super_classes.BaseEntityCRUDImpl;

/**
 * Реализация CRUD-сервиса для сущности 'Типы материалов'
 */
@Service
public class MaterialTypesServiceImpl
        extends BaseEntityCRUDImpl<MaterialTypes, Long, MaterialTypesRepository>
        implements MaterialTypesService {

    public MaterialTypesServiceImpl(MaterialTypesRepository repository) {
        super(repository);
    }
}