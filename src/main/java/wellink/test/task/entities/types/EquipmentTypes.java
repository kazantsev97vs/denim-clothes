package wellink.test.task.entities.types;

import lombok.Data;
import wellink.test.task.super_classes.BaseEntity;
import javax.persistence.Entity;

/**
 * Типы оборудования
 */
@Entity
@Data
public class EquipmentTypes extends BaseEntity {
    /**
     * Описание
     */
    private String description;

    public EquipmentTypes(String name, String description) {
        super(name);
        this.description = description;
    }
}