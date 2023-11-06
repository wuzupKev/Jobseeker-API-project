package com.application.jobchamb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "areas")
public class Areas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_AREAS")
    @SequenceGenerator(name = "SEQ_AREAS",sequenceName = "sequencia_areas")
    private int id;
    private String area;

}
