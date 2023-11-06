package com.application.jobchamb.services;

import com.application.jobchamb.entities.Posts;
import com.application.jobchamb.entities.Preferences;
import com.application.jobchamb.repositories.PreferencesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreferencesServices {
    @Autowired
    PreferencesRepository preferencesRepository;
    public List<Preferences> viewAllPreferences(){
        return preferencesRepository.findAll();
    }

    public Optional<Preferences> viewSinglePreferences(int id){
        return preferencesRepository.findById(id);
    }

    public void createSavePreferences(Preferences preferences){
        preferencesRepository.save(preferences);
    }
}
