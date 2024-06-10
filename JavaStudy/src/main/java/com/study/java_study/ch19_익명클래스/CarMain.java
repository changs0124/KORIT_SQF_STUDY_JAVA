package com.study.java_study.ch19_익명클래스;
/*
    익명클래스 : 한 번만 사용하고 버림 ex) 로그인 버튼(굳이 다른 곳에서 사용하지 X)
*/
public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        // 추상 클래스를 활용하여 익명클래스로 생성
        AbstractCar abstractCar = new AbstractCar("내가만든자동차", "블랙") {    // 추상클래스르 만들겠다.(extends 생략)
            @Override                                                          // 클래스를 정의
            public void createCar() {
                System.out.println("한번 만들어봄.");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");
            }
        };
    }
}
