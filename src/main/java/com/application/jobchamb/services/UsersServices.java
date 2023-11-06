package com.application.jobchamb.services;

import com.application.jobchamb.entities.RegisterRequest;
import com.application.jobchamb.entities.Users;
import com.application.jobchamb.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {

    @Autowired
    UsersRepository usersRepository;

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public Optional<Users> getSingleUser(long id){
        return usersRepository.findById(id);
    }

    public void  createUpdateUser(RegisterRequest users){
        Users users1 = Users.builder()
                .name(users.getName())
                .lastname(users.getLastname())
                .email(users.getEmail())
                .phone(users.getPhone())
                .password(users.getPassword())
                .curriculum(users.getCurriculum())
                .description(users.getDescription())
                .photo(users.getPhoto())
                .status(users.getStatus())
                .company(users.getCompany())
                .build();
        usersRepository.save(users1);
    }

}
