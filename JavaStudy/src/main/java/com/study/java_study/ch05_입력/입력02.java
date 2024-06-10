package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        String address = null;
        String gender = null;
        String phone = null;


        Scanner sc = new Scanner(System.in);

//        System.out.print("주소 : ");
//        address = sc.nextLine();
//
//        System.out.print("연락처 : ");
//        phone = sc.nextLine();
//
//        System.out.print("이름 : ");
//        name = sc.next();
//
//        System.out.print("나이 : ");
//        age = sc.nextInt();
//
//        System.out.print("성별 : ");
//        gender = sc.next();

        System.out.print("이름 : ");
        name = sc.next();

        System.out.print("나이 : ");
        age = sc.nextInt();
        sc.nextLine();                  // nextLine()을 통해 age 입력에 남아있는 enter 값 날리기

        System.out.print("주소 : ");
        address = sc.nextLine();

        System.out.print("성별 : ");
        gender = sc.next();
        sc.nextLine();                  // nextLine()을 통해 age 입력에 남아있는 enter 값 날리기

        System.out.print("연락처 : ");
        phone = sc.nextLine();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("연락처 : " + phone);
    }
}
