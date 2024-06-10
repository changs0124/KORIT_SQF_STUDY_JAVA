package com.study.java_study.ch19_익명클래스;

import lombok.AllArgsConstructor;

public class KiaCar extends AbstractCar {

    public KiaCar(String model, String color) {
        super(model, color);
    }

    @Override
    public void createCar() {
        System.out.println("기아 자동차를 생산");
    }

    @Override
    public void showCar() {
        System.out.println("차량 정보 조회");
    }
}
