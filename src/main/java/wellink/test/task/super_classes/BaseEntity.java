package wellink.test.task.super_classes;

import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Каждая сущность должна иметь свой идентификатор id,
 * а также название (имя) name
 */
@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    /**
     * Название
     */
    private String name;

    public BaseEntity(String name) {
        this.name = name;
    }

    public BaseEntity() {
    }
}
