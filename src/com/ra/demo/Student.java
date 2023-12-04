package com.ra.demo;

import java.util.Scanner;

public class Student {
    private String studentCode;
    private String studentName;
    private String phone;
    private String className;

    public Student() {
    }

    public Student(String studentCode, String studentName, String phone, String className) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.phone = phone;
        this.className = className;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào MSV");
        studentCode = sc.nextLine();
        System.out.println("Nhập vào Tên");
        studentName = sc.nextLine();
        System.out.println("Nhập vào SDT");
        phone = sc.nextLine();
        System.out.println("Nhập vào tên lớp");
        className = sc.nextLine();
    }

    public void displayData(){
        System.out.println("MSV : "+studentCode);
        System.out.println("Họ Và Tên : "+studentName);
        System.out.println("SDT : "+phone);
        System.out.println("Tên lớp : "+className);
    }
}
