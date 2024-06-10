package com.study.java_study.ch06_배열;

public class ArrayUtils {
    int findIndexByName(String[] names, String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
