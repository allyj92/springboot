package poly.send;

public class EmailSender implements Send{
    @Override
    public void sendMessage(String msg) {
        System.out.println("메일을 발송합니다: " + msg);
    }
}
