package com.study.java_study.ch22_예외;

import java.util.Scanner;

public class LoginMain {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void login(String username, String password) throws LoginException {
        // USERNAME, PASSWORD의 경우 null이 들어올 수 없기 때문에 null이 들어올 가능성이 있는 매개변수에 .equals를 하는 것 보단 상수에 .equals를 거는 것이 좋다.(후자인 경우 null인 경우 생각해야함)
        if (!(USERNAME.equals(username) && PASSWORD.equals(password))) {
            throw new LoginException("로그인 실패", username);
        }
        System.out.println("로그인 성공 이후 절차 진행");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username;
        String password;

        System.out.print("사용자 이름 : ");
        username = sc.nextLine();
        System.out.print("비밀번호 : ");
        password = sc.nextLine();

        try {
            login(username, password);
        } catch (LoginException e) {
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
}
