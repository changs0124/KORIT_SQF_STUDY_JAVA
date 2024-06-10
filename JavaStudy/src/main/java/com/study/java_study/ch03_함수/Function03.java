package com.study.java_study.ch03_함수;

public class Function03 {
    void fx01(int studentCode, String name, int age, String phone) {
        System.out.println("fx01 함수 호출");
        System.out.println(studentCode);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println();
    }

    void fx02(Student student) {
        System.out.println("fx02 함수 호출");
        System.out.println(student.studentCode);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.phone);
    }
}
