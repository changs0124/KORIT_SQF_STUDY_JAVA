package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스
        A a = new A();
        // A 클래스 내부의 B 클래스 생성자명 = 생성된 a.new B();
        A.B b = a.new B();

        a.test();
        b.print();

        // C가 Static -> A 클래스 생성 없이 A.C() 생성 가능
        // Static 호출 클래스명.클래스명.메소드명...
        A.C c = new A.C();
        c.show();
        A.C.show2();
    }
}
