package org.example.service;

import org.example.dto.InputRequest;
import org.example.entity.Emp;
import org.example.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public String saveEmployee(InputRequest<Emp> request){
        String currentUser = request.getLoggedInUser();
        request.setTimezone(Calendar.getInstance().getTimeZone().getDisplayName());
        Emp employee=request.getEmp();
        employee.setCreatedBy(currentUser);
        employeeRepo.save(employee);
        return "Employee saved successfully";
    }

    public String updateEmployee(int id, InputRequest<Emp> request){
        Emp employee=employeeRepo.findById(id).get();
        if(employee!=null){
            employee.setModifiedBy(request.getLoggedInUser());
            employeeRepo.saveAndFlush(employee);
        }else {
            throw new RuntimeException("Employee not found by id "+id);
        }
        return "Employee updated successfully";
    }
}
