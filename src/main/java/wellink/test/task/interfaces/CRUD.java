package wellink.test.task.interfaces;

import java.util.List;

/**
 * Create Read Update Delete
 * - основные CRUD методы над сущностью
 * @param <Entity> - тип сущности
 * @param <ID> - тип идентификатора сущности
 */
public interface CRUD <Entity, ID> {

    // Create ----------------------------------

    Entity save(Entity entity);

    List<Entity> saveAll(List<Entity> entities);

    // Read ------------------------------------

    Entity get(ID id);

    List<Entity> getAll(List<ID> ids);

    Long count();

    // Update ----------------------------------

    Entity update(Entity entity);

    // Delete ----------------------------------

    Boolean delete(ID id);

    Boolean deleteAll(List<Entity> entities);

}