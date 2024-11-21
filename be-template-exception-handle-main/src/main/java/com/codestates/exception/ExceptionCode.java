package com.codestates.exception;

import lombok.Getter;
import org.springframework.validation.FieldError;

import java.util.List;

public enum ExceptionCode {
    MEMBER_NOT_FOUND(404,"Member Not Found");

    @Getter
    private int status;

    @Getter
    private String message;

    ExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }


}
