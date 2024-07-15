package net.ekobis.ekobis.income.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import net.ekobis.ekobis.category.domain.entity.CategoryEntity;
import net.ekobis.ekobis.common.model.entity.BaseEntity;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.List;

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


    @OneToMany(mappedBy = "incomeEntity", cascade = CascadeType.ALL)
    private List<IncomeEntity> incomeEntities;

}
