package com.study.java_study.ch13_추상화04;

public class ClassA2 extends ClassA{
    @Override
    public void print(InterfaceA interfaceA) {
        System.out.println("A2 클래스에서 print 호출");
        interfaceA.test();
    }
}
