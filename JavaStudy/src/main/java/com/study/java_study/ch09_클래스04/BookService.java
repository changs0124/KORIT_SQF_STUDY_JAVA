package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

// 리펙토링 : 최대한 코드를 간결하게(줄이기)
// 클린코드 : 누구나 봤을 때 이해하기 좋은 코드
public class BookService {
    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;
        while (true) {
            System.out.print("메뉴 선택 : ");
            selectedMenu = scanner.nextLine();
            if (menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    private String selectMenu1() {
        String[] menus = {"1", "2", "3", "4", "q"};
        String selectedMenu = null;
        while (true) {
            System.out.print("메뉴 선택 : ");
            selectedMenu = scanner.nextLine();
            for(int i = 0; i < menus.length; i++) {
               if (menus[i].equals(selectedMenu)) {
                   break;
               }
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
               break;
           }
            return selectedMenu;
        }
    }

    public boolean run() {
        boolean isRun = true;
        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu1();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
        }
        System.out.println();
        return isRun;
    }

    // 공백 검사
    private String validateValue(String title) {
        String value = null;
        while (true) {
            System.out.print(title + "명 입력 : ");
            value = scanner.nextLine();
            // 해당값이 공백인가? -> !value.isBlank() : 공백이 아니면 멈춤
            if (!value.isBlank()) {           // empty : 띄어쓰기 포함 / blank : 띄어쓰기 미포함
                break;
            }
            System.out.println(title + "명은 공백일 수 없습니다. 다시 입력하세요.");
        }
        // 해당 입력값을 리턴
        return value;
    }

    // 중복 검사
    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서");
            // 해당 배열에서 입력한 값을 찾지 못하였다는 뜻 -> 중복이 없고 새로운 입력값이라는 뜻
            if (bookRepository.findBookByBookName(bookName) == null) {
                break;
            }
            // null 아니라는 것은 해당 입력값이 이미 존재한다는 뜻 -> 중복
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요");
            break;
        }
        return bookName;
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        // 공백 검사, 중복 검사를 통과한 입력값을 Entity 객체를 생성, 값 대입
        BookEntity book = new BookEntity(bookId, bookName, author, publisher);
        // 해당 배열에 대입
        bookRepository.saveBook(book);
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");

        System.out.print("옵션 선택 : ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();

        // 배열 생성 후 해당 값 담아서 searchBooks 담기
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);
        System.out.println("[ 검색 결과 ]");
        if (searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;     // 반복문(while, for)영역에서는 break 사용 할 수 있지만 조건문의 경우 break 사용 할 수 없다.
        }               // break 대신 return 사용(대신 리턴값이 없는 경우)
        for (BookEntity book : searchBooks) {
            System.out.println(book.toString());    // 배열에 담긴 객체 수 만큼 출력, 형식은 toString 해서 한번에 출력
        }
    }

    private void remove() {
        System.out.println("[ 도서 삭제 ]");
        search();
        System.out.print("삭제 할 도서번호를 입력하세요 : ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookById(removeBookId);
        if (book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId);
        System.out.println("[ 삭제 완료 ]");
    }

    /*private String modifyByTitle(String title) {
        String selectedOption = null;
        System.out.println(title + "명을 수정하시겠습니까?(y/n)");
        selectedOption = scanner.nextLine();
        if (selectedOption.equalsIgnoreCase("y") && title.equals("도서")) {
            String bookName = duplicateBookName();
            return bookName;
        }
        if (selectedOption.equalsIgnoreCase("y") && title.equals("저자")) {
            String author = validateValue("저자");
            return author;
        }

    }*/

    private void modify() {
        System.out.println("[ 도서 수정 ]");
        search();
        System.out.print("수정 할 도서번호를 입력하세요 : ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookById(modifyBookId);
        if (book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        System.out.println("[ 도서 수정 정보 입력 ]");
        for (int i = 0; i < 3; i++) {
            String selected = null;
            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {                // equalsIgnoreCase :  대소문자 구분없이 비교
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1:
                    System.out.print("저자명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.print("출판사명을 수정하시겠습니까?(y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {
                        String publisher = validateValue("출판사");
                        book.setBookName(publisher);
                        break;
                    }
                    break;
            }
        }
    }
}
