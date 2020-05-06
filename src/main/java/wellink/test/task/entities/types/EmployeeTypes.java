package wellink.test.task.entities.types;

import lombok.Data;
import wellink.test.task.super_classes.BaseEntity;
import javax.persistence.Entity;

/**
 * Типы сотрудников
 */
@Entity
@Data
public class EmployeeTypes extends BaseEntity {
    /**
     * Должность
     */
    private String position;
    /**
     * Описание
     */
    private String description;

    public EmployeeTypes(String name, String position, String description) {
        super(name);
        this.position = position;
        this.description = description;
    }
}