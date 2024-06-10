package com.study.java_study.ch12_추상화03;

/*
    인터페이스 - implements : 구현 -> 기능적인 부분(리모컨의 버튼 부분)
    1. 일반 클래스와 동일하게 정의 할 수 없다.
    2. 일반 변수(멤버변수)를 정의 할 수 없다.
    3. 무조건 상수만 정의 할 수 있다.
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야한다. : 접근 지정자가 아니라 인터페이스안의 일반 메소드를 나타낼 때 사용
    5. 추상 메소드를 정의 할 때 abstract 키워드를 생략할 수 있다.   : 기본값
    6. 인터페이스 안에 정의되어지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다. : 생략 가능
    7. 다중 상속 가능
*/
public interface Authority {
    // public static final 생략
    String DEFAULT_ROLL = "ROLE_USER";

    // public abstract 생략
    String getAuthority();

    // public 생략
    default void printAuthority() {
        System.out.println(DEFAULT_ROLL);
    }
}
