package com.study.java_study.ch06_배열;

public class BookArrayUtils {
    int findIndexByBookname(String[] books, String book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }
}
