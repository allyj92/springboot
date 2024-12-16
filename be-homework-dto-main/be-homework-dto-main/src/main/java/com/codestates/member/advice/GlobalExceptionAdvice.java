package com.codestates.member.advice;

import com.codestates.exception.BusinessLogicException;
import com.codestates.response.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestControllerAdvice
public class GlobalExceptionAdvice {




    @ExceptionHandler




    public ResponseEntity<ErrorResponse> handleException(MethodArgumentNotValidException e) {


//        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
//
//        List<ErrorResponse.FieldError> errors = fieldErrors.stream()
//                .map(error -> new ErrorResponse.FieldError(
//                        error.getField(),
//                        error.getRejectedValue(),
//                        error.getDefaultMessage()
//                )).collect(Collectors.toList());
//
//        return new ResponseEntity(errors, HttpStatus.BAD_REQUEST);
        ErrorResponse response = ErrorResponse.of(e.getBindingResult());
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler
    public ResponseEntity handleException(ConstraintViolationException e) {
        ErrorResponse response = ErrorResponse.of(e.getConstraintViolations());
        return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler
    public ResponseEntity handleException(BusinessLogicException e) {
//        ErrorResponse response = ErrorResponse.of(e.getConstraintViolations());
        System.out.println("예외처리 해줄거니...?");
        return new ResponseEntity( HttpStatus.BAD_REQUEST);
    }


}