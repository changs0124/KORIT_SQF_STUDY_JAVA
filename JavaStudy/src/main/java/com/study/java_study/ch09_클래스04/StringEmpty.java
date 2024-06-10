package com.study.java_study.ch09_클래스04;

public class StringEmpty {
    public static void main(String[] args) {
        String str = " ";

        boolean isEmpty = str.isEmpty();
        boolean isBlank = str.isBlank();

        System.out.println(isEmpty);        // false : 띄어쓰기 포함(공백을 허용)
        System.out.println(isBlank);        // true : 띄어쓰기 미포함(공백을 허용 X)
    }
}
