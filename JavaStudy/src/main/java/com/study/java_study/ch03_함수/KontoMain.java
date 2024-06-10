package com.study.java_study.ch03_함수;

public class KontoMain {
    public static void main(String[] args) {
        Konto konto = new Konto();

        System.out.println(konto.rest);

        konto.add(10000);
        System.out.println(konto.rest);
        konto.sub(2000);
        System.out.println(konto.rest);
        konto.sub(2000);
        System.out.println(konto.rest);
        konto.sub(2000);
        System.out.println(konto.rest);
    }
}
