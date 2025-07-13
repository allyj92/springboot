package javalab.javalab.ch05;

public class Student4Test {
    public static void main(String[] args) {
        Student4 stud1 = new Student4(1, "학생1"); // 생성자를 이용하여 불편형



        Subject korean = new Subject("국어",95); // 객체를 생성하여 변수에 전달
        stud1.setKorean(korean);  // 변수가 가지고 있는 주소를 매개변수로 전달

        stud1.setMath(new Subject("수학",79)); // 객체 주소만 매개변수로 전달

        stud1.showInfo();

    }
}
