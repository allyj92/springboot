package com.codestates.response;

import com.codestates.exception.ExceptionCode;
import lombok.Getter;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolation;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class ErrorResponse {
    private List<FieldError> fieldErrors;
    private List<ConstraintViolationError> violationErrors;

    private ErrorResponse(List<FieldError> fieldErrors, List<ConstraintViolationError> violationErrors) {
        this.fieldErrors = fieldErrors != null ? fieldErrors : Collections.emptyList();
        this.violationErrors = violationErrors != null ? violationErrors : Collections.emptyList();
    }

    public static ErrorResponse of(BindingResult bindingResult) {
        return new ErrorResponse(FieldError.of(bindingResult), null);
    }

    public static ErrorResponse of(Set<ConstraintViolation<?>> violations) {
        return new ErrorResponse(null, ConstraintViolationError.of(violations));
    }

    public static ErrorResponse of(ExceptionCode exceptionCode) {
        return new ErrorResponse(
                List.of(new FieldError("error", null, exceptionCode.getMessage())),
                null
        );
    }

    @Getter
    public static class FieldError {
        private String field;
        private Object rejectedValue;
        private String reason;

        private FieldError(String field, Object rejectedValue, String reason) {
            this.field = field;
            this.rejectedValue = rejectedValue;
            this.reason = reason;
        }

        public static List<FieldError> of(BindingResult bindingResult) {
            if (bindingResult == null) {
                return Collections.emptyList();
            }

            return bindingResult.getFieldErrors().stream()
                    .map(error -> new FieldError(
                            error.getField(),
                            error.getRejectedValue() != null ? error.getRejectedValue().toString() : "",
                            error.getDefaultMessage()
                    )).collect(Collectors.toList());
        }
    }

    @Getter
    public static class ConstraintViolationError {
        private String propertyPath;
        private Object rejectedValue;
        private String reason;

        private ConstraintViolationError(String propertyPath, Object rejectedValue, String reason) {
            this.propertyPath = propertyPath;
            this.rejectedValue = rejectedValue;
            this.reason = reason;
        }

        public static List<ConstraintViolationError> of(Set<ConstraintViolation<?>> constraintViolations) {
            if (constraintViolations == null) {
                return Collections.emptyList();
            }

            return constraintViolations.stream()
                    .map(constraintViolation -> new ConstraintViolationError(
                            constraintViolation.getPropertyPath().toString(),
                            constraintViolation.getInvalidValue() != null ? constraintViolation.getInvalidValue().toString() : "",
                            constraintViolation.getMessage()
                    )).collect(Collectors.toList());
        }
    }

    @Getter
    public static class BusinessLogicException{
        private int status;
        private String message;

        private BusinessLogicException(int status, String message) {
            this.status = status;
            this.message = message;
        }

        // ExceptionCode에서 리스트로 변환하는 static 메서드
        public static List<BusinessLogicException> of(List<ExceptionCode> exceptionCodes) {
            return exceptionCodes.stream()
                    .map(code -> new BusinessLogicException(code.getStatus(), code.getMessage()))
                    .collect(Collectors.toList());
        }
    }


}