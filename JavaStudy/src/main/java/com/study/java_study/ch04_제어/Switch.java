package com.study.java_study.ch04_제어;

public class Switch {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");
                break;
        }
    }
}
