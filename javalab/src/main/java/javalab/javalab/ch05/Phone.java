package javalab.javalab.ch05;

import lombok.Getter;

@Getter
public class Phone {
    private String model;
    private double price;

    public Phone(String model, double price){
        this.model = model;
        this.price = price;
    }
}
