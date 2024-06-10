package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        /*  data1과 data3에만 정보가 필요할때
            Data data = new Data("a", 0, 10.5, null);
        */

        Data data = new Data();
        data.setData1("a");
        data.setData3(10.5);

        System.out.println(data);

        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data4("b")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();

        Student student = Student.builder()
                .studentCode(1)
                .name("sch")
                .age(10)
                .build();
    }
}
