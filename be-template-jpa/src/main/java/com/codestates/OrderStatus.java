package com.codestates;

import lombok.Getter;

@Getter
public enum OrderStatus {
    ORDER_REQUEST(1, "주문 요청"),
    ORDER_CONFIRM(2, "주문 확정"),
    ORDER_COMPLETE(3, "주문 완료"),
    ORDER_CANCEL(4, "주문 취소");

    private int stepNumber;

    private String stepDescription;

    OrderStatus(int stepNumber, String stepDescription) {
        this.stepNumber = stepNumber;
        this.stepDescription = stepDescription;

    }
}
