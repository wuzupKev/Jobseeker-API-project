package com.application.jobchamb.services;

import com.application.jobchamb.entities.Areas;
import com.application.jobchamb.repositories.AreasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreasServices {

    @Autowired
    private AreasRepository areasRepository;

    //tener la lista de los status
    public List<Areas> getAreas() {
        return areasRepository.findAll();
    }

    //buscar el status por id
    public Optional<Areas> findAreas(int id) {
        return areasRepository.findById(id);
    }

    //actualizar status
    public void createUpdateAreas(Areas areas) {
        areasRepository.save(areas);
    }

}
