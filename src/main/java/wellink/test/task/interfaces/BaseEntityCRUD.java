package wellink.test.task.interfaces;

import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * Create Read Update Delete
 * - основные CRUD методы над сущностью
 * + поиск по имени
 * @param <Entity> - тип сущности
 * @param <ID> - тип идентификатора сущности
 */
public interface BaseEntityCRUD<Entity, ID> extends CRUD<Entity, ID> {

    // Read ------------------------------------

    List<Entity> getAllByName(String name);

    List<Entity> getAllByName(String name, Pageable page);
}