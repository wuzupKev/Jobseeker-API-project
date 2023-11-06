package com.application.jobchamb.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class RegisterRequest {


     String name;
     String lastname;
     String email;
     String phone;
     String password;
     String curriculum;
     String description;
     String photo;
     int status;
     int company;
}
