package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Areas;
import com.application.jobchamb.services.AreasServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/areas")
public class AreasController {

    @Autowired
    private AreasServices areasServices;

    //tener el mapping de la lista de status
    @GetMapping
    public List<Areas> getAreasList(){
        return areasServices.getAreas();
    }

    //buscar el mapping del id
    @GetMapping(path = "/{id}")
    public Optional<Areas> findListStatus(@PathVariable("id") int id){
        return areasServices.findAreas(id);
    }

    //actualizar el mapping de status
    @PostMapping()
    public void saveListStatus(@RequestBody Areas areas){
        areasServices.createUpdateAreas(areas);
    }
}
