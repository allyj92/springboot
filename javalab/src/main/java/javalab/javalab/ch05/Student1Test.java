package javalab.javalab.ch05;

public class Student1Test {
    public static void main(String[] args) {
        Student1 student1 = new Student1();

        // 기본형
        student1.koreanName = "국어";
        student1.koreanScore = 90;
        student1.mathName = "수학";
        student1.mathScore = 90;

        System.out.println(student1.toString());

        // 참조형(class)
        Subject korean = new Subject();
        korean.subjectName = "국어";
        korean.scorePoint = 90;

        Subject math = new Subject();
        math.subjectName = "수학";
        math.scorePoint=80;

        System.out.println(korean.toString());
        System.out.println(math.toString());

        student1.korean = korean;
        student1.math = math;

        Subject korean1 = new Subject("국어",90); // 생성자
        student1.korean = korean1; // 객체 주소를 전달한다.

        student1.math = new Subject("수학",90); // 객체 주소를 전달한다.



    }
}
