package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.Areas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreasRepository extends JpaRepository<Areas,Integer> {
}
