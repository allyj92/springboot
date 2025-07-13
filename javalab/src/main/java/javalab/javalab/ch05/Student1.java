package javalab.javalab.ch05;

import lombok.Getter;

public class Student1 {
    int studentID;
    String studentName;

    // -- 기본형
    String koreanName;
    int koreanScore;
    String mathName;
    int mathScore;

    // 참조형
    Subject korean;
    Subject math;

    @Override
    public String toString() {
        return "Student1{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", koreanName='" + koreanName + '\'' +
                ", koreanScore=" + koreanScore +
                ", mathName='" + mathName + '\'' +
                ", mathScore=" + mathScore +
                ", korean=" + korean +
                ", math=" + math +
                '}';
    }
}
