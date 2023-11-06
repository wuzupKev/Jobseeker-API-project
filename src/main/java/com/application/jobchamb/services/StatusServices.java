package com.application.jobchamb.services;

import com.application.jobchamb.entities.Status;
import com.application.jobchamb.repositories.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusServices {

    @Autowired
    private StatusRepository statusRepository;


    //tener la lista de los status
    public List<Status> getStatus() {
        return statusRepository.findAll();
    }

    //buscar el status por id
    public Optional<Status> findStatus(int id) {
        return statusRepository.findById(id);
    }

    //actualizar status
    public void createUpdateStatus(Status status) {
        statusRepository.save(status);
    }

}
