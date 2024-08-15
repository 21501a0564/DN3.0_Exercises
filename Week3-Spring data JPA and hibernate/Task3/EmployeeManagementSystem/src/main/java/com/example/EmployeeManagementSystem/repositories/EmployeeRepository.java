package com.example.EmployeeManagementSystem.repositories;

import com.example.EmployeeManagementSystem.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Find employees by department name
    List<Employee> findByDepartmentName(String departmentName);
}
