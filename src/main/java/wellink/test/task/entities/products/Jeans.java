package wellink.test.task.entities.products;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.enums.Gender;
import wellink.test.task.enums.Size;
import wellink.test.task.super_classes.BaseClothes;

import javax.persistence.Entity;


/**
 *  Джинсовые штаны
 */
@Entity
@Data
public class Jeans extends BaseClothes {
    /**
     * Количество карманов
     */
    private Byte packetsNumber;

    public Jeans(String name, Double cost, Color color, Size size, Gender gender, Byte packetsNumber) {
        super(name, cost, color, size, gender);
        this.packetsNumber = packetsNumber;
    }
}