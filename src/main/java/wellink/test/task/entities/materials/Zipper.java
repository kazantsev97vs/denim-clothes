package wellink.test.task.entities.materials;

import lombok.NoArgsConstructor;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Застежка-молния
 */
@Entity
@NoArgsConstructor
public class Zipper extends BaseMaterial {

    public Zipper(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}