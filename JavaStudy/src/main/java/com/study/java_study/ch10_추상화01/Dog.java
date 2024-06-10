package com.study.java_study.ch10_추상화01;

public class Dog extends Animal {        // 상속(추상화) : 공통된 부분을 따로 모아 집합체로 만든 것 = 객체의 확장
    private String breed;

    public Dog() {
        super();        // 상위 부모의 주소, 부모 객체 생성, 무조건 제일 위에, 보통 생략되어있음
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }

    @Override
    public void move() {
        System.out.println("강아지가 네발로 움직입니다.");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
