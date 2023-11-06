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
@Table(name = "requests")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_REQUEST")
    @SequenceGenerator(name = "SEQ_REQUEST",sequenceName = "sequencia_request")
    private int id;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="requester",referencedColumnName = "id" , nullable =false)
    private Users Requester;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="job",referencedColumnName = "id",nullable =false)
    private Job job;
    @ManyToOne( cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name="status",referencedColumnName = "id",nullable =false)
    private Status status;
}
