package com.study.java_study.ch17_컬랙션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain01 {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 권의 책을 등록 : ");
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.print("도서명 : ");
            String bookName = sc.nextLine();
            System.out.print("저자명 : ");
            String author = sc.nextLine();

            bookList.add(new Book(bookName, author));
        }
        System.out.println("등록 완료");
        System.out.println();

        System.out.println("전체 조회");
        for (Book book : bookList) {
            System.out.println(book);
        }
        System.out.println("완료");
        System.out.println();

        System.out.print("삭제 : ");
        String removeBookName = sc.nextLine();
        for (Book book : bookList) {
            if (book.getBookName().equals(removeBookName)) {
                bookList.remove(book);      // bookList에서 뽑은 book을 제거
                break;
            }
        }
        System.out.println("삭제 완료");
        System.out.println(bookList);
    }
}
