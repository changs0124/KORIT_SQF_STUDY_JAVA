package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10; // 10의 주소값
        ObjectA objectA1 = new ObjectA(); // 100번 // ObjectA 클래스의 주소(객체)를 objectA 변수에 넣음
        ObjectA objectA2 = new ObjectA(); // 200번
        // => 객체화 할때마다 주소값이 달라진다.(메모리 할당이 달라진다.)

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);

        // 주소값을 비교할 때 변수에 담긴 값의 주소값을 기준으로 비교
        // String a = "abc"(1234) => a = 1234
        // String b = new String("abc") => b = 200
        // a == "abc" // 1234 == 1234   : true
        // b == "abc" // 200 == 1234    : false
        
        


    }
}
