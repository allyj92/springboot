package com.codestates.order.entity;

import com.codestates.order.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table("ORDERS")
public class Order {
    @Id
    private long orderId;


    @MappedCollection(idColumn="ORDER_ID")
    private Set<OrderCoffee> orderCoffees = new LinkedHashSet<>();

    private OrderStatus orderStatus = OrderStatus.ORDER_REQUEST;

    private LocalDateTime createAt = LocalDateTime.now();

    public Order(long orderId) {
        this.orderId = orderId;
    }

    public enum OrderStatus{
        ORDER_REQUEST(1, "주문 요청"),
        ORDER_CONFIRM(2, "주문 확정"),
        ORDER_COMPLETE(3, "주문 완료"),
        ORDER_CANCLE(4, "주문 취소");

        @Getter
        private int stepNumber;
        @Getter
        private String stepDescription;

        OrderStatus(int stepNumber, String stepDescription) {
            this.stepNumber = stepNumber;
            this.stepDescription = stepDescription;
        }


    }
}
