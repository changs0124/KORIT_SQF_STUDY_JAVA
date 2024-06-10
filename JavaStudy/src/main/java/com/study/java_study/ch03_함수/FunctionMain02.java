package com.study.java_study.ch03_함수;

public class FunctionMain02 {
    public static void main(String[] args) {
        Function02 func02 = new Function02();

        func02.fx01();
        func02.fx02(10, (int)20.1); // 업캐스팅이나 다운캐스팅 가능
        func02.fx02(100, 200);
        System.out.println(func02.fx03("팥", 3) + " 주문 완료");
        String fx03 = func02.fx03("초코", 5);
        System.out.println(fx03 + " 주문 완료");
        String data = func02.get();
        System.out.println(data);
    }
}
