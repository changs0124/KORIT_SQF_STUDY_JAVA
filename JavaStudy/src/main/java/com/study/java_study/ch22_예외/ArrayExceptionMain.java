package com.study.java_study.ch22_예외;

/*
    예외(오류)
    1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당)되기 전에 오류 - 문법적 오류, 메모리가 부족
    2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류 - 없는 메모리에 접근, Stack overflow
*/
public class ArrayExceptionMain {
    public static void printArray(Integer[] nums, int length) throws Exception{ // throws Exception : 메소드를 사용하고 싶다면 예외처리를 하고 사용하라(호출하는 지점에서)
        for (int i = 0; i < length; i++) {
            System.out.println("i : " + nums[i]);
        }
//        try {
//            for (int i = 0; i < length; i++) {
//                System.out.println("i : " + nums[i]);
//            }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());     // 예외 발생시 맨 처음 확인
//            e.printStackTrace();                    // 비동기처리
//        }
    }
    public static void main(String[] args) /*throws Exception*/ {   // JVM - 메인 메소드 호출 -> 메인 메소드에 예외 처리시 메인 메소드 실행 전에 예외처리 발생
        Integer[] nums = new Integer[]{1, 2, 3, 4, 5};
        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");
    }
}
