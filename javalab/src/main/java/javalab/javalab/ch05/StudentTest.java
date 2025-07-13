package javalab.javalab.ch05;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentName = "홍길동";
        System.out.println(student1.getStudentName());

        Student student2 = new Student();
        student2.studentName = "이순신";
        System.out.println(student2.getStudentName());

        Student student3 = new Student();
        student3.studentName = "고길동";
        System.out.println(student3.getStudentName());

    }
}
