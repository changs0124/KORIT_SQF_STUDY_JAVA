package com.study.java_study.ch12_추상화03;

// 인터페이스를 사용해서 authority 메소드를 가진 설계도
public abstract class AbstractAuthority implements Authority {
    private String role;

    public AbstractAuthority() {
        role = DEFAULT_ROLL;
    }

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}
