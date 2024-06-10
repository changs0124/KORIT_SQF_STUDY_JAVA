package com.study.java_study.ch04_제어;

import java.util.Random;        //jdk 내에 lang 폴더의 라이브러리는 import 없이 사용 가능. 그 외에는 전부 import 해서 사용
import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        // while

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

//        int num = random.nextInt(5);   // 0 ~ 4까지 중 랜덤

        while (true) {
            System.out.print("정답 : ");
            int data = sc.nextInt();
            int num = random.nextInt(5);
            if(data == num) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("정답은 " + num + "입니다.");
            System.out.println("틀렸습니다. 다시 입력하세요.");

        }
    }
}
