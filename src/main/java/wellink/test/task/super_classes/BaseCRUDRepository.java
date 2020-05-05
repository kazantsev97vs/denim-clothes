package wellink.test.task.super_classes;

import org.springframework.data.repository.CrudRepository;
import wellink.test.task.interfaces.CRUD;

import java.util.ArrayList;
import java.util.List;

/**
 * Базовая реализация основных CRUD методов над сущностью
 * @param <Entity> - сущность
 * @param <Repository> - репозиторий сущности
 */
public abstract class BaseCRUDRepository
        <Entity extends BaseEntity, Repository extends CrudRepository<Entity, Long>> implements CRUD <Entity> {

    Repository repository;

    public BaseCRUDRepository(Repository repository) { this.repository = repository; }


    // Create ----------------------------------

    @Override
    public Entity save(Entity entity) {
        return repository.save(entity);
    }

    @Override
    public List<Entity> saveAll(List<Entity> entities) {

        List<Entity> list = new ArrayList<>();

        repository.saveAll(entities).forEach(list::add);

        return list;
    }


    // Read ------------------------------------

    @Override
    public Entity get(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Entity> getAll(List<Long> ids) {

        List<Entity> list = new ArrayList<>();

        repository.findAllById(ids).forEach(list::add);

        return list;
    }

    @Override
    public Long count() {
        return repository.count();
    }


    // Update ----------------------------------

    @Override
    public Entity update(Entity entity) {
        return repository.save(entity);
    }


    // Delete ----------------------------------

    @Override
    public Boolean delete(Long id) {

        repository.deleteById(id);

        return get(id) == null;
    }

    @Override
    public Boolean deleteAll(List<Entity> entities) {

        List<Long> ids = new ArrayList<>();

        for (Entity entity : entities) ids.add(entity.getId());

        repository.deleteAll(entities);

        return getAll(ids).size() == 0;
    }

}