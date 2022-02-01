package com.company.studentPortal;

import com.company.studentPortal.ui.StudentDetails;

import java.text.ParseException;
import java.util.Scanner;

public class DashBoard {

    public static void main(String[] args) throws ParseException {
        int choice=0;
        System.out.println("\n1." +
                "Add student \n" +
                "2.view student\n" +
                "3.update student\n" +
                "4.delete student\n" +
                "5.search student\n" +
                "0 Exit \n");
        Scanner scan= new Scanner(System.in);
        choice= scan.nextInt();
        switch (choice){
            case 1:
                StudentDetails studentDetails=new StudentDetails();
                studentDetails.studentInfo();
                break;
            case  2:
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
        while (choice!=0);

    }


}
