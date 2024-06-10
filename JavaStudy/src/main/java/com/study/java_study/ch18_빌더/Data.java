package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
public class Data {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    public Data(String data1) {
        this.data1 = data1;
    }

    public Data(int data2) {
        this.data2 = data2;
    }

    public Data(double data3) {
        this.data3 = data3;
    }

    /*  매개변수 타입이 중복
    public Data(String data4) {
        this.data4 = data4;
    }
    */
}
