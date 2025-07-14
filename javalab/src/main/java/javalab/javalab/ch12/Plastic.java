package javalab.javalab.ch12;

import org.springframework.format.Printer;

import java.util.Locale;

public class Plastic extends Material {
    public void doPrinting(){
        System.out.println("Plastic 재료로 출력합니다");
    }

    public  String toString(){
        return "재료는 Plastic입니다.";
    }

}
