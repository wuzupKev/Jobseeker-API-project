package com.application.jobchamb.controllers;

import com.application.jobchamb.entities.Job;
import com.application.jobchamb.entities.Request;
import com.application.jobchamb.entities.Status;
import com.application.jobchamb.services.JobServices;
import com.application.jobchamb.services.RequestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/request")
public class RequestController {
    @Autowired
    private RequestServices requestServices;

    @GetMapping
    public List<Request> getAllRequest(){
        return requestServices.getAllRequest();
    }
    @GetMapping(path = "/{id}")
    public Optional<Request> findListReq(@PathVariable("id") int id){
        return requestServices.findRequest(id);
    }

    @PostMapping
    public void createUpdateRequest(Request request){
        requestServices.createUpdateRequest(request);
    }
}
