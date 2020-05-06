package wellink.test.task.services.impl.types;

import org.springframework.stereotype.Service;
import wellink.test.task.entities.types.ProductTypes;
import wellink.test.task.repositories.types.ProductTypesRepository;
import wellink.test.task.services.types.ProductTypesService;
import wellink.test.task.super_classes.BaseEntityCRUDImpl;

/**
 * Реализация CRUD-сервиса для сущности 'Типы товаров'
 */
@Service
public class ProductTypesServiceImpl
        extends BaseEntityCRUDImpl<ProductTypes, Long, ProductTypesRepository>
        implements ProductTypesService {

    public ProductTypesServiceImpl(ProductTypesRepository repository) {
        super(repository);
    }
}