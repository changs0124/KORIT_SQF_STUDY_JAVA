package com.study.java_study.ch06_배열;

public class ArrayMain03 {
    public static void main(String[] args) {
        // 배열 : 관련된 데이터를 하나로 묶기 위해서
        int[] nums = new int[] {10, 20, 30, 40, 50, 60};

        // 순서 X, 비어있는 공간에 할당
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        // 순서 O
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;

        String[] strArray = new String[5];
        strArray[0] = new String("a");
        strArray[1] = new String("b");
        strArray[2] = new String("c");
        strArray[3] = new String("d");
        strArray[4] = new String("e");


        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("----------------------");
        for (String str : strArray) {
            System.out.println(str);
        }
        System.out.println("----------------------");
        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 3.5;
        doubles[2] = 30.5;

        for (double dNum : doubles) {
            System.out.println(dNum);
        }
        System.out.println("----------------------");
        Computer[] computers = new Computer[3];
        // 객체화 후 배열에 넣기
        computers[0] = new Computer("i3", "3GB");
        computers[1] = new Computer("i5", "5GB");
        computers[2] = new Computer("i7", "7GB");

        for(Computer computer : computers) {
            System.out.println(computer.toString());
        }
    }
}
