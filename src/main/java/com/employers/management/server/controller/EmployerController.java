package com.employers.management.server.controller;

import com.employers.management.server.model.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.employers.management.server.repository.EmployerRepository;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployerController {

    @Autowired
    private EmployerRepository repository;

    @GetMapping("/employers")
    public List<Employer> listAll(){
        return repository.findAll();
    }
}
