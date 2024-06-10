package com.study.java_study.ch15_Static;

import com.study.java_study.ch17_컬랙션.BookService;

public class StudentRepository {
    private String[] names;
    // 일반적인 멤버 변수는 객체를 생성해야지 사용 가능
    // static의 경우 클래스명으로 바로 호출이 가능 하기땜문에 생성 없이도 사용 가능
    private static StudentRepository instance;      // 자기 자신을 담을 수 있는 변수 무조건 필요
                                                    // 객체화 하기 전이라 static 으로 접근 해야함

    private StudentRepository() {                   // 외부 에서 생성 X -> private
        names = new String[5];
    }

    public static StudentRepository getInstance() {     // public static 으로 외부에서 호출 가능(객체화 없이 호출)
        if (instance == null) {
            instance = new StudentRepository();
        }
        return instance;                                // 대신 자기 자신 리턴
    }

    public void add(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
