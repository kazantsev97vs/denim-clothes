package wellink.test.task.entities.equipment;

import lombok.Data;
import wellink.test.task.entities.Color;
import wellink.test.task.super_classes.BaseClothes;
import wellink.test.task.super_classes.BaseEquipment;

import javax.persistence.Entity;

/**
 * Швейная машинка
 */
@Entity
@Data
public class SewingMachine extends BaseEquipment<BaseClothes> {

    public SewingMachine(String name, Double cost, Color color, long totalWorkingTime, long totalWorkingTimeLimit) {
        super(name, cost, color, totalWorkingTime, totalWorkingTimeLimit);
    }

    @Override
    public BaseClothes doWork() {
        return null;
    }
}