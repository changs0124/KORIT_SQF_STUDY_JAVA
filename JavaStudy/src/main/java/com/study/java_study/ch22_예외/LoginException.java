package com.study.java_study.ch22_예외;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LoginException extends RuntimeException {
    private String userName;

    // 예외를 상속 받은 클래스의 경우 RuntimeException message와 해당 클래스 변수를 같이 생성해야한다.
    public LoginException(String message, String userName) {
        super(message);
        this.userName = userName;
    }

    public String getErrorMessage() {
       return userName + "사용자 이름이 올바르지 않거나 비밀번호가 일치하지 않습니다.";
    }
}
