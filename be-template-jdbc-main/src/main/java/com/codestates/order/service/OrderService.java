package com.codestates.order.service;

import com.codestates.coffee.service.CoffeeService;
import com.codestates.exception.BusinessLogicException;
import com.codestates.exception.ExceptionCode;
import com.codestates.member.service.MemberService;
import com.codestates.order.entity.Order;
import com.codestates.order.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    final private OrderRepository orderRepository;
    final private MemberService memberService;
    final private CoffeeService coffeeService;

    public OrderService(OrderRepository orderRepository, MemberService memberService, CoffeeService coffeeService) {
        this.orderRepository = orderRepository;
        this.memberService = memberService;
        this.coffeeService = coffeeService;
    }


    public Order createOrder(Order order) {
        // 회원이 존재하는지 확인
        memberService.findVerifiedMember(order.getMemberId());

        // 커피가 존재하는지 조회해야 됨
        order.getOrderCoffees()
                .stream()
                .forEach(orderCoffee -> {
                    coffeeService.findVerifiedCoffee(orderCoffee.getCoffeeId());
                });

        return orderRepository.save(order);
    }

    public Order findOrder(long orderId) {

        return findVerifiedOrder(orderId);
    }



    public List<Order> findOrders() {
        // TODO should business logic

        // TODO order 객체는 나중에 DB에서 조회하는 것으로 변경 필요.
        return List.of(new Order(1L, 1L),
                new Order(2L, 2L));
    }

    public void cancelOrder(long orderId) {
       Order findOrder = findVerifiedOrder(orderId);
       int step = findOrder.getOrderStatus().getStepNumber();

       if (step>=2){
           throw new BusinessLogicException(ExceptionCode.CANNOT_CHANGE_ORDER);
       }
       findOrder.setOrderStatus(Order.OrderStatus.ORDER_CANCEL);
       orderRepository.save(findOrder);
    }

    private Order findVerifiedOrder(long orderId){
        Optional<Order> optionalOrder = orderRepository.findById(orderId);
        Order findOrder =
                optionalOrder.orElseThrow(()->
                        new BusinessLogicException(ExceptionCode.ORDER_NOT_FOUND));
        return findOrder;
    }
}
