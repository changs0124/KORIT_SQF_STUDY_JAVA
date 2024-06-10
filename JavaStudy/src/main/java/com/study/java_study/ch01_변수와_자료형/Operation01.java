package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자
        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2; // 몫
        System.out.println(num2);
        int num3 = 9 % 2; // 나머지
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0;
        System.out.println(num4);

        System.out.println("------------------------");
        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        System.out.println("------------------------");
        // 논리연산자
        // true : 1 / false : 0
        // && : AND(곱) / || : OR(합) / ! : not(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(!(true && true));

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        // 조건연산자(삼항연산자)
        System.out.println(3 > 2 ? "참" : "거짓");
        System.out.println(3 > 2 ? 10 : 20);
        System.out.println(3 < 2 ? "참" : "거짓");

        int x = 10;
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다."; // 자료형 통일
        String result2 = "" + 10 / 2;   // String + 정수 : String -> StringBuilder 클래스를 생성 후 append를 통해 붙이기 시작
                                        // 결과적으로 많은 문자열을 합쳐야 할 경우 +연산을 사용하는 것보다 StringBuilder를 선언 후 append로 붙이는 것이 메모리 효율면에서 좋음
                                        // (+할 때마다 Builder를 선언하기 때문)

        System.out.println("------------------------");
        // 복합대입연산자 - 문법상 해당 변수의 자료형을 유지
        int number = 10;
//        number = number + 5;
        number += 5;
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;
        number += 5.1;
        System.out.println(number);
    }
}