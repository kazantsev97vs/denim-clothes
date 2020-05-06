package wellink.test.task.super_classes;

import org.springframework.data.domain.Pageable;
import wellink.test.task.interfaces.BaseEntityCRUD;
import wellink.test.task.interfaces.BaseEntityCrudRepository;
import java.util.List;

/**
 * Базовая реализация основных CRUD методов над сущностью
 * + методов реализующих поиск по имени
 * @param <Entity> - тип сущности
 * @param <ID> - тип идентификатора сущности
 * @param <Repository> - тип репозитория сущности, наследующий методы поиска по имени
 */
public abstract class BaseEntityCRUDImpl
        <Entity extends BaseEntity, ID, Repository extends BaseEntityCrudRepository<Entity, ID>>
        extends CRUDImpl<Entity, ID, Repository> implements BaseEntityCRUD<Entity, ID> {

    public BaseEntityCRUDImpl(Repository repository) {
        super(repository);
    }

    @Override
    public List<Entity> getAllByName(String name) {
        return repository.findAllByName(name);
    }

    @Override
    public List<Entity> getAllByName(String name, Pageable page) {
        return repository.findAllByName(name, page);
    }
}