package com.study.java_study.ch09_클래스04;

public class BookMain {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램 실행합니다.");
        while (bookService.run()) {}
        System.out.println("프로그램 종료합니다.");
    }
}
