package com.company.studentPortal;

import com.company.studentPortal.ui.StudentDetails;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Scanner;

public class DashBoard {

    public static void main(String[] args) throws ParseException {
        StudentDetails studentDetails = new StudentDetails();
        int choice = 0;
        Scanner scanner;
        File file = new File("student.txt");
        Collection<Student> list = new ArrayList<>();
        ObjectInputStream ip = null;
        ObjectOutputStream op = null;
        ListIterator li = null;

        System.out.println(" ***********welcome to our student portal*****************");
        do {
            System.out.println("\n1." +
                    "Add student \n" +
                    "2.view student\n" +
                    "3.update student\n" +
                    "4.delete student\n" +
                    "5.search student\n" +
                    "0 Exit \n");

            scanner= new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:

                    //studentDetails.studentInfo(scanner);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    System.out.println("select the correct option");
            }
        }
            while (choice != 0) ;

    }
}
