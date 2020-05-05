package wellink.test.task.super_classes;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.enums.Gender;
import wellink.test.task.enums.Size;

import javax.persistence.MappedSuperclass;

/**
 * Одежда, имеет
 *  1) свой идентификатор
 *  2) свое название
 *  3) свою стоимость
 *  4) свой цвет
 *  5) размер
 *  6) пол - для кого предназначена
 */
@MappedSuperclass
@Data
public abstract class BaseClothes extends BaseMaterial {
    /**
     * Размер одежды
     */
    private Size size;
    /**
     * Мужская, женская одежда или унисекс
     */
    private Gender gender;

    public BaseClothes(String name, Double cost, Color color, Size size, Gender gender) {
        super(name, cost, color);
        this.size = size;
        this.gender = gender;
    }
}