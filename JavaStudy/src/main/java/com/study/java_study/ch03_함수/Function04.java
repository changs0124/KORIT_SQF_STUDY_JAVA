package com.study.java_study.ch03_함수;

public class Function04 {
    // Overloading : 동일한 이름의 메소드를 다양한 타입의 변수를 넣음으로써 재정의 할 수 있다. <- 메소드 이름 절약
    // 리턴값이 같은 경우 불가능, 변수의 차이로 다양한 메소드르 정의하는 것
    // overloading에 대한 개념(같은 클래스 내부) / overriding에 대한 개념(상속)
    void add(int a, int b) {
        System.out.println(a + b);
    }

    //  매개 변수(파라미터)가 같기 때문에 동일한 메소드가 2개 있는 걸로 인식하여 오류 발생
//    int add(int a, int b) {
//        return a + b;
//    }

    void add(int a, String b) {
        int c = Integer.parseInt(b);
        System.out.println(a + c);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    String add(String a, String b, String c) {
        return a + b + c;
    }
}
