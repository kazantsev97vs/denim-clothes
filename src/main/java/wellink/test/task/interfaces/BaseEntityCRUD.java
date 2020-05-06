package wellink.test.task.interfaces;

import org.springframework.data.domain.Pageable;
import wellink.test.task.super_classes.BaseEntity;
import java.util.List;

/**
 * Create Read Update Delete
 * - основные CRUD методы над сущностью
 * + поиск по имени
 * @param <Entity> - тип сущности, содержащий поля "name" и "id"
 * @param <ID> - тип идентификатора сущности
 */
public interface BaseEntityCRUD<Entity extends BaseEntity, ID> extends CRUD<Entity, ID> {

    // Read ------------------------------------

    List<Entity> getAllByName(String name);

    List<Entity> getAllByName(String name, Pageable page);
}