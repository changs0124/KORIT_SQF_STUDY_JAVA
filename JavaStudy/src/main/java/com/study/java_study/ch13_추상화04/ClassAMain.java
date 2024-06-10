package com.study.java_study.ch13_추상화04;

public class ClassAMain {
    public static void main(String[] args) {
        ClassA a1 = new ClassA1();
        ClassA a2 = new ClassA2();
        InterfaceA i1 = new InterfaceA1();
        InterfaceA i2 = new InterfaceA2();

        a1.print(i1);
        a1.print(i2);
        a2.print(i1);
        a2.print(i2);
    }
}
