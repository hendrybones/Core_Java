package com.company.studentPortal;

import java.util.Date;

/* implementing encapsulation */
public class Student {
    private String student_name;
    private String regNo;
    private String age;
    private Date RegistrationDate;
    private String Course;
    private Gender gender;

    public Student(String student_name, String regNo, String age, String date, Date registrationDate, Gender gender, String course) {
        this.student_name = student_name;
        this.regNo = regNo;
        this.age = age;
        RegistrationDate = registrationDate;
        Course = course;
        this.gender = gender;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        RegistrationDate = registrationDate;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
