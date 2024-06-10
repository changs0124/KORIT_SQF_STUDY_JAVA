package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("123"); // 공백조차 리터럴
        String name = "sch";       // 값의 자료형 String
        String phone = "01012341234";    // 값의 자료형 null

//        System.out.println(text);
//        System.out.println(name);
//        System.out.println(text.length());
//        System.out.println(name.length());
//        System.out.println(phone.length());
//
//        if (name == null || name.equals("")) {
//            System.out.println("name은 비어있습니다.");
//        }
//        if (phone == null || phone.equals("")) {
//            System.out.println("phone은 비어있습니다.");
//        }
//        if (text == null || text.equals("")) {
//            System.out.println("text은 비어있습니다.");
//        }                                               // == : 주소값 비교
//        if(name.isEmpty()) {
//            System.out.println("name은 비어있습니다.");
//        }

//        if(text.equals(name)) {`                  
//            System.out.println("o"); 
//        }                                             // equals : 값 비교

        StringUtils stringUtils = new StringUtils();

        if(stringUtils.isEmpty(text)) { // 생명 주기 : 리턴까지의 길이
            System.out.println("true");
            return;                     // return 값이 없는 경우(함수가 void인 경우) = break
        }
        if(stringUtils.isEmpty(name)) {
            System.out.println("true");
            return;
        }
        if(stringUtils.isEmpty(phone)) {
            System.out.println("true");
            return;
        }
    
    
    
    }
}
