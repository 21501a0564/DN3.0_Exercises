package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entities.Employee;
import com.example.EmployeeManagementSystem.entities.Department;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
import com.example.EmployeeManagementSystem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Home{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/departments")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/employees/by-department")
    public List<Employee> getEmployeesByDepartment(@RequestParam String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    @GetMapping("/department/by-name")
    public Department getDepartmentByName(@RequestParam String name) {
        return departmentRepository.findByName(name);
    }
}
