package com.study.java_study.ch07_클래스02;

    /*
        캡슐화 : 정보 은닉 -> 데이터를 가져오거나 다시 넣을 경우 get / set 메소드를 사용해서 접근 = JAVA 에서는 필수
    */

    public class StudyMain {
    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);
        System.out.println(a.num);          // 주소값 출력
        System.out.println(a.num2);

        StudyB b = new StudyB("sch", 27);
        b.show();

        b.setName("sch1");
        b.setAge(25);

        b.show();
        b.getName();
        b.getAge();
    }

}
