package wellink.test.task.entities.workshop_department;

import lombok.Data;
import wellink.test.task.super_classes.BaseEmployee;

import javax.persistence.Entity;

/**
 * Порной, швея, ... - в общем тот, кто отвечает за изготавление одежды
 */
@Entity
@Data
public class Dressmaker extends BaseEmployee {
    public Dressmaker(String name, String firstName, String lastName, String phoneNumber, String mail, Double salary, String position) {
        super(name, firstName, lastName, phoneNumber, mail, salary, position);
    }
}