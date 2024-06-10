package com.study.java_study.ch08_클래스03;

public class Color {
    private String code;
    private String name;

    public Color() {;}

    // AllArgsConstructor
    public Color(String code, String name) {
        this.code = code;
        this.name = name;
    }
    // getter and setter
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("색상 코드 : " + code);
        System.out.println("색상명 : " + name);
    }
}
