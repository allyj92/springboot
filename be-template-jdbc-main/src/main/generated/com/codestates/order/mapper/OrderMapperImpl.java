package com.codestates.order.mapper;

import com.codestates.order.dto.OrderPostDto;
import com.codestates.order.dto.OrderResponseDto;
import com.codestates.order.entity.Order;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-22T12:44:34+0900",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.23 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderPostDtoToOrder(OrderPostDto orderPostDto) {
        if ( orderPostDto == null ) {
            return null;
        }

        long memberId = 0L;
        long coffeeId = 0L;

        memberId = orderPostDto.getMemberId();
        coffeeId = orderPostDto.getCoffeeId();

        Order order = new Order( memberId, coffeeId );

        return order;
    }

    @Override
    public OrderResponseDto orderToOrderResponseDto(Order order) {
        if ( order == null ) {
            return null;
        }

        long memberId = 0L;
        long coffeeId = 0L;

        memberId = order.getMemberId();
        coffeeId = order.getCoffeeId();

        OrderResponseDto orderResponseDto = new OrderResponseDto( memberId, coffeeId );

        return orderResponseDto;
    }
}
