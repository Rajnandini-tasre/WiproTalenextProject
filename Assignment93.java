import java.util.*;
import java.util.stream.*;

class Employee {
    int empNumber;
    String name;
    int age;
    String location;

    public Employee(int empNumber, String name, int age, String location) {
        this.empNumber = empNumber;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee [EMP Number=" + empNumber + ", Name=" + name + ", Age=" + age + ", Location=" + location + "]";
    }
}

public class Assignment93 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        
        employees.add(new Employee(101, "Nandini", 28, "Pune"));
        employees.add(new Employee(102, "Rahul", 32, "Mumbai"));
        employees.add(new Employee(103, "Sneha", 25, "Pune"));
        employees.add(new Employee(104, "Amit", 30, "Bangalore"));
        employees.add(new Employee(105, "Priya", 27, "Pune"));

        System.out.println("All Employees:");
        employees.forEach(System.out::println);

       
        List<Employee> puneEmployees = employees.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        System.out.println("\nEmployees in Pune:");
        puneEmployees.forEach(System.out::println);
    }
}
