package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("실행");
            }
        };

        Runnable runnable1 = () -> System.out.println("실행");

        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        };

        Function<String, Integer> function1 = s -> Integer.parseInt(s);

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("accept");
            }
        };

        Consumer<String> consumer1 = s -> System.out.println("accept");

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 333;
            }
        };

        Supplier<Integer> supplier1 = () -> 333;

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate.test(10));

        Predicate<Integer> predicate1 = integer -> integer % 2 == 0;





    }
}
