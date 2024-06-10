package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
        }
        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
        }
    }
}