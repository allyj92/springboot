package lambda.start;

public class Ex0RefMain {

    public static void hello(String str) {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        // 변하는 부분 시작
        System.out.println("Hello "+str);

        // 변하는 부분 종료
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }

    public static void helloJava() {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println("Hello Java");  // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }
    public static void helloSpring() {
        System.out.println("프로그램 시작"); // 변하지 않는 부분
        System.out.println("Hello Spring"); // 변하는 부분
        System.out.println("프로그램 종료"); // 변하지 않는 부분
    }
    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }
}
