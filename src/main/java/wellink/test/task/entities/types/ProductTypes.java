package wellink.test.task.entities.types;

import lombok.Data;
import wellink.test.task.super_classes.BaseEntity;
import javax.persistence.Entity;

/**
 * Типы товаров
 */
@Entity
@Data
public class ProductTypes extends BaseEntity {
    /**
     * Описание
     */
    private String description;

    public ProductTypes(String name, String description) {
        super(name);
        this.description = description;
    }
}