package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Areas;
import com.application.jobchamb.entities.Preferences;
import com.application.jobchamb.services.PreferencesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/preferences")
public class PreferencesController {
    @Autowired
    private PreferencesServices preferencesServices;

    @GetMapping
    public List<Preferences> getPreferencesList(){
        return preferencesServices.viewAllPreferences();
    }

    @GetMapping(path = "/{id}")
    public Optional<Preferences> findPreferences(@PathVariable("id") int id){
        return preferencesServices.viewSinglePreferences(id);
    }

    @PostMapping
    public void createUpdateUser(Preferences preferences){
        preferencesServices.createSavePreferences(preferences);
    }
}
