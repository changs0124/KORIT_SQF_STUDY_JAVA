package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {
        // 배열 : 자료형 => 반복하기 위해 사용
        // 특징 : 순서가 있다, 값 중복 허용, 배열의 공간 크기는 늘리거나 줄일 수 없다.
        int[] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i +1) * 10;
        }

        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            int num = nums[i];
            System.out.println(num);
        }

        // 향상된 for문 or forEach - js
        for (int num : nums) {
            if(num % 3 == 0) {
                System.out.println(num);
            }
//            System.out.println(num);
        }


    }
}
