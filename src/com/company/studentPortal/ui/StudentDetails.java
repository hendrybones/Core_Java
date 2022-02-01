package com.company.studentPortal.ui;

import com.company.studentPortal.Gender;
import com.company.studentPortal.Student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentDetails {
    public static void studentInfo() throws ParseException {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name");
        String student_name=scanner.nextLine();

        System.out.println("Enter registration number");
        String regNo=scanner.nextLine();

        System.out.println("Enter your age");
        String age= scanner.nextLine();

        System.out.println("Enter registration date( dd-mm-yyyy)");
        String date=scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Date registrationDate=simpleDateFormat.parse(date);

        System.out.println("Enter your gender");
        Gender gender= Gender.valueOf(scanner.nextLine());

        System.out.println("Enter your course");
        String course=scanner.nextLine();

        Student student=new Student(student_name,regNo,age,date,registrationDate,gender,course);



    }
    public static int insertStudentDetails(){

    }

}