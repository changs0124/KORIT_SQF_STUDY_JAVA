package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender<T> {
    private T data1;
    private T data2;

    public Sender(T data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "data1=" + data1 +
                ", data2=" + data2 +
                '}';
    }
}
