package com.application.jobchamb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "jobtypes")
public class JobTypes {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JOBTYPE")
    @SequenceGenerator(name = "SEQ_JOBTYPE",sequenceName = "sequencia_jobtype")
    private int id;


    private String type;
}
