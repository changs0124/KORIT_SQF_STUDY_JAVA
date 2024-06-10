package com.study.java_study.ch14_Object;

import java.util.Objects;

// Lombok 설치 후 @(어노테이션으로 처리)
public class Student {
    // 변수 선언
    private String name;
    private int age;

    // 생성자
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter & Setter

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (this.getClass() == o.getClass()) {
            Student student = (Student) o;
            return Objects.equals(student.name, name)
                    && Objects.equals(student.age, age);
        }
        return false;
    }

    // hashcode : 객체의 값을 더해서 수로 만들어 줌 -> 다른 클래스에 있어도 값이 같다면 해쉬코드의 값은 같다.
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
