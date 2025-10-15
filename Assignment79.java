import java.util.*;

class Employee {
    private int empId;
    private String empName;
    private float salary;

    public Employee(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Salary=" + salary + "]";
    }
}

public class Assignment79 {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Nandini", 45000f));
        employees.add(new Employee(102, "Rahul", 52000f));
        employees.add(new Employee(103, "Sneha", 60000f));

        System.out.println("Using Iterator:");
        Iterator<Employee> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nUsing Enumeration:");
        Enumeration<Employee> en = employees.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
