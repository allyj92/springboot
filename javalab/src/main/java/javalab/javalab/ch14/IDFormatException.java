package javalab.javalab.ch14;

// 호출된 메서드에서 상위(호출한)메서드로 예외를 통해서 메세지를 보냄.
public class IDFormatException extends Exception{
    public IDFormatException(String message){
        super(message);
    }
}
