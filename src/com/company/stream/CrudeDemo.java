package com.company.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class CrudeDemo {
    public static void main(String[] args) {

        // instance of collection
        Collection<Employee> c=new ArrayList<>();
        Scanner s= new Scanner(System.in);
        Scanner s1= new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.insert\n" +
                    "2.display\n" +
                    "3.search\n" +
                    "4.delete\n" +
                    "5. update\n" +
                    "0. exit\n");
            System.out.print("Enter your choice:");
            ch=s.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter employee number");
                    int empNo=s.nextInt();
                    System.out.print("Enter employee name");
                    String name=s1.nextLine();
                    System.out.print("Enter employee salary");
                    int salary=s.nextInt();
                    c.add(new Employee(empNo,name,salary));
                    break;
                case 2:
                    System.out.println("**************************************");
                    Iterator<Employee> i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        System.out.println(e);
                    }
                    break;
                case 3:
                    boolean found=false;
                    System.out.println("Enter employee number to delete");
                    empNo = s.nextInt();
                    i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        if (e.getEmpNo()==empNo){
                            System.out.println(e);
                            found=true;
                        }

                    }
                    if (!found){
                        System.out.println("record not found");
                    }
                    break;
                case 4:
                    found = false;
                    System.out.println("Enter employee number");
                    empNo = s.nextInt();
                    i=c.iterator();
                    while (i.hasNext()){
                        Employee e=i.next();
                        if (e.getEmpNo()==empNo){
                            i.remove();
                            found=true;
                        }

                    }
                    if (!found){
                        System.out.println("record not found");
                    }else {
                        System.out.println("Record is deleted");
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("select the correct option");
            }

        }
        while (ch!=0);
    }
}
