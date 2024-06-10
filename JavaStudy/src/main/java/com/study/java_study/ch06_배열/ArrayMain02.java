package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        String a = "sch";
        String b = new String("sch");   //toString : 재정의

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "sch");
        System.out.println(b == "sch");

        String[] names = new String[2];

        names[0] = "sch";
        names[1] = new String("sch");

//        String[] names2 = new String[] {"sch", new String("sch")};
        String[] names2 = {"sch", new String("sch")};

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);
        System.out.println(names == names2);

        System.out.println(new String[2]);  //배열의 주소 : [로 시작
        System.out.println(new String[] {"a", "b"});
//        System.out.println({"a", "b"});





    }
}
