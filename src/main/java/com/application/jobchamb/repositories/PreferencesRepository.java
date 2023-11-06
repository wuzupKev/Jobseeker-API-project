package com.application.jobchamb.repositories;

import com.application.jobchamb.entities.Preferences;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferencesRepository extends JpaRepository<Preferences,Integer> {
}
