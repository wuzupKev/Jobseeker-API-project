package com.application.jobchamb.services;

import com.application.jobchamb.entities.JobTypes;
import com.application.jobchamb.repositories.JobTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTypesServices {

    @Autowired
    JobTypesRepository jobTypesRepository;

    public List<JobTypes> viewAllJobsTypes (){
        return jobTypesRepository.findAll();
    }

    public Optional<JobTypes> viewSingleJobType(int id){
        return jobTypesRepository.findById(id);
    }

    public void createUpdateJobType (JobTypes jobTypes){
        jobTypesRepository.save(jobTypes);
    }
}
