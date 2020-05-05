package wellink.test.task.interfaces;

import java.util.List;

/**
 * Create Read Update Delete
 * - основные CRUD методы над сущностью
 * @param <Entity> -  сущность
 */
public interface CRUD <Entity> {

    // Create ----------------------------------

    Entity save(Entity entity);

    List<Entity> saveAll(List<Entity> entities);

    // Read ------------------------------------

    Entity get(Long id);

    List<Entity> getAll(List<Long> ids);

    Long count();

    // Update ----------------------------------

    Entity update(Entity entity);

    // Delete ----------------------------------

    Boolean delete(Long id);

    Boolean deleteAll(List<Entity> entities);

}
