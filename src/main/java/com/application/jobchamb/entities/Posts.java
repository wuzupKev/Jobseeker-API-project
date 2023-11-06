package com.application.jobchamb.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "post")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_POST")
    @SequenceGenerator(name = "SEQ_POST",sequenceName = "sequencia_post")
    private int id;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="requester",referencedColumnName = "id")
    private Users requester;
    private String title;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="category",referencedColumnName = "id")
    private Areas category;
    private String description;
    private Timestamp publish_date;
    private int visible;
}
