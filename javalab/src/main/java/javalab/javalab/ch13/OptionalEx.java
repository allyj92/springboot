package javalab.javalab.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(new TravelCustomer("이순신", 40, 100));
        customerList.add(new TravelCustomer("김유신", 20, 100));
        customerList.add(new TravelCustomer("홍길동", 13, 50));

        // 이름검색
        TravelCustomer cust  = getCustomerByName("김유신",customerList);
        System.out.println(cust.toString());

        TravelCustomer cust1  = getCustomerByName("고길동",customerList);

        if(cust1 !=null){ // null 처리 : 객체가 있어야만 실행
            System.out.println("1. " + cust1.toString());
        }

        // Optional
        usingOptional(customerList);

    }

    // 1. 이름검색(검색성명, 고객리스트) -> 반환값 : 객체
    public static TravelCustomer getCustomerByName(String name, List<TravelCustomer> list){
        for (TravelCustomer  item : list){
            if(name.equals(item.getName())){
                return item;
            }
        }
        return null; // 검색어를 만족하는 고객 객체가 없다.
    }

    // 2. 이름검색(검색성명, 고객리스트) -> 반환값 : Optinal
    public static Optional<TravelCustomer> getCustomerByNameOptional(String name, List<TravelCustomer> list){
        for (TravelCustomer  item : list){
            if(name.equals(item.getName())){
                return Optional.of(item); // null이 아닌 객체를 담을 때 사용.
            }
        }
        return Optional.empty(); // 값이 없는 객체.
    }

    public static TravelCustomer generateDefaultCustomer(){
        return new TravelCustomer("손님", 0, 0);
    }

    // 3. 다양한 Optional 적용 예제
    public static void usingOptional(List<TravelCustomer> list){
        Optional<TravelCustomer> customerOptional = getCustomerByNameOptional("고길동",list);

        // ifPresent() : 객체가 존재하는 경우
        customerOptional.ifPresent(c-> System.out.println("1. 고객명 : " + c.getName()));

        // isPresent() : 논리값 반환
        if(customerOptional.isPresent()){
            System.out.println("2. 고객명: " + customerOptional.get().getName());
        }
        else{
            System.out.println("2. 고객을 찾을 수 없습니다.");
        }

        // orElse : 없는 경우 기본값 반환 ==> 제일 많이 쓰임 중요!
        TravelCustomer cust = customerOptional.orElse(new TravelCustomer("손님",0,0));
        System.out.println("3. " + cust.getName());

        // orElseGet() : 없는 경우 기본값을 가공된 기본값을 반환
        TravelCustomer custComputed = customerOptional.orElseGet(()->generateDefaultCustomer());
        System.out.println("4. " + custComputed.getName());
    }
}
