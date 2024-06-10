package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴  - IOC
    1. 객체를 유일하게 하나만생성하여 사용하는 기법
    2. 생성자가 private으로 외부에서는 생성할 수 없다.
*/
public class StudentMain {
    public static void main(String[] args) {
        StudentRepository.getInstance().add("sch");

        StudentService studentService = StudentService.getInstance();  // 100  //하나만 사용하는 객체
        StudentService studentService2 = StudentService.getInstance();  // 100

        studentService.addStudent();
//        studentService2.addStudent();
        studentService.getStudentData();
    }
}
