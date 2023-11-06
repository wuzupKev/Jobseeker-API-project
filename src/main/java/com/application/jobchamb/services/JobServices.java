package com.application.jobchamb.services;

import com.application.jobchamb.entities.Job;
import com.application.jobchamb.entities.JobTypes;
import com.application.jobchamb.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServices {
    @Autowired
    JobRepository jobRepository;

    public List<Job> viewAllJobsAvaible (){
        return jobRepository.findAll();
    }

    public Optional<Job> viewSingleJobAvaible(int id){
        return jobRepository.findById(id);
    }

    public void createUpdateJobs (Job job){
        jobRepository.save(job);
    }
}
