package wellink.test.task.super_classes;

import lombok.Data;
import wellink.test.task.entities.Color;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 * Материалы, каждый материал имеет
 *  1) свой идентификатор
 *  2) свое название
 *  3) свою стоимость
 *  4) свой цвет
 */
@MappedSuperclass
@Data
public abstract class BaseMaterial extends BaseEntity {

    /**
     * Стоимость материала
     */
    private Double cost;

    /**
     * Цвет материала
     */
    @OneToOne
    private Color color;


    public BaseMaterial(String name, Double cost, Color color) {
        super(name);
        this.cost = cost;
        this.color = color;
    }
}
