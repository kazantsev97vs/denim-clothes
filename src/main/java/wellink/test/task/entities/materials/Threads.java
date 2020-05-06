package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Нитки (рулон)
 */
@Entity
@Data
public class Threads extends BaseMaterial {

    public Threads(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}