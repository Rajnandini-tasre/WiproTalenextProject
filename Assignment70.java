class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Assignment70 {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee(101, "John", 50000);
            Employee e2 = (Employee) e1.clone();

            System.out.println("Before modification:");
            System.out.println("Original Employee: " + e1.id + " " + e1.name + " " + e1.salary);
            System.out.println("Cloned Employee: " + e2.id + " " + e2.name + " " + e2.salary);

            e1.name = "Michael";
            e1.salary = 60000;

            System.out.println("\nAfter modification:");
            System.out.println("Original Employee: " + e1.id + " " + e1.name + " " + e1.salary);
            System.out.println("Cloned Employee: " + e2.id + " " + e2.name + " " + e2.salary);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
