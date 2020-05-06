package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Клей для обуви
 */
@Entity
@Data
public class ShoesGlue extends BaseMaterial {

    public ShoesGlue(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}