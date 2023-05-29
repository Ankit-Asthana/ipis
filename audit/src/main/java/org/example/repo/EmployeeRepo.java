package org.example.repo;


import org.example.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Emp,Integer> {
}
