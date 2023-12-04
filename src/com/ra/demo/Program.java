package com.ra.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        do {
            System.out.println("====MENU====");
            System.out.println("1. Nhap vao n ten sinh vien");
            System.out.println("2. Hien thi danh sach vua nhap");
            System.out.println("3. Thoat");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao so luong muon them");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap thong tin sinh vien thu " + (i + 1));
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sinh vien");
                    for (Student st : list) {
                        st.displayData();
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        } while (true);

    }
}
