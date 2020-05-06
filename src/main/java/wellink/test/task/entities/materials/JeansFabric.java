package wellink.test.task.entities.materials;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.enums.Density;
import wellink.test.task.super_classes.BaseMaterial;

import javax.persistence.Entity;

/**
 * Джинсовая ткань
 */
@Entity
@Data
public class JeansFabric extends BaseMaterial {
    /**
     * Плотность ткани
     */
    private Density density;

    public JeansFabric(String name, Double cost, Color color, Density density) {
        super(name, cost, color);
        this.density = density;
    }
}