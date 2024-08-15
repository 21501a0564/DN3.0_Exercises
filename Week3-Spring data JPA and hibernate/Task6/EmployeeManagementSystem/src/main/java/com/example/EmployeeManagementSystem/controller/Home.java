package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.entities.Employee;
import com.example.EmployeeManagementSystem.entities.Department;
import com.example.EmployeeManagementSystem.repositories.EmployeeRepository;
import com.example.EmployeeManagementSystem.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public ResponseEntity<Page<Employee>> getEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String[] sort) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort[0], sort[1]));
        Page<Employee> employees = employeeRepository.findAll(pageable);

        return ResponseEntity.ok(employees);
    }

    @GetMapping("/all-departments")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/employees/by-department")
    public ResponseEntity<Page<Employee>> getEmployeesByDepartment(
            @RequestParam String departmentName,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "id,asc") String[] sort) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort[0], sort[1]));
        Page<Employee> employees = employeeRepository.findByDepartmentName(departmentName, pageable);

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
