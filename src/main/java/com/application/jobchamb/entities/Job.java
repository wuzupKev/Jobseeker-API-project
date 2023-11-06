package com.application.jobchamb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "jobs")
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JOB")
    @SequenceGenerator(name = "SEQ_JOB",sequenceName = "sequencia_job")
    private int id;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="contractor",referencedColumnName = "id")
    private Users contractor;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="company",referencedColumnName = "id")
    private Users company;
    private String title;
    private String description ;
    private String location;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="category",referencedColumnName = "id")
    private Areas category;

    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="job_type",referencedColumnName = "id")
    private JobTypes jobtype;


    private String requirements;
    private Date publish_Date;
    private int visible;



}
