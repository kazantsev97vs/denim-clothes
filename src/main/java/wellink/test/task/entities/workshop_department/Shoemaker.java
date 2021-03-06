package wellink.test.task.entities.workshop_department;

import lombok.Data;
import wellink.test.task.super_classes.BaseEmployee;

import javax.persistence.Entity;

/**
 * Сапожник, башмачник, ... - в общем тот, кто отвечает за изготавление обуви
 */
@Entity
@Data
public class Shoemaker extends BaseEmployee {
    public Shoemaker(String name, String firstName, String lastName, String phoneNumber, String mail, Double salary, String position) {
        super(name, firstName, lastName, phoneNumber, mail, salary, position);
    }
}