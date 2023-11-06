package com.application.jobchamb.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.engine.jdbc.env.internal.BlobAndClobCreator;

import java.sql.Blob;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_USERS")
    @SequenceGenerator(name = "SEQ_USERS",sequenceName = "sequencia_user")
    private int id;

    private String name;

    private String lastname;

    private String email;

    private String phone;

    private String password;

    private String curriculum;

    private String description;

    private String photo;

    private int status;

    private int company;



}
