package com.employers.management.server.service;

import com.employers.management.server.model.Employer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface employerService {
    Employer newEmployer(Employer employer);
    List<Employer> employerList();
    Employer modifyEmployer(Employer employer);
    Boolean deletedEmployer(Long id);
}
