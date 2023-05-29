package org.example.service;

import org.example.model.Employee;
import org.example.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
@Autowired
EmployeeRepository employeeRepository;
    public void addEmployee(Employee employee){
        System.out.println("-------------------Employee object-----" + employee.toString());
        employeeRepository.save(employee);

    }
    
}
