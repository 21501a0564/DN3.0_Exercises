package com.example.EmployeeManagementSystem.repositories;

import com.example.EmployeeManagementSystem.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Additional query methods can be defined here
	Department findByName(String name);
}
