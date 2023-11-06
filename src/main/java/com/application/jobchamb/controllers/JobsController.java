package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Job;
import com.application.jobchamb.entities.JobTypes;
import com.application.jobchamb.entities.Users;
import com.application.jobchamb.services.JobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/jobs")
public class JobsController {
    @Autowired
    private JobServices jobServices;

    @GetMapping
    public List<Job> listAllJobsTypes(){
        return jobServices.viewAllJobsAvaible();
    }
    @GetMapping(path = "/{id}")
    public Optional<Job> findJob(@PathVariable("id") int id){
        return jobServices.viewSingleJobAvaible(id);
    }

    @PostMapping
    public void createUpdateJob(Job job){
       jobServices.createUpdateJobs(job);
    }

}
