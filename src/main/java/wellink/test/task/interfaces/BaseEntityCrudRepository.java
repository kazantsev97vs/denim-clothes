package wellink.test.task.interfaces;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import wellink.test.task.super_classes.BaseEntity;
import java.util.List;

public interface BaseEntityCrudRepository <Entity extends BaseEntity, ID> extends CrudRepository<Entity, ID> {

    List<Entity> findAllByName(String name);

    List<Entity> findAllByName(String name, Pageable page);
}