package javalab.javalab.ch13;

class Outer2{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnuble(int i) {
        int num = 100;

        // Runnable 인터페이스를 구현한 익명 클래스가 생성됨
        return new Runnable() {


            @Override
            public void run() {
                System.out.println("i =" + i);
                System.out.println("num = " +num);
            }
        };


    }

    // 익명클래스를 이용한 인터페이스 구현
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("익명 클래스 변수");
        }
    };
}


public class AnnonymousInnerClass {


    public static void main(String[] args) {
        Outer2 out = new Outer2();
        Runnable runner = out.getRunnuble(10);
        runner.run();
    }
}
