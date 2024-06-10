package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NullExceptionMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();     // List.of에서 요소들 넣을 때 null은 들어갈 수 없다.
        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add(null);

        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for (int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());        //  예외 발생시 try의 내부에 있는 명령문은 멈추게 된다. - try부분 탈출
            }
            System.out.println("트라이 마지막 부분");
        } catch (NullPointerException e) {                          // null을 가지고 있는 개체나 변수가 호출될 때 나오는 예외
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {                     // 인덱스의 범위가 넘어갈 경우 나오는 예외
            e.printStackTrace();
        } catch (Exception e) {                                     
            e.printStackTrace();
        } catch (Throwable e) {                                     // 예외의 최상위 클래스
            e.printStackTrace();
        } finally {
            System.out.println("예외이든 아니든 실행");
        }
        System.out.println("프로그램 종료");
    }
}
