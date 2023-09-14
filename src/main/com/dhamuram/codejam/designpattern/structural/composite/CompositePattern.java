package com.dhamuram.codejam.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        Student gradeOne = new GradeOne(1, "Alex", 20, 23, 25, 22);

        Student gradeTwo = new GradeTwo(2, "Shawn", 22, 21, 24, 23);

        Student gradeThree = new GradeThree(3, "John", 20, 23, 25, 22);

        Student gradeFour = new GradeFour(4, "Maverick", 22, 21, 24, 23, 23);

        students.add(gradeOne);
        students.add(gradeTwo);
        students.add(gradeThree);
        students.add(gradeFour);


        for (Student student : students) {
            System.out.println("Roll Number : " + student.getRollNumber());
            System.out.println("Name : " + student.getName());
            System.out.println("English Grade : " + student.getEnglishGrade());
            System.out.println("Math Grade : " + student.getMathGrade());
            System.out.println("Science Grade : " + student.getScienceGrade());
            System.out.println("History Grade : " + student.getHistoryGrade());
            System.out.println("--------------------------");
        }
    }
}
