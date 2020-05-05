package wellink.test.task.super_classes;

import lombok.Data;

import javax.persistence.MappedSuperclass;

/**
 * Базовая информация о сотруднике фирмы:
 *  - имя
 *  - фамилия
 *  - номер телефона
 *  - адрес почты
 *  - ЗП
 *  - должность
 */
@MappedSuperclass
@Data
public abstract class BaseEmployee extends BaseEntity {

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String mail;

    private Double salary;

    private String position;

    public BaseEmployee(String name, String firstName, String lastName, String phoneNumber, String mail, Double salary, String position) {
        super(name);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.salary = salary;
        this.position = position;
    }
}