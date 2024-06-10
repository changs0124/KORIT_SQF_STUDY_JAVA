package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("개수 : ");
        int count = sc.nextInt();
        int i = 0;

//        while(i < count) {
//            if(i % 2 == 0) {
//                System.out.println("짝수");
//                i++;
//                continue;                   // 처음 코드부터 다시 시작
//            }
//            System.out.println("홀수");
//            i++;
//        }
        
        for(int j = 0; j < count; j++) {    // continue 시 자동 후처리(j++) 실행
            if(j % 2 == 0) {
                System.out.println("짝수");
                continue;
            }
            System.out.println("홀수");
        }
    }
}
