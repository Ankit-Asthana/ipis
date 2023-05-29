package org.example.service;
import org.example.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import org.springframework.stereotype.Service;

@Service
public class AggregatorService {
    @Autowired
    private RestTemplate restTemplate;
    public String aggregateValue(){
        Employee employee = new Employee();
        employee.setEmpName("marcus");
        employee.setEmpid(100);
        System.out.println("empolyee object in aggregator service is : " + employee.toString());
         restTemplate.postForObject("http://localhost:8082/employee/add-employee", employee,  Employee.class);

        return "SUCESS";
    }
}
