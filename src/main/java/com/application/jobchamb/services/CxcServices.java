package com.application.jobchamb.services;

import com.application.jobchamb.entities.Cxc;
import com.application.jobchamb.entities.Job;
import com.application.jobchamb.repositories.CxcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CxcServices {
    @Autowired
    CxcRepository cxcRepository;
    public List<Cxc> viewAllCxc (){
        return cxcRepository.findAll();
    }

    public Optional<Cxc> viewSingleCxce(int id){
        return cxcRepository.findById(id);
    }

    public void createUpdateCxc (Cxc cxc){
        cxcRepository.save(cxc);
    }
}
