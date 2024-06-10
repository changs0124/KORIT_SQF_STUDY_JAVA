package com.study.java_study.ch03_함수;

public class Konto {
    int rest;

    void add(int money) {
        rest += money;
    }

    int sub(int money) {
        rest -= money;
        return money;
    }
}
