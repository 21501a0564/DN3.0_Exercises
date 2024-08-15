package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entities.Employee;
import com.example.EmployeeManagementSystem.entities.Department;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
import com.example.EmployeeManagementSystem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Home {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/all-employees")
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/all-departments")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/employees/by-department")
    public ResponseEntity<List<Employee>> getEmployeesByDepartment(@RequestParam String departmentName) {
        List<Employee> employees = employeeRepository.findByDepartmentName(departmentName);
        if (employees.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/department/by-name")
    public ResponseEntity<Department> getDepartmentByName(@RequestParam String name) {
        Department department = departmentRepository.findByName(name);
        if (department == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(department);
    }
}
