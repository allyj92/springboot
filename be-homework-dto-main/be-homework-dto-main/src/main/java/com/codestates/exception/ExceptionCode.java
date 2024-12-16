package com.codestates.exception;

import lombok.Getter;

public enum ExceptionCode {
    MEMBER_NOT_FOUND(404, "Member Not Found"),
    COFFEE_NOT_FOUND(404, "Coffee Not Found"),
    ORDER_NOT_FOUND(404,"Order Not Found"),
    EXIST_MEMBER_FOUND(403, "이미 존재하는 회원입니다.");

    @Getter
    private int status;
    @Getter
    private String message;

    ExceptionCode(int status,String message){
        this.status = status;
        this.message = message;
    }
}
