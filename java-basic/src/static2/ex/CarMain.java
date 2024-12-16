package static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();
    }
}
