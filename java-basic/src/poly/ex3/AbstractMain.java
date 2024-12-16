package poly.ex3;

import poly.ex2.*;
import poly.ex2.Cat;
import poly.ex2.Dog;

public class AbstractMain {
    // 추상클래스 생성 불가
//    AbstractAnimal animal = new AbstractAnimal();
    public static void main(String[] args) {


    Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animalArr){
        soundAnimal(animal);
    }
}
// 변하지 않는 부분
private static void soundAnimal(Animal animal) {


    System.out.println("동물 소리 테스트 시작");
    animal.sound();
    System.out.println("동물 소리 테스트 종료");

}
}