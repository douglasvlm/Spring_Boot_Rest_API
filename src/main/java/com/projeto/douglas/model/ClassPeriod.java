package com.projeto.douglas.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class ClassPeriod {
    @Id
    private long id_ClassPeriod;
    @Column
    @NotNull
    private String classPeriod;

}
