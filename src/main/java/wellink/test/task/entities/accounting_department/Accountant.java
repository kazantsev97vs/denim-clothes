package wellink.test.task.entities.accounting_department;

import lombok.Data;
import wellink.test.task.super_classes.BaseEmployee;

import javax.persistence.Entity;

/**
 * Бухгалтер
 *
 * Обязанности:
 *
 *  - ведение бухгалтерского, налогового, управленческого учета (ООО (УСН и 0), ИП (ЕВНД - розничная торговля одеждой))
 *  - ведение учета с нуля (ИП)
 *  - ведение договорной работы (согласование договоров и доп.соглашений, переписка с арендодателями, поставщиками, кредитными организациями)
 *  - ведение кадровой документации
 *  - расчет и начисление заработной платы (зарплатный проект, открытие/ведение) (до 50 человек)
 *  - расчет и сдача документов по листам нетрудоспособности в ФСС
 *  - подготовка, сдача отчетов в ИФНС, фонды, статистику
 *  - работа с интернет-банками - проведение банковских операций (согласование счетов, осуществление платежей, контроль сроков платежей, ведение реестра оплат, выгрузка в 1С, платежи в валюте)
 *  - взаимодействие с банками
 *  - ведение, обработка первичной документации, сверка расчетов
 *  - подготовка и сдача ежемесячных отчетов арендодателям ТЦ
 *  - контроль кассовой дисциплины, проверка форм КМ-6, КМ-7
 *  - составление внутренних финансовых отчетов для руководителя
 *  - участие в инвентаризациях
 *  - выполнение иных поручений руководителя
 */
@Entity
@Data
public class Accountant extends BaseEmployee {
    public Accountant(String name, String firstName, String lastName, String phoneNumber, String mail, Double salary, String position) {
        super(name, firstName, lastName, phoneNumber, mail, salary, position);
    }
}