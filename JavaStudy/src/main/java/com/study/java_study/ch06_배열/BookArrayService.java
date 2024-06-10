package com.study.java_study.ch06_배열;

import com.study.java_study.ch04_제어.Switch;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookArrayUtils baru = new BookArrayUtils();
        String[] books = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[도서 메뉴]");
            System.out.println("[1. 도서 등록]");
            System.out.println("[2. 도서 수정]");
            System.out.println("[3. 도서 삭제]");
            System.out.println("[4. 도서 찾기]");
            System.out.println("[5. 도서 전체 조회]");
            System.out.println("[q. 종료]");

            System.out.print("메뉴 선택 : ");
            String selectedMenu = sc.nextLine();
            String[] newBooks = null;
            int findIndex = -1;
            switch (selectedMenu) {
                case "1":
                    System.out.println("[도서 이름 등록]");
                    newBooks = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    System.out.print("[도서 이름 등록 : ");
                    books[books.length - 1] = sc.nextLine();
                    System.out.println("등록 완료");
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("수정 할 도서 이름 : ");
                    String editBookName = sc.nextLine();

                    findIndex = baru.findIndexByBookname(books, editBookName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름 : ");
                    books[findIndex] = sc.nextLine();
                    System.out.println("[수정 완료]");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제 할 도서 이름 : ");
                    String delBookName = sc.nextLine();

                    findIndex = baru.findIndexByBookname(books, delBookName);
                    if (findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newBooks = new String[books.length - 1];
                    for(int i = 0; i < newBooks.length; i++) {
                        if(i < findIndex) {
                            newBooks[i] = books[i];
                            continue;
                        }
                        newBooks[i] = books[i + 1];
                    }
                    System.out.println(delBookName + "을(를) 삭제하였습니다.");
                    books = newBooks;
                    break;
                case "4":
                    System.out.println("[도서 찾기]");
                    System.out.print("찾을 도서 이름 : ");
                    String findBookName = sc.nextLine();
                    findIndex = baru.findIndexByBookname(books, findBookName);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 도서 입니다.");
                    }
                    System.out.println("등록된 도서 입니다.");
                    break;
                case "5":
                    System.out.println("도서 전체 조회");
                    if(books.length == 0) {
                        System.out.println("등록 된 도서가 없습니다.");
                        break;
                    }
                    for (int i = 0; i < books.length; i++) {
                        System.out.println("index[" + i + "] : " + books[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    System.out.println("[종료]");
                    break;
                default:
                    System.out.print("다시 입력하세요 : ");
            }
        }
    }
}
