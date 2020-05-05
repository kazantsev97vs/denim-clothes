package wellink.test.task.super_classes;

import lombok.Data;
import wellink.test.task.entities.Color;

import javax.persistence.MappedSuperclass;

/**
 * Оборудование
 *   для работы требуется электричество
 *   изготавливает или помогает в изготовлении некоторого Product-а
 */
@MappedSuperclass
@Data
public abstract class BaseEquipment <Product> extends BaseMaterial {
    /**
     * Время начала работы оборудования
     */
    private long workingTimeStart;
    /**
     * Время окончания работы оборудования
     */
    private long workingTimeEnd;
    /**
     * время работы оборудования
     */
    private long workingTime;
    /**
     * общая продолжительность рабочего времени
     */
    private long totalWorkingTime;
    /**
     * Максимальное возможное время работы оборудования, после которого оборудование выходит из строя
     */
    private long totalWorkingTimeLimit;

    public BaseEquipment(String name, Double cost, Color color, long totalWorkingTime, long totalWorkingTimeLimit) {
        super(name, cost, color);
        this.totalWorkingTime = totalWorkingTime;
        this.totalWorkingTimeLimit = totalWorkingTimeLimit;
    }

    /**
     * Запустить оборудование
     */
    public void turnOn() {
        workingTimeStart = System.currentTimeMillis();
    }

    /**
     * Выключить оборудование
     */
    public void turnOff() {
        workingTimeEnd = System.currentTimeMillis();
        workingTime = workingTimeEnd - workingTimeStart;
        totalWorkingTime += workingTime;
    }

    /**
     * Начать изготовление продукта
     * @return конечный изготовленный продукт
     */
    public abstract Product doWork();
}