package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Status;
import  com.application.jobchamb.services.StatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/status")
public class StatusController {

    @Autowired
    private StatusServices statusServices;

    //tener el mapping de la lista de status
    @GetMapping
    public List<Status> getListStatus(){
        return statusServices.getStatus();
    }

    //buscar el mapping del id
    @GetMapping(path = "/{id}")
    public Optional<Status> findListStatus(@PathVariable("id") int id){
        return statusServices.findStatus(id);
    }

    //actualizar el mapping de status
    @PostMapping()
    public void saveListStatus(@RequestBody Status status){
        statusServices.createUpdateStatus(status);
    }




}
