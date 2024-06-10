package com.study.java_study.ch03_함수;

public class FunctionTest01 {
    int fx01_1() {
        return 10;
    }

    int fx01_2() {
        return 20;
    }

    void printResult() {
        FunctionTest02 functionTest02 = new FunctionTest02();               // 해당 클래스 객체화
        System.out.println(functionTest02.getAddData(fx01_1(), fx01_2()));  // 03클래스의 a + b의 함수를 호출 받은 02클래스 함수 호출 결국 a + b 함수 호출
                                                                            // 거기에 01클래스 fx01_1(), fx01_2() 함수 리턴값을 해당 매개 변수에 반영 후 a + b 함수 실행 그리고 출력
    }
}