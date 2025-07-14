package javalab.javalab.ch05;

public class Square implements Shape{
    private double s;

    public Square(double s) {
        this.s = s;
    }

    @Override
    public double calculateArea() {
        return s*s;
    }
}
