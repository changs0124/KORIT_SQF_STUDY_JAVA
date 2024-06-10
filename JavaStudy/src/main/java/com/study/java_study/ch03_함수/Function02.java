package com.study.java_study.ch03_함수;

public class Function02 {
    // 매개변수 x, 리턴 x
    void fx01() {
        System.out.println("fx01 함수 호출");
    }

    // 매개변수 o, 리턴 x
    void fx02(int num1, int num2) {
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2); // String + 정수(다른 일반 자료형) : StringBuilder(StringBuffer) 호출 후 append 함수로 자동으로 붙여줌
    }
    
    // 매개변수 o, 리턴 o
    String fx03(String ingredient, int count) {
        return ingredient + "빙수 : " + count + "개";
    }

    // 매개변수 x, 리턴 o
    String get() {
        return "데이터";
    }
}
