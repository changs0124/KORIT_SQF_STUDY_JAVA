package com.study.java_study.ch09_클래스04;

import java.util.Arrays;

// 저장소 -> CRUD
public class BookRepository {
    private int bookId;
    private BookEntity[] books;

    public BookRepository() {       // 해당 클래스가 생성 되어질 때 밑의 배열도 생성
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() {    // 클래스에서만 사용 하기 때문에 private 선언
//        // 기본 배열보다 크기가 하나 더 큰 배열을 생성(마지막 인덱스의 값은 빈 값이다.)
//        BookEntity[] newBooks = new BookEntity[books.length + 1];
//        // 이전 배열의 값을 새로운 배열에 추가
//        for (int i = 0; i < books.length; i++) {
//            newBooks[i] = books[i];
//        }
        books = Arrays.copyOf(books, books.length + 1);
        // 교체(주소값 옮기기 : 기본 배열의 주소에 새로운 배열의 주소 대입)
//        books = newBooks;
    }

    // 배열의 마지막 인덱스는 해당 배열의 길이 - 1
    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity bookEntity) {
        // 배열 확장 메소드 호출
        extendBooks();
        // 변수에 들어있는 데이터 배열에 담기
        books[getLastIndex()] = bookEntity;
    }

    public BookEntity findBookById(int bookId) {
        BookEntity findBook = null;
        // 선형 탐색(순차 탐색) : 배열에서의 탐색
        // 시간복잡도 : 선형 탐색, 트리(처음엔 빠르다가 나중엔 느려짐), 
        for (BookEntity book : books) {
            if (book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;
        for (BookEntity book : books) {
            // 단건 조회 : 하나만 조회(중복 X)
            if (book.getBookName().equals(bookName)) {       // String 비교에 있어서는 주소값 비교 X
                findBook = book;
                break;
            }
        }
        return findBook;
    }

    // 검색 후 조회된 값 갯수만큼 길이의 배열 생성
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;
        switch (option) {
            case 1: // 통합 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;                                         // 검색 된 숫자
                    }
                }
                break;
            case 2: // 도서명 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명 검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    // 다건 조회 : 배열이나 해당 값이 여러개를 담거나 출력하는 경우
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);     // 새로운 배열을 만들기 위해서 사용
        BookEntity[] searchBooks = new BookEntity[newArraySize];    // newArraySize 배열 크기 설정

        int i = 0;
        switch (option) {
            case 1: // 통합 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;                              // 해당 배열에 차례순으로 대입
                        i++;                                                // 다음 배열 번호
                    }
                }
                break;
            case 2: // 도서명 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명 검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }

    private int indexOfBookId(int bookId) {
        int findIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;
    }

    public void deleteBookByBookId(int bookId) {
        int findIndex = indexOfBookId(bookId);
        BookEntity[] newBooks = new BookEntity[books.length - 1];
        for (int i = 0; i < newBooks.length; i++) {                 // for문의 경우 반복 횟수를 줄이는 것이 효율적
            if (i < findIndex) {
                newBooks[i] = books[i];
                continue;
            }
            newBooks[i] = books[i + 1];
        }
        books = newBooks;
    }

    public void deleteBookByBookId1(int bookId) {
        BookEntity[] newBooks = new BookEntity[books.length - 1];
        int j = 0;
        for (BookEntity book : books) {
            if (book.getBookId() == bookId) {
                continue;
            }
            newBooks[j] = book;
            j++;
        }
        books = newBooks;
    }
}







