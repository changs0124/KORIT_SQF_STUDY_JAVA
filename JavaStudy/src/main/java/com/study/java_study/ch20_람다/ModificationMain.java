package com.study.java_study.ch20_람다;

public class ModificationMain {
    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존 데이터 : " + oldData);
                System.out.println("새로운 데이터 : " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                return newData;
            }
        };
        // 자료형이 정해져 있어야 함
        // 대입 대상이 중요(대입 대상의 자료형에 따라서 바뀜)
        // 리턴이 있는 경우 리턴까지 삭제
        Modification<String> m3 = (oldName, newName) -> {
            System.out.println("기존 데이터 : " + oldName);
            System.out.println("새로운 데이터 : " + newName);
            return newName;
        };

//        Modification<String> m3 = (oldName, newName) -> newName;

        String name = "sch";
        String newName = m1.modify(name, "sch1");
        System.out.println(newName);

        String newName2 = m2.modify(name, "sch3");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "sch4");
        System.out.println(newName);
    }

}

