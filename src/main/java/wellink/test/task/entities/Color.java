package wellink.test.task.entities;

import wellink.test.task.super_classes.BaseEntity;
import lombok.Data;
import javax.persistence.Entity;

/**
 * Цвет
 */
@Entity
@Data
public class Color extends BaseEntity {

    /**
     * Шестнадцатеричное представление цвета в формате RGB — # КК ЗЗ СС
     */
    private String HEX;

    /**
     * Аддитивная цветовая модель RGB: Red, Green, Blue — Красный, Зелёный, Синий
     */
    private String RGB;


    public Color(String name, String HEX, String RGB) {
        super(name);
        this.HEX = HEX;
        this.RGB = RGB;
    }

}