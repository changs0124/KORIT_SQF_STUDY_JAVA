package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA {
    @Override
    public void print(InterfaceA interfaceA) {              // print() 메소드가 interfaceA를 의존한다. : interfaceA가 없으면 실행 불가
        System.out.println("A1 클래스에서 print 호출");       // 외부에서 주입 받음 : Dependency Injection : 의존성 주입
        interfaceA.test();
    }
}
