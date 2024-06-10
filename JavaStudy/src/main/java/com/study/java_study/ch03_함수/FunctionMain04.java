package com.study.java_study.ch03_함수;

public class FunctionMain04{
    public static void main(String[] args) {
        Function04 function04 = new Function04();

        function04.add(10, 20);
        function04.add(10, "20");
        function04.add(10, 20 , 30);
        String result = function04.add("10", "20", "30");
        System.out.println(result);
    }
}
