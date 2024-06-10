package com.study.java_study.ch11_추상화02;

public class Dog extends Animal {

    @Override   // 부모님이 물려주신 레시피라고 생각(기본적인 것은 고정, 하지만 기능을 개선 및 발전 시킬 수 있다.)
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }
}
