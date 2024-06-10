package com.study.java_study.ch08_클래스03;

public class StudentMain {
    public static void main(String[] args) {
        int[] numbers = new int[53];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // 학생의 정보를 담을 수 있는 공간을 생성
        Student[] students = new Student[3];
        students[0] = new Student(1, "sch", 1);
        students[1] = new Student(2, "sch1", 2);
        students[2] = new Student(3, "sch2", 3);

        for (int i = 0; i < students.length; i++) {
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }
    }
}
