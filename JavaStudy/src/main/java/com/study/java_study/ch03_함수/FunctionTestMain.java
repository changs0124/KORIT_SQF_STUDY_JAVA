package com.study.java_study.ch03_함수;

public class FunctionTestMain {
    public static void main(String[] args) {
        FunctionTest01 functionTest01 = new FunctionTest01();   // 해당 클래스 객체화
        functionTest01.printResult();                           // 03의 함수 -> 02의 함수에서 사용 -> 02의 함수를 01의 함수에서 다시 사용
    }
}
