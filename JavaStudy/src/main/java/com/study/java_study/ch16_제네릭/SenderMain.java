package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {

        Sender sender = new Sender<Integer>(10, 20);
        // [wrapper - 자료형] : 일반 자료형 X -> 객체화가 가능 한 자료형(대문자)
        // Integer, Boolean, Charactor, Double, Long, Float -(언박싱)-> int, boolean, char, double, long, float
        //                                                  <-(박싱)-

        // 박싱
        Integer num = new Integer(10);
        // 언박싱
        int num2 = num.intValue();

        // 자동 박싱, 언박싱
        Integer num3 = 20;
        int num4 = num3;

        Sender sender1 = new Sender<String>("test1", "test2");
//        Sender<String> sender1 = new Sender<>("test1", "test2");
    }
}
