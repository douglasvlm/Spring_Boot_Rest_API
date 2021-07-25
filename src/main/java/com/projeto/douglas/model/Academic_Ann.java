package com.projeto.douglas.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Academic_Ann {
    @Id
    private long id_Academic_Ann;

    private String descricao;

    @NotNull
    @CreationTimestamp
    private LocalDateTime data_Reg;
    @ManyToOne
    @NotNull
    private Event event;
    @ManyToOne
    @NotNull
    private ClassPeriod classPeriod;
    @ManyToOne
    @NotNull
    private Discipline discipline;


}
