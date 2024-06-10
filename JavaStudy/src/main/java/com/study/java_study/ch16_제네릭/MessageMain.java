package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> ?

        Message<?> m1;
        Message<String> m2 = null;

        m1 = new Message<>("10");               // ? : Object 타입
        String str = (String) m1.getMessage();  // 다운 캐스팅 (Object -> String)
        System.out.println(str);

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10");       // 자신을 포함하거나 String 타입인 것들만 들어 올 수 있음(하행)
                                                                  // 자식 객체의 경우 다운 캐스팅
        Message<? super String> m4 = new Message<>(new Object());       // 자신을 포함해서 위로는 다 가능(상행), 같은 클래스는 불가

        String str1 = m3.getMessage();
    }
}
