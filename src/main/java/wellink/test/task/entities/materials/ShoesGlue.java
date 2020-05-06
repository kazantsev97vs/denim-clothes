package wellink.test.task.entities.materials;

import lombok.NoArgsConstructor;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Клей для обуви
 */
@Entity
@NoArgsConstructor
public class ShoesGlue extends BaseMaterial {

    public ShoesGlue(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}