package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {

        GenericBox<Integer> integerBox  = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.set(10);
        // integerBox.set("문자100"); // 컴파일 오류
        Integer integer = integerBox.get(); // Integer 타입 변환 (캐스팅 X)
        System.out.println("integer = " + integer);

        GenericBox<String> StringBox = new GenericBox<>();
        StringBox.set("hello");
        String str = StringBox.get();
        System.out.println("str = " + str);

        // 원하는 모든 타입 사용 가능
        GenericBox<Double> doubleBox = new GenericBox<>();
        doubleBox.set(10.5);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = "  + doubleValue);

        // 생성 시점에 원하는 타입 지정

        // 타입 추론 : 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerrBox2 = new GenericBox<>();

    }
}
