package javalab.javalab.ch05;

public class Person {
    String name;
    int height;
    double weight;
    char gender;
    boolean married;

    public Person(){}

    public Person(String pName){
        name = pName;
    }

    // 메서드 오버로딩
    // 메서드는 각 각의 메서드를 구별할 경우 메서드명 + 매개변수타입의 조합(시그니처)를 이용한다.
    // 메서드(생성자) 오버로딩

    // 성명, 키, 몸무게 필수로 만드는 생성자
    public Person(String name, int height, double weight) {
        if(height < 1 ){
            System.out.println("키는 1보다 작을 수 없습니다.");
        }

        this.name = name;
        this.height = height;
        this.weight = weight;

    }
}
