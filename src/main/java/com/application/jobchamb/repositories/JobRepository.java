package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.Job;
import com.application.jobchamb.entities.JobTypes;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
}
