package com.example.demo.repository;

import com.example.demo.projections.EmployeeProjection;
import com.example.demo.projections.EmployeeProjectionClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.EmployeeManagementSystem.entities.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e.id AS id, e.name AS employeeName, e.department.id AS departmentId FROM Employee e")
    List<EmployeeProjection> findEmployeeProjections();

    @Query("SELECT new com.example.demo.projections.EmployeeProjectionClass(e.id, e.name, e.department.id) FROM Employee e")
    List<EmployeeProjectionClass> findEmployeeProjectionsClass();
}
