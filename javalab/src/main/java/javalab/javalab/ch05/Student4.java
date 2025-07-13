package javalab.javalab.ch05;

import lombok.Getter;
import lombok.Setter;

// 조건
// 1. 모든 학생은 학번과 성명을 가지고 있다. 변경 불가능하다.
// 2. 국어와 수학 과목이 있고 각각 과목명과 점수가 있고 수정이 불가능하다.
@Getter
@Setter
public class Student4 {

    private int studentID;
    private String studentName;

    Subject korean;
    Subject math;

    // 1. 학번과 성명
    // 생성자 - 멤버변소 초기화, 객체 생성시 1회만 실행된다.
    public Student4(int pStudentId, String pStudentName){
        studentID = pStudentId;
        studentName = pStudentName;
    }

    public void showInfo(){
        System.out.println("학번:" + studentID + ", 성명:" + studentName);
        System.out.println("국어:" + korean.subjectName + korean.scorePoint+ ", 수학:" + math.subjectName + math.scorePoint);
    }
}
