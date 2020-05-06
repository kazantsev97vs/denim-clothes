package wellink.test.task.entities;

import wellink.test.task.super_classes.BaseEntity;

/**
 * Фирма,
 * имеет
 *  - идентификатор
 *  - название
 *  - ...
 */
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
