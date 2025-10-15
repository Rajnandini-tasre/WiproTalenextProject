package com.mile1.test;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class TestStudentProject {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student("John", new int[]{85, 70, 90}); // A
        students[1] = new Student("Sam", new int[]{40, 45, 35}); // D
        students[2] = new Student("Raj", new int[]{30, 20, 25}); // F
        students[3] = new Student(null, new int[]{50, 60, 70});
        students[4] = new Student("Ravi", null);
        students[5] = null;

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < students.length; i++) {
            try {
                String validation = report.validate(students[i]);
                if (validation.equals("VALID"))
                    System.out.println(students[i].getName() + " Grade: " + report.findGrade(students[i]));
                else
                    System.out.println("Exception: " + validation);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\n--- Null Counts ---");
        System.out.println("Null Marks Array: " + service.findNumberOfNullMarksArray(students));
        System.out.println("Null Names: " + service.findNumberOfNullNames(students));
        System.out.println("Null Objects: " + service.findNumberOfNullObjects(students));
    }
}
