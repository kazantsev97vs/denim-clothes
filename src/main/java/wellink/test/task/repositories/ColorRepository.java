package wellink.test.task.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wellink.test.task.entities.Color;

@Repository
public interface ColorRepository extends CrudRepository<Color, Long> {
}