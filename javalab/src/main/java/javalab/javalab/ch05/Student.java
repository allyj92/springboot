package javalab.javalab.ch05;

import lombok.Getter;

public class Student {
    // 1. 멤버필드(Student 상태, 특징)
    int studentID;
    // 2. 메서드
    @Getter
    String studentName;
    int grade;
    String address;

}
