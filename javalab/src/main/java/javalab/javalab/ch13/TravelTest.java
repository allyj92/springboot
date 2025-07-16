package javalab.javalab.ch13;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("이순신", 40, 100));
        customerList.add(new TravelCustomer("김유신", 20, 100));
        customerList.add(new TravelCustomer("홍길동", 13, 50));

        System.out.println("== 고객 명단 출력 ==");
        customerList.stream()
                .map(c->c.getName())
                .forEach(System.out::println);

        System.out.println("== 총 여행 비용 출력 ==");
        int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println("total : " + total + "원");

        System.out.println("== 20세 이상 고객 명단 출력 ==");
        customerList.stream()
                .filter(c -> c.getAge()>=20)
                .map(c->c.getName())
                .sorted()
                .forEach(s-> System.out.println("20세 이상 고객 명단 : "+s));

    }
}
