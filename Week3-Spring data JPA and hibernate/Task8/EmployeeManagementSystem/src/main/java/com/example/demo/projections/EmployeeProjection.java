package com.example.demo.projections;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.employeeName}")
    String getEmployeeName();

    @Value("#{target.department.name}")
    String getDepartmentName();
}
