package com.study.java_study.ch03_함수;

public class FunctionMain01 {
    public static void main(String[] args) {
        //1. 객체화
        Function01 function01 = new Function01();
        
        //2. 함수 호출
        int result = function01.add(10, 2);
        System.out.println(result);
        int result2 = function01.add(100, 50);
        System.out.println(result2);

        int result3 = function01.sub(10, 2);
        System.out.println(result3);
        int result4 = function01.sub(100, 50);
        System.out.println(result4);

//        int a = function01.add(10, 20);
//        int b = function01.sub(100, 50);
//
//        int result5 = function01.add(a, b);
//        System.out.println(result5);
//        int result6 = function01.sub(a, b);
//        System.out.println(result6);


    }
}
