package wellink.test.task.entities;

import lombok.Data;
import wellink.test.task.super_classes.BaseEntity;

import javax.persistence.Entity;

/**
 * Фирма,
 * имеет
 *  - идентификатор
 *  - название
 *  - ...
 */
@Entity
@Data
public class Firm extends BaseEntity {

    /**
     * Балансовый счет фирмы
     */
    private Double balanceAccount;


    public Firm(String name, Double balanceAccount) {
        super(name);
        this.balanceAccount = balanceAccount;
    }
}