package se.jola.springdatajpa_task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.jola.springdatajpa_task1.repo.EmployeeRepository;

@Service
public final class EmployeeService {
    
    @Autowired
    private final EmployeeRepository employeeRepository;
    
    public EmployeeService(EmployeeRepository employeeRepository){
	this.employeeRepository = employeeRepository;
    }
    
    

}
