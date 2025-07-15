package javalab.javalab.ch13;

public class MyNumberTest {
    public static void main(String[] args) {
        // 인터페이스에 추상메서드 구현. 익명 내부클래스 생성
        MyNumber number = (a,b) -> (a>=b)? a:b;
        System.out.println(number.getMax(10,29));

        showResult(number);

        MyNumber add = addNumber();
        System.out.println(add.getMax(10,20));
    }

    public static void showResult(MyNumber pObj){
        System.out.println(pObj.getMax(1,2));
    }

    public static MyNumber addNumber(){
        return (x,y) -> x+y;
    };

}
