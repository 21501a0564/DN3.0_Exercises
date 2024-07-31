package com.example.employeemanagement;

public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager(10);

        Employee emp1 = new Employee("E001", "Alice", "Developer", 70000);
        Employee emp2 = new Employee("E002", "Bob", "Manager", 80000);
        Employee emp3 = new Employee("E003", "Charlie", "Analyst", 60000);

        manager.addEmployee(emp1);
        manager.addEmployee(emp2);
        manager.addEmployee(emp3);

        System.out.println("Employee List:");
        manager.traverseEmployees();

        System.out.println("\nSearching for employee E002:");
        Employee found = manager.searchEmployee("E002");
        System.out.println(found != null ? found : "Employee not found.");

        System.out.println("\nDeleting employee E001:");
        manager.deleteEmployee("E001");
        manager.traverseEmployees();
    }
}
