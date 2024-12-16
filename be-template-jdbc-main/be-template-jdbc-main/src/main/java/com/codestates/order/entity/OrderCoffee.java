package com.codestates.order.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderCoffee {
    @Id
    private long orderCoffeeId;
    private long coffeId;
    private int quantity;
}
