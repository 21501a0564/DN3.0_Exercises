package com.example.EmployeeManagementSystem.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.EmployeeManagementSystem.entities.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/paginated")
    public Page<Employee> getPaginatedEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }
}
