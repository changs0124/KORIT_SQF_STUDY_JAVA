package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {
        // 메인 메소드안에서 익명클래스를 생성하고 재정의 하기 때문에 메인 메소드 안의 지역변수를 사용할 수 있다. => 디버깅이 어려움
        // 익명 클래스 생성
        /*  Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };
        */
        // 익명 클래스를 람다식으로
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();
        // 1. new 클래스명 삭제
        // 2. @Override 삭제
        // 3. 메소드명 삭제
        // 4. 변수가 하나인 경우 변수 자료형 생략 가능
        // 5. 명령어가 한 줄일 경우 중괄호 생략(return도 생략) / 두 개 이상이면 생략 불가
        Function<String, Integer> fx = s -> Integer.parseInt(s);

        Integer num = fx.apply("10");
        System.out.println("num : " + num);
        // apply가 실행된 뒤에 andThen result에 해당 값 대입
        Integer num2 = fx.andThen(result -> result + 100).apply("10");
        System.out.println(num2);

        Consumer<String> transform = s -> System.out.println(s + "님 환영합니다.");
        transform.accept("sch");

        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };
        System.out.println(role.get());

        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));
    }
}
