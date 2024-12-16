package static2.ex;

public class Car {
    private String model;
    private static int count=0;
    public Car(String model) {
        this.model = model;
        count++;
        System.out.println("차량 구입, 이름: "+model);
    }

    static void showTotalCars(){
        System.out.println("구매한 차량 수: "+ count);
    }
}
