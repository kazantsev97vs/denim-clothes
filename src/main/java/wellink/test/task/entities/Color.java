package wellink.test.task.entities;

import wellink.test.task.super_classes.BaseEntity;
import lombok.Data;
import javax.persistence.Entity;

/**
 * Цвет, у него есть id, name, hex, rgb
 */
@Entity
@Data
public class Color extends BaseEntity {

    /**
     * Шестнадцатеричное представление цвета в формате RGB — # КК ЗЗ СС
     */
    private String hex;

    /**
     * Аддитивная цветовая модель RGB: Red, Green, Blue — Красный, Зелёный, Синий
     */
    private String rgb;

    public Color(String name, String hex, String rgb) {
        super(name);
        this.hex = hex;
        this.rgb = rgb;
    }
}