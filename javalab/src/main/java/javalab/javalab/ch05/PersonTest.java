package javalab.javalab.ch05;

public class PersonTest {
    public static void main(String[] args) {

//        Person personKim = new Person(); // 기본생성자
//        personKim.name = "김유신";
//        personKim.weight = 85.5f;
//        personKim.height = 180;



        // 객체를 만드는데 필요한 필수 데이터(값)을 지정
        Person personLee = new Person("이순신",175,75);

        Person personHong = new Person("홍설아");

    }
}
