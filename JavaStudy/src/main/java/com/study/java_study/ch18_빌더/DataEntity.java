package com.study.java_study.ch18_빌더;

public class DataEntity {
    private String data1;
    private int data2;
    private double data3;
    private String data4;

    public DataEntity(String data1, int data2, double data3, String data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    // Builder 생성
    public static DataEntityBuilder builder() {
        return new DataEntityBuilder();
    }

    public static class DataEntityBuilder {
        private String data1;
        private int data2;
        private double data3;
        private String data4;

        // DataEntity 리턴
        public DataEntity build() {
            return new DataEntity(data1, data2, data3, data4);
        }

        public DataEntityBuilder data1(String data1) {
            this.data1 = data1;         // this. => 해당 static class의 주소
            return this;
        }

        public DataEntityBuilder data2(int data2) {
            this.data2 = data2;
            return this;
        }

        public DataEntityBuilder data3(double data3) {
            this.data3 = data3;
            return this;
        }

        public DataEntityBuilder data4(String data4) {
            this.data4 = data4;
            return this;
        }
    }
}
