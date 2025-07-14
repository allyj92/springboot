package javalab.javalab.ch12;

// wrapper class
// - 기본형을 참조형으로 변환(Boxing)
// - 참조형을 기본형으로 변환(unboxing)
public class WrappreEx {
    public static void main(String[] args) {
        Integer num = 100; // boxing
        int  iNum = num.intValue(); // unboxing
        int jNum = 200;

        int sum = iNum + jNum;
        System.out.println(sum);

        int total = num + jNum;
        System.out.println(total); // auto unboxing
    }
}
