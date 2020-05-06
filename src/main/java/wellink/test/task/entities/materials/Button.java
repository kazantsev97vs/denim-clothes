package wellink.test.task.entities.materials;

import lombok.NoArgsConstructor;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Пуговица
 */
@Entity
@NoArgsConstructor
public class Button extends BaseMaterial {

    public Button(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}