package com.study.java_study.ch03_함수;

public class FunctionTest02 {
    int getAddData(int a, int b) {
        FunctionTest03 functionTest03 = new FunctionTest03(); // 해당 클래스 객체화
        return functionTest03.add(a, b);                      // a + b 함수
    }
}
