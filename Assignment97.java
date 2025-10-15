import java.util.*;
import java.util.function.Predicate;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}

public class Assignment97 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

     
        employees.add(new Employee(101, "Nandini", 12000));
        employees.add(new Employee(102, "Rahul", 9000));
        employees.add(new Employee(103, "Sneha", 15000));
        employees.add(new Employee(104, "Amit", 8000));
        employees.add(new Employee(105, "Priya", 20000));

        
        Predicate<Employee> lowSalary = e -> e.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");
        employees.stream()
                 .filter(lowSalary)
                 .forEach(e -> System.out.println(e.getName()));
    }
}
