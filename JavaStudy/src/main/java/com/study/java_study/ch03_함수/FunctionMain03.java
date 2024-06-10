package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {
        Function03 func03 = new Function03();
        Student st = new Student();

        func03.fx01(1234, "학생1", 25, "01012341234");

        st.studentCode = 1;
        st.name = "학생1";
        st.age = 25;
        st.phone = "01012341234";

        func03.fx02(st);
    }
}
