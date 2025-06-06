package poly.ex4;


import poly.ex2.Animal;
import poly.ex2.Duck;

public class AbstractMain {
    // 추상클래스 생성 불가
//    AbstractAnimal animal = new AbstractAnimal();
    public static void main(String[] args) {

    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();
    Duck duck = new Duck();

    cat.sound();
    cat.move();

    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);

    moveAnimal(dog);
    moveAnimal(cat);
    moveAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}