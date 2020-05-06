package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Шнурки (пара)
 */
@Entity
@Data
public class Laces extends BaseMaterial {

    public Laces(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}