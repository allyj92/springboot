package com.codestates.coffee.service;

import com.codestates.coffee.entity.Coffee;
import com.codestates.coffee.repository.CoffeeRepository;
import com.codestates.exception.BusinessLogicException;
import com.codestates.exception.ExceptionCode;

import com.codestates.order.entity.Order;
import org.mapstruct.ap.shaded.freemarker.template.utility.OptimizerUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.data.repository.util.ClassUtils.ifPresent;

@Service
public class CoffeeService {

    private final CoffeeRepository coffeeRepository;

    public CoffeeService(CoffeeRepository coffeeRepository) {
        this.coffeeRepository = coffeeRepository;
    }

    public Coffee createCoffee(Coffee coffee) {
        // 커피 코드를 대문자로 변경
        String coffeeCode = coffee.getCoffeeCode().toUpperCase();

        // 이미 등록된 커피 코드인지 확인
        verifyExistCoffee(coffeeCode);
        coffee.setCoffeeCode(coffeeCode);

        return coffeeRepository.save(coffee);
    }

    public Coffee updateCoffee(Coffee coffee) {
        Coffee findCoffee = findVerifiedCoffee(coffee.getCoffeeId());

        Optional.ofNullable(coffee.getKorName())
                .ifPresent(korName->findCoffee.setKorName(korName));
        Optional.ofNullable(coffee.getEngName())
                .ifPresent(engName->findCoffee.setEngName(engName));
        Optional.ofNullable(coffee.getPrice())
                .ifPresent(price ->findCoffee.setPrice(price));

        return coffeeRepository.save(findCoffee);
        }


    public Coffee findCoffee(long coffeeId) {

        return findVerifiedCoffee(coffeeId);
    }

    public List<Coffee> findCoffees() {
        return (List<Coffee>)coffeeRepository.findAll();

    }

    public void deleteCoffee(long coffeeId) {

       Coffee findCoffee = findVerifiedCoffee(coffeeId);
       coffeeRepository.delete(findCoffee);
    }

    // 주문에 해당하는 커피 정보 조회
    public List<Coffee> findOrderedCoffees(Order order) {
        return order.getOrderCoffees()
                .stream()
                .map(orderCoffee -> findCoffee(orderCoffee.getCoffeeId()))
                .collect(Collectors.toList());
    }

    private final void verifyExistCoffee(String coffeeCode){
        Optional<Coffee> coffee = coffeeRepository.findByCoffeeCode(coffeeCode);
        if(coffee.isPresent())
            throw new BusinessLogicException(ExceptionCode.COFFEE_NOT_FOUND);
    }

    public Coffee findVerifiedCoffee(long coffeeId) {
        Optional<Coffee> optionalCoffee =
                coffeeRepository.findById(coffeeId);
        Coffee findCoffee =
                optionalCoffee.orElseThrow(() ->
                        new BusinessLogicException(ExceptionCode.COFFEE_NOT_FOUND));

        return findCoffee;

    }
}