package com.study.java_study.ch04_제어;

public class StringUtils {
    // 함수(메소드)
    // 1. 단일 책임 원칙(하나의 함수는 하나의 행동만)
    boolean isEmpty(String str) {
        if (str == null) {
            return true;
        }
        return str.equals("");
//        return str == null || str.equals("");
//        return str.equals("") || str == null;
    }
}
