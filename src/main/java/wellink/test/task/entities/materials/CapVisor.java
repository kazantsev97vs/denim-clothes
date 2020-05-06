package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Козырёк для кепки
 */
@Entity
@Data
public class CapVisor extends BaseMaterial {

    public CapVisor(String name, Double cost, Color color) {
        super(name, cost, color);
    }
}