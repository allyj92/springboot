package javalab.javalab.ch05;

import lombok.Getter;

@Getter
public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget){
        this.name = name;
        this.budget = budget;
    }

    // 휴대폰을 사려면 스토어에서 사야함
    public void buyPhone(PhoneStore store){
       Phone phone =  store.sellPhone("아이폰",budget);

       if(phone != null){
           System.out.println("고객: 핸드폰 구입이 완료되었습니다.");
       }
       else{
           System.out.println("고객: 핸드폰을 구입하지 못하였습니다.");
       }
    }
}
