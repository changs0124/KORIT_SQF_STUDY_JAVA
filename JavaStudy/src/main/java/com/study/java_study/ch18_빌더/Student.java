package com.study.java_study.ch18_빌더;

public class Student {
    private int studentCode;
    private String name;
    private int age;

    // 2. 생성자 선언(AllArgsContructor)+
    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    // 3. static builder() 메소드 : new Builder 생성
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    // 1. Static class builder 생성
    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;

        // 4. build() 메소드로 Student 리턴
        public Student build() {
            return new Student(studentCode, name, age);
        }

        // 5. Setter 생성, this(주소) 리턴
        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}
