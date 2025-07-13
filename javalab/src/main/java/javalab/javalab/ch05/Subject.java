package javalab.javalab.ch05;

public class Subject {
    String subjectName;
    int scorePoint;

    public  Subject(){

    }

    public Subject(String pSubjectName, int pScorePoint){
        subjectName = pSubjectName;
        scorePoint = pScorePoint;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", scorePoint=" + scorePoint +
                '}';
    }
}
