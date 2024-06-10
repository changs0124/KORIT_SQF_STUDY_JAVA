package com.study.java_study.ch07_클래스02;

public class StudyA {
    int num;
    int num2;

    // 생성자
    // 1. 클래스 명과 동일하다.
    // 2. 리턴 자료형이 없다.
    // 3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.

    //NoArgsConstructor
    StudyA() {
        System.out.println("스터디 에이 객체 생성");
    }

    //AllArgsConstructor // 오버로딩
    StudyA(int num, int num2) {                                      // 생성자 이름인 동시에 리턴 자료형
        System.out.println("스터디 에이 객체 생성");
        this.num = num;                                             // 객체화 했을 때 해당 주소값이 this 로 들어간다고 생각 - 어떤 주소값으로 할당되는지 모르기 때문
        this.num2 = num2;
    }

    void increase(int increaseNum) {
        num += increaseNum;
        num2 += (increaseNum * 2);
    }
    void decrease(int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }

}
