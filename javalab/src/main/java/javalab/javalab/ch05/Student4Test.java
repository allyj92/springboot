package javalab.javalab.ch05;

public class Student4Test {
    public static void main(String[] args) {
        Student4 stud1 = new Student4(1, "학생1"); // 생성자를 이용하여 불편형
        stud1.showInfo();

        System.out.println(stud1.getStudentID());
        System.out.println(stud1.getStudentName());
    }
}
