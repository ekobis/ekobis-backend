package net.ekobis.ekobis.finance.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table (name="incomes")
public class IncomeEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String incomeId;
    private String firstname;
    private String amount;
    private LocalDate date;

}
