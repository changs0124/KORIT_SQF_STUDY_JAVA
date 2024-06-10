package com.study.java_study.ch07_클래스02;

public class StudyB {
    private String name;        // private : 클래스안에서는 접근 가능 / 외부에서는 접근 불가능
    private int age;

    public StudyB() {;}

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
                                    // getter & setter
    public String getName() {       // 표준화 : 다른 라이브러리와 데이터 교환에 있어 표준화가 되어있다.
        return name;                // DBMS 와 연동에 있어 자동으로 생성
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
