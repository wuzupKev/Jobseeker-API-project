package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.RegisterRequest;
import com.application.jobchamb.entities.Users;
import com.application.jobchamb.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/users")
public class UsersController {

    @Autowired
    private UsersServices usersServices;

    @GetMapping
    public List<Users> seeAllUsers(){
        return usersServices.getAllUsers();
    }

    @GetMapping(path = "/{id}")
    public Optional<Users> findUser(@PathVariable("id") int id){
        return usersServices.getSingleUser(id);
    }

    @PostMapping
    public void createUpdateUser(@RequestBody RegisterRequest users){
        usersServices.createUpdateUser(users);
    }

}
