package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal {
    private int power;

    public Tiger() {
        super();        // 상위 부모의 주소, 부모 객체 생성, 생성에 있어서만 super가 우선
        System.out.println("호랑이 객체 생성");
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    public void hunt() {
        System.out.println("호랑이가 " + power + "의 힘으로 사냥을 합니다.");
    }


    // 재정의 -> 상속 관계에서만 가능 -> 업캐스팅을 해도 재정의 한 메소드는 유지
    @Override   // @ : 어노테이션
    public void move() {
        System.out.println("호랑이가 네발로 뛰어갑니다.");
        super.move();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
}
