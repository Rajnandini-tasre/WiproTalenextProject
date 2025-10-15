package com.mile1.service;

import com.mile1.bean.Student;

public class StudentReport {
    public String findGrade(Student student) {
        int[] marks = student.getMarks();
        int sum = 0;
        for (int mark : marks) {
            if (mark < 35)
                return "F";
            sum += mark;
        }
        double average = sum / 3.0;
        if (average >= 80) return "A";
        else if (average >= 65) return "B";
        else if (average >= 50) return "C";
        else if (average >= 35) return "D";
        else return "F";
    }

    public String validate(Student student) {
        if (student == null)
            return "NullStudentException";
        if (student.getName() == null)
            return "NullNameException";
        if (student.getMarks() == null)
            return "NullMarksArrayException";
        return "VALID";
    }
}
