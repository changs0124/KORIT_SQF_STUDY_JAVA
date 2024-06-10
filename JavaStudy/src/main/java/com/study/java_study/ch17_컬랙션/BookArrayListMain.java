package com.study.java_study.ch17_컬랙션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String bookName;
            String author;

            System.out.print("도서명 : ");
            bookName = sc.nextLine();
            System.out.print("도서명 : ");
            author = sc.nextLine();

            bookList.add(new Book(bookName, author));
        }

        System.out.println("전체 조회");
        // forEach
        for (Book book : bookList) {
            System.out.println("도서명 : " + book.getBookName());
            System.out.println("저자명 : " + book.getAuthor());
        }
        // index
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println("도서명 : " + bookList.get(i).getBookName());
            System.out.println("저자명 : " + bookList.get(i).getAuthor());
        }

        System.out.println("삭제 : ");
        String removeBookName = sc.nextLine();
        // forEach
        for (Book book : bookList) {
            if (book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break;
            }
        }
        System.out.println(bookList);
        // index
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보 : " + removeBook);
                break;
            }
        }
    }
}
