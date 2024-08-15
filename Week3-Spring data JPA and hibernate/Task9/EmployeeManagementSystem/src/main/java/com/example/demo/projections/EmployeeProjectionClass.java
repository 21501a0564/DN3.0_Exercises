package com.example.demo.projections;

public class EmployeeProjectionClass {

    private Long id;
    private String employeeName;
    private Long departmentId;

    public EmployeeProjectionClass(Long id, String employeeName, Long departmentId) {
        this.id = id;
        this.employeeName = employeeName;
        this.departmentId = departmentId;
    }

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getEmployeeName() { return employeeName; }
    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }

    public Long getDepartmentId() { return departmentId; }
    public void setDepartmentId(Long departmentId) { this.departmentId = departmentId; }
}
