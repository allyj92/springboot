package javalab.javalab.ch13;

class Outer{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnuble(int i) {
        int num = 100;

        // Runnable 함수형 인터페이스
        // 지역 내부 클래스 - 메서드 내부에 선언되는 클래스
        // 1. run() 메서드를 구현하기 위해선 클래스가 필요하여 클래스를 생성
        // 2. run() 메서드를 사용하기 위해선 인스턴스가 필요하여 인스턴스 생성
        class MyRunnable implements Runnable {

            int localNum = 10;


            @Override
            public void run() {
                // num = 200;
                // i = 100l;
                System.out.println("i =" + i);
                System.out.println("num = " +num);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnuble(10);
        runner.run();
    }
}
