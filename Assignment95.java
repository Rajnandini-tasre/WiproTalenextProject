import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Location=" + location + ", Salary=" + salary + "]";
    }
}

public class Assignment95 {

   
    public static List<String> extractLocations(List<Employee> employees) {
        return employees.stream()
                .map(e -> e.location)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Nandini", "Pune", 50000));
        employees.add(new Employee(102, "Rahul", "Mumbai", 60000));
        employees.add(new Employee(103, "Sneha", "Bangalore", 55000));
        employees.add(new Employee(104, "Amit", "Chennai", 52000));
        employees.add(new Employee(105, "Priya", "Pune", 58000));

        System.out.println("All Employees:");
        employees.forEach(System.out::println);

       
        List<String> locations = extractLocations(employees);

        System.out.println("\nLocations of all employees:");
        locations.forEach(System.out::println);
    }
}
