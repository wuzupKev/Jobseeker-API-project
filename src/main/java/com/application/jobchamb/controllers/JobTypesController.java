package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.JobTypes;
import com.application.jobchamb.services.JobTypesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/jobstype")
public class JobTypesController {

    @Autowired
    private JobTypesServices jobTypesServices;

    @GetMapping
    public List<JobTypes> listAllJobsTypes(){
        return jobTypesServices.viewAllJobsTypes();
    }

    @GetMapping(path = "/{id}")
    public Optional<JobTypes> singleJobType(int id){
        return jobTypesServices.viewSingleJobType(id);
    }

    @PostMapping
    public void createUpdateJobType(JobTypes jobTypes){
        jobTypesServices.createUpdateJobType(jobTypes);
    }
}
