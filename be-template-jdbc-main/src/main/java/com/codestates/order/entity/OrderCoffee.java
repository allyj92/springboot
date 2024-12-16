package com.codestates.order.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("ORDER_COFFEE")
public class OrderCoffee {
    @Id
    private long orderCoffeeId;
    private long coffeeId;
    private int quantity;
}
