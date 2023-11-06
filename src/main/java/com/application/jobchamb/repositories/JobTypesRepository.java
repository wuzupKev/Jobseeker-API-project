package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.JobTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobTypesRepository extends JpaRepository<JobTypes, Integer> {
}
