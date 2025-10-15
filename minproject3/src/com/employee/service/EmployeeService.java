package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import com.employee.bean.Employee;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

  
    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added successfully!\n");
    }

 
    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.\n");
            return;
        }
        System.out.println("---- Report ----");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("---- End of Report ----\n");
    }
}
