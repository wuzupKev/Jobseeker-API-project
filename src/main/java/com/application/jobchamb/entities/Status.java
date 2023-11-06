package com.application.jobchamb.entities;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.event.ListDataListener;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "statuses")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_STATUS")
    @SequenceGenerator(name = "SEQ_STATUS",sequenceName = "sequencia_status")
    private int id;

    private String status;

}
