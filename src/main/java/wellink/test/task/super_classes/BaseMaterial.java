package wellink.test.task.super_classes;

import lombok.Data;
import wellink.test.task.entities.Color;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * Материалы, каждый материал имеет
 *  1) идентификатор
 *  2) название
 *  3) стоимость
 *  4) цвет
 */
@MappedSuperclass
@Data
public abstract class BaseMaterial extends BaseEntity {
    /**
     * Стоимость
     */
    private Double cost;
    /**
     * Цвет
     */
    @OneToOne
    private Color color;

    public BaseMaterial(String name, Double cost, Color color) {
        super(name);
        this.cost = cost;
        this.color = color;
    }
}