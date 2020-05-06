package wellink.test.task.entities.types;

import lombok.Data;
import wellink.test.task.super_classes.BaseEntity;
import javax.persistence.Entity;

/**
 * Типы материалов
 */
@Entity
@Data
public class MaterialTypes extends BaseEntity {
    /**
     * Описание
     */
    private String description;

    public MaterialTypes(String name, String description) {
        super(name);
        this.description = description;
    }
}