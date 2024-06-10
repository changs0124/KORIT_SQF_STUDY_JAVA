package com.study.java_study.ch14_Object;

/*
    Object : 클래스(최상위 클래스)
*/
import java.util.Objects;

public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("sch", 1234);
        Student student2 = new Student("sch", 1234);


        Object[] objects = new Object[3];
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("sch", 1234);

        //toString : 생략 가능, String 타입으로 변환
        System.out.println(student);
        String str = new String("데이터");
        System.out.println(str.toString());

        String studentData = student.toString(); // 주소.toString : 해당 주소값의 값을 출력

        // equals
        str.equals("test");
        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println(Objects.hash(10));
        System.out.println(Objects.hash(10));
    }
}
