package com.study.java_study.ch04_제어;



public class For01 {
    public static void main(String[] args) {
        // for : 순서가 있는 반복문
        for(int i = 0; i < 10000; i++) {
            System.out.println(i + 1);
        }
        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }

//        int sum = 0;
//        for(int i = 1; i <= 10; i += 2) {
//            sum += i;
//        }
//        System.out.println(sum);
        for(int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
