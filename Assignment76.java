import java.util.*;

// Employee class
class Employee {
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return "Employee [ID=" + empId + ", Name=" + empName + ", Email=" + email + ", Gender=" + gender + ", Salary=" + salary + "]";
    }
}


class EmployeeDB {
    private List<Employee> employeeList;

    public EmployeeDB() {
        employeeList = new ArrayList<>();
    }

    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == empId) {
                employeeList.remove(emp);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empId) {
        for (Employee emp : employeeList) {
            if (emp.getEmpId() == empId) {
                return "PaySlip for Employee ID " + empId + ": ₹" + emp.getSalary();
            }
        }
        return "Employee not found.";
    }

    public void printAllEmployeeDetails() {
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}


public class Assignment76 {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Nandini", "nandini@gmail.com", "Female", 45000f);
        Employee e2 = new Employee(102, "Rahul", "rahul@gmail.com", "Male", 52000f);
        Employee e3 = new Employee(103, "Sneha", "sneha@gmail.com", "Female", 60000f);

        db.addEmployee(e1);
        db.addEmployee(e2);
        db.addEmployee(e3);

        System.out.println("All Employees:");
        db.printAllEmployeeDetails();

        System.out.println("\n" + db.showPaySlip(102));

        db.deleteEmployee(101);
        System.out.println("\nAfter deleting employee 101:");
        db.printAllEmployeeDetails();
    }
}
