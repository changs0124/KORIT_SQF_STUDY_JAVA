package com.study.java_study.ch08_클래스03;

public class 은행 {
    private int 잔액;

    // getter & setter 에 있어 변수명 앞에 get / set 을 붙이면 자동으로 getter & setter 설정
    // 카멜표기법 사용
    public void set잔액(int 금액) {
        this.잔액 += 금액;
    }
    public int get잔액() {
        return 잔액;
    }
}
