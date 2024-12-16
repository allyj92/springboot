package poly.send;

public class SmsSender implements Send{

    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS를 발송합니다: "+msg);
    }
}
