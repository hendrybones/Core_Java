package com.company.studentPortal.ui;

import com.company.studentPortal.Gender;
import com.company.studentPortal.Student;
import com.company.studentPortal.dbutil.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class StudentDetails {
    public static Student  studentInfo(Scanner scanner, Collection<Student>list) throws ParseException {
        //Scanner scanner=new Scanner(System.in);
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
        System.out.println(student);
        return student;



    }
    public static int insertStudentDetails(String student_name, String regNo, String age, String date, Date registrationDate, Gender gender, String course) throws SQLException, ClassNotFoundException {
        DbUtil db= new DbUtil();
        Connection con=db.getConnection();
        String sql="insert into student values(?,?,?,?,?);";
        PreparedStatement stmt=con.prepareStatement(sql);
        stmt.setString(1, student_name);
        stmt.setString(2, course);
        stmt.setString(3, String.valueOf(gender));
        stmt.setString(4, date);
        stmt.setString(5, regNo);
        int a= stmt.executeUpdate();
        System.out.println("record inserted successfully");
        return a;
    }
    public static int updateStudent() throws SQLException, ClassNotFoundException {
        int i = 0;
        try {
            DbUtil db = new DbUtil();
            Connection con = db.getConnection();
            Scanner input = new Scanner(System.in);

            System.out.println("enter reg no");
            String inputName = input.nextLine();
            System.out.println("enter new regNo");
            String inputReg = input.nextLine();
            String sql = "update student set regNo=? where regNo=?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, inputName);
            stmt.setString(2, inputReg);
            i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println("record updated successfully");
            } else {
                System.out.println("no such record updated in the database");
            }
            db.closeConnections();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return i;

    }
    public  static  void viewStudent()throws SQLException, ClassNotFoundException{
        DbUtil db=new DbUtil();
        Connection con=db.getConnection();
        ResultSet rs=db.readData("select * from student");
        while(rs.next()){
            String c=rs.getString(1) +" "+ rs.getString(2)+" " +rs.getString(3);
            System.out.println(c);
        }
    }
    public static int deleteStudent() throws SQLException, ClassNotFoundException {
        int i = 0;
        try {
            DbUtil db = new DbUtil();
            Connection con = db.getConnection();
            System.out.println("enter regNo to delete");
            Scanner scanner = new Scanner(System.in);
            String inputReg = scanner.nextLine();
            String sql = "delete from student where regNo=?;";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,inputReg);
            i = stmt.executeUpdate();
            if (i > 0) {
                System.out.println("deleted the record from the database");
            } else {
                System.out.println("no such record in the database");
            }
            db.closeConnections();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return i;

    }
    public static String searchStudent()throws SQLException, ClassNotFoundException {
        String a ="";
        try {
            DbUtil db = new DbUtil();
            Connection con = db.getConnection();
            System.out.println("enter the regNo to search");
            Scanner input = new Scanner(System.in);
            String inputReg = input.nextLine();
            String sql = "select*from student where regNo=?;";
            PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            stmt.setString(1, inputReg);
            ResultSet rs = stmt.executeQuery();
            if (rs.next() == false) {
                System.out.println("there is no such record in the database");
            } else {
                rs.previous();
                while (rs.next()) {
                    a = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) +
                            rs.getString(4) + " " + rs.getString(5);
                    System.out.println(a);
                }
            }

            db.closeConnections();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return a;

    }

}
