import java.util.*;
import java.util.stream.*;

class Student {
    int rollNumber;
    String name;
    int mark;

    public Student(int rollNumber, String name, int mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [Roll Number=" + rollNumber + ", Name=" + name + ", Mark=" + mark + "]";
    }
}

public class Assignment94 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

     
        students.add(new Student(1, "Nandini", 72));
        students.add(new Student(2, "Rahul", 45));
        students.add(new Student(3, "Sneha", 55));
        students.add(new Student(4, "Amit", 30));
        students.add(new Student(5, "Priya", 80));

        System.out.println("All Students:");
        students.forEach(System.out::println);

   
        List<Student> clearedStudents = students.stream()
                .filter(s -> s.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("\nStudents who cleared (marks >= 50):");
        clearedStudents.forEach(System.out::println);


        long count = clearedStudents.size();
        System.out.println("\nNumber of students cleared: " + count);
    }
}
