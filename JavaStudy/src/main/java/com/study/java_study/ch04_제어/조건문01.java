package com.study.java_study.ch04_제어;

public class 조건문01 {
    public static void main(String[] args) {
        // 1. if, elseif, else // if(조건) : 조건에 따라 명령 실행 vs 삼항 연산자 : 연산의 결과 도출 -> CPU입장에선 연산을 선호함
        // 2. switch, case, default
        // 3. continue, break

        if(true) {
            System.out.println("참입니다.");
        } else {
            System.out.println("거짓입니다.");
        }

        int num = 10;
        if(num % 2 == 0 && num % 10 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        
        if (num % 2 == 0) System.out.println("2의 배수입니다.");  // 명령이 하나라면 중괄호 필요 없음
        if (num % 2 != 0)
            System.out.println("2의 배수입니다.");
            System.out.println("2의 배수입니다.");                // 중괄호가 없기 때문에 두번째 출력은 유지
        
        if(num % 2 == 0) {
            System.out.println("2의 배수입니다.");
        } else if(num % 3 ==0) {
            System.out.println("3의 배수입니다.");
        } else if(num % 7 == 0) {
            System.out.println("7의 배수입니다.");
        } else {
            System.out.println("2의 배수도 3의 배수도 7의 배수도 아닙니다.");
        }
    }
}
