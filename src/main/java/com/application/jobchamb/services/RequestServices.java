package com.application.jobchamb.services;

import com.application.jobchamb.entities.Request;
import com.application.jobchamb.entities.Request;
import com.application.jobchamb.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RequestServices {
    @Autowired
    RequestRepository requestRepository;

    public List<Request> getAllRequest() {
        return requestRepository.findAll();
    }


    public Optional<Request> findRequest(int id) {
        return requestRepository.findById(id);
    }

    public void createUpdateRequest(Request request) {
        requestRepository.save(request);
    }

}
