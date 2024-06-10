package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리 자료형
        boolean a = false;
        boolean b = true;

        // 2. 숫자(정수) 자료형
        int c = 1000000000;
        long d = 10000000000l;  // 정수 리터럴은 int형으로 컴파일 되며, long 타입 리터럴은 숫자 뒤에 L 또는 l을 붙여 표시
                                // 리터럴(literal) : 해당 변수의 고유한 주소값

        // 3. 숫자(실수) 자료형
        double e = 1.234;
//        float f = 1.234F;

        // 4. 문자
        char f = '가'; //AC00

        // 5. 문자열 String 은 클래스이기에 다른 자료형과 달리 대문자로 표기함
        String g = "가나";

        System.out.println(f);
        System.out.println((char)((int)f + 1)); // 형변환 char -> int
        System.out.println((char)65);

        // 형변환
        // 업 캐스팅(상위 형태로 바꿈)
        // 문자(char) -> 정수(byte, short, int, long) -> 실수(float, double)
        // 다운 캐스팅(하위 형태로 바꿈)
        // 실수(float, double) -> 정수(byte, short, int, long) -> 문자(char)
        // String의 경우 Class이기 때문에

        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num; // 명시적 형변환(다운 캐스팅)
        System.out.println(num2);
        double num3 = num2; // 업 캐스팅
        System.out.println(num3);
    }
}
