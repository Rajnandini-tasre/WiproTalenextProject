import java.util.*;

public class Assignment81 {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Nandini");
        employeeNames.add("Rahul");
        employeeNames.add("Sneha");
        employeeNames.add("Amit");
        employeeNames.add("Priya");

        System.out.println("Employee names in HashSet:");

        Iterator<String> it = employeeNames.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
