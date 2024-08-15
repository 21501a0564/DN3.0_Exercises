package com.example.EmployeeManagementSystem.repositories;

import com.example.EmployeeManagementSystem.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Correct method signature for pagination and sorting
    Page<Employee> findByDepartmentName(String departmentName, Pageable pageable);
}
