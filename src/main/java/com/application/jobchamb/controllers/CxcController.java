package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Cxc;
import com.application.jobchamb.entities.Job;
import com.application.jobchamb.services.CxcServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/cxc")
public class CxcController {
    @Autowired
    CxcServices cxcServices;

    @GetMapping
    public List<Cxc> listAllcxc(){
        return cxcServices.viewAllCxc();
    }

    @GetMapping(path = "/{id}")
    public Optional<Cxc> findCxc(@PathVariable("id") int id){
        return cxcServices.viewSingleCxce(id);
    }

    @PostMapping
    public void createUpdateCxc(Cxc cxc){
       cxcServices.createUpdateCxc(cxc);
    }
}
