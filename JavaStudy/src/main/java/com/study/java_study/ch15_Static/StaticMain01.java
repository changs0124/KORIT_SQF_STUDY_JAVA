package com.study.java_study.ch15_Static;

/*
    스태택(Static)
    1. 공유 영역 : 생성 없이도 할당 된 공간
    2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다.

    객체를 생성하지 않아도 사용 할 수 있는 변수나 메소드에 사용
    도구, Utils - System.out.println()
*/
public class StaticMain01 {
    public static void main(String[] args) {
        System.out.println(Static01.num);
        Static01.num = 20;
        System.out.println(Static01.num);

        Static01 static01 = new Static01();
        static01.num = 30;
        System.out.println(static01.num);

        Static01 static02 = new Static01();
        System.out.println(static02.num);
    }
}
