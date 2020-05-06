package wellink.test.task.entities.materials;

import lombok.NoArgsConstructor;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Нитки (рулон)
 */
@Entity
@NoArgsConstructor
public class Threads extends BaseMaterial {

    public Threads(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}