package com.register;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number of Employees");
        int numberOfEmployees;
        try {
            numberOfEmployees = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }


        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details:");
            System.out.println("Enter the Firstname");
            String firstName = scanner.nextLine();
            System.out.println("Enter the Lastname");
            String lastName = scanner.nextLine();
            System.out.println("Enter the Mobile");
            String mobile = scanner.nextLine();
            System.out.println("Enter the Email");
            String email = scanner.nextLine();
            System.out.println("Enter the Address");
            String address = scanner.nextLine();

            employeeList.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(employeeList);

        System.out.println("\nEmployee List:");

        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",
                              emp.getFirstName(),
                              emp.getLastName(),
                              emp.getMobileNumber(),
                              emp.getEmail(),
                              emp.getAddress());
        }


        scanner.close();
    }
}