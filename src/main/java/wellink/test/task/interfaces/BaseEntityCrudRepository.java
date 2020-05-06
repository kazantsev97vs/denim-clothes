package wellink.test.task.interfaces;

import org.springframework.data.domain.Pageable;
import wellink.test.task.super_classes.BaseEntity;
import java.util.List;

/**
 * Интерфейс для репозитория, работающего с сущностью содержайщей поле "name"
 * по которому можно осуществить поиск
 * @param <Entity> сущность содержащая поля "name" и "id"
 */
public interface BaseEntityCrudRepository <Entity extends BaseEntity>  {

    List<Entity> findAllByName(String name);

    List<Entity> findAllByName(String name, Pageable page);
}