package org.example.controller;

import org.example.dto.InputRequest;
import org.example.entity.Emp;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empaudit")
public class EmpController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveemp")
    public String saveEmployee(@RequestBody InputRequest<Emp> request){
        return employeeService.saveEmployee(request);
    }

    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable int id,@RequestBody InputRequest<Emp> request){
        return employeeService.updateEmployee(id,request);
    }
}
