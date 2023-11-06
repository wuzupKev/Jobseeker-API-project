package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.Cxc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CxcRepository extends JpaRepository<Cxc,Integer> {
}
