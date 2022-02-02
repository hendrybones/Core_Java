package com.company.stream;

public class Employee {
    private int empNo;
    private String name;
    private int salary;

    public Employee(int empNo, java.lang.String name, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
