package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Подошва для обуви (пара)
 */
@Entity
@Data
public class ShoeSoles extends BaseMaterial {

    public ShoeSoles(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}