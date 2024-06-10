package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


//        System.out.print("a : ");
        // next() 메소드 특징
        // 1. 공백과 줄바꿈(엔터)는 무시한다.
        // 2. 버퍼를 사용한다. Buffer : 안정성을 위해 / 데이터의 이동 속도에서 차이가 발생하는 문제를 해결 따라서 순간적으로 큰 용량을 확보하는 것
        // 스트링 연산에서는 Builder를 호출 / nextLine()에서는 Buffer를 호출
        String a = sc.next();
        System.out.println("a : " + a);
//        System.out.println(a.length());

//        System.out.print("b : ");
        String b = sc.nextLine();   // 공백 허용, 엔터키를 하면 줄바꿈(입력 처리)
        System.out.println("b : " + b);
    }
}
